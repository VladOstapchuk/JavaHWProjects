package homeworks.basic;

public class TriangleSquareHeronsFormula {

    public static void main(String[] args) {
        double sideA = 0.3;
        double sideB = 0.4;
        double sideC = 0.5;
        double semiPerimetr;
        double square;
        double temporaryVariable;

        //Herons formule is: S = sqrt (p*(p-a)*(p-b)*(p-c))  = 0.06
        // semi-perimeter p = (a + b +c)/2  = 0.6

        semiPerimetr = (sideA + sideB + sideC) / 2;
        temporaryVariable = (semiPerimetr * (semiPerimetr - sideA) * (semiPerimetr - sideB) * (semiPerimetr - sideC));
        square = Math.sqrt(temporaryVariable);


        System.out.println(semiPerimetr);
        System.out.println(temporaryVariable);
        System.out.println("Square triangle is" +square);



    }
}