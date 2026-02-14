package BankManagementSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener {
	JLabel text;
	JButton deposit,Cashwithdrawl,JButton,fastcash,ministatement,pinchange,balanceenquiry,exit;
	
	String pinnumber;
	 Transactions(String pinnumber) {
		 this.pinnumber=pinnumber;
		 setLayout(null);
		 
		 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/ATMmachineedited.jpg"));
	     Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		 ImageIcon i3 = new ImageIcon(i2);
		 JLabel image = new JLabel(i3);
		 image.setBounds(1, 1,730,860);
		 add(image);
		 
		 
		 text =new JLabel("Please select your Transcation");
		 text.setFont(new Font("Raleway",Font.BOLD,14));
		 text.setBounds(195,400,400,30);
		 text.setForeground(Color.WHITE);
		 text.setBackground(Color.BLACK);
		 image.add(text);
		 
		 deposit = new JButton("Deposit");
		 deposit.setBounds(150,440,140,25);
		 deposit.setFont(new Font("Raleway",Font.BOLD,14));
		 deposit.addActionListener(this);
		 image.add(deposit);
		 
		 Cashwithdrawl = new JButton("Cash Withdrawl");
		 Cashwithdrawl.setBounds(300,440,150,25);
		 Cashwithdrawl.setFont(new Font("Raleway",Font.BOLD,14));
		 Cashwithdrawl.addActionListener(this);
		 image.add(Cashwithdrawl);
		 
		 fastcash = new JButton("Fast Cash");
		 fastcash.setBounds(150,470,140,25);
		 fastcash.setFont(new Font("Raleway",Font.BOLD,14));
		 fastcash.addActionListener(this);
		 image.add(fastcash);
		 
		 ministatement = new JButton("Mini Statement");
		 ministatement.setBounds(300,470,150,25);
		 ministatement.setFont(new Font("Raleway",Font.BOLD,14));
		 ministatement.addActionListener(this);
		 image.add(ministatement);
		 
		 pinchange = new JButton("Pin Change");
		 pinchange.setBounds(150,500,140,25);
		 pinchange.setFont(new Font("Raleway",Font.BOLD,14));
		 pinchange.addActionListener(this);
		 image.add(pinchange);
		 
		 balanceenquiry = new JButton("Balance Enquiry");
		 balanceenquiry.setBounds(300,500,150,25);
		 balanceenquiry.setFont(new Font("Raleway",Font.BOLD,14));
		 balanceenquiry.addActionListener(this);
		 image.add(balanceenquiry);
		 
		 exit = new JButton("Exit");
		 exit.setBounds(300,535,150,25);
		 exit.setFont(new Font("Raleway",Font.BOLD,14));
		 exit.addActionListener(this);
		 image.add(exit);
	 

		 setSize(745,900);
		 setLocation(300,30);
		 setUndecorated(true);
		 setResizable(false);
		 setVisible(true);	 		 
		 
	     getContentPane().setBackground(Color.WHITE);
	}
	 
	 public void actionPerformed(ActionEvent ae) {
		 if (ae.getSource()== exit) {
			 System.exit(0);
		 } else if (ae.getSource()==deposit) {
			 setVisible(false);
			 new Deposit(pinnumber).setVisible(true);	 
		 } else if (ae.getSource()== Cashwithdrawl) {
			 setVisible(false);
			 new WithDraw(pinnumber).setVisible(true);
		 } else if (ae.getSource()==fastcash) {
			 setVisible(false);
			 new FastCash(pinnumber).setVisible(true);
		 } else if (ae.getSource()== pinchange) {
			 setVisible(false);
			 new PinChange(pinnumber).setVisible(true);
		 } else if (ae.getSource()== balanceenquiry) {
			 setVisible(false);
			 new BalanceEnquiry(pinnumber).setVisible(true);
		 } else if (ae.getSource()== ministatement) {
			 new MiniStatement(pinnumber).setVisible(true);
		 }
		 
	 }


	public static void main(String[] args) {
		new Transactions("");


	}

}


