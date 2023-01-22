package Main;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;import com.mysql.jdbc.PreparedStatement;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.InterningXmlVisitor;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class admin_uni_update7 extends JFrame{
		static admin_uni_update7 f1;
	String dbURL="jdbc:mysql://localhost:3306/javaproject";
	String username="root";
	String password="";
	Connection dbConnection=null;
	Statement st=null;
	private JPanel contentPane;
	private JTextField txtUpdateRecords;
	JLabel bgimg = new JLabel("New label");
	JButton name = new JButton("University Name\r\n");
	JButton mark = new JButton("Entrance Mark");
	JButton address = new JButton("University Address\r\n");
	JButton totalsu = new JButton("Total Student");
	JButton field = new JButton("Field");
	JTextField uid,uname,umark,utotal,uadd,ufield;
	private final JButton btnBack = new JButton("Back");
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
}

}
	public static void main(String[] args) {
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1 = new admin_uni_update7(0);
					f1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

					public admin_uni_update7(int uniid) {
						uid=new JTextField(20);
						uname=new JTextField(20);
						umark=new JTextField(20);
						utotal=new JTextField(20);
						uadd=new JTextField(20);
						ufield=new JTextField(20);
						
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(0, 0, 1365, 7650);
						contentPane = new JPanel();
						contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
						setContentPane(contentPane);
						contentPane.setLayout(null);
						
						JLabel lblUpdateRecords = new JLabel("UPDATE Records");
						lblUpdateRecords.setBounds(515, 51, 393, 49);
						contentPane.add(lblUpdateRecords);
						lblUpdateRecords.setHorizontalAlignment(SwingConstants.CENTER);
						lblUpdateRecords.setFont(new Font("Tahoma", Font.BOLD, 40));
						
						//btn1
						name.setFont(new Font("Tahoma", Font.BOLD, 20));
					
						name.setBounds(539, 172, 290, 52);
						contentPane.add(name);
						name.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(e.getSource()==name)
								{
									
									
											String input;
											input=JOptionPane.showInputDialog("Enter university name: ");
											if(input.length()>0)
											{
												
												try {
													theQuery("UPDATE `usedata` SET `uname`='"+input+"' WHERE `uid`= "+uniid+"");
													
													st.close();
													dbConnection.close();
												}catch(Exception e1)
												{
													e1.printStackTrace();

												}
											}
											else
												JOptionPane.showMessageDialog(null, "Enter data!");
											
									}
									
										
								
							
								}});
						//btn2
						mark.setFont(new Font("Tahoma", Font.BOLD, 20));
						
						mark.setBounds(539, 249, 290, 52);
						contentPane.add(mark);
						mark.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(e.getSource()==mark)
								{
											
													String input;
													input=JOptionPane.showInputDialog("Enter university mark: ");
													if(input.length()>0)
													{
														try {
															int i=Integer.parseInt(input);
															theQuery("UPDATE `usedata` SET `umark`="+i+" WHERE `uid`= "+uniid+"");
															
															st.close();
															dbConnection.close();
														}catch(Exception e1)
														{
															e1.printStackTrace();
														}
														
														
													}
													else
														JOptionPane.showMessageDialog(null, "Enter data!");
														
												}
											
											
								}
							
						});
						//btn3
						
						address.setFont(new Font("Tahoma", Font.BOLD, 20));
						
						address.setBounds(539, 328, 290, 52);
						contentPane.add(address);
						address.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(e.getSource()==address)
								{
									
													String input;
													input=JOptionPane.showInputDialog("Enter university address: ");
													if(input.length()>0)
													{
														try {
															
															theQuery("UPDATE `usedata` SET `uadd`='"+input+"' WHERE `uid`= "+uniid+"");
															st.close();
															dbConnection.close();
														}catch(Exception e1)
														{
															e1.printStackTrace();
														}
													
														
													}
													else
														JOptionPane.showMessageDialog(null, "Enter data!");
														
												}
													}

							
								
							
						});
						//btn4
						totalsu.setFont(new Font("Tahoma", Font.BOLD, 20));
						
						totalsu.setBounds(539, 407, 290, 52);
						contentPane.add(totalsu);
						totalsu.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(e.getSource()==totalsu)
								{
												String input;
													input=JOptionPane.showInputDialog("Enter total number of students: ");
													if(input.length()>0)
													{
														try {
															int i=Integer.parseInt(input);
															theQuery("UPDATE `usedata` SET `utotal`="+i+" WHERE `uid`= "+uniid+"");
															st.close();
															dbConnection.close();
														}catch(Exception e1)
														{
															e1.printStackTrace();
														}
														
														JOptionPane.showMessageDialog(null, "Data Updated!");
														//break;
														//System.exit(0);
													}
													else
														JOptionPane.showMessageDialog(null, "Enter data!");
														//run();
												
											}}});
											
								
							
							
						//btn5
						field.setFont(new Font("Tahoma", Font.BOLD, 20));
						
						field.setBounds(539, 488, 290, 52);
						contentPane.add(field);
						field.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(e.getSource()==field)
								{
												
													String input;
													input=JOptionPane.showInputDialog("Enter university field: ");
													if(input.length()>0)
													{
														try {
															
															theQuery("UPDATE `usedata` SET `ufield`='"+input+"' WHERE `uid`= "+uniid+"");
															st.close();
															dbConnection.close();
														}
														catch(Exception e1)
														{
															e1.printStackTrace();
														}
													
														JOptionPane.showMessageDialog(null, "Data Updated!");
														//break;
														//System.exit(0);
													}
													else
														JOptionPane.showMessageDialog(null, "Enter data!");
														//run();
												}}	});
						btnBack.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								EventQueue.invokeLater(new Runnable() {
									public void run() {
										try {
											admin_viewall7 frame = new admin_viewall7();
											frame.setVisible(true);
											f1.setVisible(false);
										} catch (Exception e) {
											e.printStackTrace();
										}
									}
								});
							}
						});
						btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
						btnBack.setBounds(539, 593, 97, 27);
						
						contentPane.add(btnBack);
						bgimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
						bgimg.setBounds(0, 0, 1370, 733);
						
						contentPane.add(bgimg);
						

					}
					
					
}

	
					
	
	
	
	
	
	
	
	

	



