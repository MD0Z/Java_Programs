import java.awt.*;
import java.awt.event.*;

public class Choice_program extends Frame
{
	Choice_program()
	{
		setTitle("Practice Program (Choice)");
		setSize(450,320);
		setVisible(true);
		setLayout(null);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		Label L1,L2,L3,L4,L5,L6;
		L1 = new Label("Select your Windows version");
		L2 = new Label("Please Select a Windows Version");
		L3 = new Label("Enter an index number from List");
		L4 = new Label();
		L5 = new Label("To remove Selected option press remove");
		L6 = new Label();
		L1.setBounds(30,40,160,50);
		L2.setBounds(30,80,300,50);
		L3.setBounds(30,120,200,50);
		L4.setBounds(30,160,230,50);
		L5.setBounds(30,200,230,50);
		L6.setBounds(30,240,300,50);
		add(L1);
		add(L2);
		add(L3);
		add(L5);
		
		Button B1,B2,B3;
		B1 = new Button("Show");
		B2 = new Button("OK");
		B3 = new Button("Remove");
		B1.setBounds(330,50,80,30);
		B2.setBounds(330,130,80,30);
		B3.setBounds(330,210,80,30);
		add(B1);
		add(B2);
		add(B3);
		
		TextField T1;
		T1 = new TextField("0");
		T1.setBounds(240,130,80,30);
		add(T1);
		
		Choice C1 = new Choice();
		C1.setBounds(200,55,110,50);
		C1.add("Windows 2000");
		C1.add("Windows Vista");
		C1.add("Windows 7");
		C1.add("Windows 8");
		C1.add("Windows 10");
		add(C1);

		L6.setText("Total option available are " +C1.getItemCount() );
		add(L6);
		B1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if((C1.getItemCount()) == 0)
				{
					L2.setText("no option are available");
				}
				else
				{
					L2.setText("The version you selected is "+ C1.getItem(C1.getSelectedIndex()) +" at index " +C1.getSelectedIndex());
					add(L2);
				}
			}
		});
		
		B2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String SInput = T1.getText();
				int num = Integer.parseInt(SInput);
				if((num <= C1.getItemCount()) && (num > -1))
				{
					L4.setText("At index "+num +" the option is " +C1.getItem(num));
					add(L4);
				}
				else
				{
					L4.setText("please input number from range 0 to "+C1.getItemCount());
					add(L4);
				}
			}
		});
		
		B3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent be)
			{
				C1.remove(C1.getSelectedIndex());
				L6.setText("Total option available are "+C1.getItemCount());
				add(L6);
			}
		});
	}
	public static void main(String[] args)
	{
		Choice_program Cp = new Choice_program();
	}
}