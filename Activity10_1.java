import java.util.Scanner;

public class Activity10_1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int fourDigitNum;
        int tens;
        int hundreds;
        int thousands;
        int tenThousands;

        System.out.println("\n");
        System.out.print("Enter four-digit positive integer: ");

        fourDigitNum = keyboard.nextInt();
        System.out.println("\n");

        tenThousands = fourDigitNum % 10000 / 1000;
        System.out.println(tenThousands);
        System.out.println("\n");

        thousands = fourDigitNum % 1000 / 100;
        System.out.println(thousands);
        System.out.println("\n");

        hundreds = fourDigitNum % 100 / 10;
        System.out.println(hundreds);
        System.out.println("\n");

        tens = fourDigitNum % 10;
        System.out.println(tens);
        System.out.println("\n");

        keyboard.close();
    }
}
