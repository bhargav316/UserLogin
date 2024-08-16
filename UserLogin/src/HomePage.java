import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HomePage {

	JFrame frame= new JFrame();
	JLabel homeLabel=new JLabel("Welcome!");
	
	HomePage(String UserID) {
		homeLabel.setBounds(0, 0, 200, 35);
		homeLabel.setFont(new Font(null,Font.PLAIN,25));
		homeLabel.setText("Welcome "+UserID);
		frame.add(homeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
