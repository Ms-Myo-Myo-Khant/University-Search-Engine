package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.MatteBorder;

 
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class admin_insert5 extends JFrame {
	Connection dbConnection;
	private JPanel contentPane;
	private JTextField utitlet;
	private JTextField umkt;
	private JTextField ustut;
	private JTextField uaddresst;
	private JTextArea uinfota;
	static admin_insert5 f1 ;
	private String fcbo;JComboBox fields;
     public  void insert(String n,int m,String f,int t,String a,String i) {
    	 String dbURL="jdbc:mysql://localhost:3306/javaproject";
 		String username="root";
 		String password="";
 		Connection dbConnection=null;
 		try {
			dbConnection=DriverManager.getConnection(dbURL,username,password);
				
				java.sql.PreparedStatement pstmt=dbConnection.prepareStatement("insert into usedata(uname,umark,ufield,utotal,uadd,uinfo) values(?,?,?,?,?,?)");
				pstmt.setString(1, n);
				pstmt.setInt(2, m);
				pstmt.setString(3, f);
				pstmt.setInt(4, t);
				pstmt.setString(5, a);
				pstmt.setString(6, i);
				int ii=pstmt.executeUpdate();
				if(ii>0)JOptionPane.showMessageDialog(null,"You are sucessfully inserted new university");
				else  JOptionPane.showMessageDialog(this, "insert fail");
				pstmt.close();
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
					f1= new admin_insert5();
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
	public admin_insert5() { 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1365, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel instp = new JPanel();
		instp.setBounds(0, 0, 1365, 760);
		contentPane.add(instp);
		instp.setLayout(null);
		
		JLabel instt = new JLabel("Inserting New University\r\n");
		instt.setBounds(401, 41, 507, 49);
		instt.setFont(new Font("Tahoma", Font.BOLD, 40));
		instp.add(instt);
		
		JLabel ntitle = new JLabel("University Name    :");
		ntitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		ntitle.setBounds(255, 165, 209, 34);
		instp.add(ntitle);
		
		JLabel emk = new JLabel("Entrance Mark       :");
		emk.setFont(new Font("Tahoma", Font.BOLD, 20));
		emk.setBounds(255, 212, 209, 34);
		instp.add(emk);
		
		JLabel unifield = new JLabel("Field                       : ");
		unifield.setFont(new Font("Tahoma", Font.BOLD, 20));
		unifield.setBounds(255, 269, 209, 34);
		instp.add(unifield);
		
		JLabel uaddress = new JLabel("Address\r\n                  :");
		uaddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		uaddress.setBounds(255, 390, 209, 34);
		instp.add(uaddress);
		
		JLabel utstu = new JLabel("Total Students       :\r\n");
		utstu.setFont(new Font("Tahoma", Font.BOLD, 20));
		utstu.setBounds(255, 326, 204, 34);
		instp.add(utstu);
		
		JLabel uinfomation = new JLabel("Information           :");
		uinfomation.setFont(new Font("Tahoma", Font.BOLD, 20));
		uinfomation.setBounds(255, 483, 220, 34);
		instp.add(uinfomation);
		
		utitlet = new JTextField();
		utitlet.setBounds(513, 168, 434, 34);
		instp.add(utitlet);
		utitlet.setColumns(10);
		
		umkt = new JTextField();
		umkt.setColumns(10);
		umkt.setBounds(513, 215, 434, 34);
		instp.add(umkt);
		
		ustut = new JTextField();
		ustut.setColumns(10);
		ustut.setBounds(513, 329, 434, 34);
		instp.add(ustut);
		
		uaddresst = new JTextField();
		uaddresst.setColumns(10);
		uaddresst.setBounds(513, 393, 434, 34);
		instp.add(uaddresst);
		 String[] f=new String[] {"None","Medicine","Computer Science","Technology","Business","Others"};
			fields = new JComboBox(f);
			fields.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					fcbo=fields.getSelectedItem().toString();
				}
			});
			fields.setBounds(513, 269, 434, 34);
			instp.add(fields);
			
			
		JButton uinsbtn = new JButton("Save\r\n"); 
		uinsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				if(e1.getSource()==uinsbtn)
				{
					String title=utitlet.getText();
					int mk=Integer.parseInt(umkt.getText());
					String field=fcbo;
					int total=Integer.parseInt(ustut.getText());
					String address=uaddresst.getText();
					String  info=uinfota.getText();
						insert(title,mk,field,total,address,info);
					utitlet.setText("");
					umkt.setText("");
					fields.setSelectedIndex(0);
					ustut.setText("");
					uaddresst.setText("");
					uinfota.setText("");
						}
				}
				
		});
		 
				 
		 
		uinsbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		uinsbtn.setBounds(730, 632, 97, 34);
		instp.add(uinsbtn);
		
		JButton uinscl = new JButton("Cancel");
		uinscl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e3) {
				if(e3.getSource()==uinscl)
				{
					utitlet.setText("");
					umkt.setText("");
					fields.setSelectedIndex(0);
					ustut.setText("");
					uaddresst.setText("");
					uinfota.setText("");
				}
			}
		});
		uinscl.setFont(new Font("Tahoma", Font.BOLD, 15));
		uinscl.setBounds(860, 632, 97, 34);
		instp.add(uinscl);
		
		JButton uinsbk = new JButton("Back");
		uinsbk.setFont(new Font("Tahoma", Font.BOLD, 15));
		uinsbk.setBounds(255, 634, 97, 30);
		instp.add(uinsbk);
		uinsbk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				if(e2.getSource()==uinsbk)
				{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								admin_menu3 frame = new admin_menu3();
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
		
		
		
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setToolTipText("");
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setEnabled(false);
		scroll.setBounds(513, 472, 440, 130);
		instp.add(scroll);
		
		uinfota = new JTextArea();
		scroll.setViewportView(uinfota);
		
		
		
		JLabel uinsimg = new JLabel("New label");
		uinsimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		uinsimg.setBounds(0, 0, 1360, 720);
		instp.add(uinsimg);
	}
	}
 

	 

