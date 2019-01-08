import java.util.Scanner;

public class FortuneTellerApp2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = input.nextLine();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("Welcome " + firstName + " to Fortune Teller!");
		System.out.println();

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

		}

		System.out.println("Enter your age");

		int ageNumber = input.nextInt();
		int yearsRetire;
		if (ageNumber % 2 == 0) {
			yearsRetire = 10;
		} else {
			yearsRetire = 12;
		}

		System.out.println("Enter your birth month");
		int birthMonth = input.nextInt();

		String bank;
		if (birthMonth >= 1 && birthMonth <= 4) {
			bank = "$1,000.00";
		} else if (birthMonth >= 5 && birthMonth <= 8) {
			bank = "$2,000.00";
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			bank = "$320.00";
		} else {
			bank = "$0.00";
		}

		input.close();

		System.out.println(firstName + " " + lastName + " will retire in " + yearsRetire + " years with " + bank
				+ " in the bank, a vacation home in " + vacationHome + ", and travel by " + transport + ".");

	}
}
