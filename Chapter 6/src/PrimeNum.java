/*
Program: PrimeNum.java          Last Date of this Revision: March 8th,2022

Purpose: An application that allows the user to find out whether or not a number is prime.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

//importing items
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PrimeNum { //start of class

	private JFrame frame;
	private JTextField inpT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeNum window = new PrimeNum();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrimeNum() {
		initialize();
	}

	
	
	
	
	public static boolean isPrime( int x) //sets number isPrime as x
	{
		int divisor = 1; //divisor is 1
		
		do
		{
			divisor = divisor  + 1; //add one to the divisor while x % 0 isn't true. Which means it'll keep adding until it divides properly.

		}while(( x % divisor) != 0);

		if(divisor == x) //if the divisor was equal to the number inputed, then it's prime since the number is divisible by itself before anything else
		{
			return true;
		}
		else
		{
			return false; //if the divisor isn't equal to the number, it means it isn't prime because there's another number that allows for it to be divided.
		}
	}
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { //GUI
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel(); 
		panel.setBounds(10, 11, 499, 304);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		inpT = new JTextField();
		inpT.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		inpT.setBounds(237, 14, 143, 39);
		panel.add(inpT);
		inpT.setColumns(10);
		
		JLabel dis = new JLabel("The number is prime"); //label that expresses a statement to be either true or false
		dis.setHorizontalAlignment(SwingConstants.CENTER);
		dis.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		dis.setBounds(61, 175, 376, 54);
		panel.add(dis);
		
		JLabel lblNewLabel = new JLabel("Enter a Number"); //user input
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNewLabel.setBounds(100, 23, 135, 14);
		panel.add(lblNewLabel);
		
		
		
		
		
		
		
		JButton subm = new JButton("Submit"); //to start isPrime
		subm.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		subm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int userNum = Integer.parseInt(inpT.getText()); //gets text back
				
				
				
				dis.setText(Boolean.toString(isPrime(userNum))); //converts boolean to text and displays it
			}
		});
		subm.setBounds(178, 81, 143, 39);
		panel.add(subm);
	}
} //end of class
