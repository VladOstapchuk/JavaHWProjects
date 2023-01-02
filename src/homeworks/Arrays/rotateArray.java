package homeworks.Arrays;
//«Перевернуть массив». Т.е. написать программу которая повернет заданный массив на 90,180,270
//градусов по часовой стрелке. (При выполнении задания использовать дополнительный массив
//нельзя).

import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner arraySize1 = new Scanner(System.in);
        System.out.println("Please enter size1 of array:");
        int size1 = arraySize1.nextInt();
        System.out.println("Please enter size2 of array:");
        int size2 = arraySize1.nextInt();

        int[][] arraySource = new int[size1][size2];
        int[][] arrayResult = new int[size1][size2];

        for (int i = 0 ; i < arraySource.length; i++){
            for (int j = 0 ; j < arraySource.length; j++){
                arraySource[i][j] = (int)(Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(arraySource));
        System.out.println(Arrays.deepToString(arrayResult));
// Case 90:
        for (int i = 0; i < arraySource.length ; i++){
            for (int j = 0; j < arraySource.length ; j++){
                int buffer = (arrayResult.length - i) - 1;
                arrayResult[j][buffer] = arraySource[i][j];

            }
        }
        System.out.println(Arrays.deepToString(arrayResult));


    }


}
