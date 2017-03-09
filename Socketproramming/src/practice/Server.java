package practice;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	String[] advice ={"abc","def","ghi","jkl","mno"};
	
	public void go(){
		try{
			ServerSocket serversock=new ServerSocket(5000);
			
			while(true){
				Socket sock=serversock.accept();
				
				PrintWriter writer=new PrintWriter(sock.getOutputStream());
				
				String s=getadvice();
				
				writer.println(s);
				
				writer.close();
				
				System.out.println("server"+s);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	private String getadvice() {
		
		int random=(int)(Math.random()*advice.length);
		
		return advice[random];
	}
	
	public static void main(String[] args) {
		Server s=new Server();
		
		s.go();
		

	}

}
