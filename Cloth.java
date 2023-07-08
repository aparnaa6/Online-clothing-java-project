package onlinestore;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

public class Cloth {
	public JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cloth window = new Cloth();
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
	public Cloth() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 864, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setBounds(104, 34, 180, 35);
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 26));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(35, 187, 147, 26);
		lblNewLabel_1.setFont(new Font("YouYuan", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(257, 194, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(35, 268, 147, 26);
		lblNewLabel_2.setFont(new Font("YouYuan", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(257, 275, 96, 19);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(new Color(234, 94, 125));
		btnNewButton.setBounds(141, 380, 111, 26);
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","msc");
					PreparedStatement pst = con.prepareStatement("select * from Registration1 where Username=? and Password=?");
					pst.setString(1, textField.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs=pst.executeQuery();
					if(rs.next())
					{
						System.out.println("USER EXIST");
						JOptionPane.showMessageDialog(null,"user logged in successfully");
						homepage fra = new homepage(); 
						fra.setVisible(true);
						frame.dispose();
						
						
					}
					
					
					else {
						System.out.println("USER INVALID");
						JOptionPane.showMessageDialog(null,"login failed");
						frame.dispose();
						
						
					}
					rs.close(); pst.close();
				}catch(Exception e)
				{
					System.out.println(e);
				}
				
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel label = new JLabel("New label");
		label.setBounds(805, 0, -209, 487);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\online.jpg"));
		lblNewLabel_3.setBounds(437, 0, 413, 497);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(60, 119, 283, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(60, 338, 283, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnNewButton_1.setBounds(287, 379, 124, 27);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent arg0) {
			try
			{
				
				
					
					Registration fra = new Registration(); 
					fra.setVisible(true);
					
				}
				
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	});
		frame.getContentPane().add(btnNewButton_1);
		
	}

	protected static void dispose() {
		// TODO Auto-generated method stub
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
