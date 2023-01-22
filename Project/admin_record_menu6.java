package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class admin_record_menu6 extends JFrame {
	static admin_record_menu6 f1;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1 = new admin_record_menu6();
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
	public admin_record_menu6() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Yasoda Gyawali\\eclipse-workspace\\USE\\mv.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1365, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pl1 = new JPanel();
		pl1.setBounds(0, 0, 1375, 760);
		contentPane.add(pl1);
		pl1.setLayout(null);
		
		JLabel lblApplicationRecord = new JLabel("      DATA RECORD");
		lblApplicationRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblApplicationRecord.setBounds(424, 77, 419, 49);
		lblApplicationRecord.setFont(new Font("Tahoma", Font.BOLD, 40));
		pl1.add(lblApplicationRecord);
		
		JButton br1 = new JButton("Admin Login Record");
		br1.setFont(new Font("Tahoma", Font.BOLD, 20));
		br1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							admin_login_admin_record8 frame = new admin_login_admin_record8();
							frame.setVisible(true);
							f1.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		br1.setBounds(519, 197, 305, 69);
		pl1.add(br1);
		
		JButton br2 = new JButton("User Login Record");
		br2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							admin_login_user_record9 frame = new admin_login_user_record9();
							frame.setVisible(true);
							f1.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		br2.setFont(new Font("Tahoma", Font.BOLD, 20));
		br2.setBounds(519, 325, 305, 69);
		pl1.add(br2);
		
		JButton br3 = new JButton("Registration Form Record");
		br3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							admin_student_register_form10 frame = new admin_student_register_form10();
							frame.setVisible(true);
							f1.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		br3.setFont(new Font("Tahoma", Font.BOLD, 20));
		br3.setBounds(519, 452, 305, 69);
		pl1.add(br3);
		
		JButton bkbtn = new JButton("Back\r\n");
		bkbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bkbtn)
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
		bkbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		bkbtn.setBounds(519, 590, 97, 27);
		pl1.add(bkbtn);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		lblNewLabel.setBounds(-11, 0, 1365, 714);
		pl1.add(lblNewLabel);
	}
}
