import java.awt.*;
import java.awt.event.*;
public class Image_program extends Frame
{
	Image img1;
	String Picture = "Goku_UI.jpg";

	public void paint(Graphics g)
	{
		Toolkit tool = Toolkit.getDefaultToolkit(); 
		img1 = tool.getImage(Picture); 
		g.drawImage(img1,0,30,this);
	}

	public Image_program()
	{	//setting frame
		setTitle("Image_program");
		setSize(778,640);
		setVisible(true);
		setLayout(null);

		//frame Closing
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
	}
	//main method
	public static void main(String[] args)
	{
  		Image_program ip = new Image_program(); 	
	}
}