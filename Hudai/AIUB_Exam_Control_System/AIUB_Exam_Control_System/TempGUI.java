import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempGUI extends JFrame implements ActionListener
{
	private JLabel label1, label2, label3, label4, label5, correct, error;
	private JTextField textfield1;
	private JPasswordField passwordfield1;
	private JButton button1;
	private ImageIcon image;
	private JPanel panel1;
	
	public TempGUI ()
	{
		super("AIUB");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		label1 = new JLabel("AMERICAN INTERNATIONAL");
		label1.setBounds (175, 40, 500, 80);
		label1.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label1);
		label2 = new JLabel("UNIVERSITY-BANGLADESH");
		label2.setBounds (180, 85, 450, 70);
		label2.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label2);
		
		label3 = new JLabel("-where leaders are created.");
		label3.setBounds (320, 140, 290, 38);
		label3.setFont (new Font("Calibri", 0, 18));
		panel1.add(label3);
		
		label4 = new JLabel("Sign in with your organizational ID number.");
		label4.setBounds (99, 270, 540, 40);
		label4.setFont (new Font("Calibri", 0, 22));
		panel1.add(label4);
		
		error = new JLabel("Invalid username or password.");
		error.setVisible(false);
		error.setBounds(200, 305, 400, 40);
		error.setFont(new Font("Calibri", 0, 16));
		error.setBackground(Color.WHITE);
		error.setForeground(Color.RED);
		panel1.add(error);
		
		textfield1 = new JTextField();
		textfield1.setBounds (97, 370, 400, 40);
		panel1.add(textfield1);
		
		passwordfield1 = new JPasswordField();
		passwordfield1.setBounds (97, 425, 400, 40);
		panel1.add(passwordfield1);
		
		button1 = new JButton("Log In");
		button1.setBounds (246, 500, 100, 35);
		button1.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		button1.setForeground(Color.WHITE);
		button1.setFont (new Font("Calibri Light", 1, 20));
		button1.addActionListener(this);
		panel1.add (button1);
		
		image = new ImageIcon (getClass().getResource("aiub.jpg"));
		label5 = new JLabel (image);
		label5.setBounds(10, 10, 160, 180);
		panel1.add(label5);		
		
		this.add(panel1);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		String btn = a.getActionCommand();
		
		if(btn.equals("Log In"))
		{
			String st;
			//myLabel.setText(myTextField.getText());
			st=passwordfield1.getText();
			
			if(st.length()==5)
			{
				FacultyMain m = new FacultyMain();
				m.setVisible(true);
				this.setVisible(false);
			}
			else if(st.length()==6)
			{
				Admin QS = new Admin ();
				QS.setVisible (true);
				this.setVisible(false);
			}
			else if(st.length()==7)
			{
				StudentMain stu = new StudentMain();
				stu.setVisible(true);
				this.setVisible(false);
			}
			else 
			{
				error.setVisible(true);
			}
			
		}
		else{}
	}
}