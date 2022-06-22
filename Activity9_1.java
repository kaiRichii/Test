import java.util.Scanner;

public class Activity9_1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int perimeterOfRec;
        int areaOfRec;
        
        System.out.println("\n");
        System.out.print("Enter the length of a rectangle: ");
        int length = keyboard.nextInt();

        System.out.print("Enter the width of a rectangle: ");
        int width = keyboard.nextInt();

        perimeterOfRec = 2*(length + width);
        areaOfRec = length * width;

        System.out.println("\nResults: ");
        System.out.println("\tPerimeter: " + perimeterOfRec);
        System.out.println("\tArea: " + areaOfRec);

        keyboard.close();
    }
}