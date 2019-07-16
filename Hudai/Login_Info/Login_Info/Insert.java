import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Insert extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3,l4,l5,l6;
	private JTextField m1,m2,m3,m4,m5,m6;
	private JButton b1,b2,b3;
	private JComboBox combo1;
	private JPanel panel;
	private String s[] = {"User_login","Admin_login"};

	public Insert()
	{
	    super(" Insert ");
		this.setSize(800,600);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);

		l1 = new JLabel("MEDICINE_NAME:");
		l1.setBounds(100, 30, 150, 30);
		//l1.setBackground(Color.gray);
		//l1.setOpaque(true);
		//l1.setFont(new Font("Arial Unicode MS", 0, 20));
		panel.add(l1);

		m1 = new JTextField();
		m1.setBounds(260, 30, 400, 30);
		//m1.setBackground(Color.YELLOW);
		panel.add(m1);

		l2 = new JLabel("MEDICINE_ID:");
		l2.setBounds(100, 90, 150, 30);
		//l2.setBackground(Color.gray);
		//l2.setOpaque(true);
		//l2.setFont(new Font("Arial Unicode MS", 0, 20));
		panel.add(l2);

		m2 = new JTextField();
		m2.setBounds(260, 90, 400, 30);
		//m2.setBackground(Color.YELLOW);
		panel.add(m2);



		l3 = new JLabel("MEDICINE_Company:");
		l3.setBounds(100, 150, 150, 30);
		//l3.setBackground(Color.gray);
		//l3.setOpaque(true);
		//l3.setFont(new Font("Arial Unicode MS", 0, 20));
		panel.add(l3);

		m3 = new JTextField();
		m3.setBounds(260, 150, 400, 30);
		//m3.setBackground(Color.YELLOW);
		panel.add(m3);


		l4 = new JLabel("MEDICINE_Location:");
		l4.setBounds(100, 210, 150, 30);
		//l4.setBackground(Color.gray);
		//l4.setOpaque(true);
		//l4.setFont(new Font("Arial Unicode MS", 0, 20));
		panel.add(l4);

		m4 = new JTextField();
		m4.setBounds(260, 210, 400, 30);
		//m4.setBackground(Color.YELLOW);
		panel.add(m4);

		l5 = new JLabel("MEDICINE_Quantity:");
		l5.setBounds(100, 270, 150, 30);
		//l5.setBackground(Color.gray);
		//l5.setOpaque(true);
		//l5.setFont(new Font("Arial Unicode MS", 0, 20));
		panel.add(l5);

		m5 = new JTextField();
		m5.setBounds(260, 270, 50, 30);
		//m5.setBackground(Color.YELLOW);
		panel.add(m5);


		l6 = new JLabel("MEDICINE_price:");
		l6.setBounds(100, 330, 150, 30);
		//l6.setBackground(Color.gray);
		//l.setOpaque(true);
		//l6.setFont(new Font("Arial Unicode MS", 0, 20));
		panel.add(l6);

		m6 = new JTextField();
		m6.setBounds(260, 330, 50, 30);
		//m5.setBackground(Color.YELLOW);
		panel.add(m6);

		b1 = new JButton("Save");
		b1.setBounds(100, 390, 100, 30);
		//b1.setBackground(Color.BLUE);
		b1.addActionListener(this);

		panel.add(b1);


		b2 = new JButton("Back");
		b2.setBounds(250, 390, 100, 30);
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
                AdminAccount m = new AdminAccount();
                m.setVisible(true);
                this.setVisible(false);
            }

            else if(btn.equals("Save"))
            {
                AdminAccount m = new AdminAccount();
                m.setVisible(true);
                this.setVisible(false);
            }
           else{}

		}

}
