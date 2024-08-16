import java.util.HashMap;

public class UsernameandPasswords {

	HashMap<String, String> loginInfo=new HashMap<>();
	public UsernameandPasswords() {
		loginInfo.put("John", "123");
		loginInfo.put("Jim", "abc123");
		loginInfo.put("Jake", "Password");
	}
	HashMap<String, String> getLoginInfo(){
		return loginInfo;
	}
	
}
