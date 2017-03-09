package chatapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Serverside {
        
        ArrayList clientoutputstream=new ArrayList();
        static int i;
	
	public static void main(String[] args) {
		new Serverside().go();

	}

	private void go() {
		try { 
			System.out.println("inside server");
			ServerSocket ss=new ServerSocket(5000);
			while(true){
			Socket clientsocket=ss.accept();
			PrintWriter writer=new PrintWriter(clientsocket.getOutputStream());
			clientoutputstream.add(writer);
			Thread t1=new Thread(new Serverwriter(clientoutputstream,clientsocket,writer));
			t1.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
