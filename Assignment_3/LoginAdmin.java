package Assignment_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class LoginAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdmin frame = new LoginAdmin();
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
	public LoginAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 153));
		panel.setBounds(0, 0, 393, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsername.setBounds(25, 112, 70, 25);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(25, 148, 70, 25);
		panel.add(lblPassword);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textUsername.setBounds(126, 112, 200, 25);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		JButton btnLogin = new JButton("LOG IN");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textUsername.getText().equals("admin") && textPassword.getText().equals("admin123")) {
					//if user input are correct
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null, "Login Successful!");
					Employees Worker = new Employees();
					Worker.setVisible(true);
				}
				else if(textUsername.getText().equals("") || textUsername.getText().equals("Username") ||
						textPassword.getText().equals("") || textPassword.getText().equals("Password")) {
					lblLoginMessage.setText("Please input all the requirements!");
				}
				else {
					lblLoginMessage.setText("Username & password didn't match!");
				}
			}
		
			
		});
		btnLogin.setFont(new Font("Arial", Font.BOLD, 14));
		btnLogin.setBounds(142, 219, 120, 40);
		panel.add(btnLogin);
		
		textPassword = new JPasswordField();
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPassword.setBounds(126, 150, 200, 25);
		panel.add(textPassword);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textUsername.setText("");
				textPassword.setText("");
			}
		});
		btnClear.setFont(new Font("Arial", Font.BOLD, 14));
		btnClear.setBounds(142, 270, 120, 40);
		panel.add(btnClear);
		lblLoginMessage.setForeground(new Color(153, 0, 0));
		
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLoginMessage.setBounds(111, 186, 215, 22);
		panel.add(lblLoginMessage);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO ADMIN PAGE");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(38, 23, 345, 40);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 51));
		panel_1.setBounds(393, 0, 241, 361);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP USER\\Desktop\\Athirah\\SEMESTER 2\\PROGRAMMING 2\\Photo\\check-in1.png"));
		lblNewLabel.setBounds(37, 118, 170, 170);
		panel_1.add(lblNewLabel);
	}
		
	
}

