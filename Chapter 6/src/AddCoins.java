import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCoins {

	private JFrame frame;
	private JTextField N;
	private JTextField Q;
	private JTextField D;
	private JTextField P;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCoins window = new AddCoins();
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
	public AddCoins() {
		initialize();
	}

	public static double getDollarAmount(int Q, int D, int N, int P)
	{
		double q = Q * 0.25;
		double d = D * 0.10;
		double n = N * 0.05;
		double p = P *0.01;
		double T = (q+d+n+p);
		
		return T;
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 561, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 525, 313);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your total coins:");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		lblNewLabel.setBounds(179, 22, 176, 14);
		panel.add(lblNewLabel);
		
		JLabel Quarters = new JLabel("Quarters:");
		Quarters.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		Quarters.setBounds(57, 67, 94, 14);
		panel.add(Quarters);
		
		JLabel Dimes = new JLabel("Dimes");
		Dimes.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		Dimes.setBounds(272, 67, 53, 14);
		panel.add(Dimes);
		
		JLabel Nickles = new JLabel("Nickles:");
		Nickles.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		Nickles.setBounds(57, 130, 61, 14);
		panel.add(Nickles);
		
		JLabel Pennies = new JLabel("Pennies:");
		Pennies.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		Pennies.setBounds(272, 130, 61, 14);
		panel.add(Pennies);
		
		JLabel lblTotal = new JLabel("Total:      $");
		lblTotal.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		lblTotal.setBounds(195, 248, 78, 14);
		panel.add(lblTotal);
		
		N = new JTextField();
		N.setBounds(128, 128, 86, 20);
		panel.add(N);
		N.setColumns(10);
		
		Q = new JTextField();
		Q.setBounds(128, 65, 86, 20);
		panel.add(Q);
		Q.setColumns(10);
		
		D = new JTextField();
		D.setBounds(343, 65, 86, 20);
		panel.add(D);
		D.setColumns(10);
		
		P = new JTextField();
		P.setBounds(343, 128, 86, 20);
		panel.add(P);
		P.setColumns(10);
		
		JLabel T = new JLabel("Amount");
		T.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		T.setBounds(268, 248, 87, 14);
		panel.add(T);
		
		JButton btn = new JButton("Submit");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				int qt = Integer.parseInt(Q.getText());
				int dt = Integer.parseInt(D.getText());
				int nt = Integer.parseInt(N.getText());
				int pt = Integer.parseInt(P.getText());
				
				
				T.setText(Double.toString(getDollarAmount(qt, dt, nt, pt)));
				
			}
		});
		btn.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		btn.setBounds(179, 159, 89, 23);
		panel.add(btn);
		
		
	
	}

	protected double getDollarAmount(String string){
		return 0 ;
		// TODO Auto-generated method stub

	}
}
