package lab10;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class zad2 {

	public static void main(String[] args) {
	try
	{
		ServerSocket s = new ServerSocket(8877);
		while(true)
		{
			Socket conn = s.accept();
			PrintStream p = new PrintStream(conn.getOutputStream());
			p.println("Poloczyles sie z serwerem");
			conn.close();
		}
	}	
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}
}
