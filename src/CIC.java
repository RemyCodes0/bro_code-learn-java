import java.util.Scanner;

public class CIC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate( in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate/ timeCompounded, timeCompounded*years);

        System.out.println("The amount after "+ years + " is: $"+ amount);




        scanner.close();
    }
}
