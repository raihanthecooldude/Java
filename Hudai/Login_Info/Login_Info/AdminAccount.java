import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AdminAccount extends JFrame implements ActionListener
{
	private JButton b1,b2,b3,b4,b5;
	private JPanel panel;

    public AdminAccount()
	{
		super(" USER ACCOUNT ");
		this.setSize(400,300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        panel = new JPanel();
		panel.setLayout(null);

		b1 = new JButton("Profile");
		b1.setBounds(100, 30, 100, 30);
		//b1.setBackground(Color.GREEN);
        b1.addActionListener(this);

		panel.add(b1);

		b2 = new JButton("Search");
		b2.setBounds(100, 90, 100, 30);
		//b2.setBackground(Color.GREEN);
		//b2.addActionListener(this);
		panel.add(b2);

		b3 = new JButton("Insert");
		b3.setBounds(100, 150, 100, 30);
		//b3.setBackground(Color.GREEN);
        b3.addActionListener(this);

		panel.add(b3);

		b4 = new JButton("Logout");
		b4.setBounds(100, 210, 100, 30);
		//b4.setBackground(Color.BLUE);
        b4.addActionListener(this);
        panel.add(b4);

		b5 = new JButton("Back");
		b5.setBounds(250, 210, 100, 30);
		//b5.setBackground(Color.BLUE);
		b5.addActionListener(this);
		panel.add(b5);

		this.add(panel);
	}

     public void actionPerformed(ActionEvent n)
		{
		    String btn = n.getActionCommand();
            if(btn.equals("Back"))
            {
                Login_Info m = new Login_Info();
                m.setVisible(true);
                this.setVisible(false);
            }

            else if(btn.equals("Insert"))
            {
                Insert i=new Insert();
                i.setVisible(true);
                this.setVisible(false);
            }

       /*    //  for Search option

            else if(btn.equals("Search"))
            {
                Search s=new Search();
                s.setVisible(true);
                this.setVisible(false);
            }
        */

            else if(btn.equals("Profile"))
            {
                Admin_Profile p=new Admin_Profile();
                p.setVisible(true);
                this.setVisible(false);
            }

           else if(btn.equals("Logout"))
            {
                Login_Info l = new Login_Info();
                l.setVisible(true);
                this.setVisible(false);
            }
           else{}

		}


}
