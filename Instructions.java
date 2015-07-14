

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import java.lang.NullPointerException;
import java.lang.Object;
import java.util.StringTokenizer;


public class Instructions extends JFrame
{
	
	//JLabel code goes here
	
	private JLabel info;
	
	private JLabel info1;
	
		private JLabel info2;

private JLabel info22;

	private JLabel info3;
	
	private JLabel info33;
	
	private JLabel author;
	
	private JLabel author1;
	
	private JLabel author2;
	
	private JLabel author3;
	
	public Instructions()
	{
		
				JPanel carrier=new JPanel();
		
		JPanel panel3 = new JPanel();
		        panel3.setLayout(new GridLayout(10,1,5,5));

		
	info=new JLabel("Caution:");
		info.setFont(new Font("Serif",Font.BOLD,18));
		info.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(info);
		
		info1=new JLabel("You are allowed only to invoke a single operation per time.");
		info1.setFont(new Font("Serif",Font.PLAIN,14));
		info1.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(info1);
		
		info2=new JLabel("Example of allowed Operations:");
		info2.setFont(new Font("Serif",Font.BOLD,14));
		info2.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(info2);
		
		info22=new JLabel("20+20, 23-13, 8*16, 20/3, 3/20");
		info22.setFont(new Font("Serif",Font.PLAIN,14));
		info22.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(info22);
		
		info3=new JLabel("Example of not allowed Operations:");
		info3.setFont(new Font("Serif",Font.BOLD,14));
		info3.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(info3);
		
		info33=new JLabel("300+23-234, 300/10*20, 0/0, [any number]/0");
		info33.setFont(new Font("Serif",Font.PLAIN,14));
		info33.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(info33);
		
		author=new JLabel("Created by Constantinos Constantinou(C)(TM)");
		author.setFont(new Font("Serif",Font.BOLD,14));
				author.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(author);
		
		author1=new JLabel("on Thursday, April 9, 2015.");
		author1.setFont(new Font("Serif",Font.BOLD,14));
				author.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(author1);
		
		author2=new JLabel("The Basic Arithmetic Calculator, updated on Version 1.10,");
		author2.setFont(new Font("Serif",Font.BOLD,14));
				author.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(author2);
		
		author3=new JLabel("on the April 14, 2014");
		author3.setFont(new Font("Serif",Font.BOLD,14));
				author.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(author3);
		
		  this.getContentPane().add(panel3);
		  
		carrier.add(panel3);
		  
		  	 this.getContentPane().add(carrier);

	}
	
	//
	
	/*
	
	public static void main(String [] ConstantinosConstantinou)
	{
		
		Instructions mycalc=new Instructions();

		mycalc.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		mycalc.setVisible(true);
		
		mycalc.setResizable(false);
		
		mycalc.setLocationRelativeTo(null);
		
		mycalc.setSize(380,380); // width , height 
		
	}
	
	*/
	
	//
	
}
