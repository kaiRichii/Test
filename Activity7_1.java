public class Activity7_1 {
    public static void main(String[] args){
        int x = 100;
        int y = 50;
        String hello = "Hello";
        String firstName = "Richie Tess Lourdes";
        String lastName = "Narval";
        

        /*compute the following arithmetic operations: addition, subtraction, 
        multiplication, division, modulo : given x = 100, y = 50 */
        System.out.println("\n");
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        //Display the string "Hello" into Uppercase, Lowercase and its length: 
        System.out.println("\nThe string \"Hello\": ");
        System.out.println("Uppercase: " + hello.toUpperCase());
        System.out.println("Lowercase: " + hello.toLowerCase());
        System.out.println("Length: " + hello.length());

        //Display your lastName and firstName using + operator: 
        System.out.println("\n" + firstName + " " + lastName);
        


    }
}
