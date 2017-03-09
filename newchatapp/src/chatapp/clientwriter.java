package chatapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

import javax.swing.JTextField;

public class clientwriter  implements ActionListener {
     JTextField field;
     PrintWriter writer;
     
     public clientwriter(JTextField field, PrintWriter writer){
    	 this.field=field;
    	 this.writer=writer;
     }
     
     
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try{
		System.out.println("inside action performed");
		writer.println(field.getText());
		writer.flush();
		field.setText("");
		System.out.println("action performed");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
