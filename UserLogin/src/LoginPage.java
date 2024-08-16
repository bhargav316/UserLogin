import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
	JFrame frame=new JFrame();
	JButton loginButton=new JButton("Login");
	JButton resetbutton=new JButton("Reset");
	JTextField userIdField=new JTextField();
	JPasswordField passwordField=new JPasswordField();
	JLabel userIDLabel=new JLabel("UserID");
	JLabel passwordLabel=new JLabel("Password");
	JLabel messageLabel=new JLabel();
	JLabel errorMessage=new JLabel();
	
	HashMap<String,String> logininfo= new HashMap<>();
	LoginPage(HashMap<String, String> loginInfoOrignal){
		logininfo=loginInfoOrignal;
		userIDLabel.setBounds(50, 100, 75, 25);
		passwordLabel.setBounds(50, 150, 75, 25);
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		userIdField.setBounds(125, 100,200, 25);
		passwordField.setBounds(125, 150, 200, 25);
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		resetbutton.setBounds(225, 200, 100, 25);
		resetbutton.setFocusable(false);
		resetbutton.addActionListener(this);
		
		frame.add(userIDLabel);
		frame.add(passwordLabel);
		frame.add(messageLabel);
		frame.add(userIdField);
		frame.add(passwordField);
		frame.add(loginButton);
		frame.add(resetbutton);
		frame.add(errorMessage);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==resetbutton) {
			userIdField.setText("");
			passwordField.setText("");
		}
		//e.getSource() will return the the object on which action is being performed
		if(e.getSource()==loginButton) {
			
			String UserID=userIdField.getText();
			if(UserID==null) {
				errorMessage.setText("Enter a user name");
			}
			String Password=String.valueOf(passwordField.getPassword()); 
			
			if(logininfo.containsKey(UserID)) {
				if(logininfo.get(UserID).equals(Password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login Successful");
					frame.dispose();
					HomePage homePage=new HomePage(UserID);
				}else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong Password");
				}
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Username Not Found");
			}
			
			
		}
		
	}
}
