package YammyMain.index;
import java.util.*;

import YammyMain.Userfolder.UserDataAccess;
public class MainIndex {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Boolean loop = true;
		UserDataAccess userDataObj = new UserDataAccess();
		while(loop) {
			System.out.println("press 1 for login");
			System.out.println("press 2 for register");
			System.out.println("press 3 for exit");
			try {
				System.out.print("Enter the option ");
				int option = input.nextInt();
				input.nextLine();
				switch(option) {
				case 1:
					try {
						System.out.println();
						System.out.println("Zomato Login Services :-- ");
						System.out.println();
						System.out.print("Enter username ");
						String Username = input.nextLine();
						System.out.println();
						System.out.print("Enter password ");
						String password = input.nextLine();
						Boolean userAccess=userDataObj.Login(Username, password);
						if(userAccess) {
							userDataObj.setUsername(Username);
							System.out.println("Welcome "+userDataObj.getUsername());
							break;
						}
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println();
					break;
				case 2:
					try {
						System.out.println();
						System.out.println("Zomato Registration :-- ");
						System.out.println();
						System.out.print("Enter username ");
						String Username = input.nextLine();
						System.out.println();
						System.out.print("Enter password ");
						String password = input.nextLine();
						if(userDataObj.register(Username, password)) {
							System.out.println();
							System.out.println(" Zomato Registration Down Sucessfully -:- ");
							System.out.println();
						}else {
							System.out.println();
							System.out.println("Zomato Registration Error Try Again -:- ");
							System.out.println();
						}
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println();
					break;
				case 3:
					System.out.println("Exit program");
					return;
				
					default:
						System.out.println("Incurrect input Restart program");
						loop=false;
						break;
				}
			}catch(InputMismatchException e) {
				System.out.println("Incorrect option Restart program");
			break;
			}
		}
		input.close();
	}
}
