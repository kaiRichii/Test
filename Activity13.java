import java.util.Scanner;

public class Activity13 {
    static void commission(){
        Scanner input = new Scanner(System.in);
        
        float commission;

        System.out.println();
        System.out.print("Enter Sales man's name: ");
        String name = input.nextLine();
        
        System.out.println();
        System.out.print("Enter his total sales for the month: ");
        float totalSales = input.nextFloat();

        if (totalSales > 0 && totalSales < 10000){
            commission = totalSales * 2 / 100;
        } else if (totalSales >= 10000 && totalSales < 25000){
            commission = totalSales * 5 / 100;
        } else if (totalSales >= 25000 && totalSales < 50000){
            commission = totalSales * 10 / 100;
        } else if (totalSales >= 50000 && totalSales < 75000){
            commission = totalSales * 13 / 100;
        } else if (totalSales >= 75000 && totalSales < 100000){
            commission = totalSales * 15 / 10;
        } else if (totalSales >= 100000){
            commission = totalSales * 25 / 100;
        } else {
            commission = 0;
        }

        System.out.println("\n\t" + name + "\'s total commission is: " + commission);
        System.out.println();

        input.close();
    }
    public static void main(String[] args){
        commission();
    }
}
