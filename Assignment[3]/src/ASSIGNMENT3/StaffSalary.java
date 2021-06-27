package ASSIGNMENT3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class StaffSalary extends JFrame {   //2.1 GUI StaffSalary

	private JPanel contentPane;
	JTextField Name;
	private JTextField StaffID;
	private JTextField WrkHrs;
	private JTextField Increment;
	private JTextField TotalSal;
	private JTable table;
	private JTextField TtlSal;
	private JTextField TotalSalTextField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffSalary frame = new StaffSalary();
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
	public StaffSalary() {  //constructor with no argument
		super("STAFF SALARY DETAILS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 664);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 910, 603);
		contentPane.add(panel);
		
		JLabel lblStaff = new JLabel("");
		lblStaff.setBounds(172, 0, 420, 147);
		Image img = new ImageIcon(this.getClass().getResource("/Staff(3).png")).getImage();
	    panel.setLayout(null);
	    lblStaff.setIcon(new ImageIcon(img));
		panel.add(lblStaff);
		
		JLabel lblNewLabel = new JLabel("STAFF ID");
		lblNewLabel.setBounds(42, 168, 96, 29);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(42, 199, 96, 29);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(lblName);
		
		JLabel lblWorkingHours = new JLabel("WORKING HOURS");
		lblWorkingHours.setBounds(42, 234, 146, 29);
		lblWorkingHours.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(lblWorkingHours);
		
		StaffID = new JTextField();
		StaffID.setBounds(201, 173, 108, 20);
		panel.add(StaffID);
		StaffID.setColumns(10);
		
		Name = new JTextField();
		Name.setBounds(201, 204, 108, 20);
		Name.setColumns(10);
		panel.add(Name);
		
		WrkHrs = new JTextField();
		WrkHrs.setBounds(201, 239, 108, 20);
		WrkHrs.setColumns(10);
		panel.add(WrkHrs);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 151, 309, 204);
		panel_1.setBackground(new Color(240, 248, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("INCREMENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {   //calculating increment
				double wrkhours;
				double increment;
				try {
					wrkhours = Integer.parseInt(WrkHrs.getText());
					
					increment =((15*wrkhours)*5)/100;
					
					Increment.setText(Double.toString(increment));

			}	catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number!"); }
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(28, 126, 141, 23);
		panel_1.add(btnNewButton);
		
		Increment = new JTextField();
		Increment.setColumns(10);
		Increment.setBounds(191, 127, 108, 20);
		panel_1.add(Increment);
		
		JButton btnTotalSalary = new JButton("TOTAL SALARY");
		btnTotalSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //calculating total salary
				double wrkhours;
				double salary;
				try {
					wrkhours = Integer.parseInt(WrkHrs.getText());
					
					salary =(15*wrkhours)+(((15*wrkhours)*5)/100);
					
					TotalSal.setText(Double.toString(salary));

			}	catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number!"); }
			}
		});
		btnTotalSalary.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnTotalSalary.setBounds(28, 163, 141, 23);
		panel_1.add(btnTotalSalary);
		
		TotalSal = new JTextField();
		TotalSal.setColumns(10);
		TotalSal.setBounds(191, 164, 108, 20);
		panel_1.add(TotalSal);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(329, 151, 571, 354);
		panel_1_1.setBackground(new Color(240, 248, 255));
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 551, 332);
		panel_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STAFF ID", "NAME", "WORKING HOURS", "INCREMENT(RM)", "SALARY(RM)"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(105);
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 248, 255));
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(148, 0, 211)));
		panel_2.setBounds(10, 526, 890, 66);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAddRecord = new JButton("ADD RECORD");
		btnAddRecord.setBackground(new Color(230, 230, 250));
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						StaffID.getText(),
						Name.getText(),
						WrkHrs.getText(),
						Increment.getText(),
						TotalSal.getText(),							
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Staff Information Update confirmed", "Staff Section",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAddRecord.setBounds(10, 11, 139, 38);
		panel_2.add(btnAddRecord);
		btnAddRecord.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBackground(new Color(230, 230, 250));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Sum With Us Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Staff Section", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDelete.setBounds(305, 11, 125, 38);
		panel_2.add(btnDelete);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBackground(new Color(230, 230, 250));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffID.setText(" ");
				Name.setText(" ");
				WrkHrs.setText(" ");
				Increment.setText(" ");
				TotalSal.setText(" ");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnReset.setBounds(463, 11, 125, 38);
		panel_2.add(btnReset);
		
		JButton btnPrint = new JButton("PRINT");   //data export to notepad
		btnPrint.setBackground(new Color(230, 230, 250));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    try {
					
					File file = new File("C:\\Users\\Sharvetha\\Documents\\2.3 File IO\\STAFF SALARY DETAILS-HOME TUITION CENTRE.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
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
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnPrint.setBounds(609, 11, 125, 38);
		panel_2.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(230, 230, 250));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Staff Salary Details", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnExit.setBounds(755, 11, 125, 38);
		panel_2.add(btnExit);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.setBackground(new Color(230, 230, 250));
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					int i = table.getSelectedRow();
					if(i>=0) {
						model.setValueAt(StaffID.getText(),i,0);
						model.setValueAt(Name.getText(),i,0);
				    	model.setValueAt(WrkHrs.getText(),i,1);
				    	model.setValueAt(Increment.getText(),i,2);
				    	model.setValueAt(TotalSal.getText(),i,3);
						JOptionPane.showMessageDialog(null, "Successfully Edited");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Please select a row first!");
					}
				}
			});
		btnEdit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnEdit.setBounds(159, 11, 125, 38);
		panel_2.add(btnEdit);
		
		TtlSal = new JTextField();
		TtlSal.setColumns(10);
		TtlSal.setBounds(91, 408, 152, 23);
		panel.add(TtlSal);
		
		JButton btnNewButton_1 = new JButton("GO TO FINANCE");
		btnNewButton_1.setBounds(10, 474, 141, 41);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputText = TtlSal.getText();  // transfer data to finance class
				Finance1 f = new Finance1();
				f.TotalSalTextField.setText(inputText);
				f.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		JButton btnNewButton_2 = new JButton("TOTAL SALARY OF THE MONTH");
		btnNewButton_2.setBounds(42, 375, 260, 23);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double total = 0;
				for(int i=0 ; i<table.getRowCount() ; i++) 
				{
					double amount = Double.parseDouble((String) table.getValueAt(i, 4));
					total+=amount;
				}
				
				TtlSal.setText(String.valueOf(total));
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JButton btnNewButton_1_1 = new JButton("HOME");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mr = new MainFrame();
				mr.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1_1.setBounds(178, 474, 141, 41);
		panel.add(btnNewButton_1_1);
	}
}
