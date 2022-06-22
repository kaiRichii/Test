import java.util.Scanner;

public class Activity8_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\n");
        System.out.print("Please Enter a Decimal Number: ");
        double yourDecimalNum = input.nextDouble();

        int roundedToInt = (int) yourDecimalNum;
        System.out.println();
        System.out.println( yourDecimalNum +"'s" + " nearest integer: " + roundedToInt);

        input.close();
    }
}
