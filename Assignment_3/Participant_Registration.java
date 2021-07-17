package Assignment_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Participant_Registration extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAge;
	private JTextField textTeamName;
	private JTable table;
	private JTextField textRegistration;
	private JTextField textTotalPrice;
	DefaultTableModel model;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Participant_Registration frame = new Participant_Registration();
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
	public Participant_Registration() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 204));
		panel.setBounds(0, 0, 850, 25);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblExit = new JLabel("X");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					Participant_Registration.this.dispose();
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
		lblExit.setBounds(825, 0, 25, 25);
		panel.add(lblExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 153));
		panel_1.setBounds(0, 23, 850, 566);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblParticipant_Registration = new JLabel("PARTICIPANT REGISTRATION");
		lblParticipant_Registration.setForeground(new Color(102, 0, 0));
		lblParticipant_Registration.setHorizontalAlignment(SwingConstants.CENTER);
		lblParticipant_Registration.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblParticipant_Registration.setBounds(236, 11, 325, 30);
		panel_1.add(lblParticipant_Registration);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 204, 153));
		panel_2.setBounds(27, 60, 334, 401);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 140, 30);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Team Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 52, 140, 30);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 93, 140, 30);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 134, 140, 30);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Number Of Participants");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 175, 140, 30);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Type Of Event");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(10, 220, 140, 30);
		panel_2.add(lblNewLabel_1_1_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textName.setBounds(160, 12, 160, 30);
		panel_2.add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textAge.setColumns(10);
		textAge.setBounds(160, 134, 160, 30);
		panel_2.add(textAge);
		
		JComboBox comboGender = new JComboBox();
		comboGender.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboGender.setModel(new DefaultComboBoxModel(new String[] {"Select Option", "Male", "Female"}));
		comboGender.setBounds(160, 94, 160, 30);
		panel_2.add(comboGender);
		
		textTeamName = new JTextField();
		textTeamName.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textTeamName.setColumns(10);
		textTeamName.setBounds(160, 53, 160, 30);
		panel_2.add(textTeamName);
		
		JComboBox comboNumParti = new JComboBox();
		comboNumParti.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboNumParti.setModel(new DefaultComboBoxModel(new String[] {"Select Option", "5", "10", "15", "20"}));
		comboNumParti.setBounds(160, 176, 160, 30);
		panel_2.add(comboNumParti);
		
		JComboBox comboEventType = new JComboBox();
		comboEventType.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboEventType.setModel(new DefaultComboBoxModel(new String[] {"Select Option", "Tournament", "Friendly", "Practice"}));
		comboEventType.setBounds(160, 221, 160, 30);
		panel_2.add(comboEventType);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Day Register");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(10, 261, 140, 30);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		textRegistration = new JTextField();
		textRegistration.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textRegistration.setColumns(10);
		textRegistration.setBounds(160, 303, 160, 30);
		panel_2.add(textRegistration);
		
		JComboBox comboDay = new JComboBox();
		comboDay.setModel(new DefaultComboBoxModel(new String[] {"Select Option", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}));
		comboDay.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboDay.setBounds(160, 262, 160, 30);
		panel_2.add(comboDay);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Registration Fee (RM)");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(10, 301, 140, 30);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		textTotalPrice = new JTextField();
		textTotalPrice.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textTotalPrice.setColumns(10);
		textTotalPrice.setBounds(160, 344, 160, 30);
		panel_2.add(textTotalPrice);
		
		JButton btnTotalPrice = new JButton("Total Price (RM)");
		btnTotalPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double registration, disc;
				int quantity;
				try {
					if (comboDay.getSelectedItem().equals("Friday") || comboDay.getSelectedItem().equals("Saturday")) {
						registration = Double.parseDouble(textRegistration.getText());
						quantity = Integer.parseInt((String) comboNumParti.getSelectedItem());
						disc = 0.10;
						
						double TotalPrice = (registration * quantity) - (registration * quantity * disc);
						textTotalPrice.setText(Double.toString(TotalPrice));
					}
					else {
						registration = Double.parseDouble(textRegistration.getText());
						quantity = Integer.parseInt((String) comboNumParti.getSelectedItem());
						disc = 0.10;
						
						double TotalPrice = (registration * quantity);
						textTotalPrice.setText(Double.toString(TotalPrice));
					}
				
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
				
			}
		});
		btnTotalPrice.setBounds(10, 343, 140, 30);
		panel_2.add(btnTotalPrice);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 204, 153));
		panel_3.setBounds(400, 60, 417, 401);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 397, 311);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Name","Team Name", "Gender", "Age", "Number Of Participant", "Event Type", "Day Register", "Registration Fee (RM)", "Total Price (RM)"
				}
			));
		scrollPane.setViewportView(table);
		
		JButton btnUpdate_1 = new JButton("UPLOAD");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("C:\\Users\\HP USER\\Desktop\\Athirah\\SEMESTER 2\\PROGRAMMING 2\\textFolder\\Registration.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n___________________________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnUpdate_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnUpdate_1.setBounds(65, 345, 100, 45);
		panel_3.add(btnUpdate_1);
		
		JButton btnPrint_1 = new JButton("PRINT");
		btnPrint_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnPrint_1.setBounds(251, 345, 100, 45);
		panel_3.add(btnPrint_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 204, 153));
		panel_4.setBounds(147, 487, 565, 68);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textName.getText(),
						textTeamName.getText(),
						comboGender.getSelectedItem(),
						textAge.getText(),
						comboNumParti.getSelectedItem(),
						comboEventType.getSelectedItem(),
						comboDay.getSelectedItem(),
						textRegistration.getText(),
						textTotalPrice.getText(),
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Partipant Information Update confirmed", "Sum With Us Management System",
								JOptionPane.OK_OPTION);
					}
				}

			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAdd.setBounds(10, 11, 100, 45);
		panel_4.add(btnAdd);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					model.setValueAt(textName.getText(),i,0);
			    	model.setValueAt(textTeamName.getText(),i,1);
			    	model.setValueAt(comboGender.getSelectedItem(),i,2);
			    	model.setValueAt(textAge.getText(),i,3);
			    	model.setValueAt(comboNumParti.getSelectedItem(),i,4);
			    	model.setValueAt(comboEventType.getSelectedItem(), i, 5);
			    	model.setValueAt(comboDay.getSelectedItem(), i, 6);
			    	model.setValueAt(textRegistration.getText(), i, 7);
			    	JOptionPane.showMessageDialog(null, "Update Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please select a row first!");
				}
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnUpdate.setBounds(120, 11, 100, 45);
		panel_4.add(btnUpdate);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textName.setText("");
				textTeamName.setText("");
				comboGender.setSelectedItem("Select Option");
				textAge.setText("");
				comboNumParti.setSelectedItem("Select Option");
				comboEventType.setSelectedItem("Select Option");
				comboDay.setSelectedItem("Select Option");
				textRegistration.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnReset.setBounds(230, 11, 100, 45);
		panel_4.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = table.getSelectedRow();
				if (i >= 0) {
				model.removeRow(i);
				JOptionPane.showMessageDialog(null, "Delete Successful");
			}
			else {
				JOptionPane.showMessageDialog(null, "Select a row to delete");
			}
			}
		});
		btnDelete.setBounds(340, 11, 100, 45);
		panel_4.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Membership Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}

			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnExit.setBounds(450, 11, 100, 45);
		panel_4.add(btnExit);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		panel_1.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Event Description");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Event Description");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Event_Description Event = new Event_Description();
				Event.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 552, 228, -76);
		panel_1.add(label);
	}
		
	}

