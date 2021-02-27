import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class checkboxdemo extends Frame
{
	checkboxdemo()
	{
		//closing frame
        	addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);   
			}	
		});
		
		//Creating new label
		Label L1;

		//Creating new checkboxes
		Checkbox CB1,CB2,CB3;
		
		//To set label text use
		L1 = new Label("Select programming language");
		
		// Setting text and state of Checkbox
		CB1 = new Checkbox("Java",false);
		CB2 = new Checkbox("C++",false);
		CB3 = new Checkbox("Python",false);
		
		// Setting X pos, Y pos, width and height of label
		L1.setBounds(110,100,250,30);
		
		// Setting X pos, Y pos, width and height of Checkbox
		CB1.setBounds(80,170,60,50);
		CB2.setBounds(170,170,60,50);
		CB3.setBounds(250,170,60,50);
		
		//Adding label to container
		add(L1);	
		
		//Adding Checkbox to container
		add(CB1);
		add(CB2);
		add(CB3);
		
		//Setting frame size
		setSize(400,320);
		setLayout(null);
		setVisible(true);  
	}


	//driver class
	public static void main(String[] args)
	{
		checkboxdemo frame = new checkboxdemo();
	}
}
