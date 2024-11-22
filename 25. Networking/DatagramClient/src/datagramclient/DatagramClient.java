/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datagramclient;

import java.net.*;

/**
 *
 * @author chiragdhunna
 */
public class DatagramClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        DatagramSocket ds = new DatagramSocket(2001);
        String msg = "Hello World";
        DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2000);
        ds.send(dp);
        
        byte b[] = new byte[1024];
        
        dp = new DatagramPacket(b,1024);
        ds.receive(dp);
        msg = new String(dp.getData()).trim();
        System.out.println("Message from Server " + msg);
        ds.close();
    }
    
}


class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        DatagramSocket ds = new DatagramSocket(2000);
        byte b[] = new byte[1024];
        
        DatagramPacket dp = new DatagramPacket(b,1024);
        ds.receive(dp);
        
        String msg = new String(dp.getData()).trim();
        System.out.println("Message from Client " + msg);
        StringBuilder sb = new StringBuilder(msg);
        sb.reverse();
        msg = sb.toString();
        
        dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2001);
        ds.send(dp);
        
        ds.close();
    }
    
}
