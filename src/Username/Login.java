package Username;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {

	
	
	
		public static void main(String[] args) {
			 String inputEmail= getMail();
			 System.out.println("Enter	 Email"  +inputEmail);
			 String inputPasw= getPasw();
			 System.out.println("Enter	 Pasw"       +inputPasw);
			
		}
		
		public static String getMail() {
			Scanner scanner = new Scanner(System.in);
			String inputEmail= "";
		   
		while (true) {

		System.out.println("Enter	 Email:    ");
		
			 inputEmail = scanner.next(); 
			 Pattern p =Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
			 if(p.matcher(inputEmail).find()) {
				 break;
				 
			 } else {
					System.out.println("Invalid Email");
			 }

			
		}return inputEmail;
	}
		
		public static String getPasw() {
			Scanner scanner = new Scanner(System.in);
			String inputPasw= "";
		
		while (true) {

		System.out.print("Enter	 Pasword:    ");
			 inputPasw = scanner.nextLine(); 
			 Pattern p =Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
			 if(p.matcher(inputPasw).find()) {
				 break;
				 
			 } else {
					System.out.println("Invalid Email");
			 }

			
		}return inputPasw;
	}
}
