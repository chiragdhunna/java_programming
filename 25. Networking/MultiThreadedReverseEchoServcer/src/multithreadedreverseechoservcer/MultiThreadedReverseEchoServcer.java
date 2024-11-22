/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadedreverseechoservcer;

import java.net.*;
import java.io.*;

/**
 *
 * @author chiragdhunna
 */
public class MultiThreadedReverseEchoServcer extends Thread{
    
    Socket stk;
    
    MultiThreadedReverseEchoServcer(Socket stk){
        this.stk = stk;
    }
    
    public void run(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg;
            StringBuilder sb;

            do{
                msg = br.readLine();
                sb = new StringBuilder(msg);
                msg = sb.reverse().toString();
                ps.println(msg);
            }while(!msg.equals("dne"));
            stk.close();
            
        }catch(Exception e){
            
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ServerSocket ss = new ServerSocket(2000);
        MultiThreadedReverseEchoServcer mtres;
        int count = 1;
        
        do{
          Socket stk = ss.accept();  
          System.out.println("Client Connected : " + count++);
          mtres = new MultiThreadedReverseEchoServcer(stk);
          mtres.start();
        }while(true);
        
        
       
        
    }
    
}


class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Socket stk = new Socket("localhost", 2000);

        BufferedReader keybr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;

        do {
            msg = keybr.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From Server " + msg);
        } while (!msg.equals("dne"));

        stk.close();
    }

}
