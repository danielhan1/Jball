import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Jball extends JComponent
{
	private Ellipse2D.Double ball;
	
	public Jball()
	{
		ball = new Ellipse2D.Double(0,0,10,10);
		this.setSize(11,11);
		
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(ball);
	}
	
}
