package homeworks.methods;

import java.util.Scanner;

public class elementInArray {
    public static void main(String[] args) {
        Scanner arrayparams = new Scanner(System.in);
        System.out.println("Please enter array length: ");
        int arLength = arrayparams.nextInt();
        int[] newarray = new int[arLength];

        for (int i = 0; i < arLength; i++) {
            System.out.println("Please enter value of " + i + " array element ");
            newarray[i] = arrayparams.nextInt();
        }

        System.out.println("Please enter what value you are looking for: ");
        int index = arrayparams.nextInt();

        int answer = arraysort(newarray, index);

        System.out.println("Result of search: " + answer + " is index of searched element. (If result is -1 - element not present in the array)");

    }

    public static int arraysort (int[] arr1, int index){
        int result = -1;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == index){
                result = i;
            }
        }
        return result;
    }

}


