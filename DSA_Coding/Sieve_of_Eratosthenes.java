import java.util.*;

public class Sieve_of_Eratosthenes {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == true) {
				for (int i = p * p; i <= n; i += p) {
					prime[i] = false;
				}
			}
		}
		
		for(int i=2;i<=n;i++) {
			if(prime[i])
				System.out.println(i);
		}
	}

}
