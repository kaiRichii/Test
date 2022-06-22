import java.util.Scanner;

public class Activity9_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Please Enter Five Decimal Numbers: ");
        System.out.print("Decimal 1: ");
        double decimalOne = input.nextDouble();

        System.out.print("Decimal 2: ");
        double decimalTwo = input.nextDouble();

        System.out.print("Decimal 3: ");
        double decimalThree = input.nextDouble();

        System.out.print("Decimal 4: ");
        double decimalFour = input.nextDouble();

        System.out.print("Decimal 5: ");
        double decimalFive = input.nextDouble();

        double sum = decimalOne + decimalTwo + decimalThree + decimalFour + decimalFive;

        System.out.println("\nResult: ");
        System.out.println("\t" + "From: " + sum);
        System.out.println("\t" + "To: " + Math.round(sum));

        input.close();
    }
}
