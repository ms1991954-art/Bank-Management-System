package bank;

import javax.swing.*;
public class Login 
{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Bank Login") ;
		frame.setLocationRelativeTo(null);
		
		JLabel title = new JLabel("BANK MANAGEMENT SYSTEM");
		title.setBounds(80,20,300, 30);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD,20));
		
		
		
		
		JLabel user = new JLabel("Username");
		user.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD,14));
		JTextField username = new JTextField();
		
		JLabel pass = new JLabel("Password");
		pass.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD,14));
		JPasswordField password = new JPasswordField() ;
		
		JButton login = new JButton("Login");
		login.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD,14));
		JButton create = new JButton("Create Account");
		create.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD,14));
		
		user.setBounds(100,90,100,30);
		username.setBounds(220,90,170,30);
		
		pass.setBounds(100,150,100,30);
		password.setBounds(220,150,170,30);
		
		login.setBounds(180,210,120,40);
		create.setBounds(155,270,170,40);
		
		login.addActionListener(e ->{
			
			if(username.getText().equals("admin")&&
					new String(password.getPassword()).equals("1234")){
				
							
				frame.dispose();
				new Dashboard();
			}else {
				JOptionPane.showMessageDialog(frame,"Invalid Login");
				
			}
		});
		
		create.addActionListener(e ->{
			frame.dispose();
			new CreateAccount();
		});
			frame.add(user);
			frame.add(username);
			frame.add(pass);
			frame.add(password);
			frame.add(login);
			frame.add(create);
			frame.add(title);
			
			frame.setLayout(null);
			frame.setSize(500,400);
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 frame.setVisible(true);
		}
	}
		
	

