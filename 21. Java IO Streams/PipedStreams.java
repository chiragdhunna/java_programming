import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread {
    OutputStream os;

    Producer(OutputStream os) {
        this.os = os;
    }

    @Override
    public void run() {
        int count = 1;

        while (true) {
            try {

                os.write(count);
                os.flush();

                System.out.println("Producer : " + count);
                System.out.flush();

                Thread.sleep(10);

                count++;
            } catch (Exception e) {
            }
        }
    }

}

class Consumer extends Thread {
    InputStream is;

    Consumer(InputStream is) {
        this.is = is;
    }

    @Override
    public void run() {
        int x;

        while (true) {
            try {

                x = is.read();

                System.out.println("Consumer : " + x);
                System.out.flush();

                Thread.sleep(10);

            } catch (Exception e) {
            }
        }
    }

}

public class PipedStreams {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}
