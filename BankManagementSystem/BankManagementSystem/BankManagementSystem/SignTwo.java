package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignTwo extends JFrame implements ActionListener{
	 

	JLabel formtwo,Religion,Category,Income,Educational,Qualification,Occupation,PANNumber,AadharNumber,SeniorCitizon,Existing,Account;
	JTextField pannum,aadharnum;
	JRadioButton yess,noo,yesss,nooo;
	Button next;
	JComboBox religion,category,salary,education,occupation;
	
	
	String formno;
	SignTwo(String formno){
		this.formno = formno;
		
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

		formtwo = new JLabel("Page 2: Additional Details ");
		formtwo.setFont(new Font("Railway",Font.BOLD,25));
		formtwo.setBounds(250,60,400,40);
		add(formtwo);
		
		
		Religion = new JLabel("Religion:");
		Religion.setFont(new Font("Railway",Font.BOLD,18));
		Religion.setBounds(100,130,400,30);
		add(Religion);
		
		String valreligion[]= {"Hindu","Muslim","Cristian","Sikh","Others"};
		religion = new JComboBox(valreligion);
		religion.setFont(new Font("Raleway",Font.BOLD,14));
		religion.setBackground(Color.WHITE);
		religion.setBounds(250,130,400,30);
		add(religion);
				
		
		Category  = new JLabel("Category: ");
		Category.setFont(new Font("Railway",Font.BOLD,18));
		Category.setBounds(100,180,400,30);
		add(Category);
		
		
		String valcategory[] = {"OBC","OC","General","SC","ST","Others"};
		category = new JComboBox(valcategory);
		category.setFont(new Font("Raleway",Font.BOLD,14));
		category.setBackground(Color.WHITE);
		category.setBounds(250,180,400,30);
		add(category);
			
		
		Income  = new JLabel("Income : ");
		Income.setFont(new Font("Railway",Font.BOLD,18));
		Income.setBackground(Color.WHITE);
		Income.setBounds(100,230,400,30);
		add(Income);
		
		String valsalary[] = {"Null","< 1,50,000","<2,00,000","<5,00,000"," Upto 1,00,00,000"};
		salary= new JComboBox(valsalary);
		salary.setFont(new Font("Raleway",Font.BOLD,14));
		salary.setBackground(Color.WHITE);
		salary.setBounds(250,230,400,30);
		add(salary);
		
		Educational = new JLabel("Educational: ");
		Educational.setFont(new Font("Railway",Font.BOLD,18));
		Educational.setBounds(100,320,400,30);
		add(Educational);
		

		Qualification = new JLabel("Quaification: ");
		Qualification.setFont(new Font("Railway",Font.BOLD,18));
		Qualification.setBounds(100,338,400,30);
		add(Qualification);
		
		String valeducate[]= {"Non- Graduate","Graduate","Post-Graduate","Doctrate","Others"};
		education = new JComboBox(valeducate);
		education.setFont(new Font("Raleway",Font.BOLD,14));
		education.setBackground(Color.WHITE);
		education.setBounds(250,320,400,30);
		add(education);
		
		
		Occupation  = new JLabel("Occupation: ");
		Occupation.setFont(new Font("Railway",Font.BOLD,18));
		Occupation.setBounds(100,370,400,30);
		add(Occupation);
		
		String valoccupate[]= {"Salaried","Self-Employed","Bussiness","Student","Retaied"};
		occupation = new JComboBox(valoccupate);
		occupation.setFont(new Font("Raleway",Font.BOLD,14));
		occupation.setBackground(Color.WHITE);
		occupation.setBounds(250,370,400,30);
		add(occupation);		

	

		
		PANNumber  = new JLabel("PAN Number: ");
		PANNumber.setFont(new Font("Railway",Font.BOLD,18));
		PANNumber.setBounds(100,420,400,30);
		add(PANNumber);
		
		
		pannum = new JTextField();
		pannum.setFont(new Font("Raleway",Font.BOLD,14));
		pannum.setBounds(250,420,400,30);
		add(pannum);
		
		AadharNumber  = new JLabel("Aadhar Number: ");
		AadharNumber.setFont(new Font("Railway",Font.BOLD,18));
		AadharNumber.setBounds(100,470,400,30);
		add(AadharNumber);
		
		aadharnum = new JTextField();
		aadharnum.setFont(new Font("Raleway",Font.BOLD,14));
		aadharnum.setBounds(250,470,400,30);
		add(aadharnum);
		
		
		SeniorCitizon  = new JLabel("SeniorCitizon: ");
		SeniorCitizon.setFont(new Font("Railway",Font.BOLD,18));
		SeniorCitizon.setBounds(100,520,400,30);
		add(SeniorCitizon);
		
		yesss = new JRadioButton("Yes");
		yesss.setFont(new Font("Raleway",Font.BOLD,14));
		yesss.setBackground(Color.WHITE);
		yesss.setBounds(250,520,60,30);
		add(yesss);
		
		nooo = new JRadioButton("No");
		nooo.setFont(new Font("Raleway",Font.BOLD,14));
		nooo.setBackground(Color.WHITE);
		nooo.setBounds(450,520,60,30);
		add(nooo);
		
		ButtonGroup groupp = new ButtonGroup();
		groupp.add(yesss);
		groupp.add(nooo);
		
		
		Existing  = new JLabel("Exisiting");
		Existing.setFont(new Font("Railway",Font.BOLD,18));
		Existing.setBounds(100,570,400,30);
		add(Existing);
		
		Account  = new JLabel("Account: ");
		Account.setFont(new Font("Railway",Font.BOLD,18));
		Account.setBounds(100,590,400,30);
		add(Account);
		
		yess = new JRadioButton("Yes");
		yess.setFont(new Font("Raleway",Font.BOLD,14));
		yess.setBackground(Color.WHITE);
		yess.setBounds(250,580,60,30);
		add(yess);
		
		noo = new JRadioButton("No");
		noo.setFont(new Font("Raleway",Font.BOLD,14));
		noo.setBackground(Color.WHITE);
		noo.setBounds(450,580,60,30);
		add(noo);
		
		ButtonGroup group = new ButtonGroup();
		group.add(yess);
		group.add(noo);
		
		
		next = new Button("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(600,650,100,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		setSize(790,870);
		setLocation(350,20);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) { 
		
		String sreligion = (String)religion.getSelectedItem();
		String scategory = (String)category.getSelectedItem();
		String sincome = (String)salary.getSelectedItem();
		String seducation = (String)education.getSelectedItem();
		String soccupation = (String)occupation.getSelectedItem();
		String scitizen = null;
		if (yess.isSelected()) {
			scitizen = "Yes";		
		} else if (noo.isSelected()) {
			scitizen = "No";
		}
		String ExistingAccount = null;
		if (yesss.isSelected()) {
			ExistingAccount = "Yes";			
		}else if (nooo.isSelected()) {
			ExistingAccount = "No";	
		}

		String pan = pannum.getText();
		String aadhar = aadharnum.getText();
		
		try {	 
				Conn c = new Conn();
				String query = "insert into SignTwo values ('"+formno+"' , '"+sreligion+"' , '"+scategory+"' , '"+sincome+"' , '"+seducation+"' , '"+soccupation+"' , '"+pan+"' , '"+aadhar+"' , '"+scitizen+"' , '"+ExistingAccount+"' )";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignThree(formno).setVisible(true);

		
		} catch (Exception e){
			System.out.println(e);
		}
	
		}
	public static void main(String[] args) {
		new SignTwo("");

	}

}