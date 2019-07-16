import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExamDuty extends JFrame implements MouseListener, ActionListener
{
	private JLabel label1, label2, label3, label4, label5;
	private JLabel label11, label22, label33, label44, label55;
	private JButton button1;
	private JPanel panel1;
	
	public ExamDuty ()
	{
		super("Exam Duty");
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
		
		label11 = new JLabel("Course");
		label11.setBounds (60, 100, 150, 50);
		label11.setFont (new Font("Calibri", 0, 26));
		panel1.add(label11);
		
		label5 = new JLabel("Section");
		label5.setBounds (360, 40, 100, 50);
		label5.setFont (new Font("Calibri", 1, 26));
		panel1.add(label5);
		
		label55 = new JLabel("Section");
		label55.setBounds (360, 100, 100, 50);
		label55.setFont (new Font("Calibri", 0, 26));
		panel1.add(label55);
						
		label2 = new JLabel("Day");
		label2.setBounds (60, 220, 100, 50);
		label2.setFont (new Font("Calibri", 1, 26));
		panel1.add(label2);

		label22 = new JLabel("Day");
		label22.setBounds (60, 280, 100, 50);
		label22.setFont (new Font("Calibri", 0, 26));
		panel1.add(label22);
		
		label3 = new JLabel("Slot");
		label3.setBounds (230, 220, 100, 50);
		label3.setFont (new Font("Calibri", 1, 26));
		panel1.add(label3);
		
		label33 = new JLabel("Slot");
		label33.setBounds (230, 280, 100, 50);
		label33.setFont (new Font("Calibri", 0, 26));
		panel1.add(label33);
				
		label4 = new JLabel("Room");
		label4.setBounds (380, 220, 100, 50);
		label4.setFont (new Font("Calibri", 1, 26));
		panel1.add(label4);
		
		label44 = new JLabel("Room");
		label44.setBounds (380, 280, 100, 50);
		label44.setFont (new Font("Calibri", 0, 26));
		panel1.add(label44);
		
		button1 = new JButton("Back");
		button1.setBounds (195, 420, 185, 80);
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