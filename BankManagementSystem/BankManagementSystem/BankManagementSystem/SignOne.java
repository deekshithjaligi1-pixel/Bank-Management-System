package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class SignOne extends JFrame implements ActionListener{
	
	Random ran;
	long random;
	JLabel formno,page1,name,fname,dob,gender,emailaddress,Maritalstatus,address,city,state,pincode;
	JTextField nametextfield,ftextfield,emailaddresstextfield,addresstextfield,citytextfield,statetextfield,pincodetextfield;
	Button next;
	JRadioButton male,female,married,unmarried,other;
	JDateChooser dateChooser;
	
	
	SignOne(){
		setLayout(null);
		
		ran = new Random();
		random = Math.abs((ran.nextLong()% 9000L)+1000L);
		
		formno = new JLabel("APPLICATION FORM. "+ random);
		formno.setFont(new Font("Railway",Font.BOLD,30));
		formno.setBounds(180,20,400,40);
		add(formno);
		
		page1 = new JLabel("Page1: Personal Details ");
		page1.setFont(new Font("Railway",Font.BOLD,22));
		page1.setBounds(220,70,400,30);
		add(page1);
		
		name = new JLabel("Name:");
		name.setFont(new Font("Railway",Font.BOLD,18));
		name.setBounds(100,130,400,30);
		add(name);
		
		nametextfield = new JTextField();
		nametextfield.setFont(new Font("Raleway",Font.BOLD,14));
		nametextfield.setBounds(250,130,400,30);
		add(nametextfield);
		
		fname  = new JLabel("Father Name: ");
		fname.setFont(new Font("Railway",Font.BOLD,18));
		fname.setBounds(100,180,400,30);
		add(fname);
		
		ftextfield = new JTextField();
		ftextfield.setFont(new Font("Raleway",Font.BOLD,14));
		ftextfield.setBounds(250,180,400,30);
		add(ftextfield);
		
		dob  = new JLabel("Date of Birth: ");
		dob.setFont(new Font("Railway",Font.BOLD,18));
		dob.setBounds(100,230,400,30);
		add(dob);
		
   	    dateChooser = new JDateChooser();
  		dateChooser.setBounds(250,230,400,30);
		dateChooser.setForeground(new Color(0,0,0));
		add(dateChooser);
		
			
		
		gender  = new JLabel("Gender: ");
		gender.setFont(new Font("Railway",Font.BOLD,18));
		gender.setBounds(100,270,400,30);
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBounds(250,270,60,30);
		male.setBackground(Color.WHITE);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(350,270,100,30);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup group = new ButtonGroup();
		group.add(male);
		group.add(female);

		
		emailaddress  = new JLabel("Email Address: ");
		emailaddress.setFont(new Font("Railway",Font.BOLD,18));
		emailaddress.setBounds(100,320,400,30);
		add(emailaddress);
		
		emailaddresstextfield = new JTextField();
		emailaddresstextfield.setFont(new Font("Raleway",Font.BOLD,14));
		emailaddresstextfield.setBounds(250,320,400,30);
		add(emailaddresstextfield);
		
		Maritalstatus  = new JLabel("Marital Status : ");
		Maritalstatus.setFont(new Font("Railway",Font.BOLD,18));
		Maritalstatus.setBounds(100,370,400,30);
		add(Maritalstatus);
		
		married = new JRadioButton("Married");
		married.setBounds(250,370,100,30);
		married.setBackground(Color.WHITE);
		add(married);
		
		unmarried = new JRadioButton("UnMarried");
		unmarried.setBounds(350,370,120,30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		
		other = new JRadioButton("Others");
		other.setBounds(470,370,250,30);
		other.setBackground(Color.WHITE);
		add(other);
		
		ButtonGroup Maritalgrouped = new ButtonGroup();
		Maritalgrouped.add(married);
		Maritalgrouped.add(unmarried);
		Maritalgrouped.add(other);
		

		
		address  = new JLabel("Address : ");
		address.setFont(new Font("Railway",Font.BOLD,18));
		address.setBounds(100,420,400,30);
		add(address);
		
		addresstextfield = new JTextField();
		addresstextfield.setFont(new Font("Raleway",Font.BOLD,14));
		addresstextfield.setBounds(250,420,400,30);
		add(addresstextfield);
		
		city  = new JLabel("City : ");
		city.setFont(new Font("Railway",Font.BOLD,18));
		city.setBounds(100,470,400,30);
		add(city);
		
		citytextfield = new JTextField();
		citytextfield.setFont(new Font("Raleway",Font.BOLD,14));
		citytextfield.setBounds(250,470,400,30);
		add(citytextfield);
		
		
		state  = new JLabel("State : ");
		state.setFont(new Font("Railway",Font.BOLD,18));
		state.setBounds(100,520,400,30);
		add(state);
		
		statetextfield = new JTextField();
		statetextfield.setFont(new Font("Raleway",Font.BOLD,14));
		statetextfield.setBounds(250,520,400,30);
		add(statetextfield);
		
		pincode  = new JLabel("Pin Code : ");
		pincode.setFont(new Font("Railway",Font.BOLD,18));
		pincode.setBounds(100,570,400,30);
		add(pincode);
		
		pincodetextfield = new JTextField();
		pincodetextfield.setFont(new Font("Raleway",Font.BOLD,14));
		pincodetextfield.setBounds(250,570,400,30);
		add(pincodetextfield);
		
		next = new Button("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.addActionListener(this);
		next.setBounds(600,650,100,30);
		add(next);
	
		
		
		
		getContentPane().setBackground(Color.WHITE);
		setSize(790,870);
		setLocation(350,20);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		String formno = "" + random; // long
		String name = nametextfield.getText();
		String fname = ftextfield.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if (male.isSelected()) {
			gender = "Male";		
		} else if (female.isSelected()) {
			gender = "Female";
		}
		String emailaddress =emailaddresstextfield.getText();
		String Maritalstatus = null;
		if (married.isSelected()) {
			Maritalstatus = "Married";			
		}else if (unmarried.isSelected()) {
			Maritalstatus = "UnMarried";	
		}else if (other.isSelected()) {
			Maritalstatus = "Others";
		}
		String address = addresstextfield.getText();
		String city = citytextfield.getText();
		String state = statetextfield.getText();
		String pincode = pincodetextfield.getText();
		
		try {
			if (name.equals("")){
				JOptionPane.showMessageDialog(null,"Name is Requied");
			} else {
				Conn c = new Conn();
				String query = "insert into SignOne values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+emailaddress+"','"+Maritalstatus+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignTwo(formno).setVisible(true);
			}
			
		} catch (Exception e){
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) {
		new SignOne();

	}

}
