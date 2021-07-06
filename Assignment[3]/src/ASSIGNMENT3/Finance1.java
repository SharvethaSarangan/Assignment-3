package ASSIGNMENT3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Finance1 extends JFrame {  //2.1 GUI Finance
	
	String s = "" ;

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField stationary;
	private JTextField others;
	private JTextField books;
	private JTextField EXPENSESF3;
	private JTextField stationary_1;
	private JTextField others_1;
	private JTextField books_1;
	private JTextField EXPENSESF5;
	private JTextField BM;
	private JTextField BI;
	private JTextField MATH;
	private JTextField SC;
	private JTextField INCOMEF3;
	private JTextField BM_1;
	private JTextField BI_1;
	private JTextField MATH_1;
	private JTextField SC_1;
	private JTextField INCOMEF5;
	private JTextField overallinc;
	private JTextField overallexpenses;
	private JTextField overallnetprofit;
	private JTable table;
	JTextField TotalSalTextField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance1 frame = new Finance1();
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
	public Finance1() {    //constructor with no argument
		super("FINANCE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1111, 889);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblFinanceLogo = new JLabel("");
		lblFinanceLogo.setBounds(426, 11, 501, 89);
		Image img = new ImageIcon(this.getClass().getResource("/Finance(7).png")).getImage();  // insert image
	    contentPane.setLayout(null);
	    contentPane.setLayout(null);
	    lblFinanceLogo.setIcon(new ImageIcon(img));
		contentPane.add(lblFinanceLogo);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 224, 208));
		panel.setBounds(557, 111, 538, 174);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 139)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Total Salary of the Month (RM) :");
		lblNewLabel.setBackground(new Color(64, 224, 208));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 204, 44);
		panel.add(lblNewLabel);
		
		JLabel lblTotalIncomeOf = new JLabel("Total Income of the Month (RM) :");
		lblTotalIncomeOf.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTotalIncomeOf.setBounds(10, 79, 229, 44);
		panel.add(lblTotalIncomeOf);
		
		JLabel lblTotalExpensesOf = new JLabel("Total Expenses of the Month (RM)  :");
		lblTotalExpensesOf.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTotalExpensesOf.setBounds(10, 45, 229, 44);
		panel.add(lblTotalExpensesOf);
		
		JButton Total_1_1_1_1 = new JButton("CALCULATE");
		Total_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {    // Calculating overall expenses
				double booksexpenses,stationaryexpenses,otherexpenses;
				double booksexpenses1,stationaryexpenses1,otherexpenses1;
				double overalltotalexpenses;
		
				try {
					booksexpenses = Double.parseDouble(books.getText());
					stationaryexpenses = Double.parseDouble(stationary.getText());
					otherexpenses =Double.parseDouble(others.getText());
					booksexpenses1 = Double.parseDouble(books_1.getText());
					stationaryexpenses1 = Double.parseDouble(stationary_1.getText());
					otherexpenses1 =Double.parseDouble(others_1.getText());
					
					overalltotalexpenses =(booksexpenses)+(stationaryexpenses)+(otherexpenses)+(booksexpenses1)+(stationaryexpenses1)+(otherexpenses1);
					
					overallexpenses.setText(Double.toString(overalltotalexpenses));

			}	catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number!"); }
			}
		});
		Total_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 10));
		Total_1_1_1_1.setBounds(392, 56, 114, 27);
		panel.add(Total_1_1_1_1);
		
		overallinc = new JTextField();
		overallinc.setColumns(10);
		overallinc.setBounds(251, 92, 131, 20);
		panel.add(overallinc);
		
		overallexpenses = new JTextField();
		overallexpenses.setColumns(10);
		overallexpenses.setBounds(251, 58, 131, 20);
		panel.add(overallexpenses);
		
		JLabel lblNetProfitOf = new JLabel("Net Profit of the Month (RM) :");
		lblNetProfitOf.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNetProfitOf.setBounds(10, 110, 229, 44);
		panel.add(lblNetProfitOf);
		
		overallnetprofit = new JTextField();
		overallnetprofit.setColumns(10);
		overallnetprofit.setBounds(251, 123, 131, 20);
		panel.add(overallnetprofit);
		
		JButton Total_1_1_1_1_1 = new JButton("CALCULATE");
		Total_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  // calculating overall income of Home Tuition Centre
				double sub = 80.00;
				int BMsub;
				int BIsub;
				int MATHsub;
				int SCsub;
				int BMsub1;
				int BIsub1;
				int MATHsub1;
				int SCsub1;
				double OverallIncome;
				try {
					BMsub = Integer.parseInt(BM.getText());
					BIsub = Integer.parseInt(BI.getText());
					MATHsub =Integer.parseInt(MATH.getText());
					SCsub = Integer.parseInt(SC.getText());
					BMsub1 = Integer.parseInt(BM_1.getText());
					BIsub1 = Integer.parseInt(BI_1.getText());
					MATHsub1 =Integer.parseInt(MATH_1.getText());
					SCsub1 = Integer.parseInt(SC_1.getText());

					
					OverallIncome =(BMsub*sub)+(BIsub*sub)+(MATHsub*sub)+(SCsub*sub)+(BMsub1*sub)+(BIsub1*sub)+(MATHsub1*sub)+(SCsub1*sub);
					
					overallinc.setText(Double.toString(OverallIncome));

			}	catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number!"); }
			}
		});
		Total_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 10));
		Total_1_1_1_1_1.setBounds(392, 90, 114, 27);
		panel.add(Total_1_1_1_1_1);
		
		JButton Total_1_1_1_1_1_1 = new JButton("CALCULATE");
		Total_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double netprofit;
				double income, expenses ,salary;
				
				try {
					income = Double.parseDouble(overallinc.getText());
					expenses = Double.parseDouble(overallexpenses.getText());
					salary = Double.parseDouble(TotalSalTextField.getText());
					
					netprofit = income - (expenses+salary);  
					overallnetprofit.setText(Double.toString(netprofit));

			}	catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number!"); }
				
			}
		});
		Total_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 10));
		Total_1_1_1_1_1_1.setBounds(392, 123, 114, 27);
		panel.add(Total_1_1_1_1_1_1);
		
		TotalSalTextField = new JTextField();
		TotalSalTextField.setBounds(251, 24, 131, 20);
		panel.add(TotalSalTextField);
		TotalSalTextField.setColumns(10);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setForeground(new Color(0, 153, 102));
		panel_1_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 139)));
		panel_1_1_1.setBackground(new Color(64, 224, 208));
		panel_1_1_1.setBounds(10, 111, 537, 252);
		contentPane.add(panel_1_1_1);
		
		JLabel Income_1_2 = new JLabel("EXPENSES CALCULATION");
		Income_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Income_1_2.setBounds(191, 11, 175, 35);
		panel_1_1_1.add(Income_1_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(new Color(224, 255, 255));
		panel_2_2.setBounds(20, 44, 234, 197);
		panel_1_1_1.add(panel_2_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("BOOKS(RM)");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_5.setBounds(29, 55, 99, 27);
		panel_2_2.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("STATIONARY(RM)");
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_1_2.setBounds(29, 89, 112, 27);
		panel_2_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("OTHERS(RM)");
		lblNewLabel_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_2_2.setBounds(29, 121, 99, 27);
		panel_2_2.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("SC");
		lblNewLabel_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_3_2.setBounds(29, 193, 61, 27);
		panel_2_2.add(lblNewLabel_1_3_2);
		
		stationary = new JTextField();
		stationary.setColumns(10);
		stationary.setBounds(151, 92, 75, 20);
		panel_2_2.add(stationary);
		
		others = new JTextField();
		others.setColumns(10);
		others.setBounds(151, 124, 75, 20);
		panel_2_2.add(others);
		
		books = new JTextField();
		books.setColumns(10);
		books.setBounds(151, 58, 75, 20);
		panel_2_2.add(books);
		
		JLabel Income_1_1_2 = new JLabel("FORM 3");
		Income_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Income_1_1_2.setBounds(77, 9, 175, 35);
		panel_2_2.add(Income_1_1_2);
		
		JButton Total_1 = new JButton("CALCULATE TOTAL");
		Total_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {     //calculating expenses of FORM 3
				double booksexpenses;
				double stationaryexpenses;
				double otherexpenses;
				double totalexpenses;
		
				try {
					booksexpenses = Double.parseDouble(books.getText());
					stationaryexpenses = Double.parseDouble(stationary.getText());
					otherexpenses =Double.parseDouble(others.getText());
					
					totalexpenses =(booksexpenses)+(stationaryexpenses)+(otherexpenses);
					
					EXPENSESF3.setText(Double.toString(totalexpenses));

			}	catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number!"); }
				
			}
		});
		Total_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Total_1.setBounds(0, 159, 141, 34);
		panel_2_2.add(Total_1);
		
		EXPENSESF3 = new JTextField();
		EXPENSESF3.setColumns(10);
		EXPENSESF3.setBounds(151, 166, 75, 20);
		panel_2_2.add(EXPENSESF3);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBackground(new Color(224, 255, 255));
		panel_2_2_1.setBounds(281, 44, 234, 197);
		panel_1_1_1.add(panel_2_2_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("BOOKS(RM)");
		lblNewLabel_1_5_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_5_1.setBounds(29, 55, 99, 27);
		panel_2_2_1.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("STATIONARY(RM)");
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_1_2_1.setBounds(29, 89, 112, 27);
		panel_2_2_1.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("OTHERS(RM)");
		lblNewLabel_1_2_2_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_2_2_2.setBounds(29, 121, 99, 27);
		panel_2_2_1.add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("SC");
		lblNewLabel_1_3_2_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_3_2_1.setBounds(29, 193, 61, 27);
		panel_2_2_1.add(lblNewLabel_1_3_2_1);
		
		stationary_1 = new JTextField();
		stationary_1.setColumns(10);
		stationary_1.setBounds(151, 92, 75, 20);
		panel_2_2_1.add(stationary_1);
		
		others_1 = new JTextField();
		others_1.setColumns(10);
		others_1.setBounds(151, 124, 75, 20);
		panel_2_2_1.add(others_1);
		
		books_1 = new JTextField();
		books_1.setColumns(10);
		books_1.setBounds(151, 58, 75, 20);
		panel_2_2_1.add(books_1);
		
		JLabel Income_1_1_2_1 = new JLabel("FORM 5");
		Income_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Income_1_1_2_1.setBounds(77, 9, 175, 35);
		panel_2_2_1.add(Income_1_1_2_1);
		
		JButton Total_2 = new JButton("CALCULATE TOTAL");
		Total_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {   //calculating expenses of FORM 5
				double booksexpenses1;
				double stationaryexpenses1;
				double otherexpenses1;
				double totalexpenses1;
		
				try {
					booksexpenses1 = Double.parseDouble(books_1.getText());
					stationaryexpenses1 = Double.parseDouble(stationary_1.getText());
					otherexpenses1 =Double.parseDouble(others_1.getText());
					
					totalexpenses1 =(booksexpenses1)+(stationaryexpenses1)+(otherexpenses1);
					
					EXPENSESF5.setText(Double.toString(totalexpenses1));

			}	catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number!"); }
			}
		});
		Total_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		Total_2.setBounds(0, 159, 141, 34);
		panel_2_2_1.add(Total_2);
		
		EXPENSESF5 = new JTextField();
		EXPENSESF5.setColumns(10);
		EXPENSESF5.setBounds(151, 166, 75, 20);
		panel_2_2_1.add(EXPENSESF5);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(new Color(0, 153, 102));
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 139)));
		panel_1_1.setBackground(new Color(64, 224, 208));
		panel_1_1.setBounds(10, 377, 537, 336);
		contentPane.add(panel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(10, 46, 256, 265);
		panel_1_1.add(panel_2);
		
		JLabel Income_1_1 = new JLabel("FORM 3");
		Income_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Income_1_1.setBounds(87, 11, 175, 35);
		panel_2.add(Income_1_1);
		
		JLabel lblBM = new JLabel("BM");
		lblBM.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblBM.setBounds(29, 87, 61, 27);
		panel_2.add(lblBM);
		
		JLabel lblBI = new JLabel("BI");
		lblBI.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblBI.setBounds(29, 121, 61, 27);
		panel_2.add(lblBI);
		
		JLabel lblMath = new JLabel("MATH");
		lblMath.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblMath.setBounds(29, 155, 61, 27);
		panel_2.add(lblMath);
		
		JLabel lblSc = new JLabel("SC");
		lblSc.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblSc.setBounds(29, 193, 61, 27);
		panel_2.add(lblSc);
		
		BM = new JTextField();
		BM.setColumns(10);
		BM.setBounds(108, 90, 86, 20);
		panel_2.add(BM);
		
		BI = new JTextField();
		BI.setColumns(10);
		BI.setBounds(108, 124, 86, 20);
		panel_2.add(BI);
		
		MATH = new JTextField();
		MATH.setColumns(10);
		MATH.setBounds(108, 158, 86, 20);
		panel_2.add(MATH);
		
		SC = new JTextField();
		SC.setColumns(10);
		SC.setBounds(108, 196, 86, 20);
		panel_2.add(SC);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Number of students taking :");
		lblNewLabel_1_2_2_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_2_2_1.setBounds(24, 49, 211, 27);
		panel_2.add(lblNewLabel_1_2_2_1);
		
		JButton income_1 = new JButton("CALCULATE INCOME");
		income_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {   //calculating income from FORM 3
				double sub = 80.00;
				int BMsub;
				int BIsub;
				int MATHsub;
				int SCsub;
				double incomeF3;
				try {
					BMsub = Integer.parseInt(BM.getText());
					BIsub = Integer.parseInt(BI.getText());
					MATHsub =Integer.parseInt(MATH.getText());
					SCsub = Integer.parseInt(SC.getText());
					
					incomeF3 =(BMsub*sub)+(BIsub*sub)+(MATHsub*sub)+(SCsub*sub);
					
					INCOMEF3.setText(Double.toString(incomeF3));

			}	catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number!"); }
			}
		});
		income_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		income_1.setBounds(0, 227, 154, 34);
		panel_2.add(income_1);
		
		INCOMEF3 = new JTextField();
		INCOMEF3.setColumns(10);
		INCOMEF3.setBounds(159, 234, 86, 20);
		panel_2.add(INCOMEF3);
		
		JLabel Income_1 = new JLabel("INCOME CALCULATION");
		Income_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Income_1.setBounds(191, 11, 175, 35);
		panel_1_1.add(Income_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(224, 255, 255));
		panel_2_1.setBounds(276, 46, 251, 265);
		panel_1_1.add(panel_2_1);
		
		JLabel Income_1_1_1 = new JLabel("FORM 5");
		Income_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Income_1_1_1.setBounds(87, 11, 175, 35);
		panel_2_1.add(Income_1_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("BM");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_4.setBounds(29, 87, 61, 27);
		panel_2_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("BI");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(29, 121, 61, 27);
		panel_2_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("MATH");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(29, 155, 61, 27);
		panel_2_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("SC");
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_3_1.setBounds(29, 193, 61, 27);
		panel_2_1.add(lblNewLabel_1_3_1);
		
		BM_1 = new JTextField();
		BM_1.setColumns(10);
		BM_1.setBounds(108, 90, 86, 20);
		panel_2_1.add(BM_1);
		
		BI_1 = new JTextField();
		BI_1.setColumns(10);
		BI_1.setBounds(108, 124, 86, 20);
		panel_2_1.add(BI_1);
		
		MATH_1 = new JTextField();
		MATH_1.setColumns(10);
		MATH_1.setBounds(108, 158, 86, 20);
		panel_2_1.add(MATH_1);
		
		SC_1 = new JTextField();
		SC_1.setColumns(10);
		SC_1.setBounds(108, 196, 86, 20);
		panel_2_1.add(SC_1);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Number of students taking :");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_2_2_1_1.setBounds(24, 49, 211, 27);
		panel_2_1.add(lblNewLabel_1_2_2_1_1);
		
		JButton income_2 = new JButton("CALCULATE INCOME");
		income_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  // calculating income from FORM 5
				double sub = 80.00;
				int BMsub1;
				int BIsub1;
				int MATHsub1;
				int SCsub1;
				double incomeF5;
				try {
					BMsub1 = Integer.parseInt(BM_1.getText());
					BIsub1 = Integer.parseInt(BI_1.getText());
					MATHsub1 =Integer.parseInt(MATH_1.getText());
					SCsub1 = Integer.parseInt(SC_1.getText());
					
					incomeF5 =(BMsub1*sub)+(BIsub1*sub)+(MATHsub1*sub)+(SCsub1*sub);
					
					INCOMEF5.setText(Double.toString(incomeF5));

			}	catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number!"); }
			}
		});
		income_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		income_2.setBounds(0, 227, 154, 34);
		panel_2_1.add(income_2);
		
		INCOMEF5 = new JTextField();
		INCOMEF5.setColumns(10);
		INCOMEF5.setBounds(159, 234, 86, 20);
		panel_2_1.add(INCOMEF5);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setForeground(new Color(0, 153, 102));
		panel_1_1_1_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 139)));
		panel_1_1_1_1_1.setBackground(new Color(64, 224, 208));
		panel_1_1_1_1_1.setBounds(557, 350, 538, 354);
		contentPane.add(panel_1_1_1_1_1);
		panel_1_1_1_1_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 518, 298);
		panel_1_1_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"TOTAL INCOME (RM)", "TOTAL EXPENSES(RM)", "TOTAL SALARY(RM)", "NET PROFIT(RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("ADD RECORD");     // add details in table to keep records
		btnNewButton.setBackground(new Color(240, 255, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
							overallinc.getText(),
							overallexpenses.getText(),
							TotalSalTextField.getText(),
							overallnetprofit.getText(),
					});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Information Added", "Finance",
									JOptionPane.OK_OPTION);
						}
					}
			}
		});
		btnNewButton.setBounds(10, 320, 109, 23);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 9));
		panel_1_1_1_1_1.add(btnNewButton);
		
		JButton btnEdit = new JButton("EDIT");  // editing details in table
		btnEdit.setBackground(new Color(240, 255, 240));
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					int i = table.getSelectedRow();
					if(i>=0) {
						model.setValueAt(overallinc.getText(),i,0);
				    	model.setValueAt(overallexpenses.getText(),i,1);
				    	model.setValueAt(TotalSalTextField.getText(),i,2);
				    	model.setValueAt(overallnetprofit.getText(),i,3);
						JOptionPane.showMessageDialog(null, "Successfully Edited"); }
					
					else
					{
						JOptionPane.showMessageDialog(null, "Please select a row first!");
					}
			}
		});
		btnEdit.setBounds(129, 320, 95, 23);
		btnEdit.setFont(new Font("Times New Roman", Font.BOLD, 11));
		panel_1_1_1_1_1.add(btnEdit);
		
		JButton btnNewButton_2 = new JButton("DELETE");  //deleting any data
		btnNewButton_2.setBackground(new Color(240, 255, 240));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Finance", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Finance", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnNewButton_2.setBounds(234, 320, 90, 23);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		panel_1_1_1_1_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PRINT");  // data exported to notepad
		btnNewButton_3.setBackground(new Color(240, 255, 240));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
					
					File file = new File("C:\\Users\\Sharvetha\\Documents\\2.3 File IO\\FINANCE-HOME TUITION CENTRE.txt");
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
		btnNewButton_3.setBounds(334, 320, 109, 23);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		panel_1_1_1_1_1.add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("EXIT");   // exit from the page
		btnNewButton_2_1.setBackground(new Color(240, 255, 240));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Finance", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_2_1.setBounds(453, 320, 75, 23);
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		panel_1_1_1_1_1.add(btnNewButton_2_1);
	}
}
