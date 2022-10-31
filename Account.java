import java.time.LocalDate;

public class Account {

    //data fields
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;

    //constructors
    public Account() {
        this.dateCreated = LocalDate.now();
    }
    public Account(int id, double balance) {
        this.dateCreated = LocalDate.now();
        this.id = id;
        this.balance = balance;
    }

    //accessor methods
    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return (100 * this.annualInterestRate);
    }
    public LocalDate getDateCreated() {
        return this.dateCreated;
    }

    //mutator methods
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    //methods
    double getMonthlyInterestRate() { /* total deposit amount after one monthly-period of compounded annual interest */
        return (this.balance * ( 1 + this.annualInterestRate / 12) );
        }
        void withdraw(double amount) {
            if (this.balance <= 0) {
                System.out.println("no mon, no fun, your son");
            }
            else {
                this.balance = this.balance - amount;
            }
        }
        void deposit(double amount) {
            if (amount == 0) {
                System.out.println("Too bad, so sad, your dad");
            }
            else {
                this.balance = this.balance + amount;
            }
        }
}