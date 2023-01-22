package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class admin_student_register_form10 extends JFrame {
	static admin_student_register_form10 f1;

	String dbURL="jdbc:mysql://localhost:3306/javaproject";
	String username="root";
	String password="";
	Connection dbConnection=null;
	

	JPanel p;JScrollPane jsp;
	private String[] ditems=new String[100];String[] gitems=null;
	int k=0;int id;String name;JList l,l1;int ph,parentph,totalmk,success;
	String DOB,email,gender,stuad,stuNRC,fatname,fatNRC,momname,momNRC,parentad,dep,rollno,bioeco,uni;
	
	
	
	public admin_student_register_form10()
	{	
		this.setVisible(true);
	 	this.setSize(1365,760);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p=new JPanel();
		p.setLayout(new GridLayout(1,2));
		getContentPane().setLayout(null);
		JLabel j1=new JLabel("Students Registeration Record");
		j1.setBounds(371, 36, 647, 49);
		getContentPane().add(j1);
		j1.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		
		 //getting data from data base
		try {
			dbConnection=DriverManager.getConnection(dbURL,username,password);
			Statement stmt=dbConnection.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT `sname` FROM student"); 
				  while(rs.next())
				  {
					
					 
					  name=rs.getString("sname");
					 // p2.add(new JTextField(id));
					  ditems[k]=name; 
					  k++;
					 }
				stmt.close();
			dbConnection.close();
		
		}
		catch(SQLException e)
		{
			System.out.println("Unable to connect database");
			e.printStackTrace();
		}
		
		for(int s=0;s<=k;s++)
		{
			gitems=new String[s];
		
		}
		
		gitems=Arrays.copyOf(ditems,k); 
		 JPanel panel = new JPanel();
		 panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 panel.setBounds(318, 121, 734, 478);
		 getContentPane().add(panel);
		 panel.setLayout(null);
		 l=new JList(gitems);
		 l.setValueIsAdjusting(true);
		 
		 l.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 l.setFont(new Font("tahoma", Font.BOLD, 20));
		jsp=new JScrollPane(l,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setBounds(12, 66, 710, 399);
		
		 l.addListSelectionListener(new ListSelectionListener() {
		 	public void valueChanged(ListSelectionEvent e) {
		 		String stuname=(String) l.getSelectedValue();
		 		
		 		try {
					dbConnection=DriverManager.getConnection(dbURL,username,password);
					Statement stmt=dbConnection.createStatement();
					ResultSet rs=stmt.executeQuery("SELECT `sname`, `birth`, `mail`, `phno`, `gen`, `sadd`, `nrc`, `fname`, `fnrc`, `mname`, `mnrc`, `ppnno`, `padd`, `dep`, `roll`, `tm`, `major`, `sy`, `uniname` FROM `student` WHERE sname='"+stuname+"'"); 
					 
					while(rs.next()) 
						{
						
						  name=rs.getString("sname");
						  DOB=rs.getString("birth");
						  email=rs.getString("mail");
						  ph=rs.getInt("phno");
						  gender=rs.getString("gen");
						  stuad=rs.getString("sadd");
						  stuNRC=rs.getString("nrc");
						  fatname=rs.getString("fname");
						  fatNRC=rs.getString("fnrc");
						  momname=rs.getString("mname");
						  momNRC=rs.getString("mnrc");
						  parentph=rs.getInt("ppnno");
						  parentad=rs.getString("padd");
						  dep=rs.getString("dep");
						  rollno=rs.getString("roll");
						  totalmk=rs.getInt("tm");
						  bioeco=rs.getString("major");
						  success=rs.getInt("sy");
						  uni=rs.getString("uniname");
					 
						}
					new admin_page_for_student_register_form_record10(name,DOB,email, ph,gender,stuad,stuNRC,fatname,fatNRC,momname,momNRC,parentph,parentad,dep,rollno,totalmk,bioeco,success,uni);
					
						 
						stmt.close();
					dbConnection.close();
				
				}
				catch(SQLException e1)
				{
					System.out.println("Unable to connect database");
					e1.printStackTrace();
				}
		 		
		 	}
		 });
		
		panel.add(jsp);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 13, 710, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextField txtUniversities = new JTextField();
		txtUniversities.setBackground(Color.WHITE);
		txtUniversities.setEditable(false);
		txtUniversities.setHorizontalAlignment(SwingConstants.CENTER);
		txtUniversities.setBounds(0, 0, 710, 40);
		txtUniversities.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtUniversities.setText("Students' records\r\n");
		panel_1.add(txtUniversities);
		txtUniversities.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnBack)
				{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								admin_record_menu6 frame = new admin_record_menu6();
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
		btnBack.setBounds(318, 626, 84, 28);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(btnBack);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		lblNewLabel.setBounds(0, 0, 1347, 713);
		getContentPane().add(lblNewLabel);}
		
//		JLabel lblNewLabel = new JLabel("New label");
//		lblNewLabel.setBounds(0, 0, 1360, 750);
//		lblNewLabel.setIcon(new ImageIcon("D:\\UIT School\\Second Year\\Groups\\java\\bg photos\\mv.jpg"));
//		getContentPane().add(lblNewLabel);
//		
		
		
		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					f1= new admin_student_register_form10();
					f1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	});
		}


////gui page of each university
}
				
		
		
			
	



