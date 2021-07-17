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

public class Tournament extends JFrame {

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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tournament frame = new Tournament();
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
	
	public void updateEventDesc(String t1, String t2, String t3, String t4, String t5, String ft) {
		lblInfo1.setText(t1);
		lblInfo2.setText(t2);	
		lblInfo3.setText(t3);
		lblInfo4.setText(t4);
		lblInfo5.setText(t5);
		lblFee.setText(ft);
		
	}
	public Tournament() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 102));
		panel.setBounds(0, 0, 534, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tournament");
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
		
		lblInfo1 = new JLabel("FIRST ROUND:");
		lblInfo1.setForeground(new Color(255, 255, 255));
		lblInfo1.setBounds(10, 11, 243, 31);
		panel_1.add(lblInfo1);
		
		lblInfo2 = new JLabel("Groups of 4 or 5 teams play a league");
		lblInfo2.setForeground(new Color(255, 255, 255));
		lblInfo2.setBounds(36, 34, 243, 31);
		panel_1.add(lblInfo2);
		
		lblInfo3 = new JLabel("FINAL STAGE:");
		lblInfo3.setForeground(new Color(255, 255, 255));
		lblInfo3.setBounds(10, 71, 243, 31);
		panel_1.add(lblInfo3);
		
		lblInfo4 = new JLabel("The first and second ranked teams play in a knockout in Final Stage A");
		lblInfo4.setForeground(new Color(255, 255, 255));
		lblInfo4.setBounds(36, 96, 428, 31);
		panel_1.add(lblInfo4);
		
		lblInfo5 = new JLabel("The third and fourth ranked teams play in a knockout in Final Stage B");
		lblInfo5.setForeground(new Color(255, 255, 255));
		lblInfo5.setBounds(36, 122, 428, 31);
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
		
		lblFee = new JLabel("70");
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
