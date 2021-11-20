import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel();
	
	WelcomePage(String userId) {
		
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font("Ink Free",Font.BOLD,25));
		welcomeLabel.setText("Hello " + userId);
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.setTitle("Welcome");
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
