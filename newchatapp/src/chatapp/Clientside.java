package chatapp;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Clientside {
     JFrame f;
     JPanel panel;
     JTextArea area;
     JTextField field;
     JButton send;
     JScrollPane pane;
     Socket clientsocket;
     InputStreamReader is;
     BufferedReader reader;
     PrintWriter writer;
     
	
	public static void main(String[] args) {
		Clientside cs=new Clientside();
		cs.go();

	}


	private void go() {
		
		getsocketconnection();
		
		f=new JFrame("CHAT APPLICATION");
		panel=new JPanel();
		area=new JTextArea(30,30);
		area.setLineWrap(true);
		area.setEditable(false);
		pane=new JScrollPane(area);
		pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		field=new JTextField(25);
		send=new JButton("SEND");
		send.addActionListener(new clientwriter(field,writer));
		
		panel.add(pane);
		panel.add(field);
		panel.add(send);
		
		
		f.getContentPane().add(BorderLayout.CENTER,panel);
		f.setSize(500,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Thread t=new Thread(new Clientreaderthread(area,reader));
		t.start();
	}


	private void getsocketconnection() {
		// TODO Auto-generated method stub
		try {
			clientsocket=new Socket("127.0.0.1",5000);
			is=new InputStreamReader(clientsocket.getInputStream());
			reader=new BufferedReader(is);
			writer=new PrintWriter(clientsocket.getOutputStream());
			System.out.println("connection established");
		 } 
		  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
