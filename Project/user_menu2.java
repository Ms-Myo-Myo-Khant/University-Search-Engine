package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class user_menu2 extends JFrame {
		static user_menu2 f1;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1= new user_menu2();
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
	public user_menu2() {
		 
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1365, 760);
		
		JPanel cp = new JPanel();
		cp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		cp.setBackground(new Color(139, 0, 0));
		cp.setBounds(-100, 0, 1360, 750);
		getContentPane().add(cp);
		cp.setLayout(null);
		
		JButton usbtn = new JButton("Search Universities");
		usbtn.setForeground(Color.BLACK);
		usbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		usbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==usbtn)
				{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								user_search_menu3 frame = new user_search_menu3();
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
		
		JLabel tu = new JLabel("User Menu");
		tu.setBounds(602, 36, 248, 40);
		cp.add(tu);
		tu.setForeground(Color.BLACK);
		tu.setFont(new Font("Tahoma", Font.BOLD, 40));
		usbtn.setBounds(597, 260, 263, 53);
		cp.add(usbtn);
		
		JButton urfnbtn = new JButton("Register\r\n");
		urfnbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e3) {
				if(e3.getSource()==urfnbtn)
				{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								user_form8 frame = new user_form8();
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
		urfnbtn.setForeground(Color.BLACK);
		urfnbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		urfnbtn.setBounds(597, 347, 263, 53);
		cp.add(urfnbtn);
		
		JButton uvbtn = new JButton("View All Universities");
		uvbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							user_uni_view_all9 frame = new user_uni_view_all9();
							frame.setVisible(true);
							f1.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		uvbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		uvbtn.setForeground(Color.BLACK);
		uvbtn.setBounds(597, 173, 263, 53);
		cp.add(uvbtn);
		
		JButton urbtn = new JButton("Rate Us");
		urbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e4) {
				if(e4.getSource()==urbtn)
				{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								user_commet15 frame = new user_commet15();
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
		urbtn.setForeground(Color.BLACK);
		urbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		urbtn.setBounds(597, 441, 263, 53);
		cp.add(urbtn);
		
		JButton logbtn = new JButton(" Log Out ");
		logbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				if(e2.getSource()==logbtn)
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
		logbtn.setForeground(Color.BLACK);
		logbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		logbtn.setBounds(864, 530, 103, 31);
		cp.add(logbtn);
		
		JLabel umimg = new JLabel("New label");
		umimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		umimg.setBounds(0, 0, 1360, 725);
		cp.add(umimg);
	}
}
