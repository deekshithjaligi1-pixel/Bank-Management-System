package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
	
	 JLabel pin,repin;
	 JPasswordField pintext,repintext;
	 JButton change,back;
	
	String pinnumber;
	 PinChange(String pinnumber) {
		 this.pinnumber=pinnumber;
		 
		 ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("Icons//ATMmachineedited.jpg"));
		 Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
		 ImageIcon i3 = new ImageIcon(i2);
		 JLabel image = new JLabel(i3);
		 image.setBounds(0,0,900,900);
		 add(image);
		 
		 pin = new JLabel("New Pin:");
		 pin.setBounds(250,425,100,30);
		 pin.setFont(new Font("Raleway",Font.BOLD,15));
		 pin.setBackground(Color.BLACK);
		 pin.setForeground(Color.WHITE);
		 image.add(pin);
		 
		 pintext = new JPasswordField();
		 pintext.setBounds(350,425,180,30);
		 image.add(pintext);
		 
		 repin = new JLabel("Re-Enter Pin:");
		 repin.setBounds(250,460,100,30);
		 repin.setFont(new Font("Raleway",Font.BOLD,15));
		 repin.setBackground(Color.BLACK);
		 repin.setForeground(Color.WHITE);
		 image.add(repin);
		 
		 repintext = new JPasswordField();
		 repintext.setBounds(350,460,180,30);
		 image.add(repintext);
		 
		 change = new JButton("Change");
		 change.setBounds(440,520,100,27);
		 change.setFont(new Font("Raleway",Font.BOLD,14));
		 change.setBackground(Color.BLACK);
		 change.setForeground(Color.WHITE);
		 change.addActionListener(this);
		 image.add(change);
		 
		 back = new JButton("Back");
		 back.setBounds(440,550,100,27);
		 back.setFont(new Font("Raleway",Font.BOLD,14));
		 back.setBackground(Color.BLACK);
		 back.setForeground(Color.WHITE);
		 back.addActionListener(this);
		 image.add(back);
		 
		 
		 setLayout(null);
		 setLocation(300,0);
		 setSize(900,900);
		 setUndecorated(true);
		 setVisible(true);
	}
	 public void actionPerformed(ActionEvent ae) {
		 if (ae.getSource()== change) {
			  
		 try {
			 String npin = pintext.getText();
			 String rpin = repintext.getText();
			 
			 if (!npin.equals(rpin)) {
				 JOptionPane.showMessageDialog(null,"Enter Pin does not match");
				 return; 
			 } 
			  if (npin.equals("")) {
				  JOptionPane.showMessageDialog(null,"Please enter PIN");
					 return;	  
			  }
			 if (rpin.equals("")) {
				  JOptionPane.showMessageDialog(null," Please re-enter new PIN");
					 return;
			 }
	
			 Conn conn = new Conn();
			 
			 String query1 = "update Deposit set pin = '"+rpin+"'  where pin='"+pinnumber+"'";
			 String query2 = "update login set pin = '"+rpin+"'  where pin='"+pinnumber+"'";
			 String query3 = "update SignThree set pin = '"+rpin+"'  where pin='"+pinnumber+"'";
			 
			 conn.s.executeUpdate(query1);
			 conn.s.executeUpdate(query2);
			 conn.s.executeUpdate(query3);
			 
			 JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
			 setVisible(false);
			 new Transactions(rpin).setVisible(true);
			 
			 

		 }catch(Exception e) {
			 System.out.println(e);
		 }
		 } else {
			 setVisible(false);
			 new Transactions(pinnumber).setVisible(true);
		 }
	 } 
	 
	 
	 
	public static void main(String[] args) {
		new PinChange("").setVisible(true);

	}

}
