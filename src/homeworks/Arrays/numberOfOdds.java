package homeworks.Arrays;

public class numberOfOdds {

    //Написать программу для подсчета количества
    //нечетных чисел в массиве.
    public static void main(String[] args) {
        int[] array = new int[] {0,5,2,4,7,1,3,19};
        int number = 0;

        for ( int i = 0; i < array.length; i++){

            if (array[i] % 2 != 0) {
                number++;
            }
        }

        System.out.println(number);

    }



}
