import javax.swing.*;
import java.awt.*;

public class Admin extends JFrame
{
	private JLabel label1, label2, label3, label4, label5, label6;
	private JComboBox combobox1, combobox2, combobox3, combobox4, combobox5, combobox6;
	private JButton button1;
	private ImageIcon image;
	private JPanel panel1;
	private String s1[] = {"Progamming Language 1","Progamming Language 2","Discrete Mathmatics","Data Structure","Introduction To DataBase", "Algorithm"};
	private String s2[] = {"A","B","C","D","E"};
	private String s3[] = {"Slot 1","Slot 2","Slot 3"};
	private String s4[] = {"Annex 1","Annex 2","Annex 3","Annex 4","Annex 5"};
	private String s5[] = {"Mir Riyanul Islam","Mohaimen Bin Noor","Victor Stany Rozario","Hasibul Hasan","Rezwan Ahmed"};
	private String s6[] = {"Day 1", "Day 2", "Day 3","Day 4", "Day 5", "Day 6"};
	
	public Admin ()
	{
		super("Admin");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		label1 = new JLabel("Course");
		label1.setBounds (100, 40, 400, 50);
		label1.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label1);
		combobox1 = new JComboBox(s1);
		combobox1.setBounds (100, 90, 400, 50);
		//comboboxl.setFont(new java.awt.Font("Calibri", 0, 20));
		combobox1.setBackground(Color.WHITE);
		panel1.add(combobox1);
		
		label3 = new JLabel("Section");
		label3.setBounds (600, 40, 100, 50);
		label3.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label3);
		combobox2 = new JComboBox(s2);
		combobox2.setBounds (600, 90, 100, 50);
		combobox2.setBackground(Color.WHITE);
		panel1.add(combobox2);
		
		label2 = new JLabel("Slot");
		label2.setBounds (100, 200, 150, 50);
		label2.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label2);	
		combobox3 = new JComboBox(s3);
		combobox3.setBounds (100, 250, 150, 50);
		combobox3.setBackground(Color.WHITE);
		panel1.add(combobox3);		
		
		label4 = new JLabel("Venue");
		label4.setBounds (330, 200, 150, 50);
		label4.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label4);
		combobox4 = new JComboBox(s4);
		combobox4.setBounds (330, 250, 150, 50);
		combobox4.setBackground(Color.WHITE);
		panel1.add(combobox4);
		
		label6 = new JLabel("Day");
		label6.setBounds (550, 200, 150, 50);
		label6.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label6);
		combobox6 = new JComboBox(s6);
		combobox6.setBounds (550, 250, 150, 50);
		combobox6.setBackground(Color.WHITE);
		panel1.add(combobox6);
		
		label5 = new JLabel("Invigilator");
		label5.setBounds (100, 350, 450, 50);
		label5.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label5);
		combobox5 = new JComboBox(s5);
		combobox5.setBounds (100, 400, 450, 50);
		combobox5.setBackground(Color.WHITE);
		panel1.add(combobox5);
		
		button1 = new JButton("Submit");
		button1.setBounds (100, 500, 500, 50);
		button1.setBackground (Color.BLUE);
		button1.setFont (new Font("Calibri Light", 0, 32));
		panel1.add (button1);
		
		/*image = new ImageIcon (getClass().getResource("aiub.jpg"));
		label5 = new JLabel (image);
		label5.setBounds(10, 10, 220, 220);
		panel1.add(label5);		*/
		
		this.add(panel1);
	}
}