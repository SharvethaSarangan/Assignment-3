package ASSIGNMENT3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffsDetails extends JFrame {  //2.1 GUI StaffsDetails

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffsDetails frame = new StaffsDetails();
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
	public StaffsDetails() {   //constructor with no argument
		super("STAFF DETAILS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(34, 139, 34)));
		panel.setBounds(10, 11, 733, 428);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(34, 139, 34)));
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(27, 11, 696, 47);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("STAFFS DETAILS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(262, 11, 235, 25);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(34, 139, 34)));
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(10, 69, 713, 350);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(102, 205, 170));
		panel_5.setBounds(10, 11, 693, 328);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 673, 137);
		panel_5.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("FORM 3");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(280, 1, 103, 21);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("1. BAHASA MELAYU -  EN.AHMAD  -");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 33, 663, 21);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("2. ENGLISH              -  MS.SHIRLEY -");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(10, 54, 663, 21);
		panel_4.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("3. MATHEMATICS    -  MDM.CHUAA -");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1.setBounds(10, 74, 663, 21);
		panel_4.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("4. SCIENCE              -  MDM.ANJALI -");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1_1.setBounds(10, 93, 663, 21);
		panel_4.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("BACHELOR OF EDUCATION(MALAY LANGUAGE)(HONS)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(238, 37, 353, 14);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("BACHELOR OF EDUCATION(TESL)(HONS)");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(238, 58, 353, 14);
		panel_4.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("BACHELOR OF SCIENCE(BUSINESS MATHEMATICS)(HONS)");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(238, 78, 353, 14);
		panel_4.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("BACHELOR OF SCIENCE(BIOLOGY)(HONS)");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(238, 97, 353, 14);
		panel_4.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(10, 162, 673, 147);
		panel_5.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("FORM 5");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(287, 0, 103, 21);
		panel_4_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("1. BAHASA MELAYU -  PUAN.AMIRAH");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_2.setBounds(10, 32, 663, 21);
		panel_4_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("2. ENGLISH              -  SIR RAJ");
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_2.setBounds(10, 54, 663, 21);
		panel_4_1.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("3. MATHEMATICS    -  MDM.ZAKIAH");
		lblNewLabel_4_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1_2.setBounds(10, 74, 663, 21);
		panel_4_1.add(lblNewLabel_4_1_1_2);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("4. SCIENCE              -  MDM.RAMYA");
		lblNewLabel_4_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1_1_1.setBounds(10, 93, 663, 21);
		panel_4_1.add(lblNewLabel_4_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("BACHELOR OF EDUCATION(TESL)(HONS)");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(255, 58, 353, 14);
		panel_4_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("BACHELOR OF EDUCATION(MALAY LANGUAGE)(HONS)");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(255, 36, 353, 14);
		panel_4_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("BACHELOR OF EDUCATION(MATHEMATICS)(HONS)");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(255, 78, 353, 14);
		panel_4_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("BACHELOR OF SCIENCE(MICROBIOLOGY)(HONS)");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1.setBounds(255, 97, 353, 14);
		panel_4_1.add(lblNewLabel_1_1_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("HOME");   //back to MainFrame
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mr = new MainFrame();
				mr.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1_1.setBackground(new Color(175, 238, 238));
		btnNewButton_1_1.setBounds(558, 121, 115, 26);
		panel_4_1.add(btnNewButton_1_1);
	}
}