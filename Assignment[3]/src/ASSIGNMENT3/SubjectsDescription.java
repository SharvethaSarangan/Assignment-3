package ASSIGNMENT3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SubjectsDescription extends JFrame {   //2.1 GUI SubjectsDescription

	private JPanel contentPane;
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubjectsDescription frame = new SubjectsDescription();
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
	public SubjectsDescription() {   //constructor with no argument
		super("SUBJECTS DESCRIPTION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(34, 139, 34)));
		panel.setBounds(10, 11, 733, 442);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(34, 139, 34)));
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(10, 11, 713, 47);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("SUBJECTS DESCRIPTION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(246, 11, 235, 25);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(34, 139, 34)));
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(10, 69, 713, 362);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(20, 11, 683, 52);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("We are providing home tuition services at Johor Bahru areas. We are providing tuition services for four subjects for FORM 3 AND ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(37, 11, 636, 14);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FORM 5");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(37, 27, 46, 14);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(102, 205, 170));
		panel_5.setBounds(62, 74, 460, 277);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(23, 11, 413, 121);
		panel_5.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("FORM 3");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(167, 1, 103, 21);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("1. BAHASA MELAYU - 10.00A.M - 11.30 A.M. - EN.AHMAD");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 33, 663, 21);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("2. ENGLISH              -  12.00P.M - 1.30 P.M.   - MS.SHIRLEY");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(10, 54, 663, 21);
		panel_4.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("3. MATHEMATICS    -  4.00P.M   - 6.00 P.M.   - MDM.CHUAA");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1.setBounds(10, 74, 663, 21);
		panel_4.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("4. SCIENCE              -  8.00P.M  -  10.00 P.M. - MDM.ANJALI");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1_1.setBounds(10, 93, 663, 21);
		panel_4.add(lblNewLabel_4_1_1_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(23, 145, 413, 121);
		panel_5.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("FORM 5");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(167, 1, 103, 21);
		panel_4_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("1. BAHASA MELAYU - 8.00A.M - 9.30 A.M.   - PUAN.AMIRAH");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_2.setBounds(10, 33, 663, 21);
		panel_4_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("2. ENGLISH              -  12.00P.M - 1.30 P.M. - SIR RAJ");
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_2.setBounds(10, 54, 663, 21);
		panel_4_1.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("3. MATHEMATICS    -  3.00P.M   - 4.30 P.M. - MDM.ZAKIAH");
		lblNewLabel_4_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1_2.setBounds(10, 74, 663, 21);
		panel_4_1.add(lblNewLabel_4_1_1_2);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("4. SCIENCE              -  7.00P.M  -  9.30 P.M. - MDM.RAMYA");
		lblNewLabel_4_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1_1_1.setBounds(10, 93, 663, 21);
		panel_4_1.add(lblNewLabel_4_1_1_1_1);
		
		JButton btnNewButton = new JButton("STUDENT REGISTRATION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentRegistration sr = new StudentRegistration ();
				sr.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setBounds(532, 88, 171, 52);
		panel_2.add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(152, 251, 152));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Subjects Description", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(532, 277, 171, 52);
		panel_2.add(btnExit);
		
		JButton btnForMoreDetails = new JButton("FOR MORE DETAILS");
		btnForMoreDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marketing m = new Marketing();
				m.setVisible(true);
				dispose();
			}
			
		});
		btnForMoreDetails.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnForMoreDetails.setBackground(new Color(152, 251, 152));
		btnForMoreDetails.setBounds(532, 151, 171, 52);
		panel_2.add(btnForMoreDetails);
		
		JButton btnBackToHome = new JButton("HOME");   //back to MainFrame
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mr = new MainFrame();
				mr.setVisible(true);
				dispose();
			}
		});
		btnBackToHome.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnBackToHome.setBackground(new Color(152, 251, 152));
		btnBackToHome.setBounds(532, 214, 171, 52);
		panel_2.add(btnBackToHome);
	}
}