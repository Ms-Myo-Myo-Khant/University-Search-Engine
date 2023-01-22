package Main;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.util.Date;
public class user_login1 extends JFrame {
	static user_login1 f1;
	private JPanel contentPane;
	private JTextField uname;
	private JPanel panel;
	static Date d=new Date();


	/**
	 * Launch the application.
	 */
	public static void userlogin(String name) {
		 String dbURL="jdbc:mysql://localhost:3306/javaproject";
	 		String username="root";
	 		String password="";
	 		Connection dbConnection=null;
	 		String dd=String.valueOf(d);
	 		try {
				dbConnection=DriverManager.getConnection(dbURL,username,password);
					
					java.sql.PreparedStatement pstmt=dbConnection.prepareStatement("INSERT INTO `userlogin`(`Name`, `Time of logging in`) VALUES (?,?)");
					pstmt.setString(1, name); 
					pstmt.setString(2, dd);
					int ii=pstmt.executeUpdate();
					if(ii>0)JOptionPane.showMessageDialog(null,"You are sucessfully Login!"); 
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
					f1 = new user_login1();
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
	public user_login1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(0, 0, 1365, 760);
		 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 1359, 720);
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(new Color(255, 250, 205));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblEnterYourName = new JLabel("Enter Username");
		lblEnterYourName.setBounds(867, 257, 224, 50);
		lblEnterYourName.setLabelFor(this);
		lblEnterYourName.setForeground(Color.BLACK);
		lblEnterYourName.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_3.add(lblEnterYourName);
		
		JLabel lblUserLoginMenu = new JLabel("User Login Menu");
		lblUserLoginMenu.setBounds(514, 29, 380, 50);
		lblUserLoginMenu.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_3.add(lblUserLoginMenu);
		
		uname = new JTextField("");
		uname.setBounds(867, 347, 234, 39);
		panel_3.add(uname);
		uname.setColumns(10);
		
		JButton btnLogIn = new JButton("Log in"); 
		btnLogIn.setBounds(867, 485, 105, 39);
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnLogIn)
				{
					String n=uname.getText();
					boolean i=n.isEmpty();
					if(i==true) {
					JOptionPane.showMessageDialog(null,"Please Enter Your Name to Login!","Error Message",JOptionPane.ERROR_MESSAGE);
					}
					else if(i==false)
					{
						
						userlogin(n); 
						uname.setText("");
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
			}
		});
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogIn.setForeground(Color.BLACK);
		panel_3.add(btnLogIn);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setBounds(996, 485, 105, 39);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton)
				{

					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								firstpage1 frame = new firstpage1();
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.BLACK);
		panel_3.add(btnNewButton);
		
		panel = new JPanel();
		panel.setBounds(94, 180, 598, 394);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.add(panel);
		panel.setLayout(null);
		
		JLabel cpimg = new JLabel("");
		cpimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\exv1.jpg"));
		cpimg.setBounds(0, 0, 600, 394);
		panel.add(cpimg);
		
		JLabel cimg = new JLabel("");
		cimg.setBounds(0, 0, 1359, 720);
		cimg.setLabelFor(contentPane);
		cimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		panel_3.add(cimg);
	}
}
