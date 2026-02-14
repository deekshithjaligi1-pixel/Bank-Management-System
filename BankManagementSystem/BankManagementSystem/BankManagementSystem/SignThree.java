package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignThree extends JFrame implements ActionListener{
	
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton button,cancel;
	
	String formno;
	SignThree(String formno) {
		this.formno=formno;
		
		setLayout(null);
		JLabel l1 = new JLabel("Page 3: Account Details");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(250,40,400,40);
		add(l1);
		
		JLabel type = new JLabel("Account Type");
		type.setFont(new Font("Raleway",Font.BOLD,20));
		type.setBounds(100,100,400,40);
		add(type);
		
		r1 = new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway",Font.BOLD,15));
		r1.setBounds(100,140,180,40);
		add(r1);
		
		r2 = new JRadioButton("Fixed Deposit");
		r2.setFont(new Font("Raleway",Font.BOLD,15));
		r2.setBounds(300,140,180,40);
		add(r2);
		
		r3 = new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway",Font.BOLD,15));
		r3.setBounds(100,180,180,40);
		add(r3);
		
		r4 = new JRadioButton("Reurring Deposit");
		r4.setFont(new Font("Raleway",Font.BOLD,15));
		r4.setBounds(300,180,180,40);
		add(r4);
		
		ButtonGroup groupaccount = new ButtonGroup();
		groupaccount.add(r1);
		groupaccount.add(r2);
		groupaccount.add(r3);
		groupaccount.add(r4);
		
		JLabel card = new JLabel(" Card Number: ");
		card.setFont(new Font("Raleway",Font.BOLD,20));
		card.setBounds(100,230,400,40);
		add(card);
		
		JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
		number.setFont(new Font("Raleway",Font.BOLD,20));
		number.setBounds(270,230,400,40);
		add(number);
		
		
		JLabel carddetail = new JLabel("Your 16 Digit Card Number ");
		carddetail.setFont(new Font("Raleway",Font.BOLD,10));
		carddetail.setBounds(110,255,400,40);
		add(carddetail);
		
		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway",Font.BOLD,20));
		pin.setBounds(110,300,400,40);
		add(pin);
		
		JLabel pinnumber = new JLabel("XXXX");
		pinnumber.setFont(new Font("Raleway",Font.BOLD,20));
		pinnumber.setBounds(270,300,400,40);
		add(pinnumber);
		
		JLabel pindetail = new JLabel("Your 4 Digit Password ");
		pindetail.setFont(new Font("Raleway",Font.BOLD,10));
		pindetail.setBounds(110,325,400,40);
		add(pindetail);
		
		JLabel srequired = new JLabel("Services Required ");
		srequired.setFont(new Font("Raleway",Font.BOLD,22));
		srequired.setBounds(110,370,400,40);
		add(srequired);
		
		c1 = new JCheckBox("ATM Card");
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setBounds(100,430,150,30);
		add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setBounds(300,430,200,30);
		add(c2);
		
		c3 = new JCheckBox("Mobile Banking");
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setBounds(100,480,150,30);
		add(c3);
		
		c4 = new JCheckBox("EMAIL & SMS Alerts");
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		c4.setBounds(300,480,200,30);
		add(c4);
		
		c5 = new JCheckBox("Check Book");
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		c5.setBounds(100,530,150,30);
		add(c5);
		
		c6 = new JCheckBox("E-Statement");
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		c6.setBounds(300,530,200,30);
		add(c6);
		
		c7 = new JCheckBox("I heardby declared that the above statement details are correct to the best of my Knowledge ");
		c7.setBackground(Color.WHITE);
		c7.setFont(new Font("Raleway",Font.BOLD,10));
		c7.setBounds(30,600,900,30);
		add(c7);
		
		
		button = new JButton("Submit");
		button.setFont(new Font("Raleway",Font.BOLD,16));
		button.setBounds(100,650,100,30);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		button.addActionListener(this);
		add(button);
		
		cancel = new JButton("Cancel");
		cancel.setFont(new Font("Raleway",Font.BOLD,16));
		cancel.setBounds(350,650,100,30);
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.addActionListener(this);
		add(cancel);
		
		
		getContentPane().setBackground(Color.WHITE);
		
		
		
		setSize(850,820);
		setLocation(350,0);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==button) {
			String accounttype = null;
			if (r1.isSelected()) {
				accounttype = "Saving Account";
			} else if (r2.isSelected()) {
				accounttype = "Fixed Deposit Account";
			} else if (r3.isSelected()) {
				accounttype = "Current Account";
			} else if (r4.isSelected()) {
				accounttype = "Reurring Deposit Account";
			}
			
			Random random = new Random();
			String cardnumber = ""+Math.abs((random.nextLong() % 9000000L))+5040936000000L; 		
			String pinnumber = ""+ Math.abs((random.nextLong() % 9000L) + 1000L);
			
			String facility = null;
			if (c1.isSelected()) {
				facility  = facility+"ATM Card";
			} else if (c2.isSelected()) {
				facility = facility + "Internet Banking";
			} else if (c3.isSelected()) {
				facility = facility + "Mobile Banking";
			} else if (c4.isSelected()) {
				facility = facility + "EMAIL & SMS Alerts";
			} else if (c5.isSelected()) {
				facility = facility + "Check Book";
			} else if (c6.isSelected()) {
				facility = facility + "E-Statement";
			}  
			
			try {
				if (accounttype.equals("")) {
					JOptionPane.showMessageDialog(null, "Account Type is Required");
				} else {
					Conn conn = new Conn();
					String query1 = "insert into SignThree values  ( '"+formno+"', '"+accounttype+"', '"+cardnumber+"','"+pinnumber+"','"+facility+"')";
					String query2 = "insert into login values ('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
					
					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null,"Card number"+ cardnumber + "\n Pin "+pinnumber);
					setVisible(false);
					new Deposit(pinnumber).setVisible(false);
				}
			}catch(Exception  e) {
				System.out.println(e);
			}
		} else {
			setVisible(false);
			new Login().setVisible(true);
		}

	}



	public static void main(String[] args) {
		
		
		new SignThree("");
	}

}
