/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseecho;

import java.net.*;
import java.io.*;

/**
 *
 * @author chiragdhunna
 */
public class ReverseEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;

        do {
            msg = br.readLine();
            sb = new StringBuilder(msg);
            msg = sb.reverse().toString();
            ps.println(msg);
        } while (!msg.equals("dne"));

        ss.close();
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
