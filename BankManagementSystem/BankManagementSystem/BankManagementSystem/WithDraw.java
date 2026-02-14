package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class WithDraw extends JFrame implements ActionListener{
	JLabel text;
	JTextField amount;
	JButton withdrawl,back;
	
	 String pinnumber;
	 WithDraw(String pinnumber) {
	 this.pinnumber = pinnumber;
		 
		 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons//ATmmachineedited.jpg"));
		 Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		 ImageIcon i3 = new ImageIcon(i2);
		 JLabel image = new JLabel(i3);
		 image.setBounds(0, 0, 900, 900);
		 add(image);
		 
		 text = new JLabel("Enter the amount you want to WithDraw");
		 text.setBackground(Color.BLACK);
		 text.setForeground(Color.WHITE);
		 text.setFont(new Font("Raleway",Font.BOLD,12));
		 text.setBounds(247,420,290,28);
		 image.add(text);
		 
		 amount = new JTextField();
		 amount.setBounds(247,450,290,28);
		 image.add(amount);
		 
		 withdrawl= new JButton("WithDrawl");
		 withdrawl.setBounds(440,515, 100, 28);
		 withdrawl.setFont(new Font("Raleway",Font.BOLD,12));
		 withdrawl.setForeground(Color.WHITE);
		 withdrawl.setBackground(Color.BLACK);
		 withdrawl.addActionListener(this);
		 image.add(withdrawl);
		 
		 back = new JButton("Back");
		 back.setBounds(440,550, 100, 28);
		 back.setFont(new Font("Raleway",Font.BOLD,12));
		 back.setForeground(Color.WHITE);
		 back.setBackground(Color.BLACK);
		 back.addActionListener(this);
		 image.add(back);
		 		 	 
		 setLayout(null);
		 setLocation(300,0);
		 setSize(900,900);
		 
		 setVisible(true);
	}
	 
	 public void actionPerformed(ActionEvent ae) {
			 if (ae.getSource()== withdrawl) {
				String number = amount.getText();
				Date date = new Date();
				if (number.equals("")) {
					JOptionPane.showMessageDialog(null,"Please enter amount you want to WithDrawl ");
					
				} else {
				try {
					Conn conn = new Conn();
					String query = ("insert into Deposit values ('"+pinnumber+"', '"+date+"', 'withdrawl','"+number+"')");
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"Rs"+number+"WithDraw Successfully");
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				}catch(Exception e) {
					System.out.println(e);
				}
				
				}
			 }else if (ae.getSource()==back) {
				 setVisible(false);
				 new Transactions(pinnumber).setVisible(true);
			 } 
			 
		 } 

	public static void main(String[] args) {
		new WithDraw("");
	}

	}