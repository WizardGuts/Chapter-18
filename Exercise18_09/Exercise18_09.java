import java.util.*;

public class Exercise18_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String value = input.next();
		
		reverseDisplay(value);
	}
	
	public static void reverseDisplay(String value) {
		if (value.length() <= 1)
			System.out.print(value);
		else {
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}
}