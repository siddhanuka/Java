package moving_ball;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class moving_ball implements ActionListener {
	JFrame frame;
	JButton button;
	Draw_panel panel;
	int x=70;
	int y=70;

	public moving_ball()
	{
		frame= new JFrame();
		button=new JButton("move");
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		button.addActionListener(this);
		panel=new Draw_panel();
		panel.x=x;
		panel.y=y;
		frame.getContentPane().add(BorderLayout.CENTER,panel);

		frame.setSize(300, 300);
		frame.setVisible(true);

	}


	public static void main(String[] args) {
		moving_ball ball=new moving_ball();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("haaaa");
		while(x<200){
			x++;
			System.out.println(x);
			panel.repaint();
			panel.x=x;
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}

	}
	}
