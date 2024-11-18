class MyData {
    int value;
    boolean flag = true;

    synchronized public void setValue(int value) {
        while (flag != true)
            try {
                wait();
            } catch (Exception e) {
            }

        this.value = value;
        flag = false;
        notify();
    }

    synchronized public int getValue() {
        while (flag != false)
            try {
                wait();
            } catch (Exception e) {
            }

        flag = true;
        notify();
        return value;
    }
}

class ProducerIP extends Thread {
    MyData data;

    public ProducerIP(MyData data) {
        this.data = data;
    }

    @Override
    public void run() {
        int counter = 0;
        while (true) {
            data.setValue(counter);
            System.out.println("ProducerIP : " + counter);
            counter++;
            // try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}

class CustomerIP extends Thread {
    MyData data;

    public CustomerIP(MyData data) {
        this.data = data;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("CustomerIP : " + data.getValue());
            // try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}

public class InterProcessCommunication {
    public static void main(String[] args) {
        MyData data = new MyData();
        ProducerIP producer = new ProducerIP(data);
        CustomerIP consumer = new CustomerIP(data);
        producer.start();
        consumer.start();
    }
}
