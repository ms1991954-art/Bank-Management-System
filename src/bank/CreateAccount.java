package bank;
import java.awt.Component;

import javax.swing.*;

public class CreateAccount 
{
	private JLabel name;
	private Component title;

	CreateAccount()
	{
		
	
	JFrame frame = new JFrame("Create Bank Account");
	JLabel title = new JLabel("CREATE BANK ACCOUNT");
	title.setBounds(80,15,240,30);
	 (title).setHorizontalAlignment(JLabel.CENTER);
	 title.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD, 18)); 
	
	
	JLabel nameL = new JLabel(" Name");
	
	nameL.setBounds(30,30,100,25);JTextField nameT = new JTextField();
	nameT.setBounds(140,30,170,25);
	
	JLabel accL = new JLabel("Account No");
	accL.setBounds(30,70,100,25);
	
	JTextField accT = new JTextField();
	accT.setBounds(140,70,170,25);
	
	JLabel balL = new JLabel("opning Balance");
	
	balL.setBounds(30,110,120,25);
	JTextField balT = new JTextField();
	
	balT.setBounds(140,110,170,25);
	
	JButton create = new JButton("Create Account");
	
	create.setBounds(90,170,160,35);
	
	create.addActionListener(e ->{
	
		
	
	String customerName = nameT.getText();
	int accountNo = Integer.parseInt(accT.getText());
	
	double opningBalance = Double.parseDouble(balT.getText());
	
	
	BankAccount newAccount = new BankAccount(customerName,accountNo,opningBalance);
	
	newAccount.name=nameT.getText();
	
	newAccount.accountNumber = Integer.parseInt(accT.getText());
	
	newAccount.balance = Double.parseDouble(balT.getText());
	
	newAccount.history = "Account Created:₹" + newAccount.balance+"\n";
	
	JOptionPane.showMessageDialog(frame, "Account Created Successfully!");
	
	frame.dispose();
	new Dashboard();
		
	});
	
	frame.add(nameL);
	frame.add(nameT);
	frame.add(accL);
	frame.add(accT);
	frame.add(balL);
	frame.add(balT);
	frame.add(create);
	
	frame.setLayout(null);
	frame.setSize(400, 300);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setVisible(true);
	frame.toFront();
	frame.requestFocus();
		
	}

	private void JLabel(String string) {
		// TODO Auto-generated method stub
		
	}	
}
