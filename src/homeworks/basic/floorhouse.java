package homeworks.basic;

import java.util.Scanner;

public class floorhouse {

    public static void main(String[] args) {
        Scanner house = new Scanner(System.in);
        System.out.println("Please, input appartment's number:");
        int appartments = house.nextInt();

        //int allflors = 9;
        //int entrance = 5;
        int appInEntrance = 36;
        int appOnTheFloor = 4;

        int verification = appartments -180;

        if (verification > 0 || verification == -180) {
            System.out.println("There is no such apartment in this house");
        }
        else {

            int result1 = (appartments - 1) / appInEntrance;
            switch (result1) {
                case 0 -> System.out.println("Entrance #1");
                case 1 -> System.out.println("Entrance #2");
                case 2 -> System.out.println("Entrance #3");
                case 3 -> System.out.println("Entrance #4");
                case 4 -> System.out.println("Entrance #5");
                default -> System.out.println("There is no such apartment in this house");
            }

            double result22 = ((double) appartments - (result1 * appInEntrance)) / appOnTheFloor;


            if (appartments > 180) {
                System.out.println("There is no such apartment in this house");
            }
            if (result22 <= 1) {
                System.out.println("Floor #1");
            } else if (result22 > 1 && result22 <= 2) {
                System.out.println("Floor #2");
            } else if (result22 > 2 && result22 <= 3) {
                System.out.println("Floor #3");
            } else if (result22 > 3 && result22 <= 4) {
                System.out.println("Floor #4");
            } else if (result22 > 4 && result22 <= 5) {
                System.out.println("Floor #5");
            } else if (result22 > 5 && result22 <= 6) {
                System.out.println("Floor #6");
            } else if (result22 > 6 && result22 <= 7) {
                System.out.println("Floor #7");
            } else if (result22 > 7 && result22 <= 8) {
                System.out.println("Floor #8");
            } else if (result22 > 8 && result22 <= 9) {
                System.out.println("Floor #9");
            } else {
                System.out.println("There is no such apartment in this house");
            }

        }

    }
}

