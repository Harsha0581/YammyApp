package YammyMain.Userfolder;

import java.util.InputMismatchException;

import YammyMain.DataBase.UserDatabase;

public class UserDataAccess implements ZomatoUserLogin {
	private static  UserDatabase Database = new UserDatabase();
	private String Username;
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getUsername() {
		return Username;
	}
	public UserDatabase getDataBase() {
		return Database;
	}
	public boolean Login(String username, String password)  {
		if(username.isEmpty() || password.isEmpty()) {
			System.out.println("The field are empty");
			return false;
		}else {
			if(Database.Data.containsKey(username)) {
				if(Database.Data.get(username).equals(password)) {
					return true;
				}else {
					return false;
				}
			}else {
				System.out.println("No username like "+username);
				return false;
			}
		}
	}
	public boolean register(String username, String password) {
		if(username.isEmpty() || password.isEmpty()) {
			System.out.println("The field are empty");
			return false;
		}else {
			if(Database.Data.containsKey(username)) {
				System.out.println("the user exist");
				return false;
			}else {
				try {
					Database.Data.put(username, password);
				}catch(InputMismatchException e) {
					System.out.println("You Enter Only in words");
				}
				return true;
			}
		}
	}
	
}
