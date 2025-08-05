package artGallery;

import java.util.Scanner;


public class ArtGallery {

	public static void main(String[] args) {
		int user = 0;
		Art[] art = new Art[3]; // Creates 3 lists 
		art[0] = new Art(); // Names first list as art 0

		String[] artArtist = new String[3]; // Initalizes artist array
		art[0].setArtistName("By Leonardo Da Vinci"); // Sets first artist name in artist array

		int[] artYear = new int[3]; // Initalizes Year array
		art[0].setYear(1503); // Sets first year  in year array array

		double[] artPrice = new double[3]; // Initalizes price array
		art[0].setPrice(100.99); // Sets first price  in price array 

		String[] artName = new String[3]; // Initalizes title array
		art[0].setTitle("Mona Lisa");  // Sets first title in title array

		art[1] = new Art(); // Names second list as art 1

		art[1].setArtistName("By John Martin");  // Sets second name  in name array 

		art[1].setTitle("Destruction Of Heracalcum"); // Sets second title in title array

		art[1].setYear(1822);   //Sets second year  in year array 

		art[1].setPrice(200.99); // Sets second price  in price array

		art[2] = new Art(); // Names third list as art 2

		art[2].setArtistName("By Van Gogh"); // Sets third name title  in name array

		art[2].setTitle("Starry Night"); // Sets third title in title array

		art[2].setYear(1889);// Sets third year in year array

		art[2].setPrice(300.99); // Sets third price in price array

		print(user, art); // Call to print method

	}

	public static void print(int user, Object[] art) { // Creates print method with parameters like int user and my object named art
		Scanner keyb = new Scanner(System.in);  // Opens scanner to record answer from user

		do { // Creates do loop to keep asking user what painting they want to see and outputting details on painting until they input 0

			System.out.println(
					"Please Enter Your Selection: \n 1. Mona Lisa \n 2. Destruction Of Heracalcum  \n 3. Starry Night  \n 0. Quit ");
			user = keyb.nextInt();

			if (user == 1) { 
				System.out.println(art[user - 1].toString()); // minus's 1 from user to make 0 = first place in list

			} else if (user == 2) {
				System.out.println(art[user - 1].toString());
			} else if (user == 3) {
				System.out.println(art[user - 1].toString());
			}
		} while (user != 0);
	}

}