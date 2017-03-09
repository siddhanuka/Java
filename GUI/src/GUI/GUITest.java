package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUITest implements ActionListener {
	JButton button;
	JFrame frame;
	public GUITest()
	{
		frame= new JFrame("sanchit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	    button=new JButton("click me");
		frame.getContentPane().add(button);
		button.addActionListener(this);
		
	}
	public void changeIt()
	{
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GUITest one=new GUITest();
		
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		button.setText("i hav been clicked");
	}

}
