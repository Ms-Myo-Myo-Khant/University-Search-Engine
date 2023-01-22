package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.ImageIcon;

public class admin_menu3 extends JFrame {

static admin_menu3 f1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1= new admin_menu3();
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
	public admin_menu3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1365,760);
		 
		
		JPanel acp = new JPanel();
		acp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		acp.setBackground(new Color(139, 0, 0));
		getContentPane().add(acp, BorderLayout.CENTER);
		acp.setLayout(null);
		
		JButton as = new JButton(" Search  Universities");
		as.setForeground(Color.BLACK);
		as.setFont(new Font("Tahoma", Font.BOLD, 20));
		as.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==as)
				{
					String input;
					input=JOptionPane.showInputDialog("Enter university name: ");
					if(input.length()>0)
					{
						try {
							new admin_search_uni_by_name4(input);
							
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
		
		JLabel al = new JLabel("Admin Menu");
		al.setBounds(559, 36, 266, 66);
		acp.add(al);
		al.setForeground(Color.BLACK);
		al.setFont(new Font("Tahoma", Font.BOLD, 40));
		as.setBounds(544, 320, 301, 54);
		acp.add(as);
		
		JButton av = new JButton("   View  All Universities");
		av.setForeground(Color.BLACK);
		av.setFont(new Font("Tahoma", Font.BOLD, 20));
		av.setBounds(544, 155, 301, 54);
		av.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==av)
				{
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
				
			}
		});
		acp.add(av);
		
		JButton ai = new JButton("Insert New University");
		ai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				if(e1.getSource()==ai)
				{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								admin_insert5 frame = new admin_insert5();
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
		ai.setForeground(Color.BLACK);
		ai.setFont(new Font("Tahoma", Font.BOLD, 20));
		ai.setBounds(544, 238, 301, 54);
		acp.add(ai);
		
		JButton alog = new JButton(" Log Out ");
		alog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				if(e2.getSource()==alog)
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
		alog.setForeground(Color.BLACK);
		alog.setFont(new Font("Arial", Font.BOLD, 15));
		alog.setBounds(845, 609, 103, 31);
		acp.add(alog);
		
		JButton vucbtn = new JButton("View User's Comments   ");
		vucbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							commentrecord frame = new commentrecord();
							frame.setVisible(true);
							f1.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		vucbtn.setForeground(Color.BLACK);
		vucbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		vucbtn.setBounds(544, 406, 301, 54);
		acp.add(vucbtn);
		
		JButton btnNewButton_1 = new JButton("View  Records");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1)
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
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(544, 486, 301, 54);
		acp.add(btnNewButton_1);
		
		JLabel amimg = new JLabel("New label");
		amimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		amimg.setLabelFor(this);
		amimg.setBounds(0, 0, 1365,760);
		acp.add(amimg);
	}

}
