package ASSIGNMENT3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login extends JFrame {   //2.1 GUI Login

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {   //constructor with no argument
		super("ADMIN LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(75, 0, 130));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		panel.setBounds(10, 11, 634, 413);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("SIGN IN");
		btnNewButton.setBounds(167, 338, 130, 46);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				    // set up username and password
					String uname = textField.getText();
					String pass = passwordField.getText();
					
					if(uname.equals("ADMIN") && pass.equals("1234")) {
						
						StaffSalary sf = new StaffSalary();
						sf.setVisible(true);
						dispose();
						}
					
					else {
						
						JOptionPane.showMessageDialog(btnNewButton, "INVALID USERNAME OR PASSWORD! PLEASE TRY AGAIN");
						
					}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		textField = new JTextField();
		textField.setBounds(226, 202, 223, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(226, 275, 223, 38);
		panel.add(passwordField);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD  : ");
		lblNewLabel_1_1.setBounds(77, 268, 139, 52);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME   : ");
		lblNewLabel_1.setBounds(77, 204, 115, 34);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));

	    
	    JLabel lblAdmin = new JLabel("");
	    lblAdmin.setBackground(new Color(230, 230, 250));
	    lblAdmin.setBounds(0, -14, 510, 530);
	    Image img = new ImageIcon(this.getClass().getResource("/ADMIN LOGIN(1).png")).getImage();
		panel.setLayout(null);
	    lblAdmin.setIcon(new ImageIcon(img));
	    panel.add(lblAdmin);
	    
	    JButton btnClose = new JButton("EXIT");
	    btnClose.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {

				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Admin Login", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
	    	}
	    });
	    btnClose.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    btnClose.setBounds(543, 11, 81, 34);
	    panel.add(btnClose);
	    
	    JButton btnBackToHome = new JButton("HOME");
	    btnBackToHome.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		MainFrame mr = new MainFrame();        
	    		mr.setVisible(true);
	    		dispose();
	    	}
	    });
	    btnBackToHome.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    btnBackToHome.setBounds(526, 356, 98, 46);
	    panel.add(btnBackToHome);
	}
}

