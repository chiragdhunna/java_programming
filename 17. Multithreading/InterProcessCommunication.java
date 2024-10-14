class MyData{
    int value;
    boolean flag = true;

    synchronized  public void setValue(int value){
        while(flag!=true)
            try{wait();}catch(Exception e){}

        this.value = value;
        flag =false;
        notify();
    }

    synchronized public int getValue(){
        while(flag!=false)
            try{wait();}catch(Exception e){}

        flag = true;
        notify();
        return value;
    }
}

class Producer extends Thread{
    MyData data;

    public Producer(MyData data) {
        this.data = data;
    }

    @Override
    public void run(){
        int counter = 0;
        while(true){
            data.setValue(counter);
            System.out.println("Producer : " + counter);
            counter++;
            // try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}

class Consumer extends Thread{
    MyData data;

    public Consumer(MyData data) {
        this.data = data;
    }

    @Override
    public void run(){
        while(true){
            System.out.println("Consumer : " + data.getValue());
            // try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}

public class InterProcessCommunication {
    public static void main(String[] args) {
        MyData data = new MyData();
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);
        producer.start();
        consumer.start();
    }
}
