import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Warsztaty01_02 {

	public static void main(String[] args) {
		
		System.out.println("Lotto: 1 - 49");
		
		int[] numbers = readNumbers();
		System.out.println(Arrays.toString(numbers));

		int[] generated = generateNumbers();
		System.out.println(Arrays.toString(generated));
		checkResult(numbers, generated);
	}

	static int[] readNumbers() {
		int[] nums = new int[6];
		int counter = 0;
		int num;
		Scanner scan = new Scanner(System.in);
		while (counter < 6) {
			System.out.println("podaj kolejną liczbe");
			try {
				num = scan.nextInt();
				if (num < 1 || num > 49) {
					System.out.println("podaj liczbe z zakresu 1 - 49");
				} else if (contains(nums, num)) {
					System.out.println("już jest, podaj inną");
				} else {
					nums[counter] = num;
					counter++;

				}

			} catch (InputMismatchException e) {
				System.out.println("to nie liczba");
				scan.nextLine();
			}
		}
		Arrays.sort(nums);
		scan.close();
		return nums;

	}

	static int[] generateNumbers() {
		int[] nums = new int[6];
		int counter = 0;
		int num = 0;
		Random random = new Random();
		while (counter < 6) {
			num = random.nextInt(49) + 1;

			if (!contains(nums, num)) {
				nums[counter] = num;
				counter++;
			}
		}
		Arrays.sort(nums);
		return nums;

	}

	static void checkResult(int[] numbers, int[] generated) {
		int result = 0;
		for (int el : numbers) {
			if (contains(generated, el)) {
				result++;
			}
		}
		switch (result) {
		case 3:
			System.out.println("trafiłeś 3");
			break;
		case 4:
			System.out.println("trafiłeś 4");
			break;
		case 5:
			System.out.println("trafiłeś 5");
			break;
		case 6:
			System.out.println("trafiłeś 6");
			break;
		default:
			System.out.println("nie trafiłeś");
		}

	}

	static boolean contains(int[] tab, int elem) {
		for (int el : tab) {
			if (el == elem) {
				return true;
			}
		}
		return false;
	}

}
