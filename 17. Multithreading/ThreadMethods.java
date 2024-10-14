class MethodRunnable implements Runnable{

    @Override
    public void run(){
        
    }
}

class MethodThread extends Thread{

    public MethodThread(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    @Override
    public void run(){
        int count  = 0;
        while(true){
            System.out.println(count++ + " Method Thread");
            // try {
            //     // Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     System.out.println(e);
            // }
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) throws Exception{
        // Thread mr = new Thread(new MethodRunnable(),"My Custom Thread");

        // Printing Properties of the Thread mr
        // System.out.println("Thread ID : " + mr.threadId() + "\nThread Name : " + mr.getName() + "\nPriority : " + mr.getPriority() + "\nState : " + mr.getState());
    

        MethodThread thread2 = new MethodThread("");
        
        // Printing Priorities of the Thread thread2
        // System.out.println("Priority of Thread 2 is : " + thread2.getPriority());
        
        // Settings the thread2 to daemon to be true so that it closes when main method ends
        // Here we kept the main method sleep for few seconds to show that it will end the 
        // thread2 on completion
        // thread2.setDaemon(true);
        thread2.start();
        // try{Thread.sleep(5000);}catch(Exception e){} 

        // Thread mainThread = Thread.currentThread();
        // mainThread.join();

        // Using yield to give more time for other thread to execute
        int count  = 0;
        while(true){
            System.out.println(count++ + " Main Thread");
            // Thread.sleep(1000);
            Thread.yield();
        }
    }
}
