package homeworks.Arrays;

import java.util.Arrays;

public class ArraysTasksFromBook {
    public static void main(String[] args) {

        //Write a program that create an empty array of 6 elements and assign
        //values from 1 to 6
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;

        }
        System.out.println(Arrays.toString(array));


        //Write a program that create an empty array of 4 elements and assign
        //index value of every element to every element an array

        int[] array1 = new int[4];
        for (int i = 0; i < array1.length; i++){
            array1[i] = i;
        }
        System.out.println(Arrays.toString(array1));


        //Write a program that create an array of 5 elements with float point
        //type, assign different values and print on the console all array values
        float[] array2 = new float[5];
        for (int i = 0; i < array2.length; i++){
            array2[i] = (float) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array2));

        //Write a program that create an array of integer elements type with
        //length 5 and assign all elements with different values, after that display
        //all elements of the array on console4

        int[] array3 = new int[5];
        for (int i = 0; i < array3.length; i++){
            array3[i] = (int)(Math.random() * 10);
        }
        System.out.println(Arrays.toString(array3));
    }
}
