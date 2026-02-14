package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class MiniStatement extends JFrame implements ActionListener{
	
	String pinnumber;
	JButton close;
	 MiniStatement(String pinnumber) {
		 this.pinnumber = pinnumber;
		 setLayout(null);
		 setTitle("Mini Statement");
		 
		 JLabel bank = new JLabel("Indian Bank");
		 bank.setFont(new Font("Raleway",Font.BOLD,16));
		 bank.setBounds(160,30,300,20);
		 add(bank);
		 
		 JLabel card = new JLabel("");
		 card.setBounds(20,80,300,20);
		 add(card);
		 
		 JLabel balance = new JLabel();
		 balance.setBounds(20,400,300,20);
		 add(balance);
		 
		 
		 
		 
		 close = new JButton("Close");
		 close.setBounds(300,500,80,30);
		 close.setForeground(Color.WHITE);
		 close.setBackground(Color.BLACK);
		 close.addActionListener(this);
		 add(close);
		 /*
		 try {
			 Conn conn = new Conn();
			 ResultSet rs = conn.c.s.executeQuery("select * from login where pin "+pinnumber+"");
			 while(rs.next()) {
				 card.setText("Card Number"+rs.getString("cardnumber").substring(0,4)+ "XXXXXXXX"+rs.getString("cardnumber").substring(12));
				 
			 }
		 }catch(Exception ae) {
			 
		 }

		 try {
			 Conn conn = new Conn();
			 int bal = 0;
			 ResultSet rs = conn.s.executeQuery("select * from bank where pin ="+pinnumber+"");
			 while(rs.next()) {
				 mini.setText(mini.getText()+"<html>"+rs.getString("date")+"&nbsp" ,"&nbsp","&nbsp","&nbsp"+ rs.getString("type")+"&nbsp" ,"&nbsp","&nbsp","&nbsp"+getString("amount")+""<br><br><html>"");		
				 if (rs.getString("type").equals("Deposit"));{
						 bal += Integer.parseInt(rs.getString("amount"));
					 } else {
						 bal +=Integer.parseInt(rs.getString("amount"));
					 }		 
			 }
			 balance.setText("Your current account balance is Rs"+bal);
		 } catch(Exception e) {
			 System.out.println(e);	
		 }
		 
		  mini.setBounds(20,140,400,200);
		 */
		 
		 setSize(300,700);
		 setLocation(20,20);
		 setUndecorated(true);
		 setBounds(100,300,450,600);
		 setVisible(true);
		 

	}
	 public void actionPerformed(ActionEvent ae) {
		 if (ae.getSource()==close) {
			 setVisible(false);
			 new Transactions("").setVisible(false);
		 }
		 
		 
	 }

	public static void main(String[] args) {
		new MiniStatement("");

	}

}
