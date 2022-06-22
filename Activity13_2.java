import java.util.Scanner;

public class Activity13_2 {
    static void copiesOf(){
        Scanner inputNum = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = inputNum.nextLine();

        System.out.println();
        System.out.println("Enter a number: ");
        int number = inputNum.nextInt();
        
        System.out.println();
        int i = 1;
        while (i <= number){
            System.out.println(name);
            i++;
        }
        inputNum.close();
    }

    public static void main(String[] args){
        copiesOf();
    }
}
