import java.util.*;

public class unique_paths {

	
// DIVIDE & Conqure approach (too much space requiered)	
//	public int findpath(int m, int n) {
//
//		if (m == 2) {
//			return n;
//		} else if (n == 2) {
//			return m;
//		} else {
//			return (findpath(m - 1, n) + findpath(m, n - 1));
//		}
//
//	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			
		//	unique_paths up = new unique_paths();
			
		//	System.out.println(up.findpath(m, n));
			
			int[][] a = new int[m+1][n+1];
			
			for(int i=0;i<=n;i++) {
				a[1][i]=1;
			}
			for(int i=0;i<=m;i++) {
				a[i][1]=1;
				}
			for(int i=2;i<=m;i++) {
				for(int j=2;j<=n;j++) {
					a[i][j] = a[i-1][j] + a[i][j-1];
				}
			}
			System.out.println(a[m][n]);
			T--;
		}
	}

}
