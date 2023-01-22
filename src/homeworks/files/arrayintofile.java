package homeworks.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class arrayintofile {
    public static void main(String[] args) {
        Scanner params = new Scanner(System.in);
        System.out.println("Please enter height of the array:");
        int a = params.nextInt();
        System.out.println("Please enter width of the array:");
        int b = params.nextInt();
        System.out.println("Please enter file name for *.txt file:");
        String filename = params.next();

        File file1 = new File(filename + ".txt" );
        try (PrintWriter pw = new PrintWriter(file1)){
            pw.println(Arrays.deepToString(fillarray(a, b)));
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }



        System.out.println(Arrays.deepToString(fillarray(a, b)));
        System.out.println(filename);

    }

    public static int[][] fillarray (int height, int width){

        int[][] result = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = (int) (Math.random() * 10);
            }
        }


        return result;
    }
}
