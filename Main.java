package Project;
import java.util.Scanner;

public class Main extends Book{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,email,address,state;
		int i;
		double pin,no;
		System.out.println("---WELCOME TO ONLINE BOOK STORE---");
		System.out.println("Please register to purchase books:");
		Scanner ss=new Scanner(System.in);
		System.out.println("Press 1 if you already register:");
		System.out.println("For new User press 2:");
		i=ss.nextInt();
		if(i==1)
		{
			System.out.println("Enter your email address:");
			name=ss.next();
			System.out.println("Enter your Mobile number:");
			no=ss.nextDouble();
			Book obj=new Book();
			obj.Booked();
		}else {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name:");
			name=sc.next();
			System.out.println("Enter your Mobile number:");
			no=sc.nextDouble();
			System.out.println("Enter your email id:");
			email=sc.next();
			System.out.println("Please provide your address to send the books:");
			address=sc.next();
			System.out.println("Please eneter pincode:");
			pin=sc.nextDouble();
			System.out.println("Please enter the State:");
			state=sc.next();
			
		}
		

	}

}
