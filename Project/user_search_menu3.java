 package Main;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Scrollbar;
import javax.swing.ImageIcon;

public class user_search_menu3 extends JFrame {
	static user_search_menu3 f1;
	private JPanel contentPane;
	String dbURL="jdbc:mysql://localhost:3306/javaproject";
	String username="root";
	String password="";
	Connection dbConnection=null;
	Statement st=null;
	public void theQuery(String query)
	{
		Connection dbconn=null;
		Statement stmt=null;
		try {
			dbconn=DriverManager.getConnection(dbURL,username ,password);
			stmt=dbconn.createStatement();
			stmt.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Data Updated! ");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		}
		public void Dataconnection(String query)
		{
		
		try {
		dbConnection=DriverManager.getConnection(dbURL,username,password);
		st=dbConnection.createStatement();
		st.executeUpdate(query);
		JOptionPane.showMessageDialog(null, "Data Updated!");
		}
		catch(SQLException e)
		{
		JOptionPane.showMessageDialog(null, e.getMessage());
	}}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1= new user_search_menu3();
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
	public user_search_menu3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1365, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel usp = new JPanel();
		usp.setBounds(0, 5, 1347, 708);
		usp.setBackground(new Color(240, 230, 140));
		contentPane.add(usp);
		usp.setLayout(null);
		
		JLabel uspl = new JLabel("USER SEARCH");
		uspl.setBounds(514, 44, 422, 40);
		usp.add(uspl);
		uspl.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JButton usu = new JButton("Search by University's Name\r\n");
		usu.setBounds(165, 212, 365, 53);
		usu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				if(e1.getSource()==usu)
				{
					String input;
					input=JOptionPane.showInputDialog("Enter university name: ");
					if(input.length()>0)
					{
						try {
							new user_search_by_name4(input);
							
						}catch(Exception e11)
						{
							e11.printStackTrace();
						}	
					}
					else
						JOptionPane.showMessageDialog(null, "Enter data!");
						
				}
			
				}
			}
		);
		usu.setFont(new Font("Tahoma", Font.BOLD, 20));
		usp.add(usu);
		
		JButton usf = new JButton("Search by Fields");
		usf.setBounds(165, 312, 365, 53);
		usf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
					if(e2.getSource()==usf)
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
		usf.setFont(new Font("Tahoma", Font.BOLD, 20));
		usp.add(usf);
		
		JButton usm = new JButton("Search by Marks");
		usm.setBounds(165, 411, 365, 53);
		usm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e3) {
				if(e3.getSource()==usm)
				{
					String input;
					input=JOptionPane.showInputDialog("Enter university mark: ");
					
					if(input.length()>0)
					{
						try {
							int i=Integer.parseInt(input);
							
							new user_search_by_mark6(i);
							
						}catch(Exception e11)
						{
							e11.printStackTrace();
						}
						
						
					}
					else
						JOptionPane.showMessageDialog(null, "Enter data!");
						
				}
			}
		});
		usm.setFont(new Font("Tahoma", Font.BOLD, 20));
		usp.add(usm);
		
		JButton usbk = new JButton("Back");
		usbk.setBounds(165, 521, 91, 32);
		usbk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e5) {
				if(e5.getSource()==usbk)
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
		usbk.setFont(new Font("Tahoma", Font.BOLD, 15));
		usp.add(usbk);
		
		JPanel exp = new JPanel();
		exp.setBounds(709, 212, 524, 341);
		usp.add(exp);
		exp.setLayout(null);
		
		JLabel expimg = new JLabel("New label");
		expimg.setBounds(0, 0, 524, 341);
		exp.add(expimg);
		expimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\exv1.jpg"));
		
		JLabel usimg = new JLabel("New label");
		usimg.setBounds(0, -12, 1347, 720);
		usimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		usp.add(usimg);
	}
}
