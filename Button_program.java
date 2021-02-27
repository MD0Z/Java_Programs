import java.awt.*;
import java.awt.event.*;

class Button_program extends Frame
{
	Button_program()
	{
		//Creating new label
		Label L1;

		//Creating new Button
		Button B1,B2,B3,B4;

		//To set Label text use
		L1 = new Label("Click on the language you speak");
		//To set Button text use
		B1 = new Button("Hindi");
		B2 = new Button("English");
		B3 = new Button("Hindi + English");
		B4 = new Button("none");
		
		//Adding label to container
		this.add(L1);
		
		//Adding button to container
		this.add(B1);
		this.add(B2);
		this.add(B3);
		this.add(B4);
		
		// Setting X pos, Y pos, width and height of label
		L1.setBounds(100,50,190,40);
		
		// Setting X pos, Y pos, width and height of button
		B1.setBounds(140,140,100,40);
		B2.setBounds(140,230,100,40);
		B3.setBounds(140,320,100,40);
		B4.setBounds(140,410,100,40);

		//frame closing
		addWindowListener(new WindowAdapter()
			{public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
		
		//Setting frame size
		setSize(380,540);
		setTitle("Button Event");
		setLayout(null);
		setVisible(true);
	}

	public static void main(String []args)
	{
		new Button_program();
	}
}
