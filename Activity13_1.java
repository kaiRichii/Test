public class Activity13_1{ 
    static void sum(){ 
       
        System.out.println();
        System.out.println("The sum of the squares of all multiples of 5 between 1 and 100: ");
        int square = 0;
        int sum = 0; 

        for (int num= 1; num <=100; num++){
            if (num % 5== 0){
                System.out.print(" " + num);
                square = num * num;
                sum += square;
            }
        }
        System.out.println("\nSum: ");
        System.out.println(sum);
    }

    public static void main(String[] args){
        sum();
    }
}