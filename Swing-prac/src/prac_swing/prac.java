package prac_swing;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class prac implements ActionListener {
	JTextArea area;
	JScrollPane bar;
	JPanel panel1;
	JFrame frame;
	JButton button;
	static int count;
       
	public void go()
	{
		area=new JTextArea(10,20);
		bar=new JScrollPane(area);
		//area.setLineWrap(true);
		bar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		bar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel1 =new JPanel();
		panel1.add(bar);
		button=new JButton("clicked");
		button.addActionListener(this);
		
		frame=new JFrame("SANCHIT");
		frame.getContentPane().add(BorderLayout.CENTER,panel1);
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		frame.setSize(350,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		
	}
	
	public static void main(String[] args) {
		prac one=new prac();
		one.go();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		area.append("i have been clicked " +count + "\n");
		//area.setText("i have been clicked "+count);
		
	}

}
