package YammyMain.Objets;
import YammyMain.DataBase.HotalList;
import YammyMain.DataBase.HotalMenuDB;
import YammyMain.DataBase.UserDatabase;
public class Yammyobjects {
	private HotalList hotallist;
	private HotalMenuDB hotalMenudb;
	private UserDatabase userdatabase;
	public Yammyobjects() {
		hotallist =new HotalList();
		hotalMenudb =new HotalMenuDB();
		userdatabase =new UserDatabase();
	}
	public HotalList getHotallist() {
		return hotallist;
	}
	public HotalMenuDB getHotalMenudb() {
		return hotalMenudb;
	}
	public UserDatabase getUserdatabase() {
		return userdatabase;
	}
	@Override
	public String toString() {
		return "Yammyobjects [hotallist=" + hotallist + ", hotalMenudb=" + hotalMenudb + ", userdatabase="
				+ userdatabase +"]";
	}
	public static void main(String args[]) {
		Yammyobjects obj = new Yammyobjects();
		System.out.println(obj.getHotallist());
	}
}
