import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Activity12_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter 2 numbers: ");

        System.out.println();
        System.out.print("\tEnter 1st number: ");
        String fNumber = inputNum.readLine();
        int realFNum = Integer.parseInt(fNumber);

        System.out.print("\tEnter 2nd number: ");
        String secNumber = inputNum.readLine();
        int realSecNum = Integer.parseInt(secNumber);

        int findLarge = Math.max(realFNum, realSecNum);
        int findSmall = Math.min(realFNum, realSecNum);

        System.out.println();
        System.out.println("Larger number: " + findLarge);
        System.out.println("Smaller number: " + findSmall);

        System.out.println();
        System.out.println("Ascending order: " + findSmall + ", " + findLarge);
        System.out.println("Descending order: " + findLarge + ", " + findSmall);
    }
}
