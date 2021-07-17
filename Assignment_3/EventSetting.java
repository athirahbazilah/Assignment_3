package Assignment_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class EventSetting extends JFrame {

	private JPanel contentPane;
	private JTextField textInfoT1;
	private JTextField textInfoT2;
	private JTextField textInfoT3;
	private JTextField textInfoT4;
	private JTextField textInfoT5;
	private JTextField textFeeT;
	private JTextField textInfoF1;
	private JTextField textInfoF2;
	private JTextField textInfoF3;
	private JTextField textInfoF4;
	private JTextField textInfoF5;
	private JTextField textFeeF;
	private JTextField textInfoP1;
	private JTextField textInfoP2;
	private JTextField textInfoP3;
	private JTextField textInfoP4;
	private JTextField textInfoP5;
	private JTextField textFeeP;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventSetting frame = new EventSetting();
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
	public EventSetting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 51));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 0, 260, 411);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tournament");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(76, 11, 87, 28);
		panel.add(lblNewLabel);
		
		JLabel lblInfo = new JLabel("Info:");
		lblInfo.setBounds(10, 50, 87, 28);
		panel.add(lblInfo);
		
		textInfoT1 = new JTextField();
		textInfoT1.setBounds(10, 74, 240, 20);
		panel.add(textInfoT1);
		textInfoT1.setColumns(10);
		
		textInfoT2 = new JTextField();
		textInfoT2.setColumns(10);
		textInfoT2.setBounds(10, 105, 240, 20);
		panel.add(textInfoT2);
		
		textInfoT3 = new JTextField();
		textInfoT3.setColumns(10);
		textInfoT3.setBounds(10, 136, 240, 20);
		panel.add(textInfoT3);
		
		textInfoT4 = new JTextField();
		textInfoT4.setColumns(10);
		textInfoT4.setBounds(10, 167, 240, 20);
		panel.add(textInfoT4);
		
		textInfoT5 = new JTextField();
		textInfoT5.setColumns(10);
		textInfoT5.setBounds(10, 200, 240, 20);
		panel.add(textInfoT5);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Fee (RM):");
		lblNewLabel_1.setBounds(10, 231, 128, 28);
		panel.add(lblNewLabel_1);
		
		textFeeT = new JTextField();
		textFeeT.setColumns(10);
		textFeeT.setBounds(10, 270, 240, 20);
		panel.add(textFeeT);
		
		JButton btnUpdateT = new JButton("UPDATE");
		btnUpdateT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t1 = textInfoT1.getText();
				String t2 = textInfoT2.getText();
				String t3 = textInfoT3.getText();
				String t4 = textInfoT4.getText();
				String t5 = textInfoT5.getText();
				String ft = textFeeT.getText();
				
				Tournament t = new Tournament();
				t.updateEventDesc(t1, t2, t3, t4, t5, ft);//passing value
				t.setVisible(true);
				dispose();
			}
		});
		btnUpdateT.setBounds(70, 333, 113, 37);
		panel.add(btnUpdateT);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 153, 153));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(524, 0, 260, 411);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPractice = new JLabel("Practice");
		lblPractice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPractice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPractice.setBounds(85, 11, 87, 28);
		panel_2.add(lblPractice);
		
		JButton btnUpdateP = new JButton("UPDATE");
		btnUpdateP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String p1 = textInfoP1.getText();
				String p2 = textInfoP2.getText();
				String p3 = textInfoP3.getText();
				String p4 = textInfoP4.getText();
				String p5 = textInfoP5.getText();
				String fp = textFeeP.getText();
				
				Practice p = new Practice();
				p.updateEventDesc(p1, p2, p3, p4, p5, fp);//passing value
				p.setVisible(true);
				dispose();
			}
		});
		btnUpdateP.setBounds(80, 333, 113, 37);
		panel_2.add(btnUpdateP);
		
		JLabel lblInfo_1_1 = new JLabel("Info:");
		lblInfo_1_1.setBounds(10, 50, 87, 28);
		panel_2.add(lblInfo_1_1);
		
		textInfoP1 = new JTextField();
		textInfoP1.setColumns(10);
		textInfoP1.setBounds(10, 75, 246, 20);
		panel_2.add(textInfoP1);
		
		textInfoP2 = new JTextField();
		textInfoP2.setColumns(10);
		textInfoP2.setBounds(10, 106, 246, 20);
		panel_2.add(textInfoP2);
		
		textInfoP3 = new JTextField();
		textInfoP3.setColumns(10);
		textInfoP3.setBounds(10, 137, 246, 20);
		panel_2.add(textInfoP3);
		
		textInfoP4 = new JTextField();
		textInfoP4.setColumns(10);
		textInfoP4.setBounds(10, 168, 246, 20);
		panel_2.add(textInfoP4);
		
		textInfoP5 = new JTextField();
		textInfoP5.setColumns(10);
		textInfoP5.setBounds(10, 199, 246, 20);
		panel_2.add(textInfoP5);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Registration Fee (RM):");
		lblNewLabel_1_1_1.setBounds(10, 230, 128, 28);
		panel_2.add(lblNewLabel_1_1_1);
		
		textFeeP = new JTextField();
		textFeeP.setColumns(10);
		textFeeP.setBounds(10, 265, 246, 20);
		panel_2.add(textFeeP);
		
		btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Employees e = new Employees();
				e.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(169, 2, 87, 37);
		panel_2.add(btnBack);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 153, 102));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(259, 0, 266, 411);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFriendly = new JLabel("Friendly");
		lblFriendly.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFriendly.setHorizontalAlignment(SwingConstants.CENTER);
		lblFriendly.setBounds(89, 11, 87, 28);
		panel_1.add(lblFriendly);
		
		JLabel lblInfo_1 = new JLabel("Info:");
		lblInfo_1.setBounds(10, 50, 87, 28);
		panel_1.add(lblInfo_1);
		
		textInfoF1 = new JTextField();
		textInfoF1.setColumns(10);
		textInfoF1.setBounds(10, 72, 246, 20);
		panel_1.add(textInfoF1);
		
		textInfoF2 = new JTextField();
		textInfoF2.setColumns(10);
		textInfoF2.setBounds(10, 103, 246, 20);
		panel_1.add(textInfoF2);
		
		textInfoF3 = new JTextField();
		textInfoF3.setColumns(10);
		textInfoF3.setBounds(10, 134, 246, 20);
		panel_1.add(textInfoF3);
		
		textInfoF4 = new JTextField();
		textInfoF4.setColumns(10);
		textInfoF4.setBounds(10, 165, 246, 20);
		panel_1.add(textInfoF4);
		
		textInfoF5 = new JTextField();
		textInfoF5.setColumns(10);
		textInfoF5.setBounds(10, 196, 246, 20);
		panel_1.add(textInfoF5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Registration Fee (RM):");
		lblNewLabel_1_1.setBounds(10, 227, 128, 28);
		panel_1.add(lblNewLabel_1_1);
		
		textFeeF = new JTextField();
		textFeeF.setColumns(10);
		textFeeF.setBounds(10, 266, 246, 20);
		panel_1.add(textFeeF);
		
		JButton btnUpdateF = new JButton("UPDATE");
		btnUpdateF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String f1 = textInfoF1.getText();
				String f2 = textInfoF2.getText();
				String f3 = textInfoF3.getText();
				String f4 = textInfoF4.getText();
				String f5 = textInfoF5.getText();
				String ff = textFeeF.getText();
				
				Friendly f = new Friendly();
				f.updateEventDesc(f1, f2, f3, f4, f5, ff);//passing value
				f.setVisible(true);
				dispose();
			}
		});
		btnUpdateF.setBounds(74, 331, 113, 37);
		panel_1.add(btnUpdateF);
	}

}
