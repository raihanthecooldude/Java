import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizSchedule extends JFrame implements MouseListener, ActionListener
{
	private JLabel label1, label2, label3;
	private JLabel label11, label22, label33;
	private JLabel label111, label222, label333;
	private JLabel label1111, label2222, label3333;
	private JLabel label11111, label22222, label33333;
	private JLabel label111111, label222222, label333333;
	private JButton button1;
	private ImageIcon image;
	private JPanel panel1;
	
	public QuizSchedule ()
	{
		super("Quiz Schedule");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		label1 = new JLabel("Course");
		label1.setBounds (50, 40, 200, 50);
		label1.setFont (new Font("Calibri", 1, 26));
		panel1.add(label1);
		
		label11 = new JLabel("Course");
		label11.setBounds (50, 100, 150, 50);
		label11.setFont (new Font("Calibri", 0, 26));
		panel1.add(label11);
		
		label111 = new JLabel("Course");
		label111.setBounds (50, 160, 150, 50);
		label111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label111);
		
		label1111 = new JLabel("Course");
		label1111.setBounds (50, 220, 150, 50);
		label1111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label1111);
		
		label11111 = new JLabel("Course");
		label11111.setBounds (50, 280, 150, 50);
		label11111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label11111);
		
		label111111 = new JLabel("Course");
		label111111.setBounds (50, 340, 150, 50);
		label111111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label111111);
		
		label2 = new JLabel("Section");
		label2.setBounds (280, 40, 100, 50);
		label2.setFont (new Font("Calibri", 1, 26));
		panel1.add(label2);

		label22 = new JLabel("Section");
		label22.setBounds (280, 100, 100, 50);
		label22.setFont (new Font("Calibri", 0, 26));
		panel1.add(label22);

		label222 = new JLabel("Section");
		label222.setBounds (280, 160, 100, 50);
		label222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label222);
		
		label2222 = new JLabel("Section");
		label2222.setBounds (280, 220, 100, 50);
		label2222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label2222);
		
		label22222 = new JLabel("Section");
		label22222.setBounds (280, 280, 100, 50);
		label22222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label22222);
		
		label222222 = new JLabel("Section");
		label222222.setBounds (280, 340, 100, 50);
		label222222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label222222);
		
		label3 = new JLabel("Date");
		label3.setBounds (450, 40, 100, 50);
		label3.setFont (new Font("Calibri", 1, 26));
		panel1.add(label3);
		
		label33 = new JLabel("Date");
		label33.setBounds (450, 100, 100, 50);
		label33.setFont (new Font("Calibri", 0, 26));
		panel1.add(label33);
		
		label333 = new JLabel("Date");
		label333.setBounds (450, 160, 100, 50);
		label333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label333);
		
		label3333 = new JLabel("Date");
		label3333.setBounds (450, 220, 100, 50);
		label3333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label3333);
		
		label33333 = new JLabel("Date");
		label33333.setBounds (450, 280, 100, 50);
		label33333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label33333);
		
		label333333 = new JLabel("Date");
		label333333.setBounds (450, 340, 100, 50);
		label333333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label333333);
		
		button1 = new JButton("Back");
		button1.setBounds (190, 470, 185, 80);
		button1.setBackground (Color.BLUE);
		button1.setForeground(Color.WHITE);
		button1.setFont (new Font("Calibri", 1, 20));
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
		String buttons = a.getActionCommand();
		
		if(buttons.equals("Back"))
		{
			StudentGUI SG = new StudentGUI();
			SG.setVisible(true);
			this.setVisible(false);
		}
		else
		{
			
		}
	}
}