public class Activity7_2 {
    public static void main(String[] args){
        double myDouble = 3.4D;
        float myFloat = (float) myDouble;

        System.out.println("\n\tDouble: " + myDouble);
        System.out.println("\tFloat: " + myFloat);
        System.out.println(String.format("\tScientific form: " + "%.3E",3.4));
    }
}
