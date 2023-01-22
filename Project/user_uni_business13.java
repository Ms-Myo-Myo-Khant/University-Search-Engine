package Main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ScrollPaneConstants;

import com.mysql.fabric.xmlrpc.base.Array;

import javafx.scene.layout.Border;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class user_uni_business13 extends JFrame{
	static user_uni_business13 f1;
	String dbURL="jdbc:mysql://localhost:3306/javaproject";
	String username="root";
	String password="";
	Connection dbConnection=null;
	
	
	JPanel p;JScrollPane jsp;
	private String[] ditems=new String[100];String[] gitems=null;
	int k=0;int id;String name;JList l,l1;int mark;
	String title,fields,address,information;
	int emark,totalstu;
	
	
	public user_uni_business13()
	{	
		this.setVisible(true);
	 	this.setSize(1365,760);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p=new JPanel();
		p.setLayout(new GridLayout(1,2));
		getContentPane().setLayout(null);
		JLabel j1=new JLabel("Bussiness Universities");
		j1.setBounds(457, 35, 534, 49);
		getContentPane().add(j1);
		j1.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		
		 //getting data from data base
		try {
			dbConnection=DriverManager.getConnection(dbURL,username,password);
			Statement stmt=dbConnection.createStatement(); 
			String field="Business";
			ResultSet rs=stmt.executeQuery("SELECT `uname` FROM usedata where ufield='"+field+"'"); 
				  while(rs.next())
				  {
					  name=rs.getString("uname");
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
		 		 String n=String.valueOf(l.getSelectedValue());
		 		 
		 		try {
					dbConnection=DriverManager.getConnection(dbURL,username,password);
					Statement stmt=dbConnection.createStatement();
					
					ResultSet rs=stmt.executeQuery("select * from usedata where uname='"+n+"'"); 
					while(rs.next()) 
						{
							title=rs.getString("uname");
							 emark=rs.getInt("umark");
							 fields=rs.getString("ufield");
							 totalstu=rs.getInt("utotal");
							 address=rs.getString("uadd");
							 information=rs.getString("uinfo");	
						}
					new user_page_For_uni_business13(title,emark,fields,totalstu,address,information);
					
						 
						stmt.close();
					dbConnection.close();
				
				}
				catch(SQLException e1)
				{
					System.out.println("Unable to connect database");
					e1.printStackTrace();
				}
		 		
		 	}

			private String toString(Object selectedValue) {
				// TODO Auto-generated method stub
				return null;
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
		txtUniversities.setText("Universities\r\n");
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
								user_search_by_field5 frame = new user_search_by_field5();
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
		btnBack.setBounds(318, 635, 82, 27);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(btnBack);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1347, 713);
		lblNewLabel.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		getContentPane().add(lblNewLabel);
		
		}
		public static void main(String[] args) {
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						f1 = new user_uni_business13();
						f1.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
	}
		