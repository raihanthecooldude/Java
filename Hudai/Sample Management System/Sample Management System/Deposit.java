import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Deposit extends JFrame implements ActionListener
{
	private JLabel numberLabel, amountLabel;
	private JTextField numberTF, amountTF;
	private JButton buttonBack, buttonLogout, buttonSubmit;
	private JPanel panel;
	private String userId;
	
	public Deposit(String userId)
	{
		super("Sample Management System - Deposit Window");
		
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		numberLabel = new JLabel("Enter Account Number : ");
		numberLabel.setBounds(100,100,150,30);
		panel.add(numberLabel);
		
		numberTF = new JTextField();
		numberTF.setBounds(260,100,100,30);
		panel.add(numberTF);
		
		amountLabel = new JLabel("Enter Amount	: ");
		amountLabel.setBounds(100,150,150,30);
		panel.add(amountLabel);
		
		amountTF = new JTextField();
		amountTF.setBounds(260,150,100,30);
		panel.add(amountTF);
		
		buttonBack = new JButton("Back");
		buttonBack.setBounds(100, 300, 80, 30);
		buttonBack.addActionListener(this);
		panel.add(buttonBack);
		
		buttonSubmit = new JButton("Submit");
		buttonSubmit.setBounds(190, 300, 80, 30);
		buttonSubmit.addActionListener(this);
		panel.add(buttonSubmit);
		
		buttonLogout = new JButton("Logout");
		buttonLogout.setBounds(280, 300, 80, 30);
		buttonLogout.addActionListener(this);
		panel.add(buttonLogout);
		
		this.add(panel);
		this.userId=userId;
	}
	public void actionPerformed(ActionEvent ae)
	{
		String buttonClicked = ae.getActionCommand();
		
		if(buttonClicked.equals(buttonBack.getText()))
		{
			
		}
		else if(buttonClicked.equals(buttonSubmit.getText()))
		{
			updateInDB();
		}
		else if(buttonClicked.equals(buttonLogout.getText()))
		{
			Login l = new Login();
			l.setVisible(true);
			this.setVisible(false);
		}
	}
	public void updateInDB()
	{
		System.out.println(userId);
		double prevBalance=0, newBalance=0;
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
				
				if(accountNumber==Integer.parseInt(numberTF.getText().toString()))
				{
					prevBalance = balance;
					newBalance = prevBalance+Double.parseDouble(amountTF.getText());
					System.out.println(newBalance);
				}
			}
		}
		catch(Exception e){}
		try
		{
			System.out.println(".");
			query = "UPDATE account SET Balance="+newBalance+" where AccountNumber="+Integer.parseInt(numberTF.getText());
			st.executeUpdate(query);
			st.close();
			con.close();
			rs.close();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
}

//UPDATE `oop1`.`account` SET `Password` = '1234' WHERE `account`.`AccountNumber` =1000000002

