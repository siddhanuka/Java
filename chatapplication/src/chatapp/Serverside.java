package chatapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Serverside {

	ArrayList clientoutputstream;
	public static void main(String[] args) {
		new Serverside().go();
		}
	private void go() {
		clientoutputstream=new ArrayList();
		
		try {
			System.out.println("inside server");
			ServerSocket serversock=new ServerSocket(5000);
			
			while(true){
				
				Socket clientsocket=serversock.accept();
				PrintWriter writer=new PrintWriter(clientsocket.getOutputStream());
				clientoutputstream.add(writer);
				System.out.println("inside server connection establish while loop");
				
				Thread t=new Thread(new clienthandler(clientsocket, clientoutputstream, writer));
				t.start();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
