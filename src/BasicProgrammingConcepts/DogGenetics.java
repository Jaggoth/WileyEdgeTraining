package BasicProgrammingConcepts;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DogGenetics {

	public static final Random RND = new Random();
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is your dog's name?");
		String dogName = in.nextLine();
		System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
		System.out.println();
		System.out.println(dogName + " is:");
		System.out.println();
		
		List<String> dogBreeds = new ArrayList<String>();
		dogBreeds.add("Labrador Retriever");
		dogBreeds.add("German Shepherd Dog");
		dogBreeds.add("Poodle");
		dogBreeds.add("Chihuahua");
		dogBreeds.add("Golden Retriever");
		dogBreeds.add("Yorkshire Terrier");
		dogBreeds.add("Dachshund");
		dogBreeds.add("Beagle");
		dogBreeds.add("Boxer");
		dogBreeds.add("Miniature Schnauzer");
		dogBreeds.add("Shih Tzu");
		dogBreeds.add("Bulldog");
		dogBreeds.add("German Spitz");
		dogBreeds.add("English Cocker Spaniel");
		dogBreeds.add("French Bulldog");
		dogBreeds.add("Pug");
		dogBreeds.add("Rottweiler");
		dogBreeds.add("Border Collie");
		dogBreeds.add("Dobermann");
		dogBreeds.add("Great Dane");
		dogBreeds.add("Bernese Mountain Dog");
		
		int[] rndNumbers = {RND.nextInt(1000),RND.nextInt(1000),RND.nextInt(1000),RND.nextInt(1000),RND.nextInt(1000)};
		
		
		
		double rndNumberSum = 0;
		for (double number : rndNumbers) {
			rndNumberSum += number;
		}
		for (int i = 0; i < 5; i++) {
			rndNumbers[i] = (int) ((rndNumbers[i] / rndNumberSum) * 100);
		}
		
		
		
		int convertedSum = 0;
		for (int number : rndNumbers) {
			convertedSum += number;
		}
		
		
		
		if ((100 - convertedSum) != 0) {
			rndNumbers[4] += 100 - convertedSum;
		}

		
		
		for (int i = 0; i < 5; i++) { 
			System.out.println(rndNumbers[i] + "% " + randomBreed(dogBreeds));
		}
		
		in.close();
	}

	private static String randomBreed(List<String> dogBreeds) {
		String breed = null;
		
		breed = dogBreeds.get(RND.nextInt(dogBreeds.size()));
		dogBreeds.remove(breed);
		
		return breed;
	}

}
