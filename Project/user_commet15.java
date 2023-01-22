package Main;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;

public class user_commet15 extends JFrame {
		static user_commet15 f1;
	Connection dbConnection;
	private JPanel contentPane;JRadioButton w,b,g,a,ex;
	private JTextField gmail;
	private JTextArea cmt; 
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public void insert(String a,String b,String c)
	{
		//setResizable(false);
		String dbURL="jdbc:mysql://localhost:3306/javaproject";
 		String username="root";
 		String password="";
 		Connection dbConnection=null;
		try {
			dbConnection=DriverManager.getConnection(dbURL,username,password);
			java.sql.PreparedStatement pstmt=dbConnection.prepareStatement("insert into rateus(gmail,comments,rate) values(?,?,?)");
			pstmt.setString(1, a);
			pstmt.setString(2, b);
			pstmt.setString(3, c);
			int ii=pstmt.executeUpdate();
			if(ii>0)JOptionPane.showMessageDialog(null,"Your Comments have sucessfully inserted!");
			else  JOptionPane.showMessageDialog(this, "Comments Fail!");
			pstmt.close();
		dbConnection.close();
		}catch(SQLException e)
		{
			
			e.printStackTrace();
		}
	}		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1 = new user_commet15();
					f1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public user_commet15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1365,760);
		//setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeaveComment = new JLabel("Leave comment!");
		lblLeaveComment.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblLeaveComment.setBounds(252, 179, 194, 37);
		contentPane.add(lblLeaveComment);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String n1=gmail.getText();
				String n2=cmt.getText();
				String n3=null;
					if(w.isSelected()==true)
					{
						n3="Worst";
					}
					else if(b.isSelected()==true)
					{
						n3="Bad";
					}
					else if(a.isSelected()==true)
					{
						n3="Average";
					}
					else if(g.isSelected()==true)
					{
						n3="Good";
					}
					else if(ex.isSelected()==true)
					{
						n3="Excellent";
					}
					
					insert(n1,n2,n3);
					gmail.setText("");
					cmt.setText("");
				}
			}
		);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSubmit.setBounds(949, 662, 94, 27);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnCancel)
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
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBounds(1082, 662, 89, 27);
		contentPane.add(btnCancel);
		
		JLabel lblUsername = new JLabel("Gmail:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(676, 185, 73, 23);
		contentPane.add(lblUsername);
		
		gmail = new JTextField();
		gmail.setBounds(761, 189, 218, 20);
		contentPane.add(gmail);
		gmail.setColumns(10);
		JPanel rbtn = new JPanel();
		rbtn.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Rate US", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		rbtn.setBackground(Color.WHITE);
		rbtn.setBounds(120, 560, 1051, 59);
		contentPane.add(rbtn);
		rbtn.setLayout(null);
		w = new JRadioButton("Worst");
		buttonGroup.add(w);
		w.setHorizontalAlignment(SwingConstants.CENTER);
		//bg.add(w);
		w.setFont(new Font("Tahoma", Font.BOLD, 18));
		w.setBounds(68, 21, 127, 31);
		rbtn.add(w);
		
		 b = new JRadioButton("Bad");
		buttonGroup.add(b);
		b.setHorizontalAlignment(SwingConstants.CENTER);
		//bg.add(b);
		b.setFont(new Font("Tahoma", Font.BOLD, 18));
		b.setBounds(271, 21, 127, 31);
		rbtn.add(b);
		
		 ex = new JRadioButton("Excellent");
		buttonGroup.add(ex);
		ex.setHorizontalAlignment(SwingConstants.CENTER);
		//bg.add(rdbtnExcellent);
		ex.setFont(new Font("Tahoma", Font.BOLD, 18));
		ex.setBounds(864, 21, 127, 31);
		rbtn.add(ex);	
		
		 g = new JRadioButton("Good");
		buttonGroup.add(g);
		g.setHorizontalAlignment(SwingConstants.CENTER);
		g.setFont(new Font("Tahoma", Font.BOLD, 18));
		g.setBounds(673, 21, 127, 31);
		rbtn.add(g);
		
		a = new JRadioButton("Average");
		buttonGroup.add(a);
		a.setHorizontalAlignment(SwingConstants.CENTER);
		a.setFont(new Font("Tahoma", Font.BOLD, 18));
		a.setBounds(465, 21, 127, 31);
		rbtn.add(a);
		
		
		
		cmt= new JTextArea();
		cmt.setBackground(new Color(224, 255, 255));
		cmt.setForeground(Color.BLACK);
		cmt.setBounds(252, 221, 812, 263);
		contentPane.add(cmt);
		
		JLabel title = new JLabel("Please let us know, how can we improve ourselves?\r\n");
		title.setFont(new Font("Tahoma", Font.BOLD, 38));
		title.setIcon(null);
		title.setBounds(197, 13, 996, 99);
		contentPane.add(title);
		
		JLabel img = new JLabel("New label");
		img.setBackground(new Color(0, 255, 255));
		img.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		img.setBounds(0, 0, 1347, 713);
		contentPane.add(img);
		
		
	}
}
