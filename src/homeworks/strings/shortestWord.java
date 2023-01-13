package homeworks.strings;

import java.util.Scanner;
/*
Вовочка сидя на уроке писал подряд одинаковые слова (слово может состоять из одной буквы).
Когда Марья Ивановна забрала у него тетрадь, там была одна строка текста. Напишите программу,
которая определит самое короткое слово из написанных Вовочкой. Например:
aaaaaaa — Вовочка писал слово - «a»
ititititit — Вовочка писал слово - «it»
catcatcatcat — Вовочка писал слово - «cat»
*/


public class shortestWord {
    public static void main(String[] args) {
        Scanner wordscan = new Scanner(System.in);
        System.out.println("Please, enter first word:");
        String word1 = wordscan.next();
        System.out.println("Please, enter second word:");
        String word2 = wordscan.next();
        System.out.println("Please, enter third word:");
        String word3 = wordscan.next();
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        String temp;
        String temp2;
        if (word1.length() == 1) {
            number1 = 1;
        }
        else {
            for (int i = 0; i < (word1.length() / 2); i++) {
                temp = word1.substring(0, i + 1);
                temp2 = word1.substring(i + 1, (i + 1) * 2);
                if (temp.equals(temp2)) {
                    number1 = i + 1;
                    break;
                } else {
                    number1 = 100;
                }
            }
        }
        if (word2.length() == 1) {
                number2 = 1;
            }
        else {
            for (int k = 0; k < (word2.length() / 2); k++) {
                temp = word2.substring(0, k + 1);
                temp2 = word2.substring(k + 1, (k + 1) * 2);
                if (temp.equals(temp2)) {
                    number2 = k + 1;
                    break;
                }else {
                    number2 = 100;
                }
            }
        }

        if (word3.length() == 1) {
            number3 = 1;
        }
        else {
            for (int j = 0; j < (word3.length() / 2); j++) {
                temp = word3.substring(0, j + 1);
                temp2 = word3.substring(j + 1, (j + 1) * 2);
                if (temp.equals(temp2)) {
                    number3 = j + 1;
                    break;
                }
                else {
                    number3 = 100;
                }
            }
        }

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        int min = Math.min(Math.min(number1, number2), number3);



        if (min == number1){
            System.out.println("The shortest word is word #1");
        } else if (min == number2) {
            System.out.println("The shortest word is word #2");
        } else if (min == number3) {
            System.out.println("The shortest word is word #3");
        }


    }
}
