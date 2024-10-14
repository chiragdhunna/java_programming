class Thread1 extends Thread{

    DisplayClass d;
    Thread1(DisplayClass d){
        this.d = d;
    }

    @Override
    public void run() {
        
        d.display("Hello World");
    }
}

class Thread2 extends Thread{
    DisplayClass d;
    Thread2(DisplayClass d){
        this.d = d;
    }

    @Override
    public void run() {
        
        d.display("Welcome All");
    }
}

class DisplayClass{

    synchronized  public void display(String str){
        int i = 0;
        while(i<str.length()){
            System.out.print(str.charAt(i++));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class SynchronisationInJava{
    public static void main(String[] args) {
        DisplayClass data = new DisplayClass();
        Thread1 thread1 = new Thread1(data);
        Thread2 thread2 = new Thread2(data);
        thread1.start();
        thread2.start();
    }
}