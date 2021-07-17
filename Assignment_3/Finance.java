package Assignment_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textUtility;
	private JTextField textAdvertisement;
	private JTextField textPrize;
	private JTextField textEmployeeQ;
	private JTextField textEmployeeS;
	private JTextField textTotalSalary;
	private JTextField textTotalBudget;
	private JTextField textParticipantQ;
	private JTextField textRegistration;
	private JTextField textTotalIncome;
	private JTextField textNetProfit;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 204, 102));
		panel.setBounds(0, 0, 829, 611);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 204, 153));
		panel_1.setBounds(22, 67, 315, 314);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Utility Fee (RM)");
		lblNewLabel_1.setBounds(10, 11, 146, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Advertisement Fee (RM)");
		lblNewLabel_1_1.setBounds(10, 53, 146, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Prize provide (RM)");
		lblNewLabel_1_1_1.setBounds(10, 94, 146, 30);
		panel_1.add(lblNewLabel_1_1_1);
		
		textUtility = new JTextField();
		textUtility.setBounds(166, 11, 139, 30);
		panel_1.add(textUtility);
		textUtility.setColumns(10);
		
		textAdvertisement = new JTextField();
		textAdvertisement.setColumns(10);
		textAdvertisement.setBounds(166, 53, 139, 30);
		panel_1.add(textAdvertisement);
		
		textPrize = new JTextField();
		textPrize.setColumns(10);
		textPrize.setBounds(166, 94, 139, 30);
		panel_1.add(textPrize);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Employee Quantity");
		lblNewLabel_1_1_1_1.setBounds(10, 135, 146, 30);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Employee Salary (RM)");
		lblNewLabel_1_1_1_2.setBackground(new Color(51, 204, 153));
		lblNewLabel_1_1_1_2.setBounds(10, 176, 146, 30);
		panel_1.add(lblNewLabel_1_1_1_2);
		
		textEmployeeQ = new JTextField();
		textEmployeeQ.setColumns(10);
		textEmployeeQ.setBounds(166, 135, 139, 30);
		panel_1.add(textEmployeeQ);
		
		textEmployeeS = new JTextField();
		textEmployeeS.setColumns(10);
		textEmployeeS.setBounds(166, 176, 139, 30);
		panel_1.add(textEmployeeS);
		
		textTotalSalary = new JTextField();
		textTotalSalary.setColumns(10);
		textTotalSalary.setBounds(166, 217, 139, 30);
		panel_1.add(textTotalSalary);
		
		textTotalBudget = new JTextField();
		textTotalBudget.setColumns(10);
		textTotalBudget.setBounds(166, 258, 139, 30);
		panel_1.add(textTotalBudget);
		
		JButton btnTotalSalary = new JButton("Total Salary (RM)");
		btnTotalSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double salary;
				int employeeQuantity;
				try {
					employeeQuantity=Integer.parseInt(textEmployeeQ.getText());
					salary=Double.parseDouble(textEmployeeS.getText());
					
					double TotalSalary = employeeQuantity * salary;
					textTotalSalary.setText(Double.toString(TotalSalary));
				
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnTotalSalary.setBounds(10, 217, 146, 30);
		panel_1.add(btnTotalSalary);
		
		JButton btnTotalBudget = new JButton("Total Budget (RM)");
		btnTotalBudget.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double utility, advertisement, prize, employeeSalary;
				int employeeQuantity;
				try {
					employeeQuantity=Integer.parseInt(textEmployeeQ.getText());
					employeeSalary=Double.parseDouble(textEmployeeS.getText());
					utility=Integer.parseInt(textUtility.getText());
					prize=Integer.parseInt(textPrize.getText());
					advertisement=Integer.parseInt(textAdvertisement.getText());
					
					double TotalBudget = (employeeQuantity * employeeSalary) + utility + prize + advertisement;
					textTotalBudget.setText(Double.toString(TotalBudget));
				
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnTotalBudget.setBounds(10, 258, 146, 30);
		panel_1.add(btnTotalBudget);
		
		JLabel lblNewLabel = new JLabel("FINANCE DETAIL");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(273, 11, 233, 42);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 204, 153));
		panel_2.setBounds(347, 67, 472, 416);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 452, 313);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Utility", "Advertisement", "Prize", "Employee Quantity", "Employee Salary", "Total Salary", "Total Budget", "Participant Quantity", "Registration", "Total Income", "Net Profit"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("C:\\Users\\HP USER\\Desktop\\Athirah\\SEMESTER 2\\PROGRAMMING 2\\textFolder\\Finance.txt");
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
		btnUpload.setBounds(78, 348, 90, 40);
		panel_2.add(btnUpload);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setBounds(320, 348, 89, 40);
		panel_2.add(btnPrint);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(51, 204, 153));
		panel_3.setBounds(347, 509, 427, 75);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textUtility.setText("");
				textAdvertisement.setText("");
				textPrize.setText("");
				textEmployeeQ.setText("");
				textEmployeeS.setText("");
				textTotalSalary.setText("");
				textTotalBudget.setText("");
				textParticipantQ.setText("");
				textRegistration.setText("");
				textTotalIncome.setText("");
				textNetProfit.setText("");
			}
		});
		btnReset.setBounds(173, 20, 99, 40);
		panel_3.add(btnReset);
		
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
		btnExit.setBounds(309, 20, 99, 40);
		panel_3.add(btnExit);
		
		JButton btnAddRecord = new JButton("ADD RECORD");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textUtility.getText(),
						textAdvertisement.getText(),
						textPrize.getText(),
						textEmployeeQ.getText(),
						textEmployeeS.getText(),
						textTotalSalary.getText(),
						textTotalBudget.getText(),
						textParticipantQ.getText(),
						textRegistration.getText(),
						textTotalIncome.getText(),
						textNetProfit.getText(),
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Finance Information Update confirmed", "Sum With Us Management System",
								JOptionPane.OK_OPTION);
					}
				}

			}
		});
		btnAddRecord.setBounds(31, 20, 108, 40);
		panel_3.add(btnAddRecord);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(51, 204, 153));
		panel_4.setBounds(22, 406, 303, 178);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Participant Quantity");
		lblNewLabel_1_2.setBounds(10, 11, 146, 30);
		panel_4.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Registration Fee (RM)");
		lblNewLabel_1_3.setBounds(10, 52, 146, 30);
		panel_4.add(lblNewLabel_1_3);
		
		JButton btnTotalIncome = new JButton("Total Income (RM)");
		btnTotalIncome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double registration;
				int participantQuantity;
				try {
					participantQuantity=Integer.parseInt(textParticipantQ.getText());
					registration=Double.parseDouble(textRegistration.getText());
					
					
					double TotalIncome = participantQuantity * registration;
					textTotalIncome.setText(Double.toString(TotalIncome));
				
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnTotalIncome.setBounds(10, 93, 146, 30);
		panel_4.add(btnTotalIncome);
		
		JButton btnNetProfit = new JButton("Net Profit (RM)");
		btnNetProfit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double utility, advertisement, prize, employeeSalary, registration;
				int employeeQuantity, participantQuantity;
				try {
					employeeQuantity=Integer.parseInt(textEmployeeQ.getText());
					employeeSalary=Double.parseDouble(textEmployeeS.getText());
					utility=Integer.parseInt(textUtility.getText());
					prize=Integer.parseInt(textPrize.getText());
					advertisement=Integer.parseInt(textAdvertisement.getText());
					participantQuantity=Integer.parseInt(textParticipantQ.getText());
					registration=Double.parseDouble(textRegistration.getText());
					
					double TotalBudget = (employeeQuantity * employeeSalary) + utility + prize + advertisement;
					textTotalBudget.setText(Double.toString(TotalBudget));
					double TotalIncome = participantQuantity * registration;
					textTotalIncome.setText(Double.toString(TotalIncome));
					double NetProfit = (TotalIncome - TotalBudget);
					textNetProfit.setText(Double.toString(NetProfit));
				
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNetProfit.setBounds(10, 134, 146, 30);
		panel_4.add(btnNetProfit);
		
		textParticipantQ = new JTextField();
		textParticipantQ.setColumns(10);
		textParticipantQ.setBounds(164, 11, 129, 30);
		panel_4.add(textParticipantQ);
		
		textRegistration = new JTextField();
		textRegistration.setColumns(10);
		textRegistration.setBounds(164, 52, 129, 30);
		panel_4.add(textRegistration);
		
		textTotalIncome = new JTextField();
		textTotalIncome.setColumns(10);
		textTotalIncome.setBounds(164, 93, 129, 30);
		panel_4.add(textTotalIncome);
		
		textNetProfit = new JTextField();
		textNetProfit.setColumns(10);
		textNetProfit.setBounds(164, 134, 129, 30);
		panel_4.add(textNetProfit);
	}
}
