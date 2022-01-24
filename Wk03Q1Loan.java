import java.util.Scanner;
import java.util.Date;
import java.lang.Math;


public class Wk03Q1Loan
{
    Double annualInterestRate, loanAmount;
    Integer numberOfYears;
    private Date loanDate;

    public Wk03Q1Loan()
    {
        this.loanDate = new Date();
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000.00;
    }
    public Wk03Q1Loan(Double annualInterestRate, Integer numberOfYears, Double loanAmount )
    {
        this.loanDate = new Date();
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public Double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(Double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public Integer getNumberOfYears()
    {
        return this.numberOfYears;
    }

    public void setNumberOfYears(Integer numberOfYears)
    {
        this.numberOfYears = numberOfYears;
    }

    public Double getLoanAmount()
    {
        return this.loanAmount;
    }

    public void setLoanAmount(Double loanAmount)
    {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate()
    {
        return this.loanDate;
    }

    public Double getMonthlyPayment()
    {
        Double monthyInterestRate = annualInterestRate/1200;
        Double monthlyPayment = (loanAmount*monthyInterestRate)/(1 - (1/ Math.pow(1 + monthyInterestRate, numberOfYears*12)));
        return monthlyPayment;
    }

    public Double getTotalPayment()
    {
       Double totalPayment = getMonthlyPayment() * numberOfYears * 12;
       return totalPayment;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        Double annualInterestRate = scan.nextDouble();
        
        System.out.print("Enter number of years as an integer: ");
        Integer numberOfYears = scan.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        Double loanAmount = scan.nextDouble();

        Wk03Q1Loan loan = new Wk03Q1Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.2f", loan.getMonthlyPayment()));
        System.out.println("The total payment is " +  String.format("%.2f", loan.getTotalPayment()));
        
        scan.close();
    }
}

