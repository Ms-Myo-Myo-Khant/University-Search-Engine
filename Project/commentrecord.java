package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

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

public class commentrecord extends JFrame {
	static commentrecord f1;
	private JPanel contentPane;
	String dbURL = "jdbc:mysql://localhost:3306/" + "javaproject";
	String username = "root";
	String password = "";
	
	Connection dbConnection = null;int cno;String cmail; String cmmt; String rate;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1= new commentrecord();
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
	public commentrecord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1365, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel up2=new JPanel();
		up2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		up2.setBackground(new Color(175, 238, 238));
		up2.setLayout(new GridLayout(0,4));
		
		
		
		JLabel numlabel = new JLabel("               Serial Number");
		numlabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		numlabel.setVerticalAlignment(SwingConstants.TOP);
		up2.add(numlabel);
		up2.setAutoscrolls(true);
		
		JLabel mailabel = new JLabel("               Email Address");
		mailabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		mailabel.setVerticalAlignment(SwingConstants.TOP);
		up2.add(mailabel);
		
		JLabel mentlabel = new JLabel("                   Comment");
		mentlabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		mentlabel.setVerticalAlignment(SwingConstants.TOP);
		up2.add(mentlabel);
		
		JLabel ratelabel = new JLabel("                   User Rating");
		ratelabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		ratelabel.setVerticalAlignment(SwingConstants.TOP);
		up2.add(ratelabel);
		
//JButton cabtn = new JButton(" Back");
		
/*abtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==cabtn)
				{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								adminview frame = new adminview();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
			}
		});
		cabtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		cabtn.setBounds(63, 626, 96, 27);
		contentPane.add(cabtn);*/
		
	
		try {
			dbConnection=DriverManager.getConnection(dbURL,username,password);
			Statement stmt=dbConnection.createStatement();
			ResultSet crs=stmt.executeQuery("SELECT `No`, `gmail`, `comments`, `rate` FROM `rateus`" ); 
			while(crs.next()) 
				{
					cno = crs.getInt("No");
					cmail=crs.getString("gmail");
				    cmmt=crs.getString("comments");
				    rate=crs.getString("rate");
				    
				    
				   
				    JTextField jf1=new JTextField();
				    JTextField jf2=new JTextField();
				    JTextField jf3=new JTextField();
				    JTextField jf4=new JTextField();
				    jf1.setText(Integer.toString(cno));
				    jf2.setText(cmail);
				    jf3.setText(cmmt);
				    jf4.setText(rate);
				    
				    
				    up2.add(jf1);
				    up2.add(jf2);
				    up2.add(jf3);
				    up2.add(jf4);
				    
			jf1.setHorizontalAlignment(JTextField.CENTER);
			jf2.setHorizontalAlignment(JTextField.CENTER);
			jf3.setHorizontalAlignment(JTextField.CENTER);
			jf4.setHorizontalAlignment(JTextField.CENTER);
			
			setFont(new Font("Tahoma", Font.PLAIN, 15));
				jf1.setFont(new Font("Tahoma", Font.PLAIN, 17));
				
				jf2.setFont(new Font("Tahoma", Font.PLAIN, 17));
				jf3.setFont(new Font("Tahoma", Font.PLAIN, 17));
				jf4.setFont(new Font("Tahoma", Font.PLAIN, 17));
				
				jf1.setEditable(false);
				jf2.setEditable(false);
				jf3.setEditable(false);
				jf4.setEditable(false);
					
				}
			
			
			
				 
				stmt.close();
			dbConnection.close();
		
		}
		catch(SQLException e1)
		{
			System.out.println("Unable to connect database");
			e1.printStackTrace();
		}
		
		JScrollPane cjp=new JScrollPane(up2,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		cjp.setBounds(147, 103, 1049, 496);
		
		cjp.getComponentCount();
		contentPane.setLayout(null);
		contentPane.add(cjp);
		
		JLabel clrd = new JLabel("User Comment Detail");
		clrd.setBounds(452, 24, 559, 54);
		clrd.setFont(new Font("Tahoma", Font.BOLD, 40));
		contentPane.add(clrd);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							admin_menu3 frame= new admin_menu3();
							frame.setVisible(true);
							f1.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnBack.setBounds(147, 636, 78, 25);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 1347, 703);
		lblNewLabel_3.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		contentPane.add(lblNewLabel_3);
		

	}
	private int toString(int cno) {
		// TODO Auto-generated method stub
		return 0;
		
		
		
	}	
}

	