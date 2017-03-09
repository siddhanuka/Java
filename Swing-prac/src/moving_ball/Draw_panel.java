package moving_ball;
import java.awt.Color;
import java.awt.Graphics;


import javax.swing.*;
     
public class Draw_panel extends JPanel {
	int x;
	int y;
	
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillOval(x, y, 50, 50);
		System.out.println("in paint");
	}
}
