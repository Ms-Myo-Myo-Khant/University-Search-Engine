package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;

public class admin_page_for_student_register_form_record10 extends JFrame {
		static admin_page_for_student_register_form_record10 f1;
	private JPanel contentPane;

	public admin_page_for_student_register_form_record10(String n,String d,String e,int p,String g,String ad,String N,String fn,String fN,String mn,String mN,int pp,String pad,String dp,String rn,int tmk,String bio,int su,String u) {
		{
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0, 0, 1360, 760);
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel tp = new JPanel();
			tp.setBounds(0, 0, 1342, 708);
			contentPane.add(tp);
			tp.setLayout(null);
			
			JLabel lblStudentsInformatiion = new JLabel("Student's Informatiion\r\n");
			lblStudentsInformatiion.setBounds(330, 26, 689, 73);
			lblStudentsInformatiion.setHorizontalAlignment(SwingConstants.CENTER);
			lblStudentsInformatiion.setFont(new Font("Tahoma", Font.BOLD, 40));
			tp.add(lblStudentsInformatiion);
			

			JScrollPane infosp = new JScrollPane();
			infosp.setBounds(223, 123, 862, 494);
			infosp.setEnabled(false);
			infosp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			infosp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			infosp.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			infosp.setToolTipText("");
			tp.add(infosp);
			
			JTextArea sta = new JTextArea();
			sta.setBackground(new Color(173, 216, 230));
			sta.setColumns(1);
			sta.setTabSize(5);
			sta.setText("\tName                	  	 :\r"+n+"\n\r\n\tDate Of Bith    	               :\r"+d+"\n\r\n\tEmail      	               :\r"+e+"\n\r\n\tPhone Number  	     	 :\r"+p+"\n\r\n\tGender       		 :\r"+g+"\n\r\n\tStudent's Address                 :\r"+ad+"\n\r\n\tStudent's NRC 		:\r"+N+"\n\r\n\tFather Name  	  	:\r"+fn+"\n\r\n\tFather's NRC 	              :\r"+fN+"\n\r\n\tMother Name                       :\r"+mn+"\n\r\n\tMother's NRC                       :\r"+mN+"\n\r\n\tParent's Phone Number        :\r"+pp+"\n\t\r\n\tParent's Address                  :\r"+pad+"\n\r\n\tDepartment		:\r"+d+"\n\r\n\tRoll Number		:\r"+rn+"\n\r\n\tTotal Marks		:\r"+tmk+"\n\r\n\tBio/Eco/etc		:\r"+bio+"\n\r\n\tSuccess Year		:\r"+su+"\n\r\n\tUniversity Name		:\r"+u+"\n");
			sta.setFont(new Font("Tahoma", Font.PLAIN, 20));
			sta.setRows(5);
			infosp.setViewportView(sta);
			
	 

			JButton btnBack = new JButton("Back");
			btnBack.setBounds(223, 654, 98, 27);
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
			tp.add(btnBack);
			
			JLabel bg = new JLabel("New label");
			bg.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
			bg.setBounds(0, 0, 1360, 703);
			tp.add(bg);
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
				if(e.getSource()==btnBack)			
				{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								admin_student_register_form10 frame = new admin_student_register_form10();
								frame.setVisible(true);
								f1.setVisible(false);
							} catch (Exception e) {
								e.printStackTrace();}

				
						}});}}});}}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1 = new admin_page_for_student_register_form_record10("","","",0,"","","","","","","",0,"","","",0,"",0,"");
					f1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	}	


