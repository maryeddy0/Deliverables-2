package learningJavawk2;
import static java.lang.String.format;
import java.util.Scanner;

public class Deliverables2 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// enter string 1
		System.out.println("Enter a string:");
		String str1 = input.nextLine();
		
		String t1 = "";
		String t2 = "";
		String a = (t1 + t2);
		
		for (int i = 0; i < str1.length(); ++i) {
			char ch = str1.charAt(i);
			if (!t1.isEmpty()) {
				t1 += " ";
				
			}
			int n = (int) ch - (int) 'a' + 1;
			t1 += String.valueOf(n);
		}
		// string 1 evaluates to
		System.out.println(t1);
		System.out.println();
	
		// enter string 2
		System.out.println("Enter another string:");
		String str2 = input.nextLine();

		for (int i = 0; i < str2.length(); ++i) {
			char ch = str2.charAt(i);
			if (!t2.isEmpty()) {
				t2 += " ";
			 
			}
			int n = (int) ch - (int) 'a' + 1;
			t2 += String.valueOf(n);
			
		}
		 
		    
		// string 2 evaluates to
		System.out.println(t2);
		System.out.println();
		
		
		///difference as an absolute value calculated
		

	}
}

	
	

