package Assignment_3;

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
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Friendly extends JFrame {

	private JPanel contentPane;
	JLabel lblInfo1;
	JLabel lblInfo2;
	JLabel lblInfo3;
	JLabel lblInfo4;
	JLabel lblInfo5;
	JLabel lblFee;
	

	/**
	 * Launch the application.
	 */
	
	public void updateEventDesc(String f1, String f2, String f3, String f4, String f5, String ff) {
		lblInfo1.setText(f1);
		lblInfo2.setText(f2);	
		lblInfo3.setText(f3);
		lblInfo4.setText(f4);
		lblInfo5.setText(f5);
		lblFee.setText(ff);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Friendly frame = new Friendly();
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
	public Friendly() {
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 102));
		panel.setBounds(0, 0, 534, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Friendly");
		lblNewLabel.setForeground(new Color(255, 204, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(214, 11, 115, 41);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 102, 102));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(31, 73, 474, 169);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PURPOSE:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 11, 243, 31);
		panel_1.add(lblNewLabel_1);
		
		lblInfo1 = new JLabel("To increase the player\u2019s fitness levels");
		lblInfo1.setForeground(new Color(255, 255, 255));
		lblInfo1.setBounds(36, 34, 243, 31);
		panel_1.add(lblInfo1);
		
		lblInfo2 = new JLabel("To provide more time for the players to play alongside each other");
		lblInfo2.setForeground(new Color(255, 255, 255));
		lblInfo2.setBounds(36, 60, 428, 31);
		panel_1.add(lblInfo2);
		
		lblInfo4 = new JLabel("To mark an occasion");
		lblInfo4.setForeground(new Color(255, 255, 255));
		lblInfo4.setBounds(36, 112, 428, 31);
		panel_1.add(lblInfo4);
		
		lblInfo3 = new JLabel("To test themselves against the opposition and try new tactics");
		lblInfo3.setForeground(Color.WHITE);
		lblInfo3.setBounds(36, 86, 359, 31);
		panel_1.add(lblInfo3);
		
		lblInfo5 = new JLabel("For charity or to raise money");
		lblInfo5.setForeground(Color.WHITE);
		lblInfo5.setBounds(36, 138, 428, 31);
		panel_1.add(lblInfo5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 204, 204));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(292, 247, 210, 103);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("REGISTRATION FEE (RM):");
		lblNewLabel_1_1_1_1.setBounds(10, 11, 173, 31);
		panel_2.add(lblNewLabel_1_1_1_1);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setForeground(new Color(204, 51, 0));
		
		lblFee = new JLabel("60");
		lblFee.setBounds(20, 39, 180, 53);
		panel_2.add(lblFee);
		lblFee.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFee.setForeground(new Color(255, 51, 0));
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Event_Description Event = new Event_Description();
				Event.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(50, 277, 106, 41);
		panel.add(btnNewButton);
	}

}

