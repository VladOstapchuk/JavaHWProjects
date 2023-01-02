package homeworks.Arrays;

// Создать массив случайных чисел (размером 15 элементов). Создайте второй массив в два раза
//больше, первые 15 элементов должны быть равны элементам первого массива, а остальные
//элементы заполнить удвоенных значением начальных. Например:
//Было → {1,4,7,2}
//Стало → {1,4,7,2,2,8,14,4}

import java.util.Arrays;
import java.util.Scanner;

public class randomArrayDouble {
    public static void main(String[] args) {
        Scanner lengthscan = new Scanner(System.in);
        System.out.println("Please enter Array length:");
        int arrayLength = lengthscan.nextInt();

        int[] randomArray = new int[arrayLength];
        for (int i = 0 ; i < randomArray.length  ; i++) {
            randomArray[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(randomArray));
        int[] array2 = Arrays.copyOf(randomArray, randomArray.length*2 );
        System.out.println(Arrays.toString(array2));

        for (int i = 0 ; i < randomArray.length ; i++ ){
            array2[i+randomArray.length] = randomArray[i]*2;
        }
        System.out.println(Arrays.toString(array2));


    }
}
