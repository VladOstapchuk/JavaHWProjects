package homeworks.methods;

import java.util.Scanner;

public class maxnumber {

    //Напишите метод который вернет максимальное число из массива целых чисел.

    public static void main(String[] args) {
        Scanner arrayparametrs = new Scanner(System.in);
        System.out.println("Please enter array length:");
        int len = arrayparametrs.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter value for " + (i+1) + " array element:");
            array[i] = arrayparametrs.nextInt();
        }
        int maxvalue = maxvalue(array);
        System.out.println("The maximum number from the array: " + maxvalue);

    }

    public static int maxvalue (int[] newarray) {
        int maxvalue =0;
        for (int i = 0; i < newarray.length; i++) {
            if (maxvalue < newarray[i]){
                maxvalue = newarray[i];
            }
        }
        return maxvalue;
    }


}


