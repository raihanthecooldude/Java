import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FacultyGUI extends JFrame implements MouseListener, ActionListener
{
	private JButton ExamDuty, QuizScheduling, LogOut;
	private JPanel panel1;
	
	public FacultyGUI ()
	{
		super("Faculty GUI");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		ExamDuty = new JButton("Exam Duty");
		ExamDuty.setBounds (90, 60, 400, 100);
		ExamDuty.setBackground (Color.BLUE);
		ExamDuty.setFont (new Font("Calibri", 1, 32));
		ExamDuty.addMouseListener(this);
		ExamDuty.addActionListener(this);
		panel1.add (ExamDuty);
		
		QuizScheduling = new JButton("Quiz Scheduling");
		QuizScheduling.setBounds (90, 260, 400, 100);
		QuizScheduling.setBackground (Color.BLUE);
		QuizScheduling.setFont (new Font("Calibri", 1, 32));
		QuizScheduling.addMouseListener(this);
		QuizScheduling.addActionListener(this);
		panel1.add (QuizScheduling);
		
		LogOut = new JButton("Log Out");
		LogOut.setBounds (195, 450, 185, 80);
		LogOut.setBackground (Color.BLUE);
		LogOut.setFont (new Font("Calibri", 1, 32));
		LogOut.addMouseListener(this);
		LogOut.addActionListener(this);
		panel1.add (LogOut);
		
		this.add(panel1);
	}
	public void mouseClicked(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m){}
	public void mouseExited(MouseEvent m){}
	
	public void actionPerformed(ActionEvent a)
	{
		String buttons = a.getActionCommand();
		
		if(buttons.equals("Log Out"))
		{
			LogIn LG = new LogIn();
			LG.setVisible(true);
			this.setVisible(false);
		}
		else if (buttons.equals("Quiz Scheduling"))
		{
			QuizScheduling QS = new QuizScheduling ();
			QS.setVisible (true);
			this.setVisible(false);
		}
		else if (buttons.equals("Exam Duty"))
		{
			ExamDuty ED = new ExamDuty ();
			ED.setVisible(true);
			this.setVisible(false);
		}
		else
		{
			
		}
	}
}