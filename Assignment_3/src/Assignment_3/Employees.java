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
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employees extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textID;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employees frame = new Employees();
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
	public Employees() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 204));
		panel.setBounds(0, 0, 750, 25);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblExit = new JLabel("X");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					Employees.this.dispose();
			}
		});
		lblExit.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setBounds(725, 0, 25, 25);
		panel.add(lblExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 153, 255));
		panel_1.setBounds(0, 24, 750, 416);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEES");
		lblNewLabel.setForeground(new Color(0, 0, 51));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(259, 11, 270, 30);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(22, 113, 322, 185);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Department");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 11, 70, 30);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 52, 70, 30);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ID");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 93, 70, 30);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Salary");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 134, 70, 30);
		panel_2.add(lblNewLabel_1_3);
		
		textName = new JTextField();
		textName.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textName.setColumns(10);
		textName.setBounds(113, 53, 170, 30);
		panel_2.add(textName);
		
		textID = new JTextField();
		textID.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textID.setColumns(10);
		textID.setBounds(113, 94, 170, 30);
		panel_2.add(textID);
		
		JComboBox comboBoxDepartment = new JComboBox();
		comboBoxDepartment.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBoxDepartment.setModel(new DefaultComboBoxModel(new String[] {"Select Option", "Operations Management", "Marketing", "Finance", "Sales", "Human Resource", "Purchase"}));
		comboBoxDepartment.setBounds(113, 15, 170, 26);
		panel_2.add(comboBoxDepartment);
		
		JComboBox comboBoxSalary = new JComboBox();
		comboBoxSalary.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBoxSalary.setModel(new DefaultComboBoxModel(new String[] {"Select Option", "RM 1200", "RM 1400", "RM 1600", "RM 1800", "RM 2000"}));
		comboBoxSalary.setBounds(113, 138, 170, 26);
		panel_2.add(comboBoxSalary);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(390, 52, 338, 246);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 318, 171);
		panel_3.add(scrollPane);
		
		//2.3 File IO
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Department","Name", "Employee ID", "Salary (RM)"
				}
			));
		scrollPane.setViewportView(table);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				comboBoxDepartment.setToolTipText(model.getValueAt(i, 0).toString());
				textName.setText(model.getValueAt(i, 1).toString());
				textID.setText(model.getValueAt(i, 2).toString());
				comboBoxSalary.setToolTipText(model.getValueAt(i, 3).toString());
			}
		});
		model = new DefaultTableModel();
		Object[] column = {"Department", "Name", "ID", "Salary"};
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					File file = new File("C:\\Users\\HP USER\\Desktop\\Athirah\\SEMESTER 2\\PROGRAMMING 2\\textFolder\\EmployeeList.txt");
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
		btnUpload.setBounds(112, 192, 105, 43);
		panel_3.add(btnUpload);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(22, 318, 705, 65);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBoxDepartment.getSelectedItem().equals("") || textName.getText().equals("") || textID.getText().equals("") || comboBoxSalary.getSelectedItem().equals("")) {
					JOptionPane.showMessageDialog(null, "Please insert complete information");
				}
				else {
					row[0] = comboBoxDepartment.getSelectedItem();
					row[1] = textName.getText();
					row[2] = textID.getText();
					row[3] = comboBoxSalary.getSelectedItem();
					model.addRow(row);
					
					comboBoxDepartment.setSelectedItem("Select Option");
					textName.setText("");
					textID.setText("");
					comboBoxSalary.setSelectedItem("Select Option");
					JOptionPane.showMessageDialog(null, "Save Successful");
				}
			}
		});
		btnAdd.setBounds(10, 11, 105, 43);
		panel_4.add(btnAdd);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = table.getSelectedRow();
				if (i >= 0) {
					model.setValueAt(comboBoxDepartment.getSelectedItem(), i, 0);
					model.setValueAt(textName.getText(), i, 1);
					model.setValueAt(textID.getText(), i, 2);
					model.setValueAt(comboBoxSalary.getSelectedItem(), i, 3);
					JOptionPane.showMessageDialog(null, "Update Succesful");
				}
				else {
					JOptionPane.showMessageDialog(null, "Select a row to update");
				}
			}
		});
		btnUpdate.setBounds(157, 11, 105, 43);
		panel_4.add(btnUpdate);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBoxDepartment.setSelectedItem("Select Option");
				textName.setText("");
				textID.setText("");
				comboBoxSalary.setSelectedItem("Select Option");
			}
		});
		btnReset.setBounds(308, 11, 105, 43);
		panel_4.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
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
		btnDelete.setBounds(451, 11, 105, 43);
		panel_4.add(btnDelete);
		
		JButton btnFinance = new JButton("FINANCE");
		btnFinance.setBounds(590, 11, 105, 43);
		panel_4.add(btnFinance);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginAdmin AdminLogin = new LoginAdmin();
				AdminLogin.setVisible(true);
			}
		});
		btnBack.setBounds(22, 17, 105, 43);
		panel_1.add(btnBack);
	}
}
