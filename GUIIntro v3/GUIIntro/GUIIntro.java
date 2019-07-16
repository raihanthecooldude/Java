import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIIntro extends JFrame implements MouseListener, ActionListener
{
	private JLabel myLabel;
	private JTextField myTextField;
	private JPasswordField myPasswordField;
	private JButton b1, b2;
	private JRadioButton r1, r2;
	private ButtonGroup bg1;
	private JCheckBox c1, c2;
	private JComboBox combo1;
	private JPanel panel;
	private String s[] = {"Hi","Hello","Kemon Acho?","Bujhi Nai","Bye"};
	
	public GUIIntro()
	{
		super("GUI");
		this.setSize(800,600);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		myLabel = new JLabel("E kemon Bichar?");
		myLabel.setBounds(100, 30, 600, 30);
		myLabel.setBackground(Color.RED);
		myLabel.setOpaque(true);
		myLabel.setFont(new Font("Arial Unicode MS", 0, 20));
		panel.add(myLabel);
		
		myTextField = new JTextField();
		myTextField.setBounds(100, 80, 600, 40);
		myTextField.setBackground(Color.YELLOW);
		panel.add(myTextField);
		
		myPasswordField = new JPasswordField();
		myPasswordField.setBounds(100, 150, 300, 40);
		myPasswordField.setEchoChar('?');
		myPasswordField.setBackground(Color.CYAN);
		panel.add(myPasswordField);
		
		b1 = new JButton("Next");
		b1.setBounds(100, 200, 100, 50);
		b1.setBackground(Color.GREEN);
		b1.addMouseListener(this);
		b1.addActionListener(this);
		panel.add(b1);
		
		b2 = new JButton("Back");
		b2.setBounds(250, 200, 100, 50);
		b2.setBackground(Color.BLUE);
		b2.addActionListener(this);
		panel.add(b2);
		
		r1 = new JRadioButton("OOP1 D");
		r1.setBounds(150, 300, 100, 30);
		panel.add(r1);
		
		r2 = new JRadioButton("OOP1 F");
		r2.setBounds(150, 350, 100, 30);
		panel.add(r2);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		
		c1 = new JCheckBox("Kobul");
		c1.setBounds(150, 400, 100,30);
		panel.add(c1);
		
		c2 = new JCheckBox("Talak");
		c2.setBounds(150, 450, 100,30);
		panel.add(c2);
		
		combo1 = new JComboBox(s);
		combo1.setBounds(300, 350, 100, 30);
		panel.add(combo1);
		
		this.add(panel);		
	}
	
	public void mouseClicked(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m)
	{
		System.out.println("Entered");
		myTextField.setBackground(Color.GREEN);
		b1.setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent m)
	{
		System.out.println("Exit");
		myTextField.setBackground(Color.YELLOW);
		b1.setBackground(Color.GRAY);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		String btn = a.getActionCommand();
		
		if(btn.equals("Next"))
		{
			System.out.println("Next CLicked");
			myLabel.setText(myTextField.getText());
		}
		else if(btn.equals("Back"))
		{
			System.out.println("Back CLicked");
			myLabel.setText("E Kemon Bichar?");
		}
		else{}
	}
}