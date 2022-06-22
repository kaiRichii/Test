import java.util.Scanner;

public class Activity8_1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner (System.in);
                
        System.out.println("\n");
        System.out.print("Enter 1st integer: ");
        int firstInteger = keyboard.nextInt();
        System.out.print("Enter 2nd integer: ");
        int secondInteger = keyboard.nextInt();

        System.out.println("\n");
        System.out.println("Result: ");
        System.out.println("\t" + "Sum: "+ (firstInteger + secondInteger));
        System.out.println("\t" + "Difference: "+ (firstInteger - secondInteger));
        System.out.println("\t" + "Product: "+ (firstInteger  *  secondInteger));
        System.out.println("\t" + "Quotient: "+ (firstInteger / secondInteger));
        System.out.println("\t" + "Remainder: "+ (firstInteger % secondInteger));

        int myNum = 5;
        int myNum2 = myNum;
        
        ++myNum; //increased to 1
        System.out.println("\n");
        System.out.println("5 increased to 1: " + myNum);
        
        
        --myNum2; //decreased to 1
        System.out.println("5 decreased to 1: " + myNum2);

        keyboard.close();

    }
}
