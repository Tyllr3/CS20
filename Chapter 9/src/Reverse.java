import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reverse 
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
		
		JLabel lbl = new JLabel("New label");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setBounds(10, 141, 414, 109);
		frame.getContentPane().add(lbl);
		
		
		
		JButton btnNewButton = new JButton("Count Down !");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//lbl.setText(number[i]);
			}
		});
		btnNewButton.setBounds(167, 75, 105, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
