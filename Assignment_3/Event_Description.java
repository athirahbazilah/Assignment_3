package Assignment_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;

public class Event_Description extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Event_Description frame = new Event_Description();
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
	public Event_Description() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
					Event_Description.this.dispose();
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
		panel_1.setBackground(new Color(153, 204, 153));
		panel_1.setBounds(0, 25, 650, 425);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("EVENT DESCRIPTION");
		lblNewLabel_1.setForeground(new Color(255, 255, 153));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		lblNewLabel_1.setBounds(210, 11, 240, 40);
		panel_1.add(lblNewLabel_1);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Participant_Registration Register = new Participant_Registration();
				Register.setVisible(true);
			}
		});
		btnRegister.setBounds(262, 365, 104, 45);
		panel_1.add(btnRegister);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(44, 60, 556, 284);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnTournament = new JButton("TOURNAMENT");
		btnTournament.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tournament t = new Tournament();
				t.setVisible(true);
				dispose();
			}
		});
		btnTournament.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnTournament.setBounds(98, 51, 137, 45);
		panel_2.add(btnTournament);
		
		JButton btnFriendly = new JButton("FRIENDLY");
		btnFriendly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Friendly f = new Friendly();
				f.setVisible(true);
				dispose();
			}
		});
		btnFriendly.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnFriendly.setBounds(307, 51, 137, 45);
		panel_2.add(btnFriendly);
		
		JButton btnPractice = new JButton("PRACTICE");
		btnPractice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Practice p = new Practice();
				p.setVisible(true);
				dispose();
			}
		});
		btnPractice.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnPractice.setBounds(196, 137, 137, 45);
		panel_2.add(btnPractice);
	}


}
