package chatapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

import javax.swing.JTextField;

public class Sendbuttonlistner implements ActionListener {
	PrintWriter writer;
	JTextField textfield;
	
	public Sendbuttonlistner(PrintWriter writer, JTextField textfield) {
		this.writer=writer;
		this.textfield=textfield;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("inside action performed-starting");
		try{
		writer.println(textfield.getText());
		writer.flush();
		}catch(Exception e){
			System.out.println("inside action performed catch block");
			e.printStackTrace();
		}
		textfield.setText("");
		textfield.setFocusable(true);
		System.out.println("inside action performed-ending");
		
	}

}
