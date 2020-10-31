import java.util.Scanner;

public class NumbertToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double number = 0.0;

		boolean isValid = false;
		while (isValid == false) {
			System.out.println("Enter the number");
			if (sc.hasNextDouble()) { // to check input is valid or not
				number = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Invalid Input");
				System.exit(1);
			}
			sc.nextLine();
		}
		sc.close();
		System.out.println(mainFun(number));
	}

	public static String mainFun(double number) {
		int i = 0, r, d = 100, j = 0;
		String[] nname = new String[6];

		if (number > 999999.99) {
			System.out.println("Out of Range");
			System.exit(1);

		}
		int integer = (int) number; // Integer Part
		int decimal = (int) (100 * number - 100 * integer); // Decimal Part
		int[] num = new int[7];
		while (integer != 0) {
			r = integer % 10;
			num[i] = r;
			i++;
			integer = integer / 10;
		}

		if (num[0] != 0) {
			nname[j] = "-" + name(num[0]);
			j++;
		}
		if (num[0] != 0) {
			nname[j] = name(num[1] * 10);
			j++;
		}
		if (num[1] != 0) {
			nname[j] = name(num[1]);
			j++;
		}
		for (i = 2; i < 6; i++) {

			if (i == 4 && num[i] != 0) {
				nname[j] = name(num[i] * 10);
				j++;
			}

			else if (num[i] != 0) {
				nname[j] = name(num[i]) + name(d);
				j++;
			}
			d = d * 10;
		}

//		System.out.print("Rs.");
		String nm = "Rs.";
		for (i = j - 1; i >= 0; i--)
			nm=nm+nname[i];
		return nm+" " + decimal + "/100 Only";
	}

	public static String name(int num) {

		if (num == 0)
			return " Zero";
		else if (num == 1)
			return " One";
		else if (num == 2)
			return " Two";
		else if (num == 3)
			return " Three";
		else if (num == 4)
			return " Four";
		else if (num == 5)
			return " Five";
		else if (num == 6)
			return " Six";
		else if (num == 7)
			return " Seven";
		else if (num == 8)
			return " Eight";
		else if (num == 9)
			return " Nine";
		else if (num == 10)
			return " Ten";
		else if (num == 20)
			return " Twenty";
		else if (num == 30)
			return " Thirty";
		else if (num == 40)
			return " Forty";
		else if (num == 50)
			return " Fifty";
		else if (num == 60)
			return " Sixty";
		else if (num == 70)
			return " Seventy";
		else if (num == 80)
			return " Eighty";
		else if (num == 90)
			return " Ninety";
		else if (num == 100)
			return " Hundred And";
		else if (num == 1000)
			return " Thousand";
		else if (num == 10000)
			return " Ten Thousand";
		else if (num == 100000)
			return " Lakh";

		else
			return null;
	}

}
