package homeworks;

import java.util.Scanner;

public class PointInCircle {
    public static void main(String[] args) {
        Scanner coordinate = new Scanner(System.in);
        System.out.println("Please, input coordinate X:");
        int coordinateX = coordinate.nextInt();
        System.out.println("Please, input coordinate Y:");
        int coordinateY = coordinate.nextInt();

        if ( 4 >= Math.sqrt((Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2)))) {
            System.out.println("Point is IN the circle");
        }
        else {
            System.out.println("Point OUT of the circle");
        }


    }



}

