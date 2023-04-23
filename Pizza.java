

import java.util.Scanner;


public class Pizza {
	public static void main(String []args) {
	 double amount =0;
	
	 Scanner sc =new Scanner(System.in);
	
	 int qty;
	 int choice;
	do {
		System.out.println("enter the choice:");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("veg pizza enter quantity:");
		       qty=sc.nextInt();
		       amount= amount+qty*100;
		       System.out.println("Total amount ="+amount);
		       break;
		case 2: System.out.println("Nonveg pizza enter quantity:");
		       qty=sc.nextInt();
		       amount= amount+qty*150;
		       System.out.println("Total amount ="+amount);
		       break;
		case 3: System.out.println("italian pizza enter quantity:");
		       qty=sc.nextInt();
		       amount= amount+qty*90;
		       System.out.println("Total amount ="+amount);
		       break;
		case 4: System.out.println("thank you");
		         break;
		default: System.out.println("invalid choice");
		}
		
		}while(choice<5);
	System.out.println("end of main");
	
	
	}
}

	

