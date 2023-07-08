package onlinestore;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Registration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	@SuppressWarnings("unused")
	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration reg = new Registration();
					reg.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(215, 255, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setBounds(207, 10, 141, 36);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(24, 128, 98, 24);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(24, 187, 73, 24);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone ");
		lblNewLabel_3.setBounds(24, 240, 121, 24);
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(187, 313, 141, 26);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setBounds(24, 310, 141, 24);
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(182, 132, 162, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 191, 318, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(182, 243, 162, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign Up");
		
		btnNewButton.setBounds(207, 406, 121, 24);
		btnNewButton.setBackground(new Color(124, 87, 202));
		btnNewButton.setFont(new Font("Dubai Light", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			@Override
						public void actionPerformed(ActionEvent e) {
							try
							{
								Class.forName("oracle.jdbc.driver.OracleDriver");
								Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","msc");
								PreparedStatement pst = con.prepareStatement("insert into Registration1 values(?,?,?,?,?)");
								pst.setString(1, textField_3.getText());
								pst.setString(2, textField.getText());
								pst.setString(3, textField_1.getText());
								pst.setString(4, textField_2.getText());
								pst.setString(5, passwordField.getText());
								pst.executeUpdate();
								{   
									
								JOptionPane.showMessageDialog(null,"Registered successfully");
									new Cloth().setVisible(true);	
									setVisible(false);
									//yi.setVisible(true);
								
									
																	
								}			
								
								pst.close();
							}catch(Exception ee)
							{
								System.out.println(ee);
							}
							
						}
								
					});
						
		
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Username");
		lblNewLabel_6.setBounds(24, 78, 153, 24);
		lblNewLabel_6.setFont(new Font("SansSerif", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(183, 78, 167, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
