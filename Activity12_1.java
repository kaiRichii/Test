import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Activity12_1{
    public static void main(String[] args) throws IOException{
        BufferedReader inputValue = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println();
        System.out.print("Enter an integer value: ");
        String intValue = inputValue.readLine();
        int realIntValue = Integer.parseInt(intValue);

        if (realIntValue %3 == 0){
            System.out.println("\nHELLO");
        } else if (realIntValue %5 == 0){
            System.out.println("\nWORLD");
        } else if (realIntValue %3 == 0 && realIntValue %5 == 0){
            System.out.println("\nHELLO WORLD");
        } else {
            System.out.println("\nInvalid input");
        }
    }
}