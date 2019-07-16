import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
	private JLabel nameLabel, passLabel;
	private JTextField userNameTF;
	private JPasswordField passPF;
	private JButton buttonLogin, buttonClose;
	private JPanel panel;
	private JRadioButton radioAdmin, radioUser;
	private ButtonGroup bg;
	private boolean flag;
	
	public Login()
	{
		super("Sample Management System - Login Window");
		
		this.setSize(600, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		nameLabel = new JLabel("UserId	: ");
		nameLabel.setBounds(100, 50, 100, 25);
		panel.add(nameLabel);
		
		userNameTF = new JTextField();
		userNameTF.setBounds(200, 50, 100, 25);
		panel.add(userNameTF);
		
		passLabel = new JLabel("Password	: ");
		passLabel.setBounds(100, 75, 100, 25);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(200, 75, 100, 25);
		panel.add(passPF);
		
		buttonLogin = new JButton("Login");
		buttonLogin.setBounds(100,120,80,40);
		buttonLogin.addActionListener(this);
		panel.add(buttonLogin);
		
		buttonClose = new JButton("Close");
		buttonClose.setBounds(200,120,80,40);
		buttonClose.addActionListener(this);
		panel.add(buttonClose);
		
		radioUser = new JRadioButton("I am User");
		radioUser.setBounds(400,50,150,25);
		radioUser.setSelected(true);
		panel.add(radioUser);
		
		radioAdmin = new JRadioButton("I am Admin");
		radioAdmin.setBounds(400,80,150,25);
		panel.add(radioAdmin);
		
		bg = new ButtonGroup();
		bg.add(radioUser);
		bg.add(radioAdmin);
		
		this.add(panel);
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String buttonClicked = ae.getActionCommand();
		
		if(buttonClicked.equals(buttonLogin.getText()))
		{
			System.out.println("hello");
			flag=true;
			check();
		}
		else if(buttonClicked.equals(buttonClose.getText()))
		{
			System.exit(0);
		}
		else{}
	}
	
	public void check()
	{
        String query = "SELECT `UserId`, `Password`, `AccountNumber`, `AccountHolderName`, `Balance` FROM `account`;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
					
			while(rs.next())
			{
                String userId = rs.getString("UserID");
                String password = rs.getString("Password");
				int accountNumber = rs.getInt("AccountNumber");
				String accountHolderName = rs.getString("AccountHolderName");
				double balance = rs.getDouble("Balance");
				
				if(userId.equals(userNameTF.getText()))
				{
					flag=false;
					if(password.equals(passPF.getText()))
					{
						if(radioUser.isSelected())
						{
							UserHome ush = new UserHome(userId,password,accountNumber,accountHolderName,balance);
							this.setVisible(false);
							ush.setVisible(true);
						}
						else if(radioAdmin.isSelected())
						{
							AdminHome adh = new AdminHome(userId,password,accountNumber,accountHolderName,balance);
							this.setVisible(false);
							adh.setVisible(true);
						}
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Invalid pass"); 
					}
				}			
			}
			if(flag){JOptionPane.showMessageDialog(this,"Invalid name"); }
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
        finally
		{
            try
			{
                if(rs!=null)
					rs.close();

                if(st!=null)
					st.close();

                if(con!=null)
					con.close();
            }
            catch(Exception ex){}
        }
    } 
}

				/*int accountNumber = rs.getInt("AccountNumber");
				String accountHolderName = rs.getString("AccountHolderName");
				double balance = rs.getDouble("Balance");
				System.out.println("User: " +userId);
				System.out.println("Password: " +password);
				System.out.println("AccountNumber: " +accountNumber);
				System.out.println("AccountHolderName: " +accountHolderName);
				System.out.println("Balance: " +balance);*/