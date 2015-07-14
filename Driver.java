
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
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
import java.lang.Object;
import java.util.StringTokenizer;
import java.lang.Math;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.Color;
//  import javafx.scene.paint.Color;  
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.lang.Exception;

import java.lang.NullPointerException;
import java.lang.NumberFormatException;
import java.lang.ArithmeticException;
import java.lang.RuntimeException;

public class Driver extends JFrame
{
	
	//
			
	private double num1,num2,result;
		
	private int count=0;
	
	private String calculationCarrier="  ";
	
	private String clc="  ";
	
	private int numP1,numP2;
	
	private int PClicks=0;
	
	/*
	numP1=0;
	numP2=0;
	PClicks=0;
	*/
	
	//private boolean sqrtPointer=false;
		
	//Buttons code goes here
	
	private JButton Button0;
	private JButton Button1;
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;
	private JButton Button5;
	private JButton Button6;
	private JButton Button7;
	private JButton Button8;
	private JButton Button9;
	
	private JButton ButtonPlus;
	private JButton ButtonMinus;
	private JButton ButtonMul;
	private JButton ButtonDiv;
	private JButton ButtonClear;
	private JButton ButtonAnswear;
	
		private JButton dotSign;
		private JButton leftBrucket;
		private JButton rightBrucket;
		private JButton sqrt;
		
		private JButton EXIT;
		private JButton INFORMATION;
		private JButton AUTHOR;
		
		//
	
	private JMenuBar textEditorMenu;
	
       private JMenu MENU;
	       private JMenu ABOUT;
	
	//JtextField Code goes here
	
	private JTextField Display;
	
	//
	
	public Driver()
	{
		
		//call to super class 
		
		super("Basic Arithmetic Calculator Version 1.15");
		
		//initialize JPanels
		
		JPanel carrier=new JPanel();
		
		JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
		
		JPanel header= new JPanel();
	

				header.setLayout(new FlowLayout(FlowLayout.LEFT));
		header.setAlignmentX(Component.LEFT_ALIGNMENT);
		
      // panel1.setLayout(new GridLayout(1,1,5,5));
		
		 panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		 panel2.setLayout(new GridLayout(4, 5,5,5));
		 
		carrier.setLayout(new FlowLayout(5,5,5));
		
		//=========================================================================================
				
		//Create the menu bar.
        textEditorMenu = new JMenuBar();
		
				//=========================================================================================

        //Build the first menu.
        MENU = new JMenu("Menu");
		MENU.setForeground(Color.BLUE);
		
	ABOUT = new JMenu("About");
	ABOUT.setForeground(Color.BLUE);
	
	//ABOUT.add(Box.createHorizontalGlue()); 
			
		 textEditorMenu.add(MENU);

	INFORMATION=new JButton("HELP");
	 	INFORMATION.setActionCommand("helpJButton");
		INFORMATION.setEnabled(true);
		INFORMATION.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			if("helpJButton".equals(e.getActionCommand())) 
			{
				
				Instructions mycalc=new Instructions();

		mycalc.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		mycalc.setVisible(true);
		
		mycalc.setResizable(false);
		
		mycalc.setLocationRelativeTo(null);
		
		mycalc.setSize(380,380); // width , height 
				
			}
			
			}
		});
		MENU.add(INFORMATION);
	  
	  EXIT=new JButton("EXIT");
	 EXIT.setActionCommand("exitJButton");
	 EXIT.setEnabled(true);
		EXIT.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			if("exitJButton".equals(e.getActionCommand())) 
			{
				
			System.exit(0);
				
			}
			
			}
		});
	 MENU.add(EXIT);
	 
	 		//=========================================================================================

		 		textEditorMenu.add(ABOUT);
				 
				 
				AUTHOR=new JButton("Author");
					AUTHOR.setActionCommand("authorJButton");
					AUTHOR.setEnabled(true);
					AUTHOR.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			if("authorJButton".equals(e.getActionCommand())) 
			{
				
				Author mycalc=new Author();

		mycalc.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		mycalc.setVisible(true);
		
		mycalc.setResizable(false);
		
		mycalc.setLocationRelativeTo(null);
		
		mycalc.setSize(315,370); // width , height
				
			}
			
			}
		});
					ABOUT.add(AUTHOR);
					
					//MENU.add(AUTHOR);
					
				//textEditorMenu.add(AUTHOR);
					
					//=========================================================================================
					
					header.add(textEditorMenu); 
					
				//=========================================================================================
	
		
		//JtextField Code goes here
	
		Display=new JTextField(" ",19);
		Display.setHorizontalAlignment(JTextField.CENTER);
		Display.setEditable(false);
		Display.setFont(new Font("Serif",Font.PLAIN,18));
		panel1.add(Display);
		
		//Buttons code goes here
	
	Button1=new JButton("1");
	Button1.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor = Button1.getForeground();
		Color oldcolor1 = Button1.getBackground();
         public void mouseEntered(MouseEvent me) 
		{
            oldcolor = Button1.getForeground();
			Color oldcolor1 = Button1.getBackground();
            Button1.setForeground(Color.WHITE);
			 Button1.setBackground(Color.ORANGE);
         }
         public void mouseExited(MouseEvent me) {
            Button1.setForeground(oldcolor);
		 			 Button1.setBackground(oldcolor1);

         }
      }
      );
	Button1.setActionCommand("one");
		panel2.add(Button1);
		
	Button2=new JButton("2");
			Button2.setActionCommand("two");
			panel2.add(Button2);

	Button3=new JButton("3");
	Button3.setActionCommand("three");
		panel2.add(Button3);
		
		/*
		
	private int numP1,numP2;
	
	private int PClicks=0;
		
		*/
		
	//	Icon SQRTico=new ImageIcon(getClass().getResource("sqrt.png"));
		sqrt=new JButton("|/''''");
	sqrt.setActionCommand("sqrt");
	sqrt.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			Font font=null;
				
			if("sqrt".equals(e.getActionCommand())) 
			{
			
                                 PClicks++;

                                    if(PClicks==1)
				    {

					    numP1=1;
                                           
				    }
                                    else if(PClicks==2)
					    {
						    
						    numP2=1;
						    
						}
                                         else
						 {
						// do nothing	 
						}					    
				
			calculationCarrier=calculationCarrier.concat("|/''''");
				
				// clc=clc.concat("Math.sqrt");
				clc=clc.concat("");
				
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
			//count++;
				
			}
			
			}
		});
		panel2.add(sqrt);
		
	ButtonPlus=new JButton("+");
	ButtonPlus.setActionCommand("plus");
		panel2.add(ButtonPlus);
		
	Button4=new JButton("4");
	Button4.setActionCommand("four");
		panel2.add(Button4);
		
	Button5=new JButton("5");
	Button5.setActionCommand("five");
		panel2.add(Button5);
		
	Button6=new JButton("6");
	Button6.setActionCommand("six");
		panel2.add(Button6);
		
		 leftBrucket=new JButton("(");
	 leftBrucket.setActionCommand("leftBrucket");
		leftBrucket.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("leftBrucket".equals(e.getActionCommand())) 
			{
				
			calculationCarrier=calculationCarrier.concat("(");
				 clc=clc.concat("");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
			//count++;
				
			}
			
			}
		});
		panel2.add(leftBrucket);
		
	ButtonMinus=new JButton("-");
	ButtonMinus.setActionCommand("minus");
		panel2.add(ButtonMinus);
		
	Button7=new JButton("7");
	Button7.setActionCommand("seven");
		panel2.add(Button7);
		
	Button8=new JButton("8");
	Button8.setActionCommand("eight");
		panel2.add(Button8);
		
	Button9=new JButton("9");
	Button9.setActionCommand("nine");
		panel2.add(Button9);
		
		rightBrucket=new JButton(")");
	 rightBrucket.setActionCommand("rightBrucket");
		rightBrucket.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("rightBrucket".equals(e.getActionCommand())) 
			{
				
			 calculationCarrier=calculationCarrier.concat(")");
				 clc=clc.concat("");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
			//count++;
				
			}
				
			}
			
		});
		panel2.add(rightBrucket);
		
	ButtonMul=new JButton("*");
	ButtonMul.setActionCommand("mul");
		panel2.add(ButtonMul);
		
	ButtonClear=new JButton("CE");
	ButtonClear.setActionCommand("clear");
		panel2.add(ButtonClear);
		
	Button0=new JButton("0");
	Button0.setActionCommand("zero");
		panel2.add(Button0);
		
	ButtonAnswear=new JButton("=");
		ButtonAnswear.setEnabled(true);
	ButtonAnswear.setActionCommand("answer");
		panel2.add(ButtonAnswear);
		
		dotSign=new JButton(".");
	dotSign.setActionCommand("dotSign");
		dotSign.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			Font font=null;
				
			if("dotSign".equals(e.getActionCommand())) 
			{
				
			 calculationCarrier=calculationCarrier.concat(".");
				 clc=clc.concat(".");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
			//count++;
				
			}
			
			}
		});
		panel2.add(dotSign);
		
	ButtonDiv=new JButton("/");
	ButtonDiv.setActionCommand("div");
		panel2.add(ButtonDiv);
	
	       // Add panels to frame
	       
      this.getContentPane().add(panel1);
        this.getContentPane().add(panel2);
	      
		carrier.add(header);
	carrier.add(panel1);
	carrier.add(panel2);
	
	 this.getContentPane().add(carrier);
	
		//Buttons Action listener Code goes here
		
		ButtonHandler clickButton=new ButtonHandler();
		Button1.addActionListener(clickButton);
		Button2.addActionListener(clickButton);
		Button3.addActionListener(clickButton);
		sqrt.addActionListener(clickButton);
		ButtonPlus.addActionListener(clickButton);
		Button4.addActionListener(clickButton);
		Button5.addActionListener(clickButton);
		Button6.addActionListener(clickButton);
		ButtonMinus.addActionListener(clickButton);
		Button7.addActionListener(clickButton);
		Button8.addActionListener(clickButton);
		Button9.addActionListener(clickButton);
		ButtonMul.addActionListener(clickButton);
		ButtonClear.addActionListener(clickButton);
		Button0.addActionListener(clickButton);
		ButtonAnswear.addActionListener(clickButton);
		ButtonDiv.addActionListener(clickButton);
		//dotSign.addActionListener(clickButton);
		//leftBrucket.addActionListener(clickButton);
		//rightBrucket.addActionListener(clickButton);
		//EXIT.addActionListener(clickButton);
		//INFORMATION.addActionListener(clickButton);
		//AUTHOR.addActionListener(clickButton);
				
		//
		
	}
	
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			//
			
			Font font=null;
			
		 if(count>1)//error condition handling 
		{
			
		//JOptionPane.showMessageDialog(null,"\n You have tried to invoke more than one operation through the calculator. \n Now the program will terminate. \n","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
			
			//System.exit(1);
			
			//calculationCarrier=" ERROR !!!";
			
			clc=" ERROR !!!";
			Display.setText( clc );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
			Button0.setEnabled(false);
			Button1.setEnabled(false);
			Button2.setEnabled(false);
			Button3.setEnabled(false);
			Button4.setEnabled(false);
			Button5.setEnabled(false);
			Button6.setEnabled(false);
			Button7.setEnabled(false);
			Button8.setEnabled(false);
			Button9.setEnabled(false);
			ButtonPlus.setEnabled(false);
			ButtonMinus.setEnabled(false);
			ButtonMul.setEnabled(false);
			ButtonDiv.setEnabled(false);
			ButtonAnswear.setEnabled(false);
			dotSign.setEnabled(false);
		leftBrucket.setEnabled(false);
		rightBrucket.setEnabled(false);
		 sqrt.setEnabled(false);
			
			count=0;
			
			numP1=0;
	numP2=0;
	PClicks=0;
						
	JOptionPane.showMessageDialog(null,"\n You have tried to invoke more than one operation through the calculator.\n The calculation JButtons of the calculator are frosed. \n Click the CE button of the calculator, in order for the JButtons to be enabled \n and you get the allowance to invoke another calculation. \n","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		else if ("one".equals(e.getActionCommand())) 
		{
			
                      calculationCarrier=calculationCarrier.concat("1");
			 clc=clc.concat("1");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
						//count++;
			
		} 
		else if ("two".equals(e.getActionCommand())) 
		{
			
			calculationCarrier=calculationCarrier.concat("2");
			 clc=clc.concat("2");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
						//count++;
			
		} 
		else if ("three".equals(e.getActionCommand())) 
		{
			
			calculationCarrier=calculationCarrier.concat("3");
			 clc=clc.concat("3");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
						//count++;
			
		} 
		else if ("four".equals(e.getActionCommand())) 
		{
			
			calculationCarrier=calculationCarrier.concat("4");
			 clc=clc.concat("4");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
						//count++;
			
		} 
		else if ("five".equals(e.getActionCommand())) 
		{
			
			calculationCarrier=calculationCarrier.concat("5");	
			 clc=clc.concat("5");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
						//count++;
			
		}
		else if ("six".equals(e.getActionCommand())) 
		{
		
			calculationCarrier=calculationCarrier.concat("6");
			 clc=clc.concat("6");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
						//count++;
			
		}
		else if ("seven".equals(e.getActionCommand())) 
		{
			
			calculationCarrier=calculationCarrier.concat("7");
			 clc=clc.concat("7");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
						//count++;
			
		} 
		else if ("eight".equals(e.getActionCommand())) 
		{
	
		calculationCarrier=calculationCarrier.concat("8");	
			 clc=clc.concat("8");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
						//count++;
			
		} 
		else if ("nine".equals(e.getActionCommand())) 
		{
			
		calculationCarrier=calculationCarrier.concat("9");
			 clc=clc.concat("9");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
						//count++;
			
		} 
		else if ("zero".equals(e.getActionCommand())) 
		{
		
			calculationCarrier=calculationCarrier.concat("0");
			 clc=clc.concat("0");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
						//count++;
			
		}
		else if ("plus".equals(e.getActionCommand())) 
		{
		
		calculationCarrier=calculationCarrier.concat("+");
			 clc=clc.concat("+");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
			count++;
			
		}
		else if ("minus".equals(e.getActionCommand())) 
		{
			
			calculationCarrier=calculationCarrier.concat("-");
			 clc=clc.concat("-");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
			
			count++;
			
		} 
		else if ("mul".equals(e.getActionCommand())) 
		{
			
			calculationCarrier=calculationCarrier.concat("*");
			 clc=clc.concat("*");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);

			count++;
			
		} 
		else if ("div".equals(e.getActionCommand())) 
		{
			
			calculationCarrier=calculationCarrier.concat("/");
			 clc=clc.concat("/");
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);

			count++;
			
		} 
		else if ("clear".equals(e.getActionCommand())) 
		{
			
			Display.setText(" ");
				font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font); 
			calculationCarrier=" ";
			clc=" ";
			
			Button0.setEnabled(true);
			Button1.setEnabled(true);
			Button2.setEnabled(true);
			Button3.setEnabled(true);
			Button4.setEnabled(true);
			Button5.setEnabled(true);
			Button6.setEnabled(true);
			Button7.setEnabled(true);
			Button8.setEnabled(true);
			Button9.setEnabled(true);
			ButtonPlus.setEnabled(true);
			ButtonMinus.setEnabled(true);
			ButtonMul.setEnabled(true);
			ButtonDiv.setEnabled(true);
			ButtonAnswear.setEnabled(true);
			dotSign.setEnabled(true);
		leftBrucket.setEnabled(true);
		rightBrucket.setEnabled(true);
		 sqrt.setEnabled(true);
			
			count=0;
			
			numP1=0;
	numP2=0;
	PClicks=0;
			
		}
		else if ("answer".equals(e.getActionCommand())) 
		{
			if(count<1)
			{
				// do this ... 
				try
				{
					if(numP1 ==1 )
					{
				num1=Double.parseDouble(clc);
						num1=Math.sqrt(num1);
					}
					else
					{
				num1=Double.parseDouble(clc);
					}
					
					clc=" ";
					
					clc=Double.toString(num1);
					
					Display.setText(" ");
			
			 calculationCarrier=clc;
			
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
		
			Button0.setEnabled(false);
			Button1.setEnabled(false);
			Button2.setEnabled(false);
			Button3.setEnabled(false);
			Button4.setEnabled(false);
			Button5.setEnabled(false);
			Button6.setEnabled(false);
			Button7.setEnabled(false);
			Button8.setEnabled(false);
			Button9.setEnabled(false);
			ButtonPlus.setEnabled(false);
			ButtonMinus.setEnabled(false);
			ButtonMul.setEnabled(false);
			ButtonDiv.setEnabled(false);
			ButtonAnswear.setEnabled(false);
			dotSign.setEnabled(false);
		leftBrucket.setEnabled(false);
		rightBrucket.setEnabled(false);
		 sqrt.setEnabled(false);
			
			count=0;
			
			numP1=0;
	numP2=0;
	PClicks=0;
						
	JOptionPane.showMessageDialog(null,"\n In order to invoke another calculation,\n click the CE button, \n of the calculator. \n","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
		
				}
				catch(NumberFormatException a)
				{
					System.out.println(a);
				}
				catch(ArithmeticException b)
				{
				System.out.println(b);
				}
				catch(RuntimeException c)
				{
				System.out.println(c);
				}
			}
			else
			{
			int size=clc.length();
			
			//  int size=calculationCarrier.length();
			
			String [] chars=new String[2];
			
			String symbol=" ";
			
			String temp=" ";
			
			//  StringTokenizer tokens = new StringTokenizer(calculationCarrier,"+-*/");
			
			StringTokenizer tokens = new StringTokenizer(clc,"+-*/");
			
			for(int i=0;i<chars.length;i++)
			{
								
				chars[i]=tokens.nextToken();
				
			}
			
			//  String myStr =calculationCarrier.replaceAll("", " ");
			
			String myStr =clc.replaceAll("", " ");
			
			StringTokenizer tokens2 = new StringTokenizer(myStr," ");
			
			for(int i=0;i<size;i++)
			{
								
				temp=tokens2.nextToken();
				
				if( ((temp.compareTo("+"))==0) || ((temp.compareTo("-"))==0) ||  ((temp.compareTo("*"))==0) || ((temp.compareTo("/"))==0) )
				{
					
					symbol=temp;
					
					i=100; // loop eliminator
					
				}
				
			}
			
			/*
			
			import java.lang.NullPointerException;
			import java.lang.NumberFormatException;
			import java.lang.ArithmeticException;
			import java.lang.RuntimeException;
			
			*/
			
			if((symbol.compareTo("+"))==0)
			{
				
				try
				{
					
					if(numP1 ==1 )
					{
				num1=Double.parseDouble(chars[0]);
						num1=Math.sqrt(num1);
					}
					else
					{
				num1=Double.parseDouble(chars[0]);
					}
				
					if(numP2 ==1)
					{
				num2=Double.parseDouble(chars[1]);
						num2=Math.sqrt(num2);
					}
				else
				{
					num2=Double.parseDouble(chars[1]);
				}
				
				result=(num1+num2);
				
				// calculationCarrier=Double.toString(result);
				
				clc=Double.toString(result);
				
				}
				catch(NumberFormatException a)
				{
					System.out.println(a);
				}
				catch(ArithmeticException b)
				{
				System.out.println(b);
				}
				catch(RuntimeException c)
				{
				System.out.println(c);
				}
				
			}
			else if((symbol.compareTo("-"))==0)
			{
				try
				{
					
					if(numP1 ==1 )
					{
				num1=Double.parseDouble(chars[0]);
						num1=Math.sqrt(num1);
					}
					else
					{
				num1=Double.parseDouble(chars[0]);
					}
				
					if(numP2 ==1)
					{
				num2=Double.parseDouble(chars[1]);
						num2=Math.sqrt(num2);
					}
				else
				{
					num2=Double.parseDouble(chars[1]);
				}
				
				result=(num1-num2);
				
				//  calculationCarrier=Double.toString(result);
				
				clc=Double.toString(result);
				
				}
				catch(NumberFormatException a)
				{
					System.out.println(a);
				}
				catch(ArithmeticException b)
				{
				System.out.println(b);
				}
				catch(RuntimeException c)
				{
				System.out.println(c);
				}
				
			}
			else if((symbol.compareTo("*"))==0)
			{
				try
				{
					
				if(numP1 ==1 )
					{
				num1=Double.parseDouble(chars[0]);
						num1=Math.sqrt(num1);
					}
					else
					{
				num1=Double.parseDouble(chars[0]);
					}
				
					if(numP2 ==1)
					{
				num2=Double.parseDouble(chars[1]);
						num2=Math.sqrt(num2);
					}
				else
				{
					num2=Double.parseDouble(chars[1]);
				}
				
				result=(num1*num2);
				
				//  calculationCarrier=Double.toString(result);
				
				clc=Double.toString(result);
				
				}
				catch(NumberFormatException a)
				{
					System.out.println(a);
				}
				catch(ArithmeticException b)
				{
				System.out.println(b);
				}
				catch(RuntimeException c)
				{
				System.out.println(c);
				}
				
			}
			else if((symbol.compareTo("/"))==0)
			{
			    try
			   {
				   
				   //
				   
				if(numP1 ==1 )
					{
				num1=Double.parseDouble(chars[0]);
						num1=Math.sqrt(num1);
					}
					else
					{
				num1=Double.parseDouble(chars[0]);
					}
				
					if(numP2 ==1)
					{
				num2=Double.parseDouble(chars[1]);
						num2=Math.sqrt(num2);
					}
				else
				{
					num2=Double.parseDouble(chars[1]);
				}
				
				if( ( num1==0 && num2==0 ) || ( num2==0 ) )
				{
					
					//calculationCarrier=" Math Error !!! ";
					
					clc=" Math Error !!! ";
					
				}
				else
				{
				
				result=(num1/num2);

				//  calculationCarrier=Double.toString(result);
					
					clc=Double.toString(result);
					
				}
				
				//
				
			   }
				catch(NumberFormatException a)
				{
					System.out.println(a);
				}
				catch(ArithmeticException b)
				{
				System.out.println(b);
				}
				catch(RuntimeException c)
				{
				System.out.println(c);
				}
								
			}
			
			Display.setText(" ");
			
			 calculationCarrier=clc;
			
			Display.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			Display.setFont(font);
		
			Button0.setEnabled(false);
			Button1.setEnabled(false);
			Button2.setEnabled(false);
			Button3.setEnabled(false);
			Button4.setEnabled(false);
			Button5.setEnabled(false);
			Button6.setEnabled(false);
			Button7.setEnabled(false);
			Button8.setEnabled(false);
			Button9.setEnabled(false);
			ButtonPlus.setEnabled(false);
			ButtonMinus.setEnabled(false);
			ButtonMul.setEnabled(false);
			ButtonDiv.setEnabled(false);
			ButtonAnswear.setEnabled(false);
			dotSign.setEnabled(false);
		leftBrucket.setEnabled(false);
		rightBrucket.setEnabled(false);
		 sqrt.setEnabled(false);
			
			count=0;
			
			numP1=0;
	numP2=0;
	PClicks=0;
						
	JOptionPane.showMessageDialog(null,"\n In order to invoke another calculation,\n click the CE button, \n of the calculator. \n","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
		
		}
		
	         }
		
		//
			
		}
	}
	
	public static void main(String[] tinoC23)
	{
			
		Driver mycalc=new Driver();

		mycalc.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		mycalc.setVisible(true);
		
		mycalc.setResizable(false);
		
		mycalc.setLocationRelativeTo(null);
		
		mycalc.setSize(300,250);
		
	}
	
}
