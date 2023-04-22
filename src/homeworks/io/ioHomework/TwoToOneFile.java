package homeworks.io.ioHomework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//        Напишите программу которая примет на вход 2 текстовых
//        файла, а вернет один. Содержимым этого файла должны
//        быть слова которые есть и в первом и во втором файле.
public class TwoToOneFile {
    public static void main(String[] args) {


        File folder = new File("D:\\Java School\\JavaProjects\\MyFirstProject\\SuperIN");

//список файлов в папке загоняем в массив
        File[] filesarray = folder.listFiles();
        File inOne = filesarray[0];
        File inTwo = filesarray[1];

//файл в который будет записан результат
        File resultFile = new File(folder, "result.txt");
        try {
            resultFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

//листы стрингов. вычитываю в них строки из файлов
        List<String> stringsOne = new ArrayList<>();
        List<String> stringsTwo = new ArrayList<>();
        List<String> results = new ArrayList<>();
        try {
            stringsOne = fileToString(inOne);
            stringsTwo = fileToString(inTwo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(stringsOne);
        System.out.println(stringsTwo);

// из массива строк делаю массив слов
        List<String> newwords1 = stringsToWords(stringsOne);
        List<String> newwords2 = stringsToWords(stringsTwo);

        System.out.println("newwords1: " + newwords1);
        System.out.println("newwords2: " + newwords2);


//сравниваю два списка слов и те что есть в обоих массивах заношу в третий(результарующий) массив
        for (String str1 : newwords1
        ) {
            for (String str2 : newwords2
            ) {
                if (str1.equals(str2)) {
                    results.add(str1);
                }

            }

        }

// трай с ресурсами. Принтврайтером записываю в файл результат.
        try (PrintWriter pw = new PrintWriter(resultFile)) {
            for (String str : results) {
                pw.println(str);

            }
        } catch (FileNotFoundException ex) {
            System.out.println("PrinWriter error!");
        }


        System.out.println("Results: " + results);

//второй вариант записи в файл с помощью буфферврайтера
//        boolean iswrite = false;
//        try {
//            iswrite = stringToFile(results, resultFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        System.out.println("Done");
//        System.out.println(iswrite);
//

    }


    // с помощью буфередридера вычитаваю из файло строки и добавляю в массив
    public static List<String> fileToString(File file) throws IOException {

        List<String> strings = new ArrayList<>();
        try (BufferedReader readbuf = new BufferedReader(new FileReader(file))) {
            String str1 = "";

            for (int i = 0; (str1 = readbuf.readLine()) != null; i++) {
                strings.add(str1);
            }

        } catch (IOException e) {
            throw e;
        }
        return strings;

    }

    //метод с помощью буферврайтера и файлврайтера записывает данные из листа в файл, построчно.
    public static boolean stringToFile(List<String> list, File file) throws IOException {

        List<String> strings = new ArrayList<>();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String str : list) {
                writer.write(str + " ");
                writer.newLine();

            }
            return true;

        } catch (IOException e) {
            throw e;
        }

    }

    //метод преобразует список строк в список слов из которых состоят строки
    public static List<String> stringsToWords(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String str1 : list
        ) {
            for (String word : str1.split(" ")
            ) {
                result.add(word);
            }


        }
        return result;
    }

}
