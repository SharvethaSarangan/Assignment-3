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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Marketing extends JFrame {   //2.1 GUI Marketing

	private JPanel contentPane;
	protected JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeTuitionCentre frame = new HomeTuitionCentre();
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
	public Marketing() {
		super("MARKETING");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 11, 564, 389);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setBounds(439, 11, 115, 51);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Marketing", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(175, 238, 238));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblNewLabel_4 = new JLabel("WHATSAPP : 0143166261");
		lblNewLabel_4.setBounds(178, 302, 204, 14);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel_2_1 = new JLabel("FACEBOOK & INSTAGRAM : SS HOME TUITION");
		lblNewLabel_2_1.setBounds(116, 255, 365, 14);
		panel_1.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("FOR MORE DETAILS : ");
		lblNewLabel_2.setBounds(190, 212, 251, 14);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(10, 11, 430, 496);
		Image img = new ImageIcon(this.getClass().getResource("/SS HOME TUITION LOGO(3).png")).getImage();  // insert image
		panel_1.setLayout(null);
	    lblLogo.setIcon(new ImageIcon(img));
		panel_1.add(lblLogo);
		
		JButton btnNewButton_1_1 = new JButton("HOME");
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
		btnNewButton_1_1.setBounds(439, 327, 115, 51);
		panel_1.add(btnNewButton_1_1);

	}
}
