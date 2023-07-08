package onlinestore;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Payment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 442);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PAYMENT OPTIONS");
		lblNewLabel.setBounds(28, 24, 305, 41);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("UPI");
		btnNewButton.setBounds(10, 97, 196, 32);
		btnNewButton.setForeground(new Color(0, 0, 160));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Credit/Debit Card");
		btnNewButton_1.setBounds(10, 201, 196, 32);
		btnNewButton_1.setForeground(new Color(0, 0, 160));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cash on Delivery");
		btnNewButton_2.setBounds(10, 301, 196, 32);
		btnNewButton_2.setForeground(new Color(0, 0, 160));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Pictures\\card.jpg"));
		lblNewLabel_1.setBounds(306, 189, 224, 216);
		contentPane.add(lblNewLabel_1);
	}
}
