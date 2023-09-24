package bank_app;


//BANK MANAGEMENT SYSTEM+++

import java.util.*;

class Account {

final int acNo;
String name;
int mobilNo;
double acBalance ;
double lgBalance;
String ifsc;
String branch;
double amount;
double currentBalance;
int option;


Account(int acNo,String name,Double acBalance){
 
   this.acNo = acNo;
   this.name = name;
   this.acBalance=acBalance;
}

Account(int acNo,int mobilNo,double acBalance,String ifsc){

   this.acNo = acNo;
   this.mobilNo = mobilNo;
   this.acBalance = acBalance;
   this.ifsc = ifsc;
}

Account(int acNo,String name,int mobilNo,double acBalance,double lgBalance,String ifsc,String branch,Double amount){

   this.acNo = acNo;
   this.name = name;
   this.mobilNo=mobilNo;
   this.acBalance = acBalance;
   this.ifsc = ifsc;
   this.branch = branch;
   this.amount = amount;

}
  
void deposit(double amount){

  currentBalance = acBalance + amount;

   System.err.println("DEPOSIT");

   System.out.println("***********************************");

   System.out.println("your money deposite successfully");
   
   System.out.println("Main Balance =" + acBalance );
   
   System.out.println("Deposite Amount =" + amount );

   System.out.println("Current Balance =" + currentBalance ); 
  
   System.out.println("***********************************");

}

void withdrow(double amount){
 
        if(acBalance >= amount){

           System.err.println("WITHDROW");

           System.out.println("***********************************");
           
           System.out.println("Main Balance =" + currentBalance );

           System.out.println("Please take your amount");

           currentBalance = currentBalance - amount;
        	 
           System.out.println("Your withdrow amount =" + amount);

           System.out.println("Your Current Balance is =" + currentBalance);

           System.out.println("***********************************");
        }
        else 

        	System.out.println("Sorry Insufficient Balance");
}


void balanceEnquiry(){

   System.err.println("BALANCE ENQUIRY");

   System.out.println("***********************************");

   System.out.println(" Account No :" + acNo);

   System.out.println(" Name :" + name);

   System.out.println( " Balance :" + currentBalance );

   System.out.println("***********************************");

}

void intrest(int amount ,int rateOfIntrest,float year){

  System.err.println("INTREST");

  System.out.println("***********************************");
 
   double in = (amount*rateOfIntrest*year)/100;

   System.out.println("Intrest amount is =" + in);

  System.out.println("***********************************"); 
  
}

}

class Bank{

public static void main (String args[])
{
	
	Scanner in = new Scanner(System.in);

	Account c1 = new Account(12345,"mathi",5000.0);
	
		System.out.println("# PLEASE SELECT YOUR OPTION #");
		
		System.out.println(" 1 . DEPOSIT ");
		System.out.println(" 2 . WITHDROW ");
		System.out.println(" 3 . BALANCE ENQUIRY ");
		System.out.println(" 4 . INTREST ");
		System.out.println(" 5 . EXIT ");
		
		
while(true) {	
	
int option = in.nextInt();
System.out.println("\n");
		
	switch(option) {
	
	case 1:	
		
		System.out.println("Please Enter Your Deposit Amount");
		
		c1.deposit(in.nextDouble()); 
		
		break;
		
	case 2:	
		
		 System.out.println("Please Enter Your Withdrow Amount");
		
		 c1.withdrow(in.nextDouble()); 

		 break;
		
	case 3:
		
		c1.balanceEnquiry();  
		
		break;
		
	case 4:
		
		System.out.println("Please Enter Three Number");
		
		System.out.println("Please Enter Your Principal Amount");
		
		int principal_amount = in.nextInt();
		
		System.out.println("Please Enter Your Rate Per  Annum");
		
		int rateOfIntrest = in.nextInt();
		
		System.out.println("Please Enter Your Time");
		
		float no_of_year = in.nextFloat();
		
		in.nextLine();
		
		c1.intrest( principal_amount, rateOfIntrest, no_of_year); 
		
		break;
		
	case 5:
		
		System.out.println("Thank you ...");
		
		System.exit(0);
		
		break;
		
	
	}
	
	}

}
}
