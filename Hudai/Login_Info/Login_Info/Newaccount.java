import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Newaccount extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	private JTextField my1,my2,my3,my4,my5,my6,my7,my8;
	private JPasswordField pass1,pass2;
	private JButton b1,b2;
	private JRadioButton r1, r2;
	private ButtonGroup bg1;
	private JCheckBox c1,c2;
	private JComboBox com1;
	private JPanel panel;
	private String s[] = {"Male","Female"};

	public Newaccount()
	{
		super(" Welcome user");
		this.setSize(900,650);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);

		l1 = new JLabel("Create Account");
		l1.setBounds(0, 0, 150, 30);
		//l1.setBackground(Color.gray);
		//l1.setOpaque(true);
		//l1.setFont(new Font("Arial Unicode MS", 0, 20));
		panel.add(l1);

		l2 = new JLabel("Full name");
        l2.setBounds(50,30,80,30);
        panel.add(l2);

		my1 = new JTextField();
		my1.setBounds(150,30, 200, 30);
		//myTextField.setBackground(Color.YELLOW);
		panel.add(my1);

		l3 =new JLabel("Password");
		l3.setBounds(50,90,80,30);
		panel.add(l3);

		my2 = new JPasswordField();
		my2.setBounds(160, 90, 150, 30);
		//my2.setBackground(Color.CYAN);
		panel.add(my2);
		l4 =new JLabel("Confirm password");
		l4.setBounds(50,120,160,30);
		panel.add(l4);
		my2 = new JTextField();
		my2.setBounds(160,120, 150, 30);
		//myTextField.setBackground(Color.YELLOW);
		panel.add(my2);
		l5 =new JLabel("User ID");
		l5.setBounds(50,150,160,30);
		panel.add(l5);
		my3 = new JTextField();
		my3.setBounds(160,150, 150, 30);
		//myTextField.setBackground(Color.YELLOW);
		panel.add(my3);
		l6 =new JLabel("Birthday");
		l6.setBounds(50,180,160,30);
		panel.add(l6);
		my4 = new JTextField();
		my4.setBounds(160,180, 150, 30);
		//myTextField.setBackground(Color.YELLOW);
		panel.add(my4);
		l7 =new JLabel("DD");
		l7.setBounds(50,210,50,30);
		panel.add(l7);
		my5 = new JTextField();
		my5.setBounds(50,240, 30, 30);
		//myTextField.setBackground(Color.YELLOW);
		panel.add(my5);
		l8 =new JLabel("MM");
		l8.setBounds(105,210,50,30);
		panel.add(l8);
		my6 = new JTextField();
		my6.setBounds(95,240, 30, 30);
		//myTextField.setBackground(Color.YELLOW);
		panel.add(my6);
		l9 =new JLabel("YY");
		l9.setBounds(160,210,50,30);
		panel.add(l9);
		my7 = new JTextField();
		my7.setBounds(140,240, 30, 30);
		//myTextField.setBackground(Color.YELLOW);
		panel.add(my7);
		l10 =new JLabel("Blood Group");
		l10.setBounds(50,280,150,30);
		panel.add(l10);
		my8 = new JTextField();
		my8.setBounds(50,320,50,30);
		//myTextField.setBackground(Color.YELLOW);
		panel.add(my8);
		l11 =new JLabel("Gender");
		l11.setBounds(50,360,150,30);
		panel.add(l11);
		com1 = new JComboBox(s);
		com1.setBounds(50, 400, 80, 30);
		panel.add(com1);
		l12 =new JLabel("Nationality");
		l12.setBounds(50,440,150,30);
		panel.add(l12);
		c1 = new JCheckBox("Bangladeshi");
		c1.setBounds(50,480, 100,30);
		panel.add(c1);

		c2 = new JCheckBox("Other");
		c2.setBounds(50,510,100,30);
		panel.add(c2);
		bg1 = new ButtonGroup();
		bg1.add(c1);
		bg1.add(c2);
		b1 = new JButton("Login");
		b1.setBounds(50,550, 100, 50);
		//b1.setBackground(Color.GREEN);
		b1.addActionListener(this);
		panel.add(b1);

        b2 = new JButton("Cancel");
		b2.setBounds(170,550, 100, 50);
		//b2.setBackground(Color.BLUE);
		b2.addActionListener(this);
		panel.add(b2);

		this.add(panel);

	}

	public void actionPerformed(ActionEvent n)
		{
		    String btn = n.getActionCommand();
            if(btn.equals("Login"))
            {
                Login_Info m = new Login_Info();
                m.setVisible(true);
                this.setVisible(false);
            }

            else if(btn.equals("Cancel"))
            {
                Login_Info m = new Login_Info();
                m.setVisible(true);
                this.setVisible(false);
            }
           else{}

		}
}
