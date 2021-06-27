package ASSIGNMENT3;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.image.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.border.LineBorder;

public class MainFrame extends JFrame {     //2.1 GUI MainFrame

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame(); //creating new object
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
  JPanel loginpanel;


  public MainFrame(){  //constructor with no argument
    super("SS HOME TUITION");
    loginpanel = new JPanel();
    setLocationRelativeTo(null);
    loginpanel.setBorder(new LineBorder(new Color(0, 0, 0)));
    loginpanel.setBackground(new Color(0, 0, 139));

    setSize(649,468);
    setLocation(500,280);

    getContentPane().add(loginpanel);
    loginpanel.setLayout(null);
    
    JPanel panelMenu = new JPanel();
    panelMenu.setBackground(new Color(224, 255, 255));
    panelMenu.setBounds(27, 22, 581, 382);
    loginpanel.add(panelMenu);
    
    JButton btnNewButton = new JButton("CLOSE");
    btnNewButton.setBounds(500, 11, 77, 45);
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
			JFrame frame = new JFrame();
			if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Main Frame", 
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
    	}
    });
    panelMenu.add(btnNewButton);
    
    JButton AdminLoginBtn = new JButton("ADMIN LOGIN");
    AdminLoginBtn.setBounds(148, 140, 271, 39);
    AdminLoginBtn.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
			Login l = new Login();
			l.setVisible(true);
			dispose();    // close the MainFrame window
    	}
    });
    AdminLoginBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
    AdminLoginBtn.setBackground(new Color(240, 255, 240));
    panelMenu.add(AdminLoginBtn);
    
    JButton StudentLoginBtn = new JButton("STUDENT LOGIN");
    StudentLoginBtn.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
			HomeTuitionCentre H = new HomeTuitionCentre();
			H.setVisible(true);
			dispose();
    	}
    });
    StudentLoginBtn.setBounds(148, 192, 271, 39);
    StudentLoginBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
    StudentLoginBtn.setBackground(new Color(240, 255, 240));
    panelMenu.add(StudentLoginBtn);
    
    JButton AboutUsBtn = new JButton("ABOUT US");
    AboutUsBtn.setBounds(148, 242, 271, 39);
    AboutUsBtn.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
			SubjectsDescription S = new SubjectsDescription ();
			S.setVisible(true);
			dispose();
    	}
    });
    AboutUsBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
    AboutUsBtn.setBackground(new Color(240, 255, 240));
    panelMenu.add(AboutUsBtn);
    
    JButton StaffDetailsBtn = new JButton("STAFF DETAILS");
    StaffDetailsBtn.setBounds(148, 292, 271, 39);
    StaffDetailsBtn.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
			StaffsDetails sd = new StaffsDetails();
			sd.setVisible(true);
			dispose();
    	}
    });
    StaffDetailsBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
    StaffDetailsBtn.setBackground(new Color(240, 255, 240));
    panelMenu.add(StaffDetailsBtn);
    
    JLabel lblbackgroundpic = new JLabel("");
    lblbackgroundpic.setBounds(0, -12, 631, 526);
    Image img1 = new ImageIcon(this.getClass().getResource("/SS HOME TUITION1.png")).getImage();  // insert image
    panelMenu.setLayout(null);
    lblbackgroundpic.setIcon(new ImageIcon(img1));
    panelMenu.add(lblbackgroundpic);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}