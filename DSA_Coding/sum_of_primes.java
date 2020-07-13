import java.util.*;
public class sum_of_primes {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
        	
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
    		prime[0] = false;
    		prime[1] = false;
    		int f = 0;
    		
    		 if(n == 2) {
    		System.out.println(-1);	
    		}
    		 else {
    			 for(int i=2;i<n;i++) {
    				 if(prime[i] && prime[n-i]) {
    					 System.out.println(i+" "+(n-i));
    					 f = 1;
    					 break;
    				 }
    			 }
    		 }
    		 if(f == 0) {
    			 System.out.println(-1);
    		 }
        	
        	T--;
        }
		
	}
	
}
