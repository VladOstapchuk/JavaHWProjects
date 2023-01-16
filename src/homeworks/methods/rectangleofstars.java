package homeworks.methods;

import java.util.Scanner;

public class rectangleofstars {
    public static void main(String[] args) {
        Scanner rectangle = new Scanner(System.in);
        System.out.println("Please enter length of rectangle: ");
        int length = rectangle.nextInt();
        System.out.println("Please enter height of rectangle: ");
        int height = rectangle.nextInt();
        star(length, height);

    }

    public static void star(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();


        }

    }


}
