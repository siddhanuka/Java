package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;

public class Graphics_test implements ActionListener  {
	private static final Border Border = null;
	JFrame f;
	JButton button1=new JButton("button1");
	JButton button2=new JButton("button2");
	DrawPanel panel1=new DrawPanel();
	JPanel panel2=new JPanel();
	
	
	public Graphics_test(){
		
		f=new JFrame("sanchit");
		
		f.getContentPane().add(BorderLayout.CENTER,panel1);
		
		//f.getContentPane().add(BorderLayout.EAST,button1);
		panel1.add(button2);
		//panel1.setBackground(Color.black);
		button2.addActionListener(this);
		
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	

	
	public static void main(String[] args) {
		Graphics_test b=new Graphics_test();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		panel1.setBackground(Color.black);
		
	}

}
