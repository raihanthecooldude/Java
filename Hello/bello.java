import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;

public class bello extends JFrame
{
	private JLabel label1, label2, correct, error;
	private JButton button1, button2, again;
	private JPanel panel1;
	
	public bello()
	{
		super("Fool");
		this.setSize(400, 500);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		label1 = new JLabel("Bello");
		label1.setBounds (65, 20, 500, 100);
		label1.setFont (new Font("Calibri", 0, 36));
		label1.setForeground(new java.awt.Color(124, 121, 121));
		panel1.add(label1);	

		
		this.add(panel1);
	}
}