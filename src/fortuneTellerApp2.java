import java.util.Scanner;

public class fortuneTellerApp2 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.println("What is your first name?");
	String firstName = input.nextLine();
	
	System.out.println("What is your last name?");
	String lastName = input.nextLine();
	
	System.out.println("Welcome " + firstName + " to Fortune Teller!");
	System.out.println();
	
	System.out.println("What is your age?");
	int numberAge = input.nextInt();
	
	System.out.println("What month were you born?");
	int numberMonth = input.nextInt();
	
	System.out.println("What is your favorite ROYGBIV color? If you don't recognize these colors enter help");
	String favoriteROYGBIV = input.next();
	
	if(favoriteROYGBIV.equalsIgnoreCase("help")) 
	{
		System.out.println("ROYGBIV means red, orange, yellow,green, blue, indigo, violet");
		System.out.println("What is your favorite ROYGBIV color?");
		favoriteROYGBIV=input.next();
	}
	

	
	System.out.println("How many siblings do you have?");
	int numberSiblings = input.nextInt();
}
}
