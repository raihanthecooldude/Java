import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentGUI extends JFrame implements MouseListener, ActionListener
{
	private JButton ExamRoutine, QuizSchedule, LogOut;
	private JPanel panel1;
	
	public StudentGUI ()
	{
		super("Student GUI");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		ExamRoutine = new JButton("Exam Routine");
		ExamRoutine.setBounds (90, 60, 400, 100);
		ExamRoutine.setBackground (Color.BLUE);
		ExamRoutine.setFont (new Font("Calibri Light", 0, 32));
		ExamRoutine.addMouseListener(this);
		ExamRoutine.addActionListener(this);
		panel1.add (ExamRoutine);
		
		QuizSchedule = new JButton("Quiz Schedule");
		QuizSchedule.setBounds (90, 260, 400, 100);
		QuizSchedule.setBackground (Color.BLUE);
		QuizSchedule.setFont (new Font("Calibri Light", 0, 32));
		QuizSchedule.addMouseListener(this);
		QuizSchedule.addActionListener(this);
		panel1.add (QuizSchedule);
		
		LogOut = new JButton("Log Out");
		LogOut.setBounds (195, 450, 185, 80);
		LogOut.setBackground (Color.BLUE);
		LogOut.setFont (new Font("Calibri Light", 0, 32));
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
		else if (buttons.equals("Quiz Schedule"))
		{
			QuizSchedule QS = new QuizSchedule ();
			QS.setVisible (true);
			this.setVisible(false);
		}
		else if (buttons.equals("Exam Routine"))
		{
			ExamRoutine ER = new ExamRoutine ();
			ER.setVisible(true);
			this.setVisible(false);
		}
		else
		{
			
		}
	}
}