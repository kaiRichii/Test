import java.util.Scanner;

public class Activity11_1 {
    static void taxiFee(){
        Scanner inputDistance = new Scanner(System.in);
        double fee;
        double charge = 2.00;

        System.out.print("Enter the distance a trip took: ");
        int distance = inputDistance.nextInt();

        if (distance <= 300){
            fee = 2.50;
            System.out.println("\nYour total taxi fee is " + fee);
        } else {
            fee = 2.50 + (((distance - 300) /100) * charge);
            System.out.println("\nYour total taxi fee is " + fee);
        }

        inputDistance.close();
    }

    public static void main(String[] args){
        System.out.println();
        taxiFee();
    }
}
