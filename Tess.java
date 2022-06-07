import java.util.Scanner;

public class Tess{
    public String name(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ur name: ");
        String name = input.nextLine();

        
        input.close();
        return name;
    }
    public static void main(String[] args){
        Tess myObj = new Tess();

        System.out.println();
        myObj.name();
    }
}