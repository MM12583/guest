package guests;

import java.util.Scanner;

public class Customer{
	
	private static final Scanner input = new Scanner(System.in) ;
	
	String name ;
	String phoneNumber ;
	
	Customer(){
		System.out.print("請輸入名稱 : ") ;
		name = input.nextLine() ;
		phoneNumber = inputPhoneNumber() ;
	}
	
	public String inputPhoneNumber(){
		boolean continueInput = true ;
		
		while (continueInput){
			System.out.print("請輸入電話 10位數 : ") ;
			phoneNumber = input.nextLine() ;
			
			if(phoneNumber.matches("\\d{10}")){
				continueInput = false ;
			}else {
				System.out.println("輸入號碼不符合規定");
			}
		}
		return phoneNumber ;
	}
	
	String getName(){
		return name ;
	}
	
	String getPhoneNumber(){
		return phoneNumber ;
	}

}
