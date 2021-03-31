package guests;

import java.util.Date;
import java.util.Scanner ;

public class Customer{
	
	String name ;
	String gender ;
	String phoneNumber ;
	String customerSerialNumber ;
	int visitTimes ;
	
	public Customer(){
		
		name = inputName() ;
		gender = gender() ; 
		phoneNumber = inputPhoneNumber() ;
		customerSerialNumber = customerSerialNumber() ;
		visitTimes = visitTimes() ;
			
	}
	
	public String inputName(){
		System.out.print("請輸入名稱 : ") ;
		name = new Scanner(System.in).nextLine() ;
		return name ;
	}
	
	public String gender(){
		boolean continueInput = true ;
		
		while (continueInput){	
		System.out.print("請輸入性別 1 男性 或 2 女性 : ") ;
		int input = new Scanner(System.in).nextInt() ;
			if(input == 1){
				gender = "Male" ;
				continueInput = false ;
			}else if (input == 2){
				gender = "Female" ;
				continueInput = false ;
			}else {
				System.out.println("請輸入 1 或 2 ") ;
			}
		}
		return gender ;
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
	
	public String customerSerialNumber(){
		String first = "A" ;
		String[] codeBasic = new Date().toString().split(" ") ;
		if (getGender() == "Female"){
			first = "B" ;
		}
		customerSerialNumber = first + codeBasic[5] + codeBasic[1] + codeBasic[2] + codeBasic[3].replaceAll(":", "") ;
		return customerSerialNumber ;
	}
	
	public int visitTimes() {
		System.out.print("請輸入來訪次數 : ") ;
		visitTimes = new Scanner(System.in).nextInt();
		return visitTimes ;
	}
	
	public String getName(){
		return name ;
	}
	
	public String getGender(){
		return gender ;
	}
	
	public String getPhoneNumber(){
		return phoneNumber ;
	}
	
	public String getcustomerSerialNumber(){
		return customerSerialNumber ;
	}
	
	public int getVisitTimes(){
		return visitTimes ;
	}
}
