import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DogGenetics {

	public static void main(String[] args) {
		String name = null;
		Scanner sc = new Scanner(System.in);
		int max = 100;
		int count = 0;
		int randomnum;
		int i = 4;
		int [] percentages = new int [5];
		String [] species = new String[] {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"}; //The species of dogs that will be printed
		System.out.println("What's your dogs name");
		name = sc.next();
		System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
		System.out.println("");
		System.out.println(name + " is:");
		
		for (int n = 0; n <5; n++) {
			randomnum = ThreadLocalRandom.current().nextInt(1, max - i + 1);//generates a random number that is between 1 and (max - i)
			percentages[n] = randomnum;//this is down so that the max random number generated in the first iteration will be low enough that the remaining percentages at least have a value of 1
			i--;
			if (n == 4) {
				percentages[4] = max; //manually set the final percentage so that the total value of percentages = 100.
			}
			max -= randomnum;
		}
		
		
		for (int f:percentages) {
			System.out.println(f + "% " + species[count]); // print out the percentages with the dog breads
			count++;
		}
		System.out.println("");
		System.out.println("Wow thats QUITE a dog.");
		
	}

}
