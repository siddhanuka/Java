package chatapp;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Clientside {

	JFrame frame;
	JTextField textfield;
	JTextArea textarea;
	JButton sendbutton;
	JPanel panel;
	Socket socket;
	InputStreamReader reader;
	BufferedReader bf;
	PrintWriter writer;
	
	public static void main(String[] args) {
		Clientside client=new Clientside();
		client.go();

	}

	private void go() {
		setupnetwork();
		frame=new JFrame("CHAT APPLICATION");
		panel=new JPanel();
		textarea=new JTextArea(20,30);
		textfield=new JTextField(25);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setEditable(false);
		JScrollPane scrollpane=new JScrollPane(textarea);
		scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		sendbutton=new JButton("SEND");
		sendbutton.addActionListener(new Sendbuttonlistner(writer, textfield));
		panel.add(scrollpane);
		panel.add(textfield);
		panel.add(sendbutton);
		
		
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Thread t=new Thread(new readmessage(bf,textarea));
		t.run();
		
		//frame.getContentPane().add(BorderLayout.CENTER, panel);
		//frame.setSize(500,500);
		//frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private void setupnetwork() {
		try {
			socket=new Socket("127.0.0.1", 5000);
			reader=new InputStreamReader(socket.getInputStream());
			bf=new BufferedReader(reader);
			writer=new PrintWriter(socket.getOutputStream());
			System.out.println("Network established");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
