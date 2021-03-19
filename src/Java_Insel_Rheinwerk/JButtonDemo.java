package Java_Insel_Rheinwerk;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;


public class JButtonDemo implements ActionListener{
	JFrame frame;
	ImageIcon image1;
	ImageIcon image2 ;
	JButton  button ;
	JLabel label ;
	
	public JButtonDemo() {
		button = new JButton("CLICK ME!") ;
		button.setBounds(150, 50, 100, 60);
		button.addActionListener(this);
		button.setBackground(new Color(125,125,125));
		
		
		
		
		
		frame  = new  JFrame("Button Example") ; 
		frame.setSize(new Dimension(420, 420) );
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button) ;
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("poo");
		
		
	}

	final Icon icon1 = new ImageIcon(JButtonDemo.class.getResource("/images/user-trash-full.png"));
	final Icon icon2 = new ImageIcon(JButtonDemo.class.getResource("/images/user-trash-full.png"));
	
	

	
	
}