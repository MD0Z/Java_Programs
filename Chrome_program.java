import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
 
public class Chrome_program extends Frame 
{
    public Chrome_program()
    {
        setTitle("Chrome logo");
        setSize(800,760);
        setVisible(true);
	setLayout(null);

	addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});
    }
 
    public void paint(Graphics g)
    {
	g.setColor(Color.BLACK);
	g.drawOval(175,175, 430,430);
	g.fillOval(175,175, 430,430);

	g.setColor(Color.GREEN);
	g.drawArc(180,180, 420,420,160,110);
	g.fillArc(180,180, 420,420,160,110);

	g.setColor(Color.RED);
	g.drawArc(180,180, 420,420,30,130);
	g.fillArc(180,180, 420,420,30,130);
	int e[] = {310,192,380,310};
	int f[] = {430,317,317,430};
	g.drawPolygon(e,f,4);
	g.fillPolygon(e,f,4);

	g.setColor(Color.ORANGE);
	g.drawArc(180,180, 420,420,270,120);
	g.fillArc(180,180, 420,420,270,120);
	int c[] = {400,570,400,400};
	int d[] = {300,287,400,300};
	g.drawPolygon(c,d,4);
	g.fillPolygon(c,d,4);

	g.setColor(Color.GREEN);
	int a[] = {477,390,380,477};
	int b[] = {415,598,400,415};
	g.drawPolygon(a,b,4);
	g.fillPolygon(a,b,4);

	g.setColor(Color.white);
	g.drawOval(300,300, 185,185);
	g.fillOval(300,300, 185,185);

	g.setColor(Color.blue);
	g.drawOval(307,307, 170,170);
	g.fillOval(307,307, 170,170);

    }
 
    public static void main(String args[])
    {
        Chrome_program t = new Chrome_program();
    }
}