package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class user_page_for_uni_tu12 extends JFrame {
		static user_page_for_uni_tu12 f1;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1= new user_page_for_uni_tu12("",0,"",0,"","");
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
	public user_page_for_uni_tu12(String t,int m,String f,int ts,String a,String i) {
		
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0, 0, 1365, 760);
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel p = new JPanel();
			p.setBounds(0, 0, 1365, 760);
			contentPane.add(p);
			p.setLayout(null);
			
			JPanel tp = new JPanel();
			tp.setBorder(new LineBorder(new Color(0, 0, 0)));
			tp.setBounds(217, 95, 908, 539);
			p.add(tp);
			tp.setLayout(null);
			
			JPanel lp = new JPanel();
			lp.setBorder(new LineBorder(new Color(0, 0, 0)));
			lp.setBounds(12, 13, 884, 224);
			tp.add(lp);
			lp.setLayout(null);
			
			JScrollPane stasp = new JScrollPane();
			stasp.setBounds(422, 13, 439, 198);
			lp.add(stasp);
			stasp.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			stasp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			stasp.setToolTipText("");
			stasp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			stasp.setEnabled(false);
			
			JTextArea sta = new JTextArea("\r\n  Entrance Marks  :\r"+m+"\n  Field  \t   :"+f+"\r\n  Total Students   :"+ts+"\r\n  Address            :"+a);
			stasp.setViewportView(sta);
			sta.setForeground(Color.BLACK);
			sta.setFont(new Font("Tahoma", Font.PLAIN, 15));
			sta.setEditable(false);
			
			JPanel imgp = new JPanel();
			imgp.setBounds(25, 13, 367, 198);
			lp.add(imgp);
			imgp.setLayout(null);

			JLabel lbimg = new JLabel("New label");
			lbimg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\viewallformedicine.gif"));
			lbimg.setBounds(0, 0, 367, 198);
			imgp.add(lbimg);
			
			JScrollPane infosp = new JScrollPane();
			infosp.setBounds(12, 276, 884, 246);
			infosp.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			infosp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			infosp.setToolTipText("");
			infosp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			infosp.setEnabled(false);
			tp.add(infosp);
			
			JTextArea infota = new JTextArea();
			infota.setFont(new Font("Tahoma", Font.PLAIN, 15));
			infota.setText("\t\t\tInformations About This University\r\n\t\t\t------------------------------------------------\n"+i);
			infota.setEditable(false);
			infosp.setViewportView(infota); 
			infota.setForeground(Color.BLACK);
			
			JLabel header = new JLabel(t);
			header.setBounds(217, 13, 908, 69);
			header.setHorizontalAlignment(SwingConstants.CENTER);
			header.setFont(new Font("Tahoma", Font.BOLD, 30));
			p.add(header);
			
			JButton bkbtn = new JButton("Back");
			bkbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==bkbtn)
					{
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
				}
			});
			bkbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
			bkbtn.setBounds(217, 658, 76, 26);
			p.add(bkbtn);
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
			lblNewLabel.setBounds(0, 0, 1360, 713);
			p.add(lblNewLabel);
		}
		
	}


