import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.Component;

import javax.swing.JSeparator;

import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.JTextField;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;

import java.awt.FlowLayout;

import java.awt.GridLayout;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;

import java.lang.NullPointerException;

import java.lang.Object;

import java.util.StringTokenizer;

import java.lang.ArithmeticException;

 import java.lang.Exception;
	
import java.lang.RuntimeException;

import java.awt.event.ItemEvent;

import java.awt.event.ItemListener;

import javax.swing.JComponent;

import javax.swing.text.JTextComponent;

import javax.swing.JTextArea;

import javax.swing.JComboBox;

import javax.swing.JLabel;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import javax.swing.JScrollPane;

import java.awt.Dimension;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.UIManager;

import javax.swing.Box;

import java.awt.EventQueue;

import java.awt.Frame;

import java.awt.Component;

import java.awt.Window;

import java.awt.Container;

public class Author extends JFrame
{
	
			private JLabel imageCarrier;
	private JLabel authorINFO1;
		private JLabel authorINFO2;
	private JLabel authorINFO3;

	private Icon authorPic;
	
	//private JButton EXIT;
	
	public Author()
	{
		
		JPanel carrier=new JPanel();
		
		JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
		
		panel1.setLayout(new FlowLayout(5,5,5));
		panel2.setLayout(new GridLayout(4,1,5,5));
		//panel3.setLayout(new FlowLayout(5,5,5));
		//panel4.setLayout(new FlowLayout(5,5,5));
		
		// authorPic=new ImageIcon(getClass().getResource("1-Constantinos-Constantinou-Personal-I.D.-Type-Photograph (Custom).jpg"));
		imageCarrier=new JLabel("Author image goes here !!!");
		imageCarrier.setHorizontalAlignment(JLabel.LEFT);
		panel1.add(imageCarrier);
		
		authorINFO1=new JLabel("Program Created By:");
		authorINFO1.setFont(new Font("Serif",Font.BOLD,14));
		authorINFO1.setHorizontalAlignment(JLabel.LEFT);
		panel2.add(authorINFO1);
		
		authorINFO2=new JLabel("Author: Constantinos Constantinou");
		authorINFO2.setFont(new Font("Serif",Font.BOLD,14));
		authorINFO2.setHorizontalAlignment(JLabel.LEFT);
		panel2.add(authorINFO2);
		
		authorINFO3=new JLabel("Email: constantinos.constantinou@engineer.com");
		authorINFO3.setFont(new Font("Serif",Font.BOLD,14));
		authorINFO3.setHorizontalAlignment(JLabel.LEFT);
		
		panel2.add(authorINFO3);
		
		/*
		
		EXIT=new JButton("Close Window");
	 EXIT.setActionCommand("clcwin");
	 EXIT.setEnabled(true);
	 EXIT.addActionListener(
			new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			if("clcwin".equals(e.getActionCommand())) 
			{
				
			}
			
			}
		});
	 panel2.add(EXIT);
	 
	 */
		
		      this.getContentPane().add(panel1);
        this.getContentPane().add(panel2);
	       // this.getContentPane().add(panel3);
			  //      this.getContentPane().add(panel4);
	
	carrier.add(panel1);
	carrier.add(panel2);
		//carrier.add(panel3);
		//carrier.add(panel4);
	
	 this.getContentPane().add(carrier);
		
	}
	
	//
	
	/*
	
	public static void main(String [] ConstantinosConstantinou)
	{
		
		Author mycalc=new Author();

		mycalc.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		mycalc.setVisible(true);
		
		mycalc.setResizable(false);
		
		mycalc.setLocationRelativeTo(null);
		
		mycalc.setSize(315,370); // width , height 
		
	}
	
	*/
	
	//
	
}
