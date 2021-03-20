package guests;

import java.util.Scanner;

public class Customer{
	
	private static final Scanner input = new Scanner(System.in) ;
	
	String name ;
	String phoneNumber ;
	
	Customer(){
		System.out.print("�п�J�W�� : ") ;
		name = input.nextLine() ;
		phoneNumber = inputPhoneNumber() ;
	}
	
	public String inputPhoneNumber(){
		boolean continueInput = true ;
		
		while (continueInput){
			System.out.print("�п�J�q�� 10��� : ") ;
			phoneNumber = input.nextLine() ;
			
			if(phoneNumber.matches("\\d{10}")){
				continueInput = false ;
			}else {
				System.out.println("��J���X���ŦX�W�w");
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
