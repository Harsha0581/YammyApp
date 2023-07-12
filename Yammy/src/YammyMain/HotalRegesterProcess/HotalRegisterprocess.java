package YammyMain.HotalRegesterProcess;
import YammyMain.DataBase.HotalList;
import YammyMain.DataBase.HotalMenuDB;
import YammyMain.Objets.Yammyobjects;
public class HotalRegisterprocess implements HotalRegisterProcessMethods{
	private Yammyobjects objc = new Yammyobjects();;
	private HotalList hotalList;
	private HotalMenuDB MenuDB;
	public HotalRegisterprocess(){
		hotalList= objc.getHotallist();
		MenuDB = objc.getHotalMenudb();
	}
	public Yammyobjects getObjc() {
		return objc;
	}
	public HotalMenuDB getHotalMenu() {
		return this.MenuDB;
	}
	public HotalList getHotalList() {
		return this.hotalList;
	}
	@Override
	public Boolean HotalRegister(String HName, String Password, String Number, String Address){
		if(HName.isEmpty() || Password.isEmpty() || Number.isEmpty() || Address.isEmpty()) {
			System.out.println("The fileds are Empty");
			return false;
		}
		final String Domin ="Yammy!";
		String HNId ="";
		String hotalname = HName;
		String tempname =hotalname;
		String password =Password;
		String number =Number;
		String address = Address;
		Long num=0L;
		try {
			num=Long.parseLong((number));
		}catch(NumberFormatException e){
			System.out.println("Check The mobile number");
			System.exit(0);
		}
		int numbecount =0;
		while(num>0) {
			num=num/10;
			numbecount++;
		}
		if(numbecount< 10 || numbecount>10) {
			System.out.println("Check register number "+numbecount+" digits");
			return false;
		}
		//for id
		if(hotalname.isEmpty() || hotalname.length()>31 || hotalname.length()<=4) {
			System.out.println("The Hotal name is Empty or Hotal name must Be above 4 and below 31 letters");
			return false;
		}else {
			hotalname = hotalname.replaceAll("\\s","");
			String HNNumber = Number.substring(Number.length()-4);
			String Hnlength = Integer.toString(tempname.length());
			String Subname = tempname.substring(tempname.length()-4);
			HNId =(Subname.concat(Hnlength).concat(Domin).concat(HNNumber)).toUpperCase();
			if(getHotalList().hotalname.containsKey(getHotalList().new HotalName(tempname)) && 
					getHotalList().hotalname.get(getHotalList().new HotalName(tempname)).getNumber()==number) {
				System.out.println("The Hotal Name In use or register number in use check the details");
				return false;
			}else {
				getHotalList().hotalname.put(getHotalList().new HotalName(tempname),
																	getHotalList().new HotalDetails(HNId,password,number,address));
				System.out.println("Register sucessfully");
				return true;
			}
		}
	}
	@Override
	public boolean HotalMenu(String HotalName, String inputpassword) {
		String hotalname =HotalName;
		String hotalpassword =inputpassword;
		if(hotalname.isEmpty() || hotalpassword.isEmpty()) {
			System.out.println("Error fild are empty");
			return false;
		}
		//create and call a method for login 
		new Logincredentials() {

			@Override
			public boolean HotalLogin(String name, String password) {
				return false;
			}
			
		};
		return true;
	}
	public static void main(String args[]) {
		HotalRegisterprocess register =new HotalRegisterprocess();
		register.HotalRegister("harsha","vardhan","9989101624","Hyd");
		register.HotalRegister("harshia","vardhan","9089101624","Hyd");
		register.HotalMenu("harsha", "vardhan");
		register.HotalMenu("harshia", "vardhan");
	}
}








