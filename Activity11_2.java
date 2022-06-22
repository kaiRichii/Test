import java.util.Scanner;

public class Activity11_2{
    static void integerValue(){
        Scanner valueInput = new Scanner(System.in);
        
        System.out.print("Enter any integer value: ");
        int value = valueInput.nextInt();

        if (value < 0){
            int square = value * value;
            System.out.println("\nThe square of " + value + " is "+ square);
        } else {
            int cube = value * value * value;
            System.out.println("\nThe cube of " + value + " is " + cube);

            valueInput.close();
        }
    }

    public static void main(String[] args){
        System.out.println();
        integerValue();
    }
}