import java.util.Date;

class Account {
    protected String name;
    protected String accountNumber;
    protected Date dob;
    protected String address;
    protected String phoneNumber;
    protected double balance;

    Account() {
        this.accountNumber = Math.random() + "";
        this.balance = 0;
    }

    Account(String name, Date dob, String address, String phoneNumber) {
        this.accountNumber = Math.random() + "";
        this.address = address;
        this.name = name;
        this.dob = dob;
        this.balance = 0;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAddress() {
        return address;
    }

    public Date getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void close() {
        this.close();
    }
}

class SavingsAccount extends Account {

    protected double fixedDeposit;

    public void setFixedDeposit(double fixedDeposit) {
        this.fixedDeposit = fixedDeposit;
        this.balance -= fixedDeposit;
    }

    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public double liquidate() {
        double totalAmount = this.fixedDeposit + this.balance;
        this.fixedDeposit = 0;
        this.balance = totalAmount;
        return totalAmount;
    }
}

class Loan extends Account {
    protected double loanAmount;
    protected String loanApplicationNumber;

    public double getLoanAmount() {
        return loanAmount;
    }

    public String getLoanApplicationNumber() {
        return loanApplicationNumber;
    }

    public double EMI(double amount) {
        this.loanAmount -= amount;
        return this.loanAmount;
    }

    public double loanTopUp(double amount) {
        this.loanAmount -= amount;
        return this.loanAmount;
    }

    public double rePayment(double amount) {
        this.loanAmount -= amount;
        return this.loanAmount;
    }
}

public class AccountCustomer {
    public static void main(String[] args) {

    }
}
