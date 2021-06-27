package ASSIGNMENT3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class StudentRegistration extends JFrame {  //2.1 GUI StudentRegistration

	private JPanel contentPane;
	private JFrame frame;
	private JTextField Name;
	private JTextField IcNum;
	private JTextField EmailAddress;
	private JTextField ContactNum;
	private JTable table;
	private JTextField Address;
	private JTextField Payment;
	private JTextField Subjects;
	private JTextField Noofsubs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRegistration frame = new StudentRegistration();
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
	public StudentRegistration() {   //constructor with no argument
		super("STUDENT REGISTRATION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1438, 788);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1370, 738);
		panel.setForeground(new Color(0, 153, 102));
		panel.setBackground(new Color(204, 204, 255));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(102, 51, 153)));
		contentPane.add(panel, "2, 2, fill, fill");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 153, 102));
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(102, 51, 153)));
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(24, 11, 1316, 75);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION");
		lblNewLabel.setBounds(499, 22, 445, 30);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 32));
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(new Color(0, 153, 102));
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(102, 51, 153)));
		panel_1_1.setBackground(new Color(204, 204, 255));
		panel_1_1.setBounds(10, 97, 525, 403);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("NAME ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(49, 29, 122, 22);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("IC NUMBER ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(49, 62, 122, 22);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("EMAIL ADDRESS");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(49, 95, 175, 22);
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("CONTACT NUMBER ");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(49, 128, 224, 22);
		panel_1_1.add(lblNewLabel_1_3);
		
		Name = new JTextField();
		Name.setBounds(226, 27, 270, 22);
		panel_1_1.add(Name);
		Name.setColumns(10);
		
		IcNum = new JTextField();
		IcNum.setColumns(10);
		IcNum.setBounds(226, 64, 270, 22);
		panel_1_1.add(IcNum);
		
		EmailAddress = new JTextField();
		EmailAddress.setColumns(10);
		EmailAddress.setBounds(226, 97, 270, 22);
		panel_1_1.add(EmailAddress);
		
		ContactNum = new JTextField();
		ContactNum.setColumns(10);
		ContactNum.setBounds(226, 130, 270, 22);
		panel_1_1.add(ContactNum);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("GENDER");
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_3_1.setBounds(49, 194, 224, 22);
		panel_1_1.add(lblNewLabel_1_3_1);
		
		JComboBox Gender = new JComboBox();
		Gender.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Gender.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "FEMALE", "MALE"}));
		Gender.setBounds(226, 195, 270, 22);
		panel_1_1.add(Gender);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("ADDRESS");
		lblNewLabel_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_3_2.setBounds(49, 161, 224, 22);
		panel_1_1.add(lblNewLabel_1_3_2);
		
		Address = new JTextField();
		Address.setColumns(10);
		Address.setBounds(226, 163, 270, 22);
		panel_1_1.add(Address);
		
		Payment = new JTextField();
		Payment.setColumns(10);
		Payment.setBounds(226, 339, 270, 22);
		panel_1_1.add(Payment);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("FORM");
		lblNewLabel_1_3_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_3_1_2.setBounds(49, 227, 224, 22);
		panel_1_1.add(lblNewLabel_1_3_1_2);
		
		JComboBox Form = new JComboBox();
		Form.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "FORM 3", "FORM 5"}));
		Form.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Form.setBounds(226, 227, 270, 22);
		panel_1_1.add(Form);
		
		JButton btnNewButton_1 = new JButton("PAYMENT");  
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //calculating the payment of a student
				//declaring variables
				int subs;
				double payment;
				try {
					subs = Integer.parseInt(Noofsubs.getText());
					
					payment =(80*subs);
					
					Payment.setText(Double.toString(payment));

			}	catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number!"); }
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(49, 338, 142, 23);
		panel_1_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_3_1_2_1 = new JLabel("SUBJECTS (BM/BI/MATH/SC)");
		lblNewLabel_1_3_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_3_1_2_1.setBounds(49, 260, 263, 22);
		panel_1_1.add(lblNewLabel_1_3_1_2_1);
		
		Subjects = new JTextField();
		Subjects.setColumns(10);
		Subjects.setBounds(311, 260, 183, 22);
		panel_1_1.add(Subjects);
		
		JLabel lblNewLabel_1_3_1_2_1_1 = new JLabel("NUMBER OF SUBJECTS ");
		lblNewLabel_1_3_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_3_1_2_1_1.setBounds(49, 291, 263, 22);
		panel_1_1.add(lblNewLabel_1_3_1_2_1_1);
		
		Noofsubs = new JTextField();
		Noofsubs.setColumns(10);
		Noofsubs.setBounds(311, 294, 183, 22);
		panel_1_1.add(Noofsubs);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setForeground(new Color(0, 153, 102));
		panel_1_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(102, 51, 153)));
		panel_1_1_1.setBackground(new Color(204, 204, 255));
		panel_1_1_1.setBounds(41, 575, 1302, 107);
		panel.add(panel_1_1_1);
		
		JButton btnNewButton = new JButton("ADD RECORD");  // add record of students in the table
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						Name.getText(),
						IcNum.getText(),
						EmailAddress.getText(),
						ContactNum.getText(),
						Address.getText(),
						Gender.getSelectedItem(),
						Form.getSelectedIndex(),
						Subjects.getText(),
						Noofsubs.getText(),
						Payment.getText(),
							
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, " Student Information Update confirmed", "Student Registration",
								JOptionPane.OK_OPTION);
					}
				}
			}

		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(10, 37, 160, 38);
		panel_1_1_1.add(btnNewButton);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					int i = table.getSelectedRow();
					if(i>=0) {
						model.setValueAt(Name.getText(),i,0);
				    	model.setValueAt(IcNum.getText(),i,1);
				    	model.setValueAt(EmailAddress.getText(),i,2);
				    	model.setValueAt(ContactNum.getText(),i,3);
				    	model.setValueAt(Address.getText(),i,4);
				    	model.setValueAt(Gender.getSelectedItem(), i, 5);
				    	model.setValueAt(Form, i, 6);
				    	model.setValueAt(Subjects, i, 7);
				    	model.setValueAt(Noofsubs, i, 8);
						JOptionPane.showMessageDialog(null, "Successfully Edited"); }
					
					else
					{
						JOptionPane.showMessageDialog(null, "Please select a row first!");
					}
				}
			});

		btnEdit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnEdit.setBounds(213, 37, 160, 38);
		panel_1_1_1.add(btnEdit);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Student Registration", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Student Registration", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDelete.setBounds(422, 37, 153, 38);
		panel_1_1_1.add(btnDelete);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Name.setText(" ");
				IcNum.setText(" ");
				EmailAddress.setText(" ");
				ContactNum.setText(" ");
				Address.setText(" ");
				Gender.setSelectedItem("SELECT");
				Form.setSelectedItem("SELECT");
				Subjects.setText(" ");
				Noofsubs.setText(" ");
				Payment.setText(" ");
				}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnReset.setBounds(614, 37, 139, 38);
		panel_1_1_1.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Student Registration", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnExit.setBounds(1128, 37, 127, 38);
		panel_1_1_1.add(btnExit);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    try {
					
					File file = new File("C:\\Users\\Sharvetha\\Documents\\2.3 File IO\\STUDENT REGISTRATION-HOME TUITION CENTRE.txt");
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
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPrint.setBounds(786, 37, 146, 38);
		panel_1_1_1.add(btnPrint);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mr = new MainFrame();
				mr.setVisible(true);
				dispose();
			}
		});
		btnHome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnHome.setBounds(963, 37, 146, 38);
		panel_1_1_1.add(btnHome);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setForeground(new Color(0, 153, 102));
		panel_1_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(102, 51, 153)));
		panel_1_1_2.setBackground(new Color(204, 204, 255));
		panel_1_1_2.setBounds(545, 97, 815, 409);
		panel.add(panel_1_1_2);
		panel_1_1_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 795, 383);
		panel_1_1_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "IC NUMBER", "EMAIL ADDRESS", "CONTACT NUMBER", "ADDRESS", "GENDER", "FORM", "SUBJECTS", "NO.OF SUBJECTS", "PAYMENT"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(105);
		table.getColumnModel().getColumn(1).setPreferredWidth(88);
		table.getColumnModel().getColumn(2).setPreferredWidth(96);
		table.getColumnModel().getColumn(3).setPreferredWidth(106);
		table.getColumnModel().getColumn(4).setPreferredWidth(106);
		scrollPane.setViewportView(table);
		

	}
}
