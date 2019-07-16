import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

class UserHome extends JFrame implements ActionListener
{
	private JLabel labelWelcome, labelName, labelNumber, labelBalance;
	private JButton buttonLogout, buttonChangePassword;
	private JPanel panel;
	
	public UserHome(String userId,String password, int accountNumber,String accountHolderName, double balance)
	{
		super("Sample Management System - User Home Window");
		
		this.setSize(600, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		labelWelcome = new JLabel("Welcome to Sample Bank");
		labelWelcome.setBounds(200, 50, 200, 30);
		panel.add(labelWelcome);
		
		labelName = new JLabel("Accout Holder Name	:	"+accountHolderName);
		labelName.setBounds(200, 100, 200, 30);
		panel.add(labelName);
		
		labelNumber = new JLabel("Accout Number	:	"+accountNumber);
		labelNumber.setBounds(200, 150, 200, 30);
		panel.add(labelNumber);
		
		labelBalance = new JLabel("Current Balance	:	"+balance);
		labelBalance.setBounds(200, 200, 200, 30);
		panel.add(labelBalance);
		
		buttonChangePassword = new JButton("Change Password");
		buttonChangePassword.setBounds(150, 250, 150, 30);
		buttonChangePassword.addActionListener(this);
		panel.add(buttonChangePassword);
		
		buttonLogout = new JButton("Logout");
		buttonLogout.setBounds(320, 250, 150, 30);
		buttonLogout.addActionListener(this);
		panel.add(buttonLogout);
		
		
		this.add(panel);
		
	}
	public void actionPerformed(ActionEvent ae){}
}