package homeworks.methods;

// Реализуйте метод рисующий на экране прямоугольник из звездочек "*" - его параметрами  будут целые числа,
// которые описывают длину и ширину такого прямоугольника


import java.util.Scanner;

public class rectangleStar {

    public static void main(String[] args) {

        Scanner star = new Scanner(System.in);
        System.out.println("Please enter length for rectangle:");
        int length = star.nextInt();
        System.out.println("Please enter width for rectangle:");
        int width = star.nextInt();

        rectangle(length, width);

    }


    public static void rectangle (int length, int width){

        for (int i = 0; i <= length; i++) {
            for (int j = 0; j <= width; j++) {
                System.out.print("*");
        }
            System.out.println();

        }




    }



}
