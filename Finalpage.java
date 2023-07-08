package onlinestore;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Finalpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finalpage frame = new Finalpage();
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
	public Finalpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 534);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(68, 68, 138));
		contentPane.setBackground(new Color(238, 208, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Order");
		lblNewLabel.setForeground(new Color(62, 21, 106));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 34));
		lblNewLabel.setBounds(224, 10, 212, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 97, 111, 27);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(254, 97, 141, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Csize");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(11, 217, 131, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Location");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 309, 111, 27);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(254, 221, 141, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Place your Order");
		btnNewButton.setForeground(new Color(74, 74, 149));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		btnNewButton.setBounds(183, 406, 294, 36);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent arg0) {
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","msc");
				PreparedStatement pst = con.prepareStatement("insert into Myorder values(?,?,?)");
				pst.setString(1, textField.getText());
				pst.setString(2, textField_1.getText());
				pst.setString(3, textField_2.getText());
				pst.executeUpdate();
				
				{
				
					System.out.println("Order Placed");
					JOptionPane.showMessageDialog(null,"Go to payment");
					Payment arr = new Payment(); 
					arr.setVisible(true);
									
				}
		
			pst.close();
			}catch(Exception ee)
			{
				System.out.println(ee);
			}	
			}
			
	});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\clothing.jpg"));
		lblNewLabel_4.setBounds(554, 10, 239, 173);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(254, 312, 309, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
