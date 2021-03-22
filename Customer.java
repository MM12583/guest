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
		System.out.print("�п�J�W�� : ") ;
		name = new Scanner(System.in).nextLine() ;
		return name ;
	}
	
	public String inputPhoneNumber(){
		boolean continueInput = true ;
		
		while (continueInput){
			System.out.print("�п�J�q�� 10��� : ") ;
			phoneNumber = new Scanner(System.in).nextLine() ;
			
			if(phoneNumber.matches("\\d{10}")){
				continueInput = false ;
			}else {
				System.out.println("��J���X���ŦX�W�w") ;
			}
		}
		return phoneNumber ;
	}
	
	public int visitTimes(){
		System.out.print("�п�J�ӳX���� : ") ;
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
