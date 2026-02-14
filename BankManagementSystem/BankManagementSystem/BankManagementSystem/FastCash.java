package BankManagementSystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
	JLabel text;
	JButton hundred,Fivehundred,Thousand,TwoThousand,FiveThousand;
	JButton Tenthousand,balanceenquiry,back;
	
	String pinnumber;
	FastCash(String pinnumber) {
		 this.pinnumber=pinnumber;
		 setLayout(null);
		 
		 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/ATMmachineedited.jpg"));
	     Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		 ImageIcon i3 = new ImageIcon(i2);
		 JLabel image = new JLabel(i3);
		 image.setBounds(1, 1,730,860);
		 add(image);
		 
		 
		 text =new JLabel("SELECT WITHDRAWL AMOUNT:");
		 text.setFont(new Font("Raleway",Font.BOLD,14));
		 text.setBounds(195,400,400,30);
		 text.setForeground(Color.WHITE);
		 text.setBackground(Color.BLACK);
		 image.add(text);
		 
		 hundred = new JButton(" Rs 100");
		 hundred.setBounds(150,440,140,25);
		 hundred.setFont(new Font("Raleway",Font.BOLD,14));
		 hundred.addActionListener(this);
		 image.add(hundred);
		 
		 Fivehundred = new JButton(" Rs 500");
		 Fivehundred.setBounds(300,440,150,25);
		 Fivehundred.setFont(new Font("Raleway",Font.BOLD,14));
		 Fivehundred.addActionListener(this);
		 image.add(Fivehundred);
		 
		 Thousand = new JButton(" Rs 1000");
		 Thousand.setBounds(150,470,140,25);
		 Thousand.setFont(new Font("Raleway",Font.BOLD,14));
		 Thousand.addActionListener(this);
		 image.add(Thousand);
		 
		 TwoThousand = new JButton(" Rs 2000");
		 TwoThousand.setBounds(300,470,150,25);
		 TwoThousand.setFont(new Font("Raleway",Font.BOLD,14));
		 TwoThousand.addActionListener(this);
		 image.add(TwoThousand);
		 
		 FiveThousand = new JButton("5000");
		 FiveThousand.setBounds(150,500,140,25);
		 FiveThousand.setFont(new Font("Raleway",Font.BOLD,14));
		 FiveThousand.addActionListener(this);
		 image.add(FiveThousand);
		 
		 Tenthousand = new JButton("10000");
		 Tenthousand.setBounds(300,500,150,25);
		 Tenthousand.setFont(new Font("Raleway",Font.BOLD,14));
		 Tenthousand.addActionListener(this);
		 image.add(Tenthousand);
		 
		 back = new JButton("Back");
		 back.setBounds(300,535,150,25);
		 back.setFont(new Font("Raleway",Font.BOLD,14));
		 back.addActionListener(this);
		 image.add(back);
	 

		 setSize(745,900);
		 setLocation(300,30);
		 setResizable(false);
		 setVisible(true);	 		 
		 
	     getContentPane().setBackground(Color.WHITE);
	}
	 
	 public void actionPerformed(ActionEvent ae) {
		 if (ae.getSource()==back) {
			 setVisible(false);
			 new Transactions(pinnumber).setVisible(true);
		 } else  {
			 String  amount = ((JButton)ae.getSource()).getText().substring(3); // Rs 500 
			 Conn c = new Conn();
			 try {
				 ResultSet rs = c.s.executeQuery("select * from Deposit where pin = '"+pinnumber+"' ");
				 int balance =0;
				 while(rs.next()) {
					if (rs.getString("type").equals("Deposit")) {
					     balance += Integer.parseInt(rs.getString("amount"));
					} else {
					     balance -= Integer.parseInt(rs.getString("amount"));
					}
				 }
				 
				 if (ae.getSource() != back &&  balance < Integer.parseInt(amount)) {
					 JOptionPane.showMessageDialog(null,"InSufficient Balance");
					 return;
				 }
				 Date date = new Date();
				 String query = "insert into values ('"+pinnumber+"', '"+date+"','WithDraw','"+amount+"')";
				 c.s.executeUpdate(query);
				 JOptionPane.showMessageDialog(null,"Rs"+amount+"Debited Successfully");
				 
				 setVisible(false);
				 new Transactions(pinnumber).setVisible(true);
			 } catch(Exception e) {
				 System.out.println(e);
			 }
		 }
		  
	 }

	public static void main(String[] args) {
		new FastCash("");


	}

}

