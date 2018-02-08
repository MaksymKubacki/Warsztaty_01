
	import java.util.Random;


public class Warsztaty01_04 {

		public static void main(String[] args) {
			
			String str = "D3+10";
			System.out.println(str);
			System.out.println("Wynik Twojego rzutu to: " + rollDice(str));
		}

		public static int rollDice(String str) {
			char d = 'D';
			int num = str.indexOf(d);
			String str1 = str.substring(0, num);
			String str2 = str.substring(num + 1, str.length());
			String str3 = "";

			if (str.contains("+") || str.contains("-")) {
				int num1;
				if (str.contains("+")) {
					num1 = str.indexOf('+');
				} else {
					num1 = str.indexOf('-');
				}
				str1 = str.substring(0, num);
				str2 = str.substring(num + 1, num1);
				str3 = str.substring(num1, str.length());
			}

			if (str1.isEmpty() == true) {
				str1 = "1";
			}
			if (str3.isEmpty() == true) {
				str3 = "0";
			}

			 int result= resultOfRoll(str1, str2, str3);
			 return result;
		}

		 public static int resultOfRoll(String str1, String str2, String str3) {
		
		 int nr1 = Integer.parseInt(str1);
		 int nr2 = Integer.parseInt(str2);
		 Random r = new Random();
		 nr2=r.nextInt(nr2) +1;
		 int nr3 = Integer.parseInt(str3);
		
		 int result = nr1 * nr2 + nr3;
		 return result;
		 }
	}