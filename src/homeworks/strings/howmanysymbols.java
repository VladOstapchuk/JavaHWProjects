package homeworks.strings;

import java.util.Arrays;
import java.util.Scanner;

public class howmanysymbols {
    public static void main(String[] args) {
        Scanner newString = new Scanner(System.in);
        System.out.println("Please enter some string here:");
        String result = newString.nextLine();
        char[] fromString = result.toCharArray();
        char whatFind = 'b';
        //String sample = "b";
        //char[] sampleChar = sample.toCharArray();
        int resultNumber = 0;
        int resultNumber2 = 0;

        for (int i = 0; i < fromString.length; i++) {
            if (fromString[i] == whatFind) {
                resultNumber++;
            }
        }
        for (char i: fromString) {
            if (i == whatFind) {
                resultNumber2++;
            }
        }


        System.out.println(Arrays.toString(fromString));
        System.out.println(resultNumber);
        System.out.println(resultNumber2);
    }

}
