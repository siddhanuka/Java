package chatapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class Serverwriter implements Runnable {
    
	PrintWriter writer;
	ArrayList clientoutputstream;
	Socket sock;
	BufferedReader br;
	 
	public Serverwriter(ArrayList clientoutputstream ,Socket sock, PrintWriter writer) {
		
		this.clientoutputstream=clientoutputstream;
		this.sock=sock;
		this.writer=writer;
		try {
			InputStreamReader is=new InputStreamReader(sock.getInputStream());
	        br=new BufferedReader(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		String s;
		try{
			while((s=br.readLine())!=null){
				System.out.println("inside server reader");
				System.out.println("message "+s);
				telleveryclient(s);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void telleveryclient(String s) {
		Iterator it=clientoutputstream.iterator();
		try{
		while(it.hasNext()){
			System.out.println("inside server writer");
			writer=(PrintWriter)it.next();
			writer.println(s);
			writer.flush();
		                    }
		}catch (Exception e) {
			// TODO: handle exception
		}
		}
	}


