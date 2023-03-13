package homeworks.files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Создайте консольный «текстовый редактор» с возможностью сохранения набранного текста в
//файл.

public class writeintofile {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Please, Set a file name for *.txt file:");
        String fileName = text.nextLine();

        System.out.println("What text do you want to write into file?");
        String sameText = text.nextLine();

        File redactor = new File(fileName + ".txt");
        try (PrintWriter pw = new PrintWriter(redactor)){
            pw.println(sameText);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
