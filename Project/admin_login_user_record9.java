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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

import Admin.adminview;

import javax.swing.JButton;

public class admin_login_user_record9 extends JFrame implements ActionListener{
	static admin_login_user_record9 f1;
	private JPanel contentPane;
	String dbURL = "jdbc:mysql://localhost:3306/" + "javaproject";
	String username = "root";
	String password = "";
	Connection dbConnection = null;int seno;String usename; String logindate;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1 = new admin_login_user_record9();
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
	public admin_login_user_record9() {
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
		
		JLabel lblNewLabel_1 = new JLabel("               User Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		up1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("                   Date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		up1.add(lblNewLabel_2);
		
		
		try {
			dbConnection=DriverManager.getConnection(dbURL,username,password);
			Statement stmt=dbConnection.createStatement();
			ResultSet urs=stmt.executeQuery("SELECT `No`, `Name`, `Time of logging in` FROM `userlogin` " ); 
			while(urs.next()) 
				{
					seno = urs.getInt("No");
					usename=urs.getString("Name");
				    logindate=urs.getString("Time of logging in");
				
				    JTextField ujf1=new JTextField();
				    JTextField ujf2=new JTextField();
				    JTextField ujf3=new JTextField();
				    ujf1.setText(Integer.toString(seno));
				    ujf2.setText(usename);
				    ujf3.setText(logindate);
				    
				    
				up1.add(ujf1);
				up1.add(ujf2);
				up1.add(ujf3);
			ujf1.setHorizontalAlignment(JTextField.CENTER);
			ujf2.setHorizontalAlignment(JTextField.CENTER);
			ujf3.setHorizontalAlignment(JTextField.CENTER);
			
			setFont(new Font("Tahoma", Font.PLAIN,15));
				ujf1.setFont(new Font("Tahoma", Font.PLAIN, 17));
				
				ujf2.setFont(new Font("Tahoma", Font.PLAIN, 17));
				ujf3.setFont(new Font("Tahoma", Font.PLAIN, 17));
				
				ujf1.setEditable(false);
				ujf2.setEditable(false);
				ujf3.setEditable(false);
					
				 
				
					
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
		
		
		ujp.setBounds(167, 94, 996, 505);
		contentPane.add(ujp);
		
		JButton ubtn = new JButton(" Back");
		
		ubtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==ubtn)
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
		ubtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		ubtn.setBounds(167, 632, 96, 27);
		contentPane.add(ubtn);
		
		JLabel ulrd = new JLabel("User Login Record Detail");
		ulrd.setFont(new Font("Tahoma", Font.BOLD, 40));
		ulrd.setBounds(354, 24, 559, 41);
		contentPane.add(ulrd);
		
		JLabel urbg = new JLabel("");
		urbg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		urbg.setBounds(0, 0, 1360, 750);
		contentPane.add(urbg);
		
	
		
	}

	private String toString(Date d2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

}