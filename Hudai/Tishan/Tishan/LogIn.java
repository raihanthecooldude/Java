import javax.swing.*;
import java.awt.*;

public class LogIn extends JFrame
{
	private JLabel label1, label2, label3, label4, label5;
	private JTextField textfield1;
	private JPasswordField passwordfield1;
	private JButton button1;
	private ImageIcon image;
	private JPanel panel1;
	
	public LogIn ()
	{
		super("Log In");
		this.setSize(650, 800);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		label1 = new JLabel("AMERICAN INTERNATIONAL");
		label1.setBounds (230, 40, 500, 80);
		label1.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label1);
		label2 = new JLabel("UNIVERSITY-BANGLADESH");
		label2.setBounds (235, 85, 450, 70);
		label2.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label2);
		
		label3 = new JLabel("-where leaders are created.");
		label3.setBounds (270, 150, 290, 40);
		label3.setFont (new Font("Calibri Light", 0, 24));
		panel1.add(label3);
		
		label4 = new JLabel("Sign in with your organizational id number.");
		label4.setBounds (75, 270, 540, 55);
		label4.setFont (new Font("Helvetica", 0, 25));
		panel1.add(label4);
		
		textfield1 = new JTextField();
		textfield1.setBounds (75, 340, 480, 55);
		panel1.add(textfield1);
		
		passwordfield1 = new JPasswordField();
		passwordfield1.setBounds (75, 405, 480, 55);
		panel1.add(passwordfield1);
		
		button1 = new JButton("Log In");
		button1.setBounds (75, 470, 480, 55);
		button1.setBackground (Color.BLUE);
		button1.setFont (new Font("Calibri Light", 0, 26));
		panel1.add (button1);
		
		image = new ImageIcon (getClass().getResource("aiub.jpg"));
		label5 = new JLabel (image);
		label5.setBounds(10, 10, 220, 220);
		panel1.add(label5);		
		
		this.add(panel1);
	}
}