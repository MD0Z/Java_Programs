import java.awt.*;
import java.applet.*;
import java.awt.Color;
public class Smiley extends Frame
{
	Smiley()
	{
		public void paint(Graphics g){
			g.setColor(Color.yellow);
			g.fillOval(40,40,300,390);	//head
			g.setColor(Color.white);
			g.fillOval(100,120,50,35);	//lefteye
			g.fillOval(230,120,50,35);	//righteye
			g.setColor(Color.black);
			g.fillOval(115,130,20,20);	//pupil(left)
			g.fillOval(247,130,20,20);	//pupil(right)
			g.drawOval(85,100,30,30);	//nose
			g.fillArc(60,125,80,40,180,180);//mouth
		}
		//closing frame
        	addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);   
			}	
		});
		//Setting frame size
		setSize(400,400);
		setLayout(null);
		setVisible(true); 
	}
	public static void main(String []args)
	{
		new Smiley();
	}
}