package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.print.attribute.SetOfIntegerSyntax;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import Admin.adminview;

public class admin_login_admin_record8 extends JFrame {
	static admin_login_admin_record8 f1 ;
	private JPanel contentPane;
	String dbURL = "jdbc:mysql://localhost:3306/" + "javaproject";
	String username = "root";
	String password = "";
	Connection dbConnection = null;int aseno;String aname; String adate; int aid;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1= new admin_login_admin_record8();
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
	public admin_login_admin_record8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1365, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel up1=new JPanel();
		up1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		up1.setBackground(new Color(175, 238, 238));
		up1.setLayout(new GridLayout(0,3));
		
		
		
		JLabel lblNewLabel = new JLabel("               Serial Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		up1.add(lblNewLabel);
		up1.setAutoscrolls(true);
		
		JLabel lblNewLabel_1 = new JLabel("               Admin Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		up1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("                   Date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		up1.add(lblNewLabel_2);
		
JButton abtn = new JButton(" Back");
		
		abtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==abtn)
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
		abtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		abtn.setBounds(167, 630, 96, 27);
		contentPane.add(abtn);
		
	
		try {
			dbConnection=DriverManager.getConnection(dbURL,username,password);
			Statement stmt=dbConnection.createStatement();
			ResultSet urs=stmt.executeQuery("SELECT `No`, `Name`, `Time of logging in` FROM `adminlogin` " ); 
			while(urs.next()) 
				{
					aseno = urs.getInt("No");
					aname=urs.getString("Name");
				    adate=urs.getString("Time of logging in");
				    
				    
				   
				    JTextField jf1=new JTextField();
				    JTextField jf2=new JTextField();
				    JTextField jf3=new JTextField();
				    jf1.setText(Integer.toString(aseno));
				    jf2.setText(aname);
				    jf3.setText(adate);
				    
				    
				up1.add(jf1);
				up1.add(jf2);
				up1.add(jf3);
			jf1.setHorizontalAlignment(JTextField.CENTER);
			jf2.setHorizontalAlignment(JTextField.CENTER);
			jf3.setHorizontalAlignment(JTextField.CENTER);
			
			setFont(new Font("Tahoma", Font.PLAIN, 15));
				jf1.setFont(new Font("Tahoma", Font.PLAIN, 17));
				
				jf2.setFont(new Font("Tahoma", Font.PLAIN, 17));
				jf3.setFont(new Font("Tahoma", Font.PLAIN, 17));
				
				jf1.setEditable(false);
				jf2.setEditable(false);
				jf3.setEditable(false);
					
				}
			
			
			
				 
				stmt.close();
			dbConnection.close();
		
		}
		catch(SQLException e1)
		{
			System.out.println("Unable to connect database");
			e1.printStackTrace();
		}
		contentPane.setLayout(null);
		
		JScrollPane ujp=new JScrollPane(up1,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		ujp.getComponentCount();
		ujp.setBounds(167, 94, 994, 505);
		contentPane.add(ujp);
		
		JLabel ulrd = new JLabel("Admin Login Record Detail");
		ulrd.setFont(new Font("Tahoma", Font.BOLD, 40));
		ulrd.setBounds(382, 11, 559, 54);
		contentPane.add(ulrd);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		lblNewLabel_3.setBounds(0, 0, 1363, 711);
		contentPane.add(lblNewLabel_3);
		

	}
	private int toString(int aseno2) {
		// TODO Auto-generated method stub
		return 0;
		
		
		
	}	
}

	