package Main;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class user_search_by_field5 extends JFrame {

		static user_search_by_field5 f1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1 = new user_search_by_field5();
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
	public user_search_by_field5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1365, 760);
		
		JPanel sp = new JPanel();
		sp.setBackground(new Color(178, 34, 34));
		getContentPane().add(sp, BorderLayout.CENTER);
		sp.setLayout(null);
		
		JButton spm = new JButton("Medical");
		spm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							user_uni_medicine10 frame = new user_uni_medicine10();
							frame.setVisible(true);
							f1.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
		JLabel spl = new JLabel("User Search Menu\r\n\r\n");
		spl.setBounds(539, 33, 369, 40);
		sp.add(spl);
		spl.setFont(new Font("Tahoma", Font.BOLD, 40));
		spm.setFont(new Font("Tahoma", Font.BOLD, 20));
		spm.setBounds(613, 176, 221, 40);
		sp.add(spm);
		
		JButton spt = new JButton("Technology");
		spt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							user_uni_tu12 frame = new user_uni_tu12();
							frame.setVisible(true);
							f1.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		spt.setFont(new Font("Tahoma", Font.BOLD, 20));
		spt.setBounds(613, 251, 221, 40);
		sp.add(spt);
		
		JButton spit = new JButton("Computer Science");
		spit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							user_uni_cu11 frame = new user_uni_cu11();
							frame.setVisible(true);
							f1.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		spit.setFont(new Font("Tahoma", Font.BOLD, 20));
		spit.setBounds(613, 324, 221, 40);
		sp.add(spit);
		
		JButton spb = new JButton("Business");
		spb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							user_uni_business13 frame = new user_uni_business13();
							frame.setVisible(true);
							f1.setVisible(false);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		spb.setFont(new Font("Tahoma", Font.BOLD, 20));
		spb.setBounds(613, 398, 221, 40);
		sp.add(spb);
		
		JButton spo = new JButton("Others");
		spo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							user_uni_other14 frame = new user_uni_other14();
							frame.setVisible(true);
							f1.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		spo.setFont(new Font("Tahoma", Font.BOLD, 20));
		spo.setBounds(613, 476, 221, 40);
		sp.add(spo);
		
		JButton spbk = new JButton("Back");
		spbk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==spbk)
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
		spbk.setFont(new Font("Tahoma", Font.BOLD, 15));
		spbk.setBounds(613, 556, 78, 27);
		sp.add(spbk);
		
		JLabel spimg = new JLabel("New label");
		spimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		spimg.setBounds(0, 0, 1347, 713);
		sp.add(spimg);
	}

	 
}
