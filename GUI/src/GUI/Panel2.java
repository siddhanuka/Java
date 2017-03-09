package GUI;
import javax.swing.*;
import java.awt.*;

public class Panel2 extends JPanel {
	public void paintComponent(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, getHeight(), getWidth());
		 
		int red=(int)(Math.random()*255);
		int green=(int)(Math.random()*255);
		int blue=(int)(Math.random()*255);
		System.out.println("Paint component called!!");
		Color randomcolor=new Color(red,green,blue);
		g.setColor(randomcolor);
	    g.fillOval(145, 145, 100, 100);
	    //repaint();
	}
}
