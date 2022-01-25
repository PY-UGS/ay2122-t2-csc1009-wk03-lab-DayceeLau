import java.util.Scanner;

public class Wk03Q1Main {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        Double annualInterestRate = scan.nextDouble();
        
        System.out.print("Enter number of years as an integer: ");
        Integer numberOfYears = scan.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        Double loanAmount = scan.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.2f", loan.getMonthlyPayment()));
        System.out.println("The total payment is " +  String.format("%.2f", loan.getTotalPayment()));

        scan.close();
    }
}
