package Assignment_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Company_Background extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Company_Background frame = new Company_Background();
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
	public Company_Background() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Event Description");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Tournament");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Friendly");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Practice");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Other");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Marketing");
		mnNewMenu_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Marketing Ad = new Marketing();
				Ad.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 634, 411);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO OUR PAGE!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(159, 214, 309, 56);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HP USER\\Desktop\\Athirah\\SEMESTER 2\\PROGRAMMING 2\\Photo\\football1.png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(260, 11, 120, 120);
		panel_1.add(lblNewLabel_3);
		
		JButton btnCustomer = new JButton("CUSTOMER");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login_Page LoginCust = new Login_Page();
				LoginCust.setVisible(true);
			}
		});
		btnCustomer.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCustomer.setBounds(92, 313, 125, 45);
		panel_1.add(btnCustomer);
		
		JButton btnEmployee = new JButton("EMPLOYEE");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginAdmin AdminLogin = new LoginAdmin();
				AdminLogin.setVisible(true);
			}
		});
		btnEmployee.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEmployee.setBounds(373, 313, 125, 45);
		panel_1.add(btnEmployee);
		
		JLabel lblAbFutsalCentre = new JLabel("AB FUTSAL CENTRE");
		lblAbFutsalCentre.setForeground(new Color(204, 255, 204));
		lblAbFutsalCentre.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbFutsalCentre.setFont(new Font("Castellar", Font.BOLD, 18));
		lblAbFutsalCentre.setBounds(159, 133, 309, 56);
		panel_1.add(lblAbFutsalCentre);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(459, 33, 165, 192);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("FOR MORE INFO:");
		lblNewLabel_1.setBounds(10, 11, 130, 25);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contact Us");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(10, 34, 130, 25);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("+609-8594882");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(10, 52, 130, 25);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Visit Us");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBounds(10, 80, 130, 25);
		panel_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("AB Futsal Centre,");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setBounds(10, 99, 130, 25);
		panel_2.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Taman Cukai Utama,");
		lblNewLabel_1_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_3_1.setBounds(10, 116, 130, 25);
		panel_2.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_3_1_1 = new JLabel("24000 Kemaman, ");
		lblNewLabel_1_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_3_1_1.setBounds(10, 133, 130, 25);
		panel_2.add(lblNewLabel_1_1_3_1_1);
		
		JLabel lblNewLabel_1_1_3_1_2 = new JLabel("Terengganu");
		lblNewLabel_1_1_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_3_1_2.setBounds(10, 150, 130, 25);
		panel_2.add(lblNewLabel_1_1_3_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP USER\\Desktop\\Athirah\\SEMESTER 2\\PROGRAMMING 2\\Photo\\562943.jpg"));
		lblNewLabel_2.setBounds(0, 0, 634, 389);
		panel_1.add(lblNewLabel_2);
		
	}
}
