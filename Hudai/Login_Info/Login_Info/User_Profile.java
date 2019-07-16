import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class User_Profile extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2;
	private JPanel panel;
	public User_Profile()
	{
		super(" Profile_Details");
		this.setSize(700,350);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		l1 = new JLabel("WELCOME IN YOUR PROFILE");
		l1.setBounds(10, 10, 300, 40);
		//l1.setBackground(Color.gray);
		//l1.setOpaque(true);
		//l1.setFont(new Font("Arial Unicode MS", 0, 20));
        panel.add(l1);

		l2 = new JLabel("Name:");
        l2.setBounds(100,50,80,30);
        panel.add(l2);
		l3 =new JLabel("ID:");
		l3.setBounds(100,90,80,30);
		panel.add(l3);
		l4 =new JLabel("Birthday Date: /  /  /  ");
		l4.setBounds(100,120,160,30);
		panel.add(l4);
		l5 =new JLabel("Blood Group: ");
		l5.setBounds(100,150,160,30);
		panel.add(l5);
		l6 =new JLabel("Gender:");
		l6.setBounds(100,180,160,30);
		panel.add(l6);
		l7 =new JLabel("Nationality:");
		l7.setBounds(100,210,160,30);
		panel.add(l7);
		b1 = new JButton("Logout");
		b1.setBounds(50,250, 100, 50);
		//b1.setBackground(Color.GREEN);
		b1.addActionListener(this);
		panel.add(b1);

        b2 = new JButton("Back");
		b2.setBounds(170,250, 100, 50);
		//b2.setBackground(Color.BLUE);
		b2.addActionListener(this);
		panel.add(b2);

       this.add(panel);
    }

    public void actionPerformed(ActionEvent n)
		{
		    String btn = n.getActionCommand();
            if(btn.equals("Back"))
            {
                UserAccount m = new UserAccount();
                m.setVisible(true);
                this.setVisible(false);
            }

            else if(btn.equals("Logout"))
            {
                Login_Info m = new Login_Info();
                m.setVisible(true);
                this.setVisible(false);
            }
           else{}

		}

}

