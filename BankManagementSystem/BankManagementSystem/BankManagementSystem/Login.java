package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
	
	JButton signup,clear,signin;
	JTextField cardtextfield; 
	JPasswordField pintextfield;
	JLabel label,header,Cardno,Pinnum;
	
	Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/banklogo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(130,110,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        label = new JLabel(i3);
        label.setBounds(90,10,80,100);  
        add(label);
        
        
        
        header = new JLabel("Welcome to ATM ");
        header.setFont(new Font("Osward",Font.BOLD,38));
        header.setBounds(220,20,500,100);
        add(header);
        
        Cardno = new JLabel("Card No:");
        Cardno.setFont(new Font("Calibri",Font.BOLD,30));
        Cardno.setBounds(145,140,500,60);
        add(Cardno);
        
        cardtextfield = new JTextField();
        cardtextfield.setBounds(260,150,270,30);
        add(cardtextfield);
        
                
        
        Pinnum = new JLabel("Pin No  :");
        Pinnum.setFont(new Font("Calibri",Font.BOLD,32));
        Pinnum.setBounds(145,200,300,60);
        add(Pinnum);
        
        pintextfield = new JPasswordField();
        pintextfield.setBounds(260,215,270,30);
        add(pintextfield);
        
        signin = new JButton("Sign In ");
        signin.setBounds(260,300,100,30);
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);
        
        
        signup = new JButton("Sign Up");
        signup.setFont(new Font("Raleway",Font.BOLD,18));
        signup.setBounds(260,350,270,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        clear = new JButton("Clear");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        
        setSize(800, 480);
        setLocation(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==clear) {
			cardtextfield.setText("");
			pintextfield.setText("");
				
		} else if (ae.getSource()== signup ) {
			setVisible(false);
			new SignOne().setVisible(true);
			
		} else if (ae.getSource()== signin) {
			Conn conn = new Conn();
			String  cardnumber = cardtextfield.getText();
			String pinnumber = pintextfield.getText();
			String query = "select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
			try {
				ResultSet rs =conn.s.executeQuery(query);
				if (rs.next()) {
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "InCorrectCard Number or Pin");
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
	}

    public static void main(String[] args) {
        new Login();
    }
}