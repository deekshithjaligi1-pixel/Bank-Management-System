package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
	JButton back;
	JLabel text;
	String pinnumber;
	 BalanceEnquiry(String pinnumber){
		 this.pinnumber = pinnumber;
		 setLayout(null);
		 
		 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons//ATMmachineedited.jpg"));
		 Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		 ImageIcon i3 = new ImageIcon(i2);
		 JLabel image = new JLabel(i3);
		 image.setBounds(0,0,900,900);
		 add(image);
		 

		 
		 back = new JButton("Back");
		 back.setFont(new Font("Raleway",Font.BOLD,14));
		 back.setBounds(420,550,100,30);
		 back.setForeground(Color.WHITE);
		 back.setBackground(Color.BLACK);
		 back.addActionListener(this);
		 image.add(back);
		 
		 

		 Conn c = new Conn();
		 int balance =0;
		 		 try {
		 			 ResultSet rs = c.s.executeQuery("select * from Deposit where pin = '"+pinnumber+"'");
		 			
		 			 while(rs.next()) {
		 				 if (rs.getString("type").equals("Deposit")) {
		 				 balance += Integer.parseInt(rs.getString("amount"));
		 			 } else{
		 				 balance -= Integer.parseInt(rs.getString("amount"));
		 			 }
		 			 
		 			 }
		 		 } catch(Exception e) {
		 			 System.out.println(e);
		 		 }
		 		 
				 
		     text = new JLabel("Your Current Account balance is Rs " + balance);
		     text.setFont(new Font("Raleway",Font.BOLD,12));
	     	 text.setForeground(Color.WHITE);
		     text.setBounds(250,420,300,20);
		     image.add(text);
		 		 
		 
	 
		 setSize(900,900);
		 setLocation(300,0);
		 setUndecorated(true);
		 setVisible(true);
	 
	 }
	
	 
	 public void actionPerformed(ActionEvent ae) {
		 if (ae.getSource()==back) {
			 setVisible(false);
			 new Transactions(pinnumber).setVisible(true); 
		 }
	 }
	public static void main(String[] args) {
		new BalanceEnquiry("");
		
	}

}
