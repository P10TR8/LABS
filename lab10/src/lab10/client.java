package lab10;

import java.io.*;
import java.net.*;

public class client {
    Socket requestSocket;
    ObjectOutputStream out;
    ObjectInputStream in;
    String message;

    client() {
    }

    void run() {
        try {

            requestSocket = new Socket("localhost", 1000);
            out = new ObjectOutputStream(requestSocket.getOutputStream());
            
            out.flush();
            
            in = new ObjectInputStream(requestSocket.getInputStream());
            do {
                try {
                    message = (String) in.readObject();
                    if (message.equals("Wyslano komunikat do klienta")) {
                       
                    	
                    	sendMessage("Nawiazano komunikacje i wyslano odpowiedz");

                    }
                    Thread.sleep(120000);
                    sendMessage("Koniec pracy");
                    requestSocket.close();
                } catch (ClassNotFoundException classNot) {
 
                    System.err.println("Bledne dane");
               
                
                
                } catch (InterruptedException e) {

                }
            } while (!message.equals("Bledny komunikat"));
        } catch (UnknownHostException unknownHost) {
          
        	System.err.println("Blad polaczenia");
        } catch (IOException ioException) {
         
        	ioException.printStackTrace();
        } finally {
            
        	
        	try {
                in.close();
                out.close();
                requestSocket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    void sendMessage(String wiadomosc) {
        try {
            out.writeObject(wiadomosc);
            out.flush();
            System.out.println(wiadomosc);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void main(String args[]) {
        client cl = new client();
        cl.run();
    }
}