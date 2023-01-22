package Main;

import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
 
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

public class user_form8 extends JFrame implements ActionListener{
	static user_form8 f1;
	private JPanel contentPane;
	private JTextField pphnot;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField bd;
	private JTextField textField;
	private JLabel paddt;

	/**
	 * Launch the application.
	 * 
	 */
	public static void Dataconnection1(String name,String birth,String email,long phno,String gender,String address,String nrc,String fathername,String fnrc,String mothername,String mnrc,long hphno,String homeaddress,String depart,String rno,int mark,String msub,int syear,String uni) {
		String dbURL="jdbc:mysql://localhost:3306/"+"javaproject";
		String username="root";
		String password="";
		Connection dbConnection=null;
		try {
			dbConnection=DriverManager.getConnection(dbURL,username,password);
		Statement stmt=dbConnection.createStatement();
		
		stmt.executeUpdate("INSERT INTO `student`( `Name`, `Date of Birth`, `E-mail`, `Phone-no`, `Gender`, `Student's Address`, `NRC`, `Father's name`, `Father's NRC`, `Mother's name`, `Mother's NRC`, `Parents' Phone No`, `Parent's Address`, `Department`, `Roll no`, `Total marks`, `Bio/Eco/His/Geo`, `Success Year`, `Uni Name`) values('"+name+"','"+birth+"','"+email+"',"+phno+",'"+gender+"','"+address+"','"+nrc+"','"+fathername+"','"+fnrc+"','"+mothername+"','"+mnrc+"',"+hphno+",'"+homeaddress+"','"+depart+"','"+rno+"',"+mark+",'"+msub+"',"+syear+",'"+uni+"')");
		
			
		
			
			stmt.close();
			dbConnection.close();
		}
		catch(SQLException e)
		{
			System.out.println("Unable to connect database");
			e.printStackTrace();
		}
		
	
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1 = new user_form8();
					f1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public user_form8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1365, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JPanel rfp;
		JLabel name,dob,email,phno,gender,add,nrc,fname,fnrc,mname,mnrc,pphno,dep,rollno,tmark,majorsub,gyr,uniname;
		 JLabel rfl;
		  JTextField namet;
		 JTextField emailt;
		 JTextField phnot;
		 JTextField addt;
		 JTextField nrct;
		 JTextField fnamet;
		 JTextField fnrct;
		 JTextField mnamet;
		 JTextField mnarct;
		 JTextField depart;
		 JTextField rno;
		 JTextField tmarkt;
		 JTextField majorsubt;
		 JTextField gyrt;
		 JTextField uninamet;
		contentPane.setLayout(null);
		
		rfp=new JPanel();
		rfp.setBounds(0, 0, 1347, 723);
//		rfp.setForeground(new Color(255, 250, 250));
		name=new JLabel("Name:");
		name.setFont(new Font("Tahoma", Font.BOLD, 20));
		name.setBounds(145, 99, 118, 27);
		dob=new JLabel("Date Of Birth:");
		dob.setFont(new Font("Tahoma", Font.BOLD, 20));
		dob.setBounds(145, 145, 152, 27);
		email=new JLabel("Email:");
		email.setFont(new Font("Tahoma", Font.BOLD, 20));
		email.setBounds(145, 195, 129, 16);
		phno=new JLabel("Phone Number:");
		phno.setFont(new Font("Tahoma", Font.BOLD, 20));
		phno.setBounds(145, 243, 173, 16);
		gender=new JLabel("Gender");
		gender.setFont(new Font("Tahoma", Font.BOLD, 20));
		gender.setBounds(145, 293, 164, 16);
		add=new JLabel("Address:");				
		add.setFont(new Font("Tahoma", Font.BOLD, 20));
		add.setBounds(145, 344, 164, 16);
		nrc=new JLabel("NRC:");
		nrc.setFont(new Font("Tahoma", Font.BOLD, 20));
		nrc.setBounds(145, 395, 139, 16);
		fname=new JLabel("Father Name:");
		fname.setFont(new Font("Tahoma", Font.BOLD, 20));
		fname.setBounds(145, 444, 152, 16);
		fnrc=new JLabel("Father's NRC:");
		fnrc.setFont(new Font("Tahoma", Font.BOLD, 20));
		fnrc.setBounds(145, 491, 152, 16);
		mname=new JLabel("Mother Name:");
		mname.setFont(new Font("Tahoma", Font.BOLD, 20));
		mname.setBounds(145, 539, 152, 16);
		mnrc=new JLabel("Mother's NRC:");
		mnrc.setFont(new Font("Tahoma", Font.BOLD, 20));
		mnrc.setBounds(145, 585, 152, 16);
		pphno=new JLabel("Parent's Phone Number:");
		pphno.setFont(new Font("Tahoma", Font.BOLD, 20));
		pphno.setBounds(756, 195, 282, 16);
		dep=new JLabel("Department:");
		dep.setFont(new Font("Tahoma", Font.BOLD, 20));
		dep.setBounds(756, 234, 212, 34);
		rollno=new JLabel("Roll Number:");
		rollno.setFont(new Font("Tahoma", Font.BOLD, 20));
		rollno.setBounds(756, 293, 173, 16);
		tmark=new JLabel("Total Marks");
		tmark.setFont(new Font("Tahoma", Font.BOLD, 20));
		tmark.setBounds(756, 344, 139, 16);
		majorsub=new JLabel("Major Subject:");
		majorsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		majorsub.setBounds(756, 390, 164, 27);
		gyr=new JLabel("Graduated Year:");
		gyr.setFont(new Font("Tahoma", Font.BOLD, 20));
		gyr.setBounds(756, 444, 189, 16);
		uniname=new JLabel("University Name:");
		uniname.setFont(new Font("Tahoma", Font.BOLD, 20));
		uniname.setBounds(756, 481, 200, 36);
		rfp.setLayout(null);
		
		rfl = new JLabel("University Registration Form\r\n");
		rfl.setFont(new Font("Tahoma", Font.BOLD, 40));
		rfl.setBounds(421, 13, 616, 49);
		rfp.add(rfl);
		rfp.add(name);
		rfp.add(dob);
		rfp.add(email);
		rfp.add(phno);
		rfp.add(gender);
		rfp.add(add);
		rfp.add(nrc);
		rfp.add(fname);
		rfp.add(fnrc);
		rfp.add(mname);
		rfp.add(mnrc);
		rfp.add(pphno);
		rfp.add(dep);
		rfp.add(rollno);
		rfp.add(tmark);
		rfp.add(majorsub);
		rfp.add(gyr);
		rfp.add(uniname);
		getContentPane().add(rfp);
		
		namet = new JTextField();
		namet.setBounds(402, 102, 221, 27);
		rfp.add(namet);
		namet.setColumns(10);
		
		emailt = new JTextField();
		emailt.setColumns(10);
		emailt.setBounds(402, 193, 221, 27);
		rfp.add(emailt);
		
		phnot = new JTextField();
		phnot.setColumns(10);
		phnot.setBounds(402, 241, 221, 27);
		rfp.add(phnot);
		
		addt = new JTextField();
		addt.setColumns(10);
		addt.setBounds(402, 326, 221, 54);
		rfp.add(addt);
		
		nrct = new JTextField();
		nrct.setColumns(10);
		nrct.setBounds(402, 393, 221, 27);
		rfp.add(nrct);
		
		fnamet = new JTextField();
		fnamet.setColumns(10);
		fnamet.setBounds(402, 442, 221, 27);
		rfp.add(fnamet);
		
		fnrct = new JTextField();
		fnrct.setColumns(10);
		fnrct.setBounds(402, 489, 221, 27);
		rfp.add(fnrct);
		
		mnamet = new JTextField();
		mnamet.setColumns(10);
		mnamet.setBounds(402, 537, 221, 27);
		rfp.add(mnamet);
		
		mnarct = new JTextField();
		mnarct.setColumns(10);
		mnarct.setBounds(402, 583, 221, 27);
		rfp.add(mnarct);
		
		depart = new JTextField();
		depart.setColumns(10);
		depart.setBounds(1048, 241, 221, 27);
		rfp.add(depart);
		
		rno = new JTextField();
		rno.setColumns(10);
		rno.setBounds(1048, 291, 221, 27);
		rfp.add(rno);
		
		tmarkt = new JTextField();
		tmarkt.setColumns(10);
		tmarkt.setBounds(1048, 342, 221, 27);
		rfp.add(tmarkt);
		
		majorsubt = new JTextField();
		majorsubt.setColumns(10);
		majorsubt.setBounds(1048, 393, 221, 27);
		rfp.add(majorsubt);
		
		gyrt = new JTextField();
		gyrt.setColumns(10);
		gyrt.setBounds(1048, 442, 221, 27);
		rfp.add(gyrt);
		
		uninamet = new JTextField();
		uninamet.setColumns(10);
		uninamet.setBounds(1048, 485, 221, 34);
		rfp.add(uninamet);
		
		JRadioButton genm = new JRadioButton("Male");
		buttonGroup.add(genm);
		genm.setBounds(402, 292, 110, 25);
		rfp.add(genm);
		
		JLabel label_1 = new JLabel("Parent's Address:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(756, 109, 242, 35);
		rfp.add(label_1);
		
		JRadioButton genf = new JRadioButton("Female");
		buttonGroup.add(genf);
		genf.setBounds(516, 292, 107, 25);
		rfp.add(genf);
		
		/*hphno = new JTextField();
		hphno.setBounds(1073, 99, 200, 27);
		rfp.add(hphno);
		hphno.setColumns(10);*/
		
		JButton regbtn = new JButton("Register");
		regbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==regbtn) {
					String l=phnot.getText(),l1=pphnot.getText(),l2=tmarkt.getText(),l3=gyrt.getText();
					long g=Integer.parseInt(l),g1=Integer.parseInt(l1);
					int g2=Integer.parseInt(l2),g3=Integer.parseInt(l3);
					String n=namet.getText();String n1=bd.getText();
					String n4=emailt.getText();String n5=null;
					if(genm.isSelected()==true && genf.isSelected()==false) {
						n5="Male";
					}
					else if(genm.isSelected()==false && genf.isSelected()==true)
					{
						n5="Female";
					}
					
					String n6=addt.getText(),n7=nrct.getText(),n8=fnamet.getText(),n9=fnrct.getText(),n10=mnamet.getText(),n11=mnarct.getText(),n12=paddt.getText(),n13=depart.getText(),n14=rno.getText(),n15=majorsubt.getText(),n16=uninamet.getText();
					Dataconnection1(n,n1,n4,g,n5,n6,n7,n8,n9,n10,n11,g1,n12,n13,n14,g2,n15,g3,n16);
					namet.setText("");bd.setText("");emailt.setText("");addt.setText("");nrct.setText("");fnamet.setText("");
					fnrct.setText("");mnamet.setText("");mnarct.setText("");paddt.setText("");depart.setText("");rno.setText("");majorsubt.setText("");uninamet.setText("");phnot.setText("");pphnot.setText("");tmarkt.setText("");gyrt.setText("");
					JOptionPane.showMessageDialog( null,"You have successfully registered!","Successful Message",JOptionPane.INFORMATION_MESSAGE);
					}
					}
				});
				
			
		
		regbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		regbtn.setForeground(new Color(0, 0, 0));
		regbtn.setBounds(1050, 582, 110, 27);
		rfp.add(regbtn);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				namet.setText("");bd.setText("");emailt.setText("");addt.setText("");nrct.setText("");fnamet.setText("");
				fnrct.setText("");mnamet.setText("");mnarct.setText("");
				paddt.setText("");depart.setText("");rno.setText("");majorsubt.setText("");uninamet.setText("");phnot.setText("");pphnot.setText("");tmarkt.setText("");gyrt.setText("");
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBounds(1172, 582, 97, 27);
		rfp.add(btnCancel);
		
		JButton rfpbk = new JButton("Back");
		rfpbk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rfpbk)
				{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								user_menu2 frame = new user_menu2();
								frame.setVisible(true);
								f1.setVisible(false);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
			}
		});
		//private JTextField hphno;
		rfpbk.setFont(new Font("Tahoma", Font.BOLD, 15));
		rfpbk.setBounds(145, 644, 97, 27);
		rfp.add(rfpbk);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(1048, 99, 221, 60);
		rfp.add(textField);
		
		pphnot = new JTextField();
		pphnot.setColumns(10);
		pphnot.setBounds(1050, 193, 219, 27);
		rfp.add(pphnot);
		
		bd = new JTextField();
		bd.setColumns(10);
		bd.setBounds(402, 145, 221, 27);
		rfp.add(bd);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		label.setBounds(-13, 0, 1370, 716);
		rfp.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
