package homeworks.strings;

public class charactersAfterDecimalPoint {
    public static void main(String[] args) {
        for (int i = 2; i < 12; i++) {
            String text = String.format("%." + i + "f", Math.PI);
            System.out.println(text);
        }

    }




}
