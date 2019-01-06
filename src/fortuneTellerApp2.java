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

		if (favoriteROYGBIV.equalsIgnoreCase("help")) {
			System.out.println("ROYGBIV means red, orange, yellow,green, blue, indigo, violet");
			System.out.println("What is your favorite ROYGBIV color?");
			favoriteROYGBIV = input.next();
		}

		String transport;

		if (favoriteROYGBIV.equalsIgnoreCase("red")) {
			transport = "Porche";
		} else if (favoriteROYGBIV.equalsIgnoreCase("orange")) {
			transport = "Toyota";
		} else if (favoriteROYGBIV.equalsIgnoreCase("yellow")) {
			transport = "Honda";
		} else if (favoriteROYGBIV.equalsIgnoreCase("green")) {
			transport = "Jeep";
		} else if (favoriteROYGBIV.equalsIgnoreCase("blue")) {
			transport = "scooter";
		} else if (favoriteROYGBIV.equalsIgnoreCase("indigo")) {
			transport = "flying carpet";
		} else if (favoriteROYGBIV.equalsIgnoreCase("violet")) {
			transport = "surf board";
		} else {
			transport = "pickup truck";
		}

		System.out.println("How many siblings do you have?");
		int numberSiblings = input.nextInt();

		String vacationHome = "";
		if (numberSiblings == 0) {
			vacationHome = "McLeod Ganj, India";

		} else if (numberSiblings == 1) {
			vacationHome = "Smokey Mts, Tennessee";

		} else if (numberSiblings == 2) {
			vacationHome = "New Orleans";

		} else if (numberSiblings == 3) {
			vacationHome = "Anywhere, Costa Rica";

		} else if (numberSiblings < 3) {
			vacationHome = "Miami Beach, Florida";
		} else if (numberSiblings > 0) {
			vacationHome = "Calcutta, India";

		System.out.println("Enter your age");
			
			int ageNumber = input.nextInt();
			int yearsRetire;
			if (ageNumber % 2 == 0) {
				yearsRetire = 10;
			} else {
				yearsRetire = 12;
			}
		}
	}
}
