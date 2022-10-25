package tugaspbo;

public class Account {
    protected double balance;

    public Account(double initBalance){
        balance = initBalance;
    }
    public double getBalance(){
        return this.balance;
    }
    public boolean deposit (double atm){
        balance += atm;
        return true;
    }
    public boolean withdraw(double atm){
        balance -= atm;
        return true;
    }
}
class SavingAccount extends Account{
    private double interestRate;

    public SavingAccount(double initBalance, double balance, double interest_rate){
        super(initBalance);
        super.balance = balance;
        this.interestRate = interest_rate;
    }
}
class CheckingAccount extends Account{
    private double overdraftProtection;

    public CheckingAccount(double initBalance, double balance){
        super(initBalance);
        this.balance = balance;
        overdraftProtection = -0.1d;

    }
    public CheckingAccount(double initBalance, double balance, double protect){
        super(initBalance);
        super.balance = balance;
        overdraftProtection = protect;
    }
    public boolean withdraw(double atm){
        super.withdraw(atm);
        double overdraftNeeded = atm - this.balance;
        if(balance - atm >= 0){
            this.balance -= atm;
            return true;
        }
        else {
            if(overdraftProtection == -1.0 || overdraftProtection < overdraftNeeded){
                return false;
            }
            else{
                this.balance = 0.0;
                overdraftProtection -= overdraftNeeded;
                return true;
            }
        }
    }   
}