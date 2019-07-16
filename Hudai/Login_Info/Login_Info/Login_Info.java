import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login_Info extends JFrame implements ActionListener, MouseListener
{
	private JLabel l1,l2;
	private JTextField myTextField;
	private JPasswordField myPasswordField;
	private JButton b1,b2,b3,b4,b5;
	private JComboBox combo1;
	private JPanel panel;
	public Login_Info()
	{
		super(" Login System ");
		this.setSize(800,600);
		//this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//this.setLayout(null);

		panel = new JPanel();
		panel.setLayout(null);

		l1 = new JLabel("User Id");
		l1.setBounds(100, 30, 45, 30);
		//l1.setBackground(Color.GRAY);
		l1.setOpaque(true);
		panel.add(l1);

		myTextField = new JTextField();
		myTextField.setBounds(100, 80, 600, 40);
		//myTextField.setBackground(Color.YELLOW);
		panel.add(myTextField);

		l2 = new JLabel("Password");
		l2.setBounds(100, 150, 600, 40);
		//l2.setBackground(Color.gray);
		//l2.setOpaque(true);
		//l2.setFont(new Font("Arial Unicode MS", 0, 20));
        panel.add(l2);

		myPasswordField = new JPasswordField();
		myPasswordField.setBounds(100, 200, 300, 40);
		//myPasswordField.setBackground(Color.CYAN);
		panel.add(myPasswordField);

		b1 = new JButton("Admin_login");
		b1.setBounds(100, 270, 150, 50);
		b1.setBackground(Color.yellow);
		b1.addMouseListener(this);
		b1.addActionListener(this);
		panel.add(b1);

        b2 = new JButton("User_login");
		b2.setBounds(270, 270, 150, 50);
		b2.setBackground(Color.yellow);
		b2.addMouseListener(this);
		b2.addActionListener(this);

		panel.add(b2);

		b3 = new JButton("Create an account");
		b3.setBounds(100, 340, 200, 50);
		b3.setBackground(Color.yellow);
        b3.addMouseListener(this);
		b3.addActionListener(this);
		panel.add(b3);


	    b4 = new JButton("EXIT");
		b4.setBounds(100, 420, 100, 50);
		b4.setBackground(Color.yellow);
        b4.addMouseListener(this);
		b4.addActionListener(this);
		panel.add(b4);

		this.add(panel);


	}


	public void mouseClicked(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m)
	{
		JButton b = (JButton) m.getComponent();
		if(b==b1)
		{
			b1.setBackground(Color.GREEN);
			myTextField.setBackground(Color.blue);
            myPasswordField.setBackground(Color.blue);
			//myTextField.setText("Admin_login");
		}
		else if(b==b2)
		{
			b2.setBackground(Color.green);
			myTextField.setBackground(Color.blue);
            myPasswordField.setBackground(Color.blue);
			//myTextField.setText("Admin_login");
		}
		else if(b==b4)
		{
			b4.setBackground(Color.red);
			myTextField.setBackground(Color.orange);
            myPasswordField.setBackground(Color.orange);
			//myTextField.setText("EXIT");
		}

		else if(b==b3)
		{
			b3.setBackground(Color.CYAN);
			myTextField.setBackground(Color.red);
            myPasswordField.setBackground(Color.red);
			//myTextField.setText("EXIT");
		}
	}

	public void mouseExited(MouseEvent m)
	{
		JButton b = (JButton) m.getComponent();
		if(b==b1)
		{
			b1.setBackground(Color.yellow);
			myTextField.setBackground(Color.white);
			myPasswordField.setBackground(Color.white);
			//myTextField.setText("");

		}
		else if(b==b2)
		{
			b2.setBackground(Color.yellow);
			myTextField.setBackground(Color.white);
			myPasswordField.setBackground(Color.white);
			//myTextField.setText("");

		}

		else if(b==b3)
		{
			b3.setBackground(Color.yellow);
			myTextField.setBackground(Color.white);
            myPasswordField.setBackground(Color.white);
			//myTextField.setText("EXIT");
		}

		else if(b==b4)
		{
			b4.setBackground(Color.yellow);
			myTextField.setBackground(Color.white);
			myPasswordField.setBackground(Color.white);
			//nameField.setText("");
		}

	}


	public void actionPerformed(ActionEvent n)
	{
		String btn = n.getActionCommand();

		if(btn.equals("Admin_login"))

		{
			AdminAccount m = new AdminAccount();
			m.setVisible(true);
			this.setVisible(false);
		}

		else if(btn.equals("User_login"))

		{
			UserAccount m = new UserAccount();
			m.setVisible(true);
			this.setVisible(false);
		}

		else if(btn.equals("Create an account"))
		{
		    Newaccount na = new Newaccount();
			na.setVisible(true);
			this.setVisible(false);
		}
		else if(btn.equals("EXIT"))
		{
           // System.out.println("Back CLicked");
			System.exit(0);
		}
		else{JOptionPane.showMessageDialog(this, "SomeThing Missing");}
	}
}
