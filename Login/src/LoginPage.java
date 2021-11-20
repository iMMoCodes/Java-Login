import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIdField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIdLabel = new JLabel("UserID:");
	JLabel userPasswordLabel = new JLabel("Password:");
	JLabel messageLabel = new JLabel();
	HashMap<String,String> loginInfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> loginInfoOriginal) {
		
		loginInfo = loginInfoOriginal;
		
		userIdLabel.setBounds(50,50,75,25);
		userPasswordLabel.setBounds(50,90,75,25);
		
		messageLabel.setBounds(125,200,250,35);
		messageLabel.setFont(new Font("Ink Free",Font.BOLD,30));
		
		userIdField.setBounds(125,50,200,25);
		userPasswordField.setBounds(125,90,200,25);
		
		loginButton.setBounds(125,150,100,25);
		loginButton.addActionListener(this);
		loginButton.setFocusable(false);
		
		resetButton.setBounds(230,150,100,25);
		resetButton.addActionListener(this);
		resetButton.setFocusable(false);
		
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(userIdField);
		frame.add(userPasswordField);
		frame.add(messageLabel);
		frame.add(userIdLabel);
		frame.add(userPasswordLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Login");
		frame.setSize(500,300);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == resetButton) {
			userIdField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource() == loginButton) {
			String userId = userIdField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(loginInfo.containsKey(userId)) {
				if(loginInfo.get(userId).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login Successful");
					WelcomePage welcomePage = new WelcomePage();
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong password");
				}
			} else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("User not found");
			}
		}
	}
}
