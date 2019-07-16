import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizScheduling extends JFrame implements MouseListener, ActionListener
{
	private JLabel label1, label2, label5;
	private JComboBox combobox1, combobox2, combobox3;
	private JButton button1, button2;
	private JPanel panel1;
	private String s1[] = {"Progamming Language 1","Progamming Language 2","Discrete Mathmatics","Data Structure","Introduction To DataBase", "Algorithm"};
	private String s2[] = {"A","B","C","D","E"};
	private String s3[] = {"12.3.17", "12.3.17", "12.3.17"};
	
	public QuizScheduling ()
	{
		super("Quiz Scheduling");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		label1 = new JLabel("Course");
		label1.setBounds (60, 40, 150, 50);
		label1.setFont (new Font("Calibri", 1, 26));
		panel1.add(label1);
		
		combobox1 = new JComboBox(s1);
		combobox1.setBounds (60, 100, 200, 50);
		combobox1.setBackground(Color.WHITE);
		panel1.add(combobox1);
		
		label5 = new JLabel("Section");
		label5.setBounds (360, 40, 100, 50);
		label5.setFont (new Font("Calibri", 1, 26));
		panel1.add(label5);
		
		combobox2 = new JComboBox(s2);
		combobox2.setBounds (360, 100, 100, 50);
		combobox2.setBackground(Color.WHITE);
		panel1.add(combobox2);
						
		label2 = new JLabel("Date");
		label2.setBounds (70, 220, 100, 50);
		label2.setFont (new Font("Calibri", 1, 26));
		panel1.add(label2);

		combobox3 = new JComboBox(s3);
		combobox3.setBounds (70, 280, 100, 50);
		combobox3.setBackground(Color.WHITE);
		panel1.add(combobox3);
		
		button2 = new JButton("Submit");
		button2.setBounds (70, 420, 190, 80);
		button2.setBackground (Color.BLUE);
		button2.setForeground(Color.WHITE);
		button2.setFont (new Font("Calibri Light", 1, 20));
		panel1.add (button2);
		
		button1 = new JButton("Back");
		button1.setBounds (320, 420, 190, 80);
		button1.setBackground (Color.BLUE);
		button1.setForeground(Color.WHITE);
		button1.setFont (new Font("Calibri Light", 1, 20));
		button1.addMouseListener(this);
		button1.addActionListener(this);
		panel1.add (button1);
		
		this.add(panel1);
	}
	public void mouseClicked(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m){}
	public void mouseExited(MouseEvent m){}
	
	public void actionPerformed(ActionEvent a)
	{
		String back = a.getActionCommand();
		
		if(back.equals("Back"))
		{
			FacultyGUI FG = new FacultyGUI();
			FG.setVisible(true);
			this.setVisible(false);
		}
		else
		{
			
		}
	}
}