package chatapp;

import java.io.BufferedReader;

import javax.swing.JTextArea;

public class readmessage implements Runnable {
	String message;
	BufferedReader bf;
	JTextArea area;
	public readmessage(BufferedReader bf, JTextArea area){
		this.bf=bf;
		this.area=area;
	}
	@Override
	public void run() {
		try{
			while((message=bf.readLine())!=null){
				System.out.println("read "+message);
				area.append(message+"\n");
			}
				
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
