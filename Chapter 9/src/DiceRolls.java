/* Program: DiceRolls      Last Date of this Revision: April 14h,2022

Purpose: An application that prompts the user for the amount of rolls they would like to do with 3 dice, and then displays the outcomes.
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class DiceRolls { //start of class

	private JFrame frame;
	private JTextField num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceRolls window = new DiceRolls();
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
	public DiceRolls() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea area = new JTextArea();
		area.setFont(new Font("MS Gothic", Font.PLAIN, 13));
		area.setBounds(177, 0, 227, 239);
		panel.add(area);
		
		JButton btn = new JButton("click !");
		btn.setBackground(new Color(152, 251, 152));
		btn.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int numRolls = Integer.parseInt(num.getText()); //starts the code when the button is pushed 
				int[] outcomes = new int [19];
				int outcome;
				
				for (int roll = 0; roll < numRolls; roll++) //rolls until the amount of rolls = the number of rolls the input requested 
				{
					outcome = (int)(6 * Math.random() + 1) + (int) (6 * Math.random() +1) + (int) (6 * Math.random() +1); // adds the 3 dice outcomes together 
					outcomes[outcome] +=1;
				}
				
				for (int i = 3; i <=18; i ++) //between 3-18, only possible for 3 dice
				{
					area.append(i + ":" + outcomes[i] +"\n"); //displays the outcomes in a line
				}
			}
		});
		btn.setBounds(51, 117, 89, 23);
		panel.add(btn);
		
		num = new JTextField();
		num.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		num.setHorizontalAlignment(SwingConstants.CENTER);
		num.setBounds(41, 50, 113, 35);
		panel.add(num);
		num.setColumns(10);
		
		JLabel lbl = new JLabel("How Many Rolls?");
		lbl.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 13));
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setBounds(10, 11, 171, 30);
		panel.add(lbl);
		
		JButton btnNewButton = new JButton("clear!");
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				area.setText(" ");
			}
		});
		btnNewButton.setBounds(51, 166, 89, 23);
		panel.add(btnNewButton);
	} //end of class 
}
