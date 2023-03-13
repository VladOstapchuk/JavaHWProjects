package homeworks.methods;

// Напишите метод, который реализует линейный поиск элемента в массиве целых чисел.
// Если такой элемент в массиве есть, то верните его индекс, если нет, то метод должен возвращать "-1"

import java.util.Scanner;

public class findElementInArray {

    public static void main(String[] args) {

        int[] array = new int[] {1, 3, 5, 6, 11, 55, 44 ,2 ,3 ,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("What element you want to find?");
        int find = sc.nextInt();

        System.out.println("Element on position: " + findElement(array, find));

    }


    public static int findElement(int[] array, int toFind){
        int elementPosition = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == toFind) {
                elementPosition = i;
            }

        }

        return  elementPosition;
    }


}
