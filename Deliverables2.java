package learningJavawk2;

import static java.lang.String.format;
import java.util.Scanner;

public class Deliverables2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// enter string 1
		System.out.println("Enter a string:");
		String str1 = input.nextLine();

		int sum1 = 0;
		int sum2 = 0;
		String t1 = "";
		String t2 = "";
		String a = (t1 + t2);

		for (int i = 0; i < str1.length(); ++i) {
			char ch = str1.charAt(i);
			int n = (int) ch;
			sum1 += n;
			t1 = String.valueOf(n);
			System.out.print(t1 + " ");

		}
		// string 1 evaluates to
		System.out.println();
		System.out.println("The absolute sum is: " + sum1);

		// enter string 2
		System.out.println();
		System.out.println("Enter another string:");
		String str2 = input.nextLine();

		for (int i = 0; i < str2.length(); ++i) {
			char ch = str2.charAt(i);
			int n = (int) ch;
			sum2 += n;
			t2 = String.valueOf(n);
			System.out.print(t2 + " ");

		}
		System.out.println();
		System.out.println("The absolute sum is: " + sum2);

		/// difference as an absolute value calculated
		System.out.println();
		int diff = (sum1 - sum2);
		System.out.print("The difference of the two absolute sums is: ");
		System.out.println(Math.abs(diff));
	}
}
