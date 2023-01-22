package Main;
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
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
import javax.swing.JPasswordField;

public class admin_login2 extends JFrame {
	static admin_login2 f1;
	private JPanel contentPane;
	private JPanel exp;
	private JTextField name;
	private JTextField id;
	private JPasswordField pass;
	static Date d=new Date();
	public static void adminlogin(String name) {
		String dbURL="jdbc:mysql://localhost:3306/"+"javaproject";
		String username="root";
		String password="";
		Connection dbConnection=null;
		String dd=String.valueOf(d);
		try {
			dbConnection=DriverManager.getConnection(dbURL,username,password);
		Statement stmt=dbConnection.createStatement();
		
		stmt.executeUpdate("INSERT INTO `adminlogin`(`Name`, `Time of logging in`) VALUES ('"+name+"','"+dd+"')");  
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
					f1 = new admin_login2();
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
	public admin_login2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(0, 0, 1365,760);
		 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 1359, 712);
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(new Color(255, 250, 205));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel alt = new JLabel("Admin Login Menu");
		alt.setBounds(514, 29, 380, 50);
		alt.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_3.add(alt);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setBounds(999, 461, 92, 39);
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=name.getText();
				char[] n1=pass.getPassword();
				boolean err;
				long l=Integer.parseInt(id.getText());
				
				if(l==123 && n1[0]=='a' && n1[1]=='a' && n1[2]=='a')
					{
					err=true;
					}
				else
					{
					err=false;
					}
				if(err==true)
				{
					adminlogin(n);
					JOptionPane.showMessageDialog(null,"You are sucessfully Login!");
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
					else
						{
						JOptionPane.showMessageDialog(null,"Password is incorrect!","ERROR",JOptionPane.ERROR_MESSAGE);
						name.setText("");
						pass.setText("");
						id.setText("");
						}
			}
		});
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogIn.setForeground(Color.BLACK);
		panel_3.add(btnLogIn);
		
		JButton btnNewButton = new JButton("Cancel"); 
		btnNewButton.setBounds(1129, 461, 92, 39);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton)
				{
					name.setText("");
					pass.setText("");
					id.setText("");	

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
		
		JLabel lun = new JLabel("Enter Name           :");
		lun.setBounds(777, 248, 195, 39);
		lun.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3.add(lun);
		
		JLabel lid = new JLabel("Enter ID Number  :");
		lid.setBounds(777, 304, 195, 33);
		lid.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3.add(lid);
		
		JLabel lup = new JLabel("Enter Password     :");
		lup.setBounds(777, 363, 195, 39);
		lup.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3.add(lup);
		
		name = new JTextField();
		name.setBounds(998, 248, 223, 33);
		panel_3.add(name);
		name.setColumns(10);
		
		id = new JTextField();
		id.setBounds(998, 304, 223, 33);
		panel_3.add(id);
		id.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(998, 369, 223, 33);
		panel_3.add(pass);
		
		exp = new JPanel();
		exp.setBounds(68, 217, 547, 354);
		exp.setAlignmentX(Component.LEFT_ALIGNMENT);
		exp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.add(exp);
		exp.setLayout(null);
		
		JLabel cpimg = new JLabel("New label");
		cpimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\emv.jpg"));
		cpimg.setBounds(0, 0, 547, 354);
		exp.add(cpimg);
		
		JLabel lcimg = new JLabel("New label");
		lcimg.setBounds(0, 0, 1359, 712);
		lcimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		lcimg.setLabelFor(contentPane);
		panel_3.add(lcimg);
	}
}
