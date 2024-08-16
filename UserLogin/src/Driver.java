
public class Driver {

	public static void main(String[] args) {
		UsernameandPasswords passwords=new UsernameandPasswords();
		LoginPage loginPage=new LoginPage(passwords.getLoginInfo());

	}

}
