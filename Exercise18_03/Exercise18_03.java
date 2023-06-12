import java.util.*;

public class Exercise18_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two integers to compute: ");
		int m = Integer.parseInt(input.next());
		int n = Integer.parseInt(input.next());
		
		System.out.print("The greatest common divisor for " + m + " and " + n + " is: " + gcd(m, n));
	}
	
	private static int gcd(int m, int n) {
		if ( m % n == 0)
			return n;
		else
			return gcd(n, m % n);
	}
}