package projects;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CoinFlipSim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number of flips");
		int count = sc.nextInt();
		int heads = 0;
		int tails = 0;
		for(int i=0; i<count; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(1, 2 + 1);
			if(randomNum == 1) {
				heads++;
				System.out.println("Heads. Heads = "+heads+" | Tails = "+tails+" | Total Flips = "+(i+1));
			} else {
				tails++;
				System.out.println("Tails. Heads = "+heads+" | Tails = "+tails+" | Total Flips = "+(i+1));
			}
		}
		sc.close();
	}
}
