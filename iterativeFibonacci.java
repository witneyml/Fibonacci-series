import java.util.Scanner;

public class iterativeFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of years:");

        int years = input.nextInt();
        if (years<1)
            System.out.println("Enter 1 year and above");

        long[] reward = new long[years+1];
        reward[0] =0;

        if (years>=1) {
            reward[1] =1;
        }

        for (int i=2;i <= years;i++) {
            reward[i] = reward[i-1] + reward[i-2];
            
            for (int year = 1; year <= years; year++) {
                System.out.println("year" +year+ ":" +reward[year]+ "points");
            }
        }

    }
}
