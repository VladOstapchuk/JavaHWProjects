package homeworks.loops;

import java.util.Scanner;

public class RectangleOfStars {
    public static void main(String[] args) {
        Scanner param = new Scanner(System.in);
        System.out.println("Please enter a width of rectangle:");
        int width = param.nextInt();
        System.out.println("Please enter a height of rectangle:");
        int height = param.nextInt();

        for (int i = 1; i <= height; i++) {
            if (i == 1 || i == height) {

                for (int j = 1; j <= width; j++) {
                    if (j != width) {
                        System.out.print("*");
                    } else {
                        System.out.println("*");
                    }
                }
            } else {
                for (int k = 1; k <= width; k++) {
                    if (k == 1 ) {
                        System.out.print("*");
                    } else if (k == width) {
                        System.out.println("*");
                    } else {
                        System.out.print(" ");
                    }
                }


            }

        }


    }


}
