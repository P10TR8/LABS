package lab10;

import java.io.*;
import java.net.*;

public class server {
    ServerSocket providerSocket;
    Socket connection = null;
    ObjectOutputStream out;
    ObjectInputStream in;
    String message;

    server() {
    }

void run()
{
    try{
        providerSocket = new ServerSocket(1000, 10);
        System.out.println("Oczekiwanie na polaczenie");
        connection = providerSocket.accept();
        out = new ObjectOutputStream(connection.getOutputStream());
        out.flush();
        in = new ObjectInputStream(connection.getInputStream());
        sendMessage("Wyslano komunikat do klienta");
  
        do{
            try{
                message = (String)in.readObject();

                if (message.equals("Nawiazano komunikacje i wyslano odpowiedz"))
                    Thread.sleep(2000);
                    sendMessage("Polaczenie zatwierdzone");
            }
            catch(ClassNotFoundException classnot){
                System.err.println("Bledne dane");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while(!message.equals("Nawiazano komunikacje i wyslano odpowiedz"));
    }
    catch(IOException ioException){
        ioException.printStackTrace();
    }
    finally{

        try{
            in.close();
            out.close();
            providerSocket.close();
        }
        catch(IOException ioException){
        }
    }
}
    void sendMessage(String wiadomosc)
    {
        try{
            out.writeObject(wiadomosc);
            out.flush();
            System.out.println(wiadomosc);
        }
        catch(IOException ioException){
            ioException.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        server se = new server();
        while(true){
            se.run();
        }
    }
}