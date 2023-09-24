package fooddeliveryApp;

import java.util.Scanner;

public class Zomato {
	final static String zname = "WELCOME TO ZOMATO";
	final static String b = "1. BBQ";
	final static String mn = "2. MANDI BRIYANI";
	final static String k = "3. KFC";
	final static String e = "4. EXIT";

	static BBQ bbq = new BBQ();

	static MandiBriyani mandibriyani = new MandiBriyani();

	static KFC kfc = new KFC();

	void addOrder(Zomato z) {

		if (z instanceof BBQ) {
			System.err.println("RESTAURANT BBQ");

			System.out.println("Dish " + Zomato.bbq.dish);
			System.out.println("Price " + Zomato.bbq.price);
			System.out.println("Delivery Boy " + Zomato.bbq.deliveryBoy);

		} else if (z instanceof MandiBriyani) {
			System.err.println("RESTAURANT MANDI BRIYANI");

			System.out.println("Dish " + Zomato.mandibriyani.dish);
			System.out.println("Price " + Zomato.mandibriyani.price);
			System.out.println("Delivery Boy " + Zomato.mandibriyani.deliveryBoy);

		} else if (z instanceof KFC) {
			System.err.println("RESTAURANT KFC");

			System.out.println("Dish " + Zomato.kfc.dish);
			System.out.println("Price " + Zomato.kfc.price);
			System.out.println("Delivery Boy " + Zomato.kfc.deliveryBoy);
			

		}

	}

	public static void main(String[] args) {

		System.out.println("********************************************");
		System.out.println(Zomato.zname);
		System.out.println("*******************************************");

		Scanner in = new Scanner(System.in);
		Zomato z = new Zomato();

		System.out.println("Enter your user id");
		int uid = in.nextInt();

		System.out.println("Enter your mobileno");
		long mobileno = in.nextLong();

		System.out.println("Enter your password");
		int password = in.nextInt();

		System.out.println("Enter your username");
		String username = in.nextLine();
		in.nextLine();

		System.out.println("Thank you for Registering......");
		System.out.println("*******************************************");

		UserDetails u1 = new UserDetails(uid, username, mobileno, password);

		System.out.println("Hi");
		System.out.println("please ReEnter your password");
		int cpassword = in.nextInt();

		if (password == cpassword) {
			System.out.println(Zomato.zname);
			System.out.println(Zomato.b);
			System.out.println(Zomato.mn);
			System.out.println(Zomato.k);
			System.out.println(Zomato.e);

			System.out.println("please choose your option..");
			while (true) {
				int choice = in.nextInt();

				switch (choice) {

				case 1:
					z.addOrder(bbq);
					break;

				case 2:
					z.addOrder(mandibriyani);
					break;

				case 3:
					z.addOrder(kfc);

					break;
				case 4:

					System.exit(0);
					break;
				}
			}

		} else {

			System.err.println("Invalide password");
		}
		
	}

}
