package Main;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class firstpage_aboutus extends JFrame {
	static firstpage_aboutus f1;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1= new firstpage_aboutus();
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
	public firstpage_aboutus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,1365, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//this.setTitle("About us");
		
		JLabel cmt = new JLabel("Universities Search Engine (USE)");
		cmt.setBounds(335, 28, 711, 41);
		contentPane.add(cmt);
		cmt.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JTextArea txtrUniversititesSearchEngine = new JTextArea();
		txtrUniversititesSearchEngine.setEditable(false);
		txtrUniversititesSearchEngine.setBackground(new Color(240, 255, 255));
		txtrUniversititesSearchEngine.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtrUniversititesSearchEngine.setBounds(172, 119, 993, 518);
		contentPane.add(txtrUniversititesSearchEngine);
		txtrUniversititesSearchEngine.setText("    Universitites Search Engine (USE) is a web-like application\r\n    that helps students in finding informatiion about the universities.\r\n\r\n \t How it works?\r\n \t Step 1:\t\tYou have to type your name  in order to log in the app. \r\n\t\t\tThen, press log in.\r\n\r\n\t  Step 2:\t\tYou can view all information about universites.\r\n\t\t\tYou can also search a paricular university by\r\n\t\t\tfields or total marks or name.\r\n\r\n***You can give feedback or rate what you feel about our app***\r\n\r\n    Need help?\r\n    Join us our website: www.usemyanmar.com\r\n    Send message to our email: usemyanmar@gmail.com\r\n\r\n       Credit goes to...\r\n>>Myo Myo Khant\t  \t>>Phyo Maw Ko\r\n>>Ei Ei Moe Pwint\t\t>>May Yadanar\r\n>>Sai Kuan Ngin\t\t>>Myat Theingi Nwe\r\n>>Thin Thant Tun");
		
		JButton bkbtn = new JButton("Back");
		bkbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		});
		bkbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		bkbtn.setBounds(172, 650, 89, 29);
		contentPane.add(bkbtn);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\All About Java Test\\Project\\src\\Main\\photos\\bg11.jpg"));
		lblNewLabel.setBounds(0, 0, 1352, 713);
		contentPane.add(lblNewLabel);
	}
}
