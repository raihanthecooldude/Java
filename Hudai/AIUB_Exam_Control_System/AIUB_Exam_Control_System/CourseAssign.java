import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CourseAssign extends JFrame implements ActionListener
{
	private JLabel label1, label2, label3, label4, label5, label6, label7;
	private JComboBox combobox1, combobox2, combobox3, combobox4, combobox5, combobox6, combobox7;
	private JPasswordField passwordfield1;
	private JButton button1, back, logout;
	private ImageIcon image;
	private JPanel panel1;
	private String s1[] = {"Progamming Language 1","Progamming Language 2","Discrete Math","Data Structure","Introduction To DataBase", "Algorithm"};
	private String s2[] = {"A","B","C","D","E"};
	private String s3[] = {"Slot 1","Slot 2","Slot 3"};
	private String s4[] = {"1101","1102","1210","2204","6120"};
	private String s5[] = {"Mir Riyanul Islam","Mohaimen Bin Noor","Victor Stany Rozario","Hasibul Hasan","Rezwan Ahmed"};
	private String s6[] = {"Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6"};
	private String s7[] = {"Annex 1", "Annex 2", "Annex 3", "Annex 4", "Annex 5", "Annex 6"};
	
	public CourseAssign ()
	{
		super("Course Assigning");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		label1 = new JLabel("Course");
		label1.setBounds (60, 40, 150, 50);
		label1.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label1);
		combobox1 = new JComboBox(s1);
		combobox1.setBounds (60, 90, 200, 40);
		combobox1.setBackground(Color.WHITE);
		panel1.add(combobox1);
		
		label3 = new JLabel("Section");
		label3.setBounds (360, 40, 100, 50);
		label3.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label3);
		combobox2 = new JComboBox(s2);
		combobox2.setBounds (360, 90, 80, 40);
		combobox2.setBackground(Color.WHITE);
		panel1.add(combobox2);		
		
		label5 = new JLabel("Faculty Name");
		label5.setBounds (60, 200, 450, 50);
		label5.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label5);
		combobox5 = new JComboBox(s5);
		combobox5.setBounds (60, 250, 250, 40);
		combobox5.setBackground(Color.WHITE);
		panel1.add(combobox5);
		
		button1 = new JButton("Submit");
		button1.setBounds (246, 500, 100, 35);
		button1.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		button1.setForeground(Color.WHITE);
		button1.setFont (new Font("Calibri Light", 1, 20));
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
		
		
		this.add(panel1);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		String btn = a.getActionCommand();
		
		if(btn.equals("Submit"))
		{
		}
		else if(btn.equals("Back"))
		{
			Admin TG = new Admin();
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