import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean cont = true;
		Scanner scnr = new Scanner(System.in);
		ArrayList<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie("Hitchhiker's Guide to the Galaxy", "scifi"));
		movieList.add(new Movie("A Clockwork Orange", "scifi"));
		movieList.add(new Movie("Friday the 13th", "horror"));
		movieList.add(new Movie("Nightmare on Elm Street", "horror"));
		movieList.add(new Movie("Dead Alive", "horror"));
		movieList.add(new Movie("Stand By Me", "drama"));
		movieList.add(new Movie("Across the Universe", "drama"));
		movieList.add(new Movie("Batman", "drama"));
		movieList.add(new Movie("Spongebob", "animated"));
		movieList.add(new Movie("Baby Shark", "animated"));
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("\nThere are 10 movies in this list.");
		while (cont == true) {
			System.out.println("\nWhat category are you interested in?");
			System.out.println("(animated/horror/drama/scifi):");
			String userInput = scnr.nextLine();
			if (userInput.charAt(0) == 'a' || userInput.charAt(0) == 'A') {
				System.out.println("Animated movies include:\n");
				for (int i = 0; i < movieList.size(); i++) {
					if (movieList.get(i).getCategory() == "animated") {
						System.out.println(movieList.get(i).getTitle());
					}
				}
				System.out.println("\nContinue? y/n");
				String userCont = scnr.nextLine();
				if (userCont.charAt(0) == 'y' || userCont.charAt(0) == 'Y') {
					cont = true;
				} else {
					cont = false;
				}

			}
			if (userInput.charAt(0) == 'd' || userInput.charAt(0) == 'D') {
				System.out.println("Drama movies include:\n");
				for (int j = 0; j < movieList.size(); j++) {
					if (movieList.get(j).getCategory() == "drama") {
						System.out.println(movieList.get(j).getTitle());
					}
				}
				System.out.println("\nContinue? y/n");
				String userCont = scnr.nextLine();
				if (userCont.charAt(0) == 'y' || userCont.charAt(0) == 'Y') {
					cont = true;
				} else {
					cont = false;
				}
			}

			if (userInput.charAt(0) == 'h' || userInput.charAt(0) == 'H') {
				System.out.println("Horror movies include:\n");
				for (int k = 0; k < movieList.size(); k++) {
					if (movieList.get(k).getCategory() == "horror") {
						System.out.println(movieList.get(k).getTitle());
					}
				}
				System.out.println("\nContinue? y/n");
				String userCont = scnr.nextLine();
				if (userCont.charAt(0) == 'y' || userCont.charAt(0) == 'Y') {
					cont = true;
				} else {
					cont = false;
				}
			}
			if (userInput.charAt(0) == 's' || userInput.charAt(0) == 'S') {
				System.out.println("Sci-Fi movies include:\n");
				for (int l = 0; l < movieList.size(); l++) {
					if (movieList.get(l).getCategory() == "scifi") {
						System.out.println(movieList.get(l).getTitle());

					}
				}
				System.out.println("\nContinue? y/n");
				String userCont = scnr.nextLine();
				if (userCont.charAt(0) == 'y' || userCont.charAt(0) == 'Y') {
					cont = true;
				} else {
					cont = false;
				}
			}
			
		}//WHILE LOOP
		System.out.println("Goodbye!");
	}
}
