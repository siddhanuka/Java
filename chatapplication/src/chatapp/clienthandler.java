package chatapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class clienthandler implements Runnable {
      Socket sock;
      BufferedReader reader;
      ArrayList clientoutputstream;
      PrintWriter writer;
	public clienthandler(Socket sock, ArrayList clientoutputstream, PrintWriter writer) throws IOException {
		this.sock=sock;
		this.clientoutputstream=clientoutputstream;
		this.writer=writer;
		InputStreamReader is=new InputStreamReader(sock.getInputStream());
		reader=new BufferedReader(is);
		System.out.println("inside clent handler constructor");
	}

	@Override
	public void run() {
		String message;
		try {
			while((message=reader.readLine())!=null){
				System.out.println("read"+message);
				telleveryone(message);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void telleveryone(String message) {
		
		java.util.Iterator it= clientoutputstream.iterator();
		while(it.hasNext()){
			try{
			writer=(PrintWriter)it.next();
			writer.println(message);
			writer.flush();
			}catch(Exception e)
			{
				System.out.println("inside telleveryone");
				e.printStackTrace();
			}
		}
	}
}
