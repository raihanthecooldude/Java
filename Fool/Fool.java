import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;

public class Fool extends JFrame implements ActionListener, MouseListener
{
	private JLabel label1, label2, correct, error;
	private JButton button1, button2, again;
	private JPanel panel1;

	
	public Fool ()
	{
		
		super("Fool");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		label1 = new JLabel("Welcome to the World of Fools");
		label1.setBounds (65, 20, 500, 100);
		label1.setFont (new Font("Calibri", 0, 36));
		label1.setForeground(new java.awt.Color(124, 121, 121));
		panel1.add(label1);	

		label2 = new JLabel("Are you a Fool?");
		label2.setBounds (190, 120, 500, 100);
		label2.setFont (new Font("Calibri", 0, 32));
		//label2.addMouseListener(this);
		//label2.addActionListener(this);
		panel1.add(label2);
		
		button1 = new JButton("Yes");
		button1.setBounds (170, 300, 80, 40);
		button1.setBackground(Color.GREEN);//(new java.awt.Color(0, 255, 0));
		button1.setFont (new Font("Calibri", 0, 32));
		//button1.addMouseListener(this);
		button1.addActionListener(this);
		panel1.add(button1);
		
		button2 = new JButton("No");
		button2.setBounds (350, 300, 80, 40);
		button2.setFont (new Font("Calibri", 0, 32));
		button2.setBackground(Color.RED);
		button2.addMouseListener(this);
		button2.addActionListener(this);
		panel1.add(button2);
		
		correct = new JLabel("Congrats! You are a Fool.");
		correct.setBounds (120, 470, 500, 100);
		correct.setFont (new Font("Calibri", 0, 32));
		correct.setForeground(Color.RED);
		//correct.addActionListener(this);
		panel1.add(correct);
		correct.setVisible(false);
		
		error = new JLabel("Oh okay! You are not a Fool.");
		error.setBounds (120, 470, 500, 100);
		error.setFont (new Font("Calibri", 0, 32));
		error.setForeground(Color.RED);
		//error.addActionListener(this);
		panel1.add(error);
		error.setVisible(false);
		
		again = new JButton("Play Again");
		again.setBounds (200, 300, 200, 40);
		again.setFont (new Font("Calibri", 0, 32));
		again.setBackground(Color.BLACK);
		again.setForeground(Color.RED);
		//again.addMouseListener(this);
		again.addActionListener(this);
		panel1.add(again);
		again.setVisible(false);
		
		this.add(panel1);
	}
	
	public void mouseClicked(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m)
	{
		Random r = new Random();
		int X, Y;
		
		X= r.nextInt(500);
		Y= r.nextInt(650);
		
		button2.setBounds (X, Y, 80, 40);
		
		//System.out.println("Entered");
	}
	public void mouseExited(MouseEvent m){}
	
	public void actionPerformed(ActionEvent a)
	{
		String btn = a.getActionCommand();
		
		if(btn.equals("Yes"))
		{
			error.setVisible(false);
			correct.setVisible(true);
			again.setVisible(true);
			label2.setVisible(false);
			button1.setVisible(false);
			button2.setVisible(false);
		}
		else if(btn.equals("No"))
		{
			correct.setVisible(false);
			error.setVisible(true);
			again.setVisible(true);
			label2.setVisible(false);
			button1.setVisible(false);
			button2.setVisible(false);
		}
		else if(btn.equals("Play Again"))
		{
			label2.setVisible(true);
			button1.setVisible(true);
			button2.setVisible(true);
			again.setVisible(false);
			error.setVisible(false);
			correct.setVisible(false);
		}
		else{}
	}
	
	public static void main (String []args)
	{
		Fool f = new Fool();
		f.setVisible(true);
	}
	
}