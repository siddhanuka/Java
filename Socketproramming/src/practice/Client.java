package practice;

import java.net.Socket;
import java.io.*;

public class Client {

	public void go(){
		try{
			Socket chatsock=new Socket("127.0.0.1",5000);
			
			InputStreamReader is=new InputStreamReader(chatsock.getInputStream());
			
			BufferedReader reader=new BufferedReader(is);
			
			String s=reader.readLine();
			
			System.out.println("today "+s);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client one=new Client();
		one.go();
		

	}

}
