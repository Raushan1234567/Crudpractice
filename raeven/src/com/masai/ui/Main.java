package com.masai.ui;
import java.time.LocalDate;
import java.util.*;
import com.dto.*;
import com.exception.Somethingwenrwrong;
import com.masai.dao.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int c;
		 do {
			 System.out.println("Add Student");
			 System.out.println("Update ");
			 System.out.println("Delete");
			 System.out.println("Search");
			 System.out.println("Print");
			 System.out.println("Exit");
			 
			 c=sc.nextInt();
			 
			 switch(c) {
			 case 1:
				 Addui(sc);
				 break;
			 case 2:
				 Updateui(sc);
				 break;
			 case 3:
				 Deletedui(sc);
				 break;
			 case 4:
				 Searchui(sc);
				 break;
			 case 5:
				 Printui(sc);
				 break;
			 case 0:
				 System.out.println("Thanks");
				 break;
				 default :
					 System.out.println("Invalid selection");
			 }
			 
		 }while(c!=0);
		 sc.close();

	}

	private static void Addui(Scanner sc) {
		
		System.out.println("Enter code ");
		String id=sc.next();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter rice");
	 double   price=sc.nextDouble();
	 System.out.println("Enter Date");
	 LocalDate   pdate=LocalDate.parse(sc.next());
		System.out.println("Enter number of pages ");
		int np=sc.nextInt();
		System.out.println("Enter writer name");
		String  wn=sc.next();
		
		Student s=new Student(id,name,price,pdate,np,wn);
		
		Inteface op=new Implement();
		
		
			try {
				op.Add(s);
			} catch (Somethingwenrwrong e) {
				// TODO Auto-generated catch block
				System.out.println("Not added");
			}
	 
		
		
		
	}

	 static void Updateui(Scanner sc) {
		
		 System.out.println("Enter code ");
			String id=sc.next();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter rice");
		 double   price=sc.nextDouble();
		 System.out.println("Enter Date");
		 LocalDate   pdate=LocalDate.parse(sc.next());
			System.out.println("Enter number of pages ");
			int np=sc.nextInt();
			System.out.println("Enter writer name");
			String  wn=sc.next();
			
			Student s=new Student(id,name,price,pdate,np,wn);
			
			Inteface op=new Implement();
			
			
				try {
					op.Update(s);
				} catch (Somethingwenrwrong e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					 
				}
				
		
	}

	 static void Deletedui(Scanner sc) {
		 System.out.println("Enter code ");
			String id=sc.next();
			
			Inteface op=new Implement();
			
			try {
				op.Dlete(id);
			} catch (Somethingwenrwrong e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	 static void Searchui(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	 static void Printui(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

}
