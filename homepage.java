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

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class homepage extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
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
	public homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 599);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Men");
		lblNewLabel.setBounds(10, 10, 96, 23);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Women");
		lblNewLabel_1.setBounds(10, 166, 96, 23);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kids");
		lblNewLabel_2.setBounds(10, 356, 61, 23);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Shirts");
		lblNewLabel_3.setBounds(10, 71, 96, 23);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Jackets");
		lblNewLabel_4.setBounds(222, 71, 102, 23);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Jeans");
		lblNewLabel_5.setBounds(519, 76, 85, 15);
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Kurtis");
		lblNewLabel_6.setBounds(10, 224, 96, 34);
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Palazzos");
		lblNewLabel_7.setBounds(222, 230, 87, 23);
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Jeans");
		lblNewLabel_8.setBounds(519, 230, 66, 23);
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("Buy");
		btnNewButton.setBounds(10, 114, 78, 23);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent arg0) {
			try
			{
				
				
					System.out.println("Order Placed");
					JOptionPane.showMessageDialog(null,"Go to My Order");
					Finalpage fra = new Finalpage(); 
					fra.setVisible(true);
					
				}
				
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy");
		btnNewButton_1.setBounds(224, 116, 71, 23);
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent arg1) {
			try
			{
				
				
					System.out.println("Order Placed");
					JOptionPane.showMessageDialog(null,"Go to My Order");
					Finalpage arr = new Finalpage(); 
					arr.setVisible(true);
									
				}
				
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
		}
	});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Buy");
		btnNewButton_2.setBounds(514, 115, 71, 23);
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent arg2) {
			try
			{
				
				
					System.out.println("Order Placed");
					JOptionPane.showMessageDialog(null,"Go to My Order");
					Finalpage arr = new Finalpage(); 
					arr.setVisible(true);
									
				}
				
			catch(Exception e2)
			{
				System.out.println(e2);
			}
			
		}
	});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Buy");
		btnNewButton_3.setBounds(10, 278, 78, 23);
		btnNewButton_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent arg3) {
			try
			{
				
				
					System.out.println("Order Placed");
					JOptionPane.showMessageDialog(null,"Go to My Order");
					Finalpage arr = new Finalpage(); 
					arr.setVisible(true);
									
				}
				
			catch(Exception e3)
			{
				System.out.println(e3);
			}
			
		}
	});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Buy");
		btnNewButton_4.setBounds(221, 278, 74, 23);
		btnNewButton_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent arg3) {
			try
			{
				
				
					System.out.println("Order Placed");
					JOptionPane.showMessageDialog(null,"Go to My Order");
					Finalpage arr = new Finalpage(); 
					arr.setVisible(true);
									
				}
				
			catch(Exception e4)
			{
				System.out.println(e4);
			}
			
		}
	});
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Buy");
		btnNewButton_5.setBounds(514, 278, 71, 23);
		btnNewButton_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent arg3) {
			try
			{
				
				
					System.out.println("Order Placed");
					JOptionPane.showMessageDialog(null,"Go to My Order");
					Finalpage arr = new Finalpage(); 
					arr.setVisible(true);
									
				}
				
			catch(Exception e3)
			{
				System.out.println(e3);
			}
			
		}
	});
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_9 = new JLabel("Dresses");
		lblNewLabel_9.setBounds(10, 400, 78, 23);
		lblNewLabel_9.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Tshirts");
		lblNewLabel_10.setBounds(216, 400, 71, 23);
		lblNewLabel_10.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Jeans");
		lblNewLabel_11.setBounds(519, 400, 96, 23);
		lblNewLabel_11.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton_6 = new JButton("Buy");
		btnNewButton_6.setBounds(10, 455, 78, 23);
		btnNewButton_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_6.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent arg3) {
			try
			{
				
				
					System.out.println("Order Placed");
					JOptionPane.showMessageDialog(null,"Go to My Order");
					Finalpage arr = new Finalpage(); 
					arr.setVisible(true);
									
				}
				
			catch(Exception e3)
			{
				System.out.println(e3);
			}
			
		}
	});
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Buy");
		btnNewButton_7.setBounds(222, 456, 73, 23);
		btnNewButton_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_7.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent arg3) {
			try
			{
				
				
					System.out.println("Order Placed");
					JOptionPane.showMessageDialog(null,"Go to My Order");
					Finalpage arr = new Finalpage(); 
					arr.setVisible(true);
									
				}
				
			catch(Exception e3)
			{
				System.out.println(e3);
			}
			
		}
	});
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Buy");
		btnNewButton_8.setBounds(514, 456, 71, 23);
		btnNewButton_8.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_8.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent arg3) {
			try
			{
				
				
					System.out.println("Order Placed");
					JOptionPane.showMessageDialog(null,"Go to My Order");
					Finalpage arr = new Finalpage(); 
					arr.setVisible(true);
									
				}
				
			catch(Exception e3)
			{
				System.out.println(e3);
			}
			
		}
	});
		contentPane.add(btnNewButton_8);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\kurti2.jpg"));
		lblNewLabel_12.setBounds(305, 146, 199, 416);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\ASUS\\Pictures\\tshirt7.jpg"));
		lblNewLabel_13.setBounds(621, 20, 235, 238);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\ASUS\\Pictures\\tshirt4.jpg"));
		lblNewLabel_14.setBounds(595, 300, 194, 229);
		contentPane.add(lblNewLabel_14);
	}
}
