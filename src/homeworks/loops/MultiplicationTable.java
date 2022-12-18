package homeworks.loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            int result;
            result = i * 5;
            if (i != 10) {
                System.out.print( i + " * 5 = " + result + ", " );
            } else {
                System.out.print( i + " * 5 = " + result );
            }




        }


    }

}
