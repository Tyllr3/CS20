/* Program: Reverse.java          Last Date of this Revision: April 13th,2022

Purpose: An application that displays a count down.
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;

public class Reverse //start of class
{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reverse window = new Reverse();
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
	public Reverse() {
		initialize();
	}
	public static void main1(String[] args) 
	{
		int[]number = new int[10];

		for (int i =0; i <= 10; i++);
		{
			int i = 0;
			number[i] = i;
			System.out.println(number[i]);
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea lbl = new JTextArea();
		lbl.setFont(new Font("Monospaced", Font.ITALIC, 33));
		lbl.setBounds(10, 148, 394, 69);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel.add(lbl);
		
		
		JButton btnNewButton = new JButton("Count Down !");
		btnNewButton.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		btnNewButton.setBounds(136, 50, 136, 51);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) //button is pushed
			{
				int[]number = new int[10]; // 10 indexes
				
				for (int i =0; i <= 9; i++) //correct order 
				{
					number[i] = i; //stores 
					
				}
				
				
				for (int i =9; i >= 0; i--) //allows for numbers to reverse 
				{
					number[i] = i;
					String el = Integer.toString(number[i]); //converts to string 
					lbl.append(el + " "); //displays the numbers in a reverse order 
				}
			}
		});
	}
} //end of class
