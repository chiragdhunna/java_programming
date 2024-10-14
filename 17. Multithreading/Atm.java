class Customer extends Thread{
    ATM atm;
    String name;
    double amount;

    Customer(String name, ATM atm, double amount){
        this.name = name;
        this.amount = amount;
        this.atm = atm;
    }

    public void useAtm(){
        atm.checkBalance(name);
        atm.withdraw(name,amount);
    }

    @Override
    public void run(){
        useAtm();
    }
}

class ATM{
    double balance = Math.random()*200;

    synchronized  public void checkBalance(String name){
        System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1) + " Your Current Balance is : "  + balance);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    synchronized public void withdraw(String name , double amount){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        balance -= amount;
        System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1) + " amount withdraw "+ amount);
        checkBalance(name);
    }
}

public class Atm {
    public static void main(String[] args) {
        Customer mia = new Customer("mia",new ATM(),Math.random()*20);
        Customer lana = new Customer("lana",new ATM(),Math.random()*20);
        Customer ann = new Customer("ann",new ATM(),Math.random()*20);
        Customer kagney = new Customer("kagney",new ATM(),Math.random()*20);

        mia.start();
        lana.start();
        ann.start();
        kagney.start();
    }
}
