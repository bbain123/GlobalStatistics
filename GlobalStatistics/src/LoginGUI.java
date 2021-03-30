import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.*;

import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LoginGUI extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LoginInterface loginInterface;
	private static LoginGUI instance;
	private JButton Login, Register;
	private JTextField usernameField = new JTextField(12);
	private JTextField passwordField = new JTextField(12);
	private JFrame frame = new JFrame();
	private JPanel contentPane = new JPanel();
	private JLabel registeredLabel = new JLabel("Account successfully registered");
	private JLabel unregisteredLabel = new JLabel("registration failed");
	private JLabel failLoginLabel = new JLabel("Login failed. Check credentials");
	

	
	public static LoginGUI getInstance() {
		if (instance == null){
			instance = new LoginGUI();
    }

		return instance;
	}
	
	
	private void DisplayLoginGUI() {
		
		loginInterface = loginInterface.getInstance();
		JPanel contentPane = new JPanel(new SpringLayout());

		JLabel Username = new JLabel("Username:");
        Username.setLabelFor(usernameField);
		
		JLabel Password = new JLabel("Password:");
        Password.setLabelFor(passwordField);
		
        
        Login = new JButton("Login");
        Login.addActionListener(this);
        
        Register = new JButton("Register Account");
        Register.addActionListener(this);
        
   
		contentPane.add(Username);
		contentPane.add(usernameField);
		contentPane.add(Password);
		contentPane.add(passwordField);
		contentPane.add(new JLabel());
		contentPane.add(Login);
		contentPane.add(new JLabel());
		contentPane.add(Register);
		
		registeredLabel.setVisible(false);
		contentPane.add(registeredLabel);
		unregisteredLabel.setVisible(false);
		contentPane.add(unregisteredLabel);
		failLoginLabel.setVisible(false);
		contentPane.add(failLoginLabel);
		
		
		//lay out the panel
		SpringUtilities.makeCompactGrid(contentPane, 4, 2, 20, 20, 20, 20);
		
		JFrame frame = new JFrame("LoginGUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane.setOpaque(true); //set panel visible
		frame.setContentPane(contentPane); //set frame as panel
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		String usrname, pssword;

		
		
		if(command.equals("Login")){
			usrname = usernameField.getText();
			pssword = passwordField.getText();
			
			if(loginInterface.login(usrname, pssword)){
				MainUI mainUI = MainUI.getInstance();
				mainUI.toggleVisiability(true);
			}
			else {			//update labels to say login failed
				registeredLabel.setVisible(false);
				unregisteredLabel.setVisible(false);
				failLoginLabel.setVisible(true);
			}
				
        
		}
		
		else if (command.equals("Register Account")) {
			usrname = usernameField.getText();
			pssword = passwordField.getText();
			
			if(loginInterface.addUser(usrname, pssword)) {
				unregisteredLabel.setVisible(false);
				failLoginLabel.setVisible(false);
				registeredLabel.setVisible(true);
			}
			else {
				failLoginLabel.setVisible(false);
				registeredLabel.setVisible(false);
				unregisteredLabel.setVisible(true);
			}
				
				
		}
	}
	
	
  

	public static void main(String[] args) {
		//javax.swing.SwingUtilities.invokeLater(new Runnable() {
            
			//public void run() {
				//new LoginGUI().DisplayLoginGUI();
            //}
        //});
		new LoginGUI().DisplayLoginGUI();
	}
}
	
	

