import java.util.Scanner;

public class FibonacciLoyaltySystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter number of years:");
        int years = input.nextInt();
        if (years < 1) {
            System.out.print("Enter 1 year and above:");
    }
     long [] rewards = new long[years + 1];
     rewards[0] = 0;

     if (years>= 1) {
         rewards[1] = 1;
     }

     for (int i = 2; i <= years; i++) {
         rewards[i] = rewards[i - 1] + rewards[i - 2];
     }

     System.out.println("Loyalty points for each year:");

        for (int year = 1; year <= years; year++) {
            System.out.println("Year " + year + ": " + rewards[year] + " points");
        }
        input.close();
    }
}