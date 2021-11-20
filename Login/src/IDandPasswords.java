import java.util.HashMap;

public class IDandPasswords {
	// Create hash map to store login info
	HashMap<String,String> loginInfo = new HashMap<String,String>();
	
	IDandPasswords() {
		loginInfo.put("iMMo","Codes");
		loginInfo.put("User1","password123");
		loginInfo.put("User2","password456");
	}
	
	protected HashMap<String,String> getLoginInfo() {
		return loginInfo;
	}
	
}
