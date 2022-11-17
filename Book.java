package Project;
import java.util.Scanner;

public class Book {
	     protected void Booked() {

	    	 System.out.println("Select the books from the below list:\n"+"1.Gitanjali\n"+"2.Mahabharatha\n"+"3.Ramayana");
             Scanner du=new Scanner(System.in);
             String input=du.next();
             switch(input) {
             case "1":
            	     System.out.println("Gitanjali book is in stock\n"+"Gitanjali by ANR\n"+"price=300");
            	     System.out.println("Enter how many book you want:");
            	     Scanner b=new Scanner(System.in);
            	     int g=b.nextInt();
            	     int t=300*g;
            	     System.out.println("Total book price:"+t);
            	     break;
             case "2":
            	 System.out.println("Mahabharatha book is in stock\n"+"Mahabharatha by MSR\n"+"price=400");
        	     System.out.println("Enter how many book you want:");
        	     Scanner m=new Scanner(System.in);
        	     int g1=m.nextInt();
        	     int t1=300*g1;
        	     System.out.println("Total book price:"+t1);
        	     break;
             case "3":
            	 System.out.println("Ramayana book is in stock\n"+"Ramayana by LLR\n"+"price=500");
        	     System.out.println("Enter how many book you want:");
        	     Scanner r=new Scanner(System.in);
        	     int g2=r.nextInt();
        	     int t2=300*g2;
        	     System.out.println("Total book price:"+t2);
        	     break;
        	     
             
             }
	}

}
