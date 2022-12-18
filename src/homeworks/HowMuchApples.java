package homeworks;

import java.util.Scanner;

public class HowMuchApples {

    public static void main(String[] args) {

        Scanner Apple = new Scanner(System.in);
        System.out.println("What price for one Apple?");
        int applePrice = Apple.nextInt();
        System.out.println("Hom much apples do you want to buy?");
        int applesNumber = Apple.nextInt();

        int result = applesNumber * applePrice;

        //System.out.println(applePrice);
        //System.out.println(applesNumber);
        System.out.println("You need " + result + "$");

    }
}