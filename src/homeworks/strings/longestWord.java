package homeworks.strings;

import java.util.Arrays;
import java.util.Scanner;

public class longestWord {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Please, enter some text here:");
        String newText = word.nextLine();
        String[] arrayText = newText.split(" ");
        int number = 0;
        int value = 0;
        System.out.println(Arrays.toString(arrayText));
        for (int i = 0; i < arrayText.length; i++) {
            if (number < arrayText[i].length()) {
                number = arrayText[i].length();
                value = i;
            }
        }
        System.out.println(arrayText[value]);


    }
}
