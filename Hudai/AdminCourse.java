import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AdminCourse extends JFrame implements ActionListener
{
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8;
	private JComboBox combobox1, combobox2, combobox3, combobox4, combobox5, combobox6, combobox7, combobox8;
	private JPasswordField passwordfield1;
	private JButton button1, back, logout;
	private ImageIcon image;
	private JPanel panel1;
	private String s1[] = new String[1000];
	private String s2[] = {"A","B","C","D","E"};
	private String s3[] = {"Slot 1","Slot 2","Slot 3"};
	private String s4[] = {"1101","1102","1210","2204","6120"};
	private String s5[] = new String[200];
	private String s6[] = {"Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6"};
	private String s7[] = {"Annex 1", "Annex 2", "Annex 3", "Annex 4", "Annex 5", "Annex 6", "Annex 7"};
	private String name;
	
	public AdminCourse(){}
	public AdminCourse (String name)
	{
		super("Exam Scheduling and Invigilator Assigning");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		this.name=name;
		
		label1 = new JLabel("Course");
		label1.setBounds (60, 80, 150, 50);
		label1.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label1);
		getCourse();
		combobox1 = new JComboBox(s1);
		combobox1.setBounds (60, 130, 400, 40);
		combobox1.setBackground(Color.WHITE);
		panel1.add(combobox1);
		
		/*label3 = new JLabel("Section");
		label3.setBounds (360, 70, 100, 50);
		label3.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label3);
		combobox2 = new JComboBox(s2);
		combobox2.setBounds (360, 120, 120, 40);
		combobox2.setBackground(Color.WHITE);
		panel1.add(combobox2);*/
		
		label2 = new JLabel("Slot");
		label2.setBounds (60, 210, 120, 50);
		label2.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label2);	
		combobox3 = new JComboBox(s3);
		combobox3.setBounds (60, 260, 120, 40);
		combobox3.setBackground(Color.WHITE);
		panel1.add(combobox3);		
		
		label4 = new JLabel("Room");
		label4.setBounds (360, 330, 150, 50);
		label4.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label4);
		combobox4 = new JComboBox(s4);
		combobox4.setBounds (360, 380, 120, 40);
		combobox4.setBackground(Color.WHITE);
		panel1.add(combobox4);
		
		label6 = new JLabel("Day");
		label6.setBounds (360, 210, 150, 50);
		label6.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label6);
		combobox6 = new JComboBox(s6);
		combobox6.setBounds (360, 260, 120, 40);
		combobox6.setBackground(Color.WHITE);
		panel1.add(combobox6);
		
		//label5 = new JLabel("Invigilator");
		//label5.setBounds (60, 350, 450, 50);
		//label5.setFont (new Font("Calibri Light", 0, 32));
		//panel1.add(label5);
		//combobox5 = new JComboBox(s5);
		//combobox5.setBounds (60, 400, 250, 40);
		//combobox5.setBackground(Color.WHITE);
		//panel1.add(combobox5);
		
		button1 = new JButton("Submit");
		button1.setBounds (246, 590, 100, 35);
		button1.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		button1.setForeground(Color.WHITE);
		button1.setFont (new Font("Calibri Light", 1, 20));
		button1.addActionListener(this);
		panel1.add (button1);
		
		label7 = new JLabel("Venue");
		label7.setBounds (60, 330, 450, 50);
		label7.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label7);
		combobox7 = new JComboBox(s7);
		combobox7.setBounds (60, 380, 250, 40);
		combobox7.setBackground(Color.WHITE);
		panel1.add(combobox7);
		
		getFaculty();
		
		label8 = new JLabel("Invigilator");
		label8.setBounds (60, 450, 450, 50);
		label8.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label8);
		combobox8 = new JComboBox(s5);
		combobox8.setBounds (60, 500, 250, 40);
		combobox8.setBackground(Color.WHITE);
		panel1.add(combobox8);
		
		back = new JButton("Back");
		back.setBounds (20, 8, 100, 35);
		back.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		back.setForeground(Color.WHITE);
		back.setFont (new Font("Calibri", 1, 20));
		back.addActionListener(this);
		panel1.add (back);
		
		logout = new JButton("Log Out");
		logout.setBounds (460, 8, 100, 35);
		logout.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		logout.setForeground(Color.WHITE);
		logout.setFont (new Font("Calibri", 1, 20));
		logout.addActionListener(this);
		panel1.add (logout);
		
		
		this.add(panel1);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		String btn = a.getActionCommand();
		
		if(btn.equals("Submit"))
		{
			submit();
		}
		else if(btn.equals("Back"))
		{
			Admin TG = new Admin(name);
			TG.setVisible(true);
			this.setVisible(false);
		}
		else if(btn.equals("Log Out"))
		{
			TempGUI TG = new TempGUI();
			TG.setVisible(true);
			this.setVisible(false);
		}
		else{}
	}
	public void getCourse()
	{
		String query = "SELECT distinct course FROM `course_section`;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aiub","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
			int i = 0;
					
			while(rs.next())
			{
                String course = rs.getString("course");
				System.out.println(course);
				s1[i] = course;
				System.out.println(s1[i]);
				i++;
			}
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
	public void getFaculty()
	{
		String query = "SELECT * FROM `users`;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aiub","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
			int i = 0;
					
			while(rs.next())
			{
                String userId = rs.getString("UserId");
                String password = rs.getString("Password");
				int userType = rs.getInt("UserType");
				String name = rs.getString("Name");
				if (userType == 2)
				{
					s5[i] = name;
					i++;
				}				
			}
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
	public void submit()
	{
		String query = "INSERT INTO `exam` VALUES ('"+combobox1.getSelectedItem().toString()+"', '"+combobox3.getSelectedItem().toString()+"', '"+combobox6.getSelectedItem().toString()+"', '"+combobox7.getSelectedItem().toString()+"', '"+combobox4.getSelectedItem().toString()+"', '"+combobox8.getSelectedItem().toString()+"');";
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aiub", "root", "");
			Statement stm = con.createStatement();
			stm.execute(query);
			stm.close();
			con.close();					
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
    }
}