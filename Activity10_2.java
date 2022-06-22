import java.util.Scanner;
public class Activity10_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\n");
        System.out.print("Enter the elapsed time for an event in seconds: ");
        int elapsedTime = input.nextInt();

        int hours = elapsedTime / 3600;
        int minutes = (elapsedTime % 3600) /60;
        int seconds = (elapsedTime % 3600) % 60;

        System.out.println("\n");
        System.out.println("Time: ");
        System.out.println("\t" + hours + ":" + minutes + ":" + seconds);

        input.close();

    }
}
