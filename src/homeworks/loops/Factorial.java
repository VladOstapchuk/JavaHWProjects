package homeworks.loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner factorial = new Scanner(System.in);
        System.out.println("Input number for calculation of factorial (more than 4 and less than 16):");
        int f = factorial.nextInt();

        if (f < 4 || f > 16) {
            System.out.println("Number not in range, please input number more than 4 and less than 16!");
        } else {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result = result * i;
                //System.out.println(result);
            }
            System.out.println("Factorial of " + f + " = " + result);

        }
    }
}
