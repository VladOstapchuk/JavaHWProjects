package homeworks.Arrays;

//Написать код для зеркального переворота массива. Например (7,2,9,4) -> (4,9,2,7). Массив может
//быть произвольной длинны. Использовать дополнительный массив запрещено.

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner arrayLength = new Scanner(System.in);
        System.out.println("Please enter array length:");
        int length = arrayLength.nextInt();
        int[] arrayReverse = new int[length];
        for (int i = 0 ; i < arrayReverse.length ; i++) {
            arrayReverse[i] = (int)(Math.random()*10);
        }
        int middle = arrayReverse.length / 2;
        System.out.println(Arrays.toString(arrayReverse));
        System.out.println("Array middle point is: " + middle);
        for (int j = 0; j < middle ;j++){
            int buffer = arrayReverse[j];
            int lastElement = arrayReverse.length - 1 - j;
            arrayReverse[j] = arrayReverse[lastElement];
            arrayReverse[lastElement] = buffer;

        }

        System.out.println(Arrays.toString(arrayReverse));
    }
}
