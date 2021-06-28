package Assignment_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login_Page extends JFrame {

	private JPanel contentPane;
	private JTextField textUserName;
	private JPasswordField pwdPassword;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page frame = new Login_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login_Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new LineBorder(new Color(204, 255, 153), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(177, 186, 250, 40);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textUserName = new JTextField();
		textUserName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textUserName.getText().equals("Username")) {
					textUserName.setText("");
				}
				else {
					textUserName.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textUserName.getText().equals(""))
					textUserName.setText("Username");
			}
		});
		textUserName.setBorder(null);
		textUserName.setFont(new Font("Arial", Font.PLAIN, 12));
		textUserName.setText("Username");
		textUserName.setBounds(10, 11, 170, 20);
		panel.add(textUserName);
		textUserName.setColumns(10);
		
		JLabel lblUsernameIcon = new JLabel("");
		lblUsernameIcon.setIcon(new ImageIcon("C:\\Users\\HP USER\\Desktop\\Athirah\\SEMESTER 2\\PROGRAMMING 2\\Photo\\Username1.jpg"));
		lblUsernameIcon.setBounds(190, 1, 60, 40);
		panel.add(lblUsernameIcon);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(177, 237, 250, 40);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPassword.getText().equals("Password")) {
					pwdPassword.setEchoChar('●');
					pwdPassword.setText("");
				}
				else {
					pwdPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdPassword.getText().equals("")) {
					pwdPassword.setText("Password");
					pwdPassword.setEchoChar((char)0);
				}
				
			}
		});
		pwdPassword.setBorder(null);
		pwdPassword.setEchoChar((char)0);
		pwdPassword.setText("Password");
		pwdPassword.setBounds(10, 11, 170, 20);
		panel_1.add(pwdPassword);
		
		JLabel lblPasswordIcon = new JLabel("");
		lblPasswordIcon.setIcon(new ImageIcon("C:\\Users\\HP USER\\Desktop\\Athirah\\SEMESTER 2\\PROGRAMMING 2\\Photo\\password1.jpg"));
		lblPasswordIcon.setBounds(198, 0, 40, 40);
		panel_1.add(lblPasswordIcon);
		
		JLabel lbl_X = new JLabel("X");
		lbl_X.setForeground(new Color(255, 255, 255));
		lbl_X.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					Login_Page.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_X.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_X.setForeground(Color.WHITE);
			}
		});
		lbl_X.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_X.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lbl_X.setBounds(580, 0, 20, 20);
		contentPane.add(lbl_X);
		
		lblLoginMessage.setForeground(new Color(153, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLoginMessage.setBounds(177, 288, 250, 26);
		contentPane.add(lblLoginMessage);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Company_Background Home = new Company_Background();
				Home.setVisible(true);
			}
		});
		btnBack.setBackground(new Color(255, 204, 153));
		btnBack.setForeground(new Color(0, 51, 51));
		btnBack.setFont(new Font("Arial", Font.BOLD, 12));
		btnBack.setBounds(10, 1, 95, 40);
		contentPane.add(btnBack);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Participant_Registration RegisterParticipant = new Participant_Registration();
				RegisterParticipant.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(51, 153, 102));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(177, 380, 250, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP USER\\Desktop\\Athirah\\SEMESTER 2\\PROGRAMMING 2\\Photo\\football1.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(236, 55, 120, 120);
		contentPane.add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("LOG IN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setFont(new Font("Arial", Font.BOLD, 14));
		btnLogin.setBackground(new Color(153, 204, 102));
		btnLogin.setBounds(20, 319, 250, 50);
		contentPane.add(btnLogin);
		
		JButton btnSignup = new JButton("SIGN UP");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUp PartiSignUp = new SignUp();
				PartiSignUp.setVisible(true);
			}
		});
		btnSignup.setFont(new Font("Arial", Font.BOLD, 14));
		btnSignup.setBackground(new Color(255, 153, 102));
		btnSignup.setBounds(328, 319, 250, 50);
		contentPane.add(btnSignup);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP USER\\Desktop\\Athirah\\SEMESTER 2\\PROGRAMMING 2\\Photo\\562943.jpg"));
		lblNewLabel.setBounds(0, 0, 600, 500);
		contentPane.add(lblNewLabel);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
