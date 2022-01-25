import java.util.Date;
import java.lang.Math;


public class Loan
{
    Double annualInterestRate, loanAmount;
    Integer numberOfYears;
    private Date loanDate;

    public Loan()
    {
        this.loanDate = new Date();
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000.00;
    }
    public Loan(Double annualInterestRate, Integer numberOfYears, Double loanAmount )
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
}

