package homeworks.methods;

//напишите метод, которій вернет количество слов в строке текста.

import java.util.Scanner;

public class numberOfWords {
    public static void main(String[] args) {

        Scanner textscan = new Scanner(System.in);
        System.out.println("Please enter some text, and we calculate how many words is in. Enter text here:");


        String text = textscan.nextLine();

        System.out.println(wordsInText(text));


    }

    public static int wordsInText (String text){
        String[] array = text.split(" ");


        return array.length;
    }










}


