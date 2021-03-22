package guests;

import java.util.Scanner;

public class Customer{
	
	String name ;
	String phoneNumber ;
	int visitTimes ;
	
	public Customer(){
		name = inputName() ;
		phoneNumber = inputPhoneNumber() ;
		visitTimes = visitTimes() ;
	}
	
	public String inputName(){
		System.out.print("請輸入名稱 : ") ;
		name = new Scanner(System.in).nextLine() ;
		return name ;
	}
	
	public String inputPhoneNumber(){
		boolean continueInput = true ;
		
		while (continueInput){
			System.out.print("請輸入電話 10位數 : ") ;
			phoneNumber = new Scanner(System.in).nextLine() ;
			
			if(phoneNumber.matches("\\d{10}")){
				continueInput = false ;
			}else {
				System.out.println("輸入號碼不符合規定") ;
			}
		}
		return phoneNumber ;
	}
	
	public int visitTimes(){
		System.out.print("請輸入來訪次數 : ") ;
		visitTimes = new Scanner(System.in).nextInt();
		return visitTimes ;
	}
	
	public String getName(){
		return name ;
	}
	
	public String getPhoneNumber(){
		return phoneNumber ;
	}
	
	public int getVisitTimes(){
		return visitTimes ;
	}
}
