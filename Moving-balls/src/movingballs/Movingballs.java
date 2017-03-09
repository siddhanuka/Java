package movingballs;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;


public class Movingballs extends JFrame {

	public void paint(Graphics g){
		g.setColor(Color.gray);
		g.fillOval(30, 60, 50, 50);
		g.setColor(Color.red);
		g.fillOval(30, 120, 50, 50);
		g.setColor(Color.green);
		g.fillOval(30, 180, 50, 50);
		repaint();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JFrame f=new Movingballs();
        f.setSize(700, 700);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.repaint();
        
	}

}
