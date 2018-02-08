import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Warsztaty01_01 {

	public static void main(String[] args) {

		Random x = new Random();
		int los = x.nextInt(1000) + 1;
		int wpr = -1;

		Scanner scan = new Scanner(System.in);
		System.out.println(los);

		while (wpr != los) {
			System.out.println("Zgadnij liczbę:");
			
			try {
				wpr = scan.nextInt();
				if (wpr < los) {
					System.out.println("haha za mało xD");
				} else if (wpr > los) {
					System.out.println("haha za dużo xD");
				}
			} catch (InputMismatchException e) {
				System.out.println("liczbe!!! czytaj ze zrozumieniem!!!");
				scan.nextLine();
			}
		}scan.close();
		System.out.println("Brawo zgałeś");

	}

}
