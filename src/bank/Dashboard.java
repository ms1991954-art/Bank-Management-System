package bank;
 import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

import javax.swing. *;

public class Dashboard {

	Dashboard()
	{
	BankAccount account = new BankAccount();
	
	{
	
		JFrame frame = new JFrame("Bank Dashboard");
		
		
		
		frame.getContentPane().setBackground(new java.awt.Color(15,76,129));
		JLabel title = new JLabel("SBI BANK");
		title.setBounds(150,25,200,40);
		title.setForeground(java.awt.Color.WHITE);
		title.setFont(title.getFont().deriveFont(24.0f));
		
		JLabel name = new JLabel ("Customer:" + account.name);
		name.setForeground(java.awt.Color.WHITE);
		name.setBounds(50, 70, 350, 25);
		
		JLabel acc = new JLabel("Account No:"+ account.accountNumber);
		acc.setForeground(java.awt.Color.WHITE);
		acc.setBounds(50, 110, 350, 25);
		
		JLabel card = new JLabel("Card No:"+ account.cardNumber);
		
		card.setForeground(java.awt.Color.WHITE);
		card.setBounds(50,150,350,25);
		
		JLabel id = new JLabel("Customer ID" + account.customerId);
		id.setForeground(Color.WHITE);
		id.setBounds(50,190,350,25);
		
		JButton deposit = new JButton("Deposite");
		deposit.setBounds(120,230,220,40);
		
		JButton withdraw = new JButton("Withdraw");
		withdraw.setBounds(120,280,220,40);
		
		JButton balance = new JButton("Check Balance");
		balance.setBounds(120,330,220,40);
		
		JButton history = new JButton("Transaction History");
		history.setBounds(120,380,220,40);
		
		JButton logout = new JButton("Logout");
		logout.setBounds(120,430,220,40);
		
		JButton create = new JButton("Create Account");
		create.setBounds(120, 480, 220, 40);
		
		deposit.setBackground(new java.awt.Color(255,255,255));
		withdraw.setBackground(new java.awt.Color(255,255,255));
		balance.setBackground(new java.awt.Color(255,255,255));
		history.setBackground(new java.awt.Color(255,255,255));
		logout.setBackground(new java.awt.Color(255,255,255));
		create.setBackground(new java.awt.Color(255,255,255));
		
		deposit.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD,14));
		deposit.setFocusPainted(false);
		deposit.setBorderPainted(false);
		withdraw.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD, 14)); 
		balance.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD,14 ));
		history.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD,14));
		logout.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD,14));
		create.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD,14));
		
		
		
		
		deposit.addActionListener(e ->{
			String input = JOptionPane.showInputDialog(frame,"Enter Deposit Amount");
			
			try {
				double amount=Double.parseDouble(input);
						if(amount <= 0) {
			
				JOptionPane.showMessageDialog(frame,"Enter a valid amount");
			}else {
				account.deposite(amount);
			
			JOptionPane.showMessageDialog(frame, "Money Deposited");
			}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(frame, "Please enter numbers only");
			}
				
		});
		
		withdraw.addActionListener(e->{
			String input = JOptionPane.showInputDialog(frame,"Enter withdraw Amount");
			
			try {
				double amount= Double.parseDouble(input);
				
				if (amount <=0) {
					JOptionPane.showMessageDialog(frame, "Enter valid amount");
					
				} else {
					boolean ok= account.withdraw(amount);
					
					if (ok) {
						JOptionPane.showMessageDialog(frame,"Money withdrawn");
					} else {
						JOptionPane.showMessageDialog(frame, "Insufficient Balance");
					}
				}
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(frame, "Please enter numbers only");
			}
		});
		
		balance.addActionListener(e->{
			JOptionPane.showMessageDialog(frame, "Current Balance: ₹" + account.getBalance());
		});
		
		history.addActionListener(e->{
			JOptionPane.showMessageDialog(frame, account.getHistory());
		});
		logout.addActionListener(e->{
			frame.dispose();
			Login.main(null);
		});	
			create.addActionListener(e->{
				new CreateAccount();
			
				
			});
		
		
		frame.add(title);
		frame.add(name);
		frame.add(acc);
		frame.add(card);
		frame.add(id);
		frame.add(deposit);
		frame.add(withdraw);
		frame.add(balance);
		frame.add(history);
		frame.add(logout);
		frame.add(create);
		
		frame.setSize(480,600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}	;
}
}
