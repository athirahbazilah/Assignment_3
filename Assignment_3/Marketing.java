package Assignment_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Marketing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Marketing frame = new Marketing();
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
	public Marketing() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Discount disc = new WeekendDiscount();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 204));
		panel.setBounds(0, 0, 650, 25);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblExit = new JLabel("X");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					Marketing.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setForeground(Color.BLACK);
			}
		});
		lblExit.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setBounds(625, 0, 25, 25);
		panel.add(lblExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setBounds(0, 25, 650, 475);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(79, 62, 485, 323);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane textAdvertisement = new JTextPane();
		textAdvertisement.setFont(new Font("Sitka Small", Font.BOLD, 14));
		textAdvertisement.setText("We provide comfortable place for you to enjoy your futsal activities.\r\n\r\nFeel free to register at our futsal centre. You will never disappoints.\r\n\r\nWe provide a really appreciable prize for the winner at RM 1000\r\n\r\nWe also provide 15.0% discount on the weekend. so you can enjoy you futsal activities to the fullest!\r\n\r\nIf you are interested, you can contact us +609-8594882 for more info");
		
		textAdvertisement.setBounds(23, 26, 438, 267);
		panel_2.add(textAdvertisement);
		
		JLabel lblNewLabel_1 = new JLabel("ADVERTISEMENT");
		lblNewLabel_1.setBounds(198, 11, 262, 45);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 18));
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Company_Background Home = new Company_Background();
				Home.setVisible(true);
			}
		});
		btnBack.setBounds(113, 406, 100, 40);
		panel_1.add(btnBack);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Participant_Registration Register = new Participant_Registration();
				Register.setVisible(true);
			}
		});
		btnRegister.setBounds(267, 406, 100, 40);
		panel_1.add(btnRegister);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(frame, "Comfirm you want to exit?", "EXIT", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				}
				System.exit(0);
			}
		});
		btnExit.setBounds(427, 406, 100, 40);
		panel_1.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP USER\\Desktop\\Athirah\\SEMESTER 2\\PROGRAMMING 2\\Photo\\images1.jpg"));
		lblNewLabel.setBounds(0, 0, 650, 475);
		panel_1.add(lblNewLabel);
	}
}
