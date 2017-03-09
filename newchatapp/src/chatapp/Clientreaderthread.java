package chatapp;

import java.io.BufferedReader;

import javax.swing.JTextArea;

public class Clientreaderthread implements Runnable {
	JTextArea area;
	BufferedReader reader;
	
	public Clientreaderthread(JTextArea area, BufferedReader reader){
		this.area=area;
		this.reader=reader;
	}
	@Override
	public void run() {
		try{
			String s;
			while((s=reader.readLine())!=null){
				System.out.println("inside client reader block");
				System.out.println("message/n " +s);
				area.append(s+"\n");
			}
			
		}catch (Exception e) {
			System.out.println("inside reader thread catch block");
			e.printStackTrace();
		}
		
	}

}
