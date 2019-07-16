/*b-ismi-llahi r-raḥmani r-raḥimi*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;

public class TicTacToe2 extends JFrame implements ActionListener, MouseListener // class name 
{
	private JLabel tic, sign;
	private JButton f1, f2, f3, f4, f5, f6, f7, f8, f9, start;
	private JPanel panel1;
	private JRadioButton pla1, pla2, x, o;
	private ButtonGroup bg1, bg2;

	
	public TicTacToe2 () // constructor
	{
		
		super("TicTacToe 2 Player"); //GUI name
		this.setSize(800, 500);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
    	panel1.setBackground(Color.white);
    
		tic = new JLabel("Tic Tac Toe");
		tic.setBounds (275, 30, 400, 100);
		tic.setFont (new Font("Calibri", 1, 50)); //1 for bold
		tic.setBackground(Color.white);
		tic.setForeground(Color.BLACK); //(new java.awt.Color(x, y, z)); // RGB color combo
		panel1.add(tic);
		
		tic = new JLabel("Which Player are you?");
		tic.setBounds (250, 120, 400, 100);
		tic.setFont (new Font("Calibri", 0, 32)); //1 for bold
		tic.setBackground(Color.white);
		tic.setForeground(Color.BLUE); //(new java.awt.Color(x, y, z)); // RGB color combo
		panel1.add(tic);
		
		pla1 = new JRadioButton("Player 1");
		pla1.setBounds (200, 200, 150, 40);
		pla1.setFont (new Font("Times New Roman", 0, 24)); //1 for bold
		pla1.setBackground(Color.white);
		pla1.setForeground(Color.RED); //(new java.awt.Color(x, y, z)); // RGB color combo
		panel1.add(pla1);
		
		pla2 = new JRadioButton("Player 2");
		pla2.setBounds (450, 200, 150, 40);
		pla2.setFont (new Font("Times New Roman", 0, 24)); //1 for bold
		pla2.setBackground(Color.white);
		pla2.setForeground(Color.GREEN); //(new java.awt.Color(x, y, z)); // RGB color combo
		panel1.add(pla2);
		
		bg1 = new ButtonGroup();
		bg1.add(pla1);
		bg1.add(pla2);
		
		sign = new JLabel("Choose your sign: ");
		sign.setBounds (200, 240, 400, 100);
		sign.setFont (new Font("Calibri", 0, 32)); //1 for bold
		sign.setBackground(Color.white);
		sign.setForeground(Color.BLUE); //(new java.awt.Color(x, y, z)); // RGB color combo
		panel1.add(sign);
		
		start = new JButton("start");
		start.setBounds (350, 350, 100, 35);
		start.setFont (new Font("Calibri", 0, 28)); //1 for bold
		start.setBackground(Color.BLACK);
		start.setForeground(Color.WHITE); //(new java.awt.Color(x, y, z)); // RGB color combo
		panel1.add(start);
		
		
    	/*label1 = new JLabel("Text of the label");
		label1.setBounds (x coordinate, y coordinate, width, height);
		label1.setFont (new Font("Calibri", 0, 36)); //1 for bold
		label1.setForeground(new java.awt.Color(x, y, z)); // RGB color combo
		panel1.add(label1);*/
	
		
		this.add(panel1);
	}
	
	public void mouseClicked(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m){}
	public void mouseExited(MouseEvent m){}
	
	public void actionPerformed(ActionEvent a){}
	
	public static void main (String []args) //main class
	{
		TicTacToe2 obj = new TicTacToe2();
		obj.setVisible(true);
	}
	
}