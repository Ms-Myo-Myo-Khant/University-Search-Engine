package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class firstpage1 extends JFrame {

	static firstpage1 f1 ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 f1 = new firstpage1();
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
	public firstpage1() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1365,760);
		
		JPanel cp = new JPanel();
		cp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		cp.setBackground(new Color(139, 0, 0));
		cp.setBounds(12, 72, 420, 180);
		getContentPane().add(cp);
		cp.setLayout(null);
		
		JLabel title = new JLabel("Universities Search Engine");
		title.setBounds(462, 30, 576, 67);
		cp.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 40));
		title.setForeground(Color.BLACK);
		
		JButton abtn = new JButton("Admin");
		abtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		abtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent a) {
				if(a.getSource()==abtn)
				{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								admin_login2 frame = new admin_login2();
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
		
		JPanel panel = new JPanel();
		panel.setBounds(182, 197, 483, 362);
		cp.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\group.jpg"));
		lblNewLabel.setBounds(0, 0, 483, 362);
		panel.add(lblNewLabel);
		
		abtn.setForeground(Color.BLACK);
		abtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		abtn.setBounds(853, 197, 294, 67);
		cp.add(abtn);
		
		JButton ubtn = new JButton("User");
		ubtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==ubtn)
				{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								user_login1 frame = new user_login1();
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
		ubtn.setForeground(Color.BLACK);
		ubtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		ubtn.setBounds(853, 314, 294, 67);
		cp.add(ubtn);
		
		JButton abbtn = new JButton("About Us");
		abbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							firstpage_aboutus frame = new firstpage_aboutus();
							frame.setVisible(true);
							f1.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		abbtn.setForeground(Color.BLACK);
		abbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		abbtn.setBounds(853, 431, 294, 67);
		cp.add(abbtn);
		
		JButton exitbtn = new JButton("Exit\r\n");
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==exitbtn)
				{
					int s=JOptionPane.showConfirmDialog (null,"Do You Really Want to Quit?","User Confirmation",JOptionPane.OK_CANCEL_OPTION);
					if(s==JOptionPane.OK_OPTION)
					{
						System.exit(0); 
				}}}
			
		});
		exitbtn.setForeground(Color.BLACK);
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		exitbtn.setBounds(853, 548, 294, 67);
		cp.add(exitbtn);
		
		JLabel dcimg = new JLabel("New label");
		dcimg.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dcimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		dcimg.setBounds(0,0,1359,725);
		cp.add(dcimg);
	}
}
