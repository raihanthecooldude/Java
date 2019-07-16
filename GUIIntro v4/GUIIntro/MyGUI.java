import javax.swing.*;
import java. awt.*;
import java.awt.event.*;

public class MyGUI extends JFrame implements MouseListener, ActionListener
{
	private JPanel panel1;
	private JLabel title;
	private JTextField nameField;
	private JPasswordField passField;
	private JRadioButton r1;
	private JRadioButton r2;
	private ButtonGroup bg1,bg2;
	private JComboBox combo1;
	private JCheckBox cBox1,cBox2;
	private JButton login, exit;
	String s[] = {"15-1","15-2","15-3","16-1","16-2"};
	public MyGUI(){}
	public MyGUI(String s1)
	{
		super("This is My GUI");
		this.setSize(800,600);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		
		title = new JLabel(s1);
		title.setBounds(200,50,500,50);
		title.setBackground(Color.BLUE);
		title.setOpaque(true);
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel1.add(title);
		
		nameField = new JTextField();
		nameField.setBounds(100,100,200,30);
		nameField.setBackground(Color.GREEN);
		panel1.add(nameField);
		
		passField = new JPasswordField();
		passField.setBounds(100,150,200,30);
		passField.setBackground(Color.PINK);
		passField.setEchoChar('@');
		panel1.add(passField);
		
		login = new JButton("Log In");
		login.setBounds(100,200,80,30);
		login.setBackground(Color.MAGENTA);
		login.addMouseListener(this);
		login.addActionListener(this);
		panel1.add(login);
		
		exit = new JButton("Exit");
		exit.setBounds(200, 200, 80,30);
		exit.setBackground(Color.CYAN);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		panel1.add(exit);
		
		r1 = new JRadioButton("Student");
		r1.setBounds(320,200,80,30);
		panel1.add(r1);
		
		r2 = new JRadioButton("Faculty");
		r2.setBounds(320,250,80,30);
		panel1.add(r2);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		
		cBox1 = new JCheckBox("I am a Robot");
		cBox1.setBounds(320,300,150,30);
		panel1.add(cBox1);
		
		cBox2 = new JCheckBox("I am not a Robot");
		cBox2.setBounds(500,300,150,30);
		panel1.add(cBox2);
		
		bg2 = new ButtonGroup();
		bg2.add(cBox1);
		bg2.add(cBox2);
		
		
		combo1 = new JComboBox(s);
		combo1.setBounds(320,350,100,30);
		panel1.add(combo1);
		
		this.add(panel1);
		
	}
	
	public void mouseClicked(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m)
	{
		JButton b = (JButton) m.getComponent();
		if(b==login)
		{
			login.setBackground(Color.BLUE);
			nameField.setBackground(Color.ORANGE);
			nameField.setText("Login");
		}
		else if(b==exit)
		{
			exit.setBackground(Color.RED);
			passField.setBackground(Color.ORANGE);
			nameField.setText("Exit");
		}
	}
	public void mouseExited(MouseEvent m)
	{
		JButton b = (JButton) m.getComponent();
		if(b==login)
		{
			login.setBackground(Color.MAGENTA);
			nameField.setBackground(Color.RED);
			nameField.setText("");
			
		}
		else if(b==exit)
		{
			exit.setBackground(Color.CYAN);
			passField.setBackground(Color.GRAY);
			nameField.setText("");
		}
	}
	
	public void actionPerformed(ActionEvent a)
	{
		String s = a.getActionCommand();
		
		if(s.equals("Log In"))
		{
			String s1=nameField.getText();
			title.setText(s1);
			//login.setText("OOP1");
			JOptionPane.showMessageDialog(this, "This is Last Example");
			
		}
		else if(s.equals("Exit"))
		{
			title.setText("AIUB");
			login.setText("Log In");
			GUIIntro g = new GUIIntro();
			g.setVisible(true);
			this.setVisible(false);
			
		}
	}
	

}