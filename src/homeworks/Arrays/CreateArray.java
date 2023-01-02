package homeworks.Arrays;

 //Написать код для возможности создания массива целых чисел (размер вводиться с клавиатуры) и
 //        возможности заполнения каждого его элемента вручную. Выведите этот массив на экран.

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {

    public static void main(String[] args) {

        Scanner scanArray = new Scanner(System.in);
        System.out.println("Please enter array length:");
        int arrayLength = scanArray.nextInt();
        int[] createArray = new int[arrayLength];
        for ( int i = 0; i < createArray.length ; i++) {
            System.out.println("Please enter " + i + " array's value:");
            int value = scanArray.nextInt();
            createArray[i] = value;
        }
        System.out.println(Arrays.toString(createArray));


    }
}
