import java.util.Scanner;

public class GCD {

	  int gcd(int a, int b) {
		
		int c = a % b;
		if(c == 0) {
			return b;
		}
		return gcd(b,c);
	}
	
	public static void main(String args[]) {
		GCD g = new GCD();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a<b) {
			int t = a;
			b = a;
			a = t;
		}
		int c = g.gcd(a,b);
		System.out.println(c);
	}
	
}
