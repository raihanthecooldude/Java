import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin extends JFrame implements ActionListener
{
	private JLabel label1, label2;
	private JRadioButton rbutton1, rbutton2, rbutton3;
	private JPanel panel1;
	private ButtonGroup bg1;
	private JButton button1, back, logout;
	private ImageIcon image1, image2;
	
	public Admin ()
	{
		super("Admin");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		rbutton1 = new JRadioButton("Course Assigning");
		rbutton1.setBounds(150, 300, 400, 50);
		rbutton1.setBackground(Color.WHITE);
		panel1.add(rbutton1);
		
		rbutton2 = new JRadioButton("Exam Scheduling");
		rbutton2.setBounds(150, 350, 400, 50);
		rbutton2.setBackground(Color.WHITE);
		panel1.add(rbutton2);
		
		rbutton3 = new JRadioButton("Invigilator Assigning");
		rbutton3.setBounds(150, 400, 400, 50);
		rbutton3.setBackground(Color.WHITE);
		panel1.add(rbutton3);
		
		bg1 = new ButtonGroup();
		bg1.add(rbutton1);
		bg1.add(rbutton2);
		bg1.add(rbutton3);
		
		button1 = new JButton("Done");
		button1.setBounds (246, 500, 100, 35);
		button1.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		button1.setForeground(Color.WHITE);
		button1.setFont (new Font("Calibri Light", 1, 20));
		button1.addActionListener(this);
		panel1.add (button1);
		
		back = new JButton("Back");
		back.setBounds (20, 8, 100, 35);
		back.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		back.setForeground(Color.WHITE);
		back.setFont (new Font("Calibri", 1, 20));
		back.addActionListener(this);
		panel1.add (back);
		
		logout = new JButton("Log Out");
		logout.setBounds (460, 8, 100, 35);
		logout.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		logout.setForeground(Color.WHITE);
		logout.setFont (new Font("Calibri", 1, 20));
		logout.addActionListener(this);
		panel1.add (logout);
		
		label1 = new JLabel("Choose Your Option");
		label1.setBounds (100, 250, 300, 50);
		label1.setFont (new Font("Calibri Light", 0, 32));
		label1.setBackground(Color.WHITE);
		panel1.add(label1);
		
		/*image1 = new ImageIcon (getClass().getResource("back.png"));
		label1 = new JLabel (image1);
		label1.setBounds(10, 8, 50, 50);
		label1.addActionListener(this);
		panel1.add(label1);
		
		image2 = new ImageIcon (getClass().getResource("settings.jpg"));
		label2 = new JLabel (image2);
		label2.setBounds(520, 8, 50, 50);
		panel1.add(label2);*/
		
		this.add(panel1);
	}
	
	
	public void actionPerformed(ActionEvent a)
	{
		String btn = a.getActionCommand();
		
		if(btn.equals("Done"))
		{
			if(rbutton1.isSelected())
			{
				CourseAssign ca = new CourseAssign();
				ca.setVisible(true);
				this.setVisible(false);
			}
			else if(rbutton2.isSelected())
			{
				AdminCourse QS = new AdminCourse ();
				QS.setVisible (true);
				this.setVisible(false);
			}
			else if(rbutton3.isSelected())
			{
				FacultyGUI QS = new FacultyGUI ();
				QS.setVisible (true);
				this.setVisible(false);
			}
		}
		else if(btn.equals("Back"))
		{
			TempGUI TG = new TempGUI();
			TG.setVisible(true);
			this.setVisible(false);
		}
		else if(btn.equals("Log Out"))
		{
			TempGUI TG = new TempGUI();
			TG.setVisible(true);
			this.setVisible(false);
		}
		else{}
	}
}