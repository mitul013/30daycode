/*
 You are given a sorted array containing only numbers 0 and 1. Find the transition point efficiently. The transition point is a point where "0" ends and "1" begins (0 based indexing).
Note that, if there is no "1" exists, print -1.
Note that, in case of all 1s print 0.

Input:
The first line of the input contains T denoting the number of testcases. The first line of the test case will be the size of array and second line will be the elements of the array.

Output:
Your function should return transition point.

Your Task:
The task is to complete the function transitionPoint() that takes array and N as input and returns the value of the position where "0" ends and "1" begins.

Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 500000
0 ≤ C[i] ≤ 1
Example:

Input
2
5
0 0 0 1 1
4
0 0 0 0

Output
3
-1

Explanation:
Testcase 1: position 3 is 0 and next one is 1, so answer is 3.
Testcase 2: Since, there is no "1", so the answer is -1. 
  
 */

// { Driver Code Starts
import java.util.*;

class transition_point {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int transitionPoint(int arr[], int n) {
        int s = 0;
        int e = n-1;
		int x;
		if (arr[0] == 1) {
			return  0;
		} 
		else if (arr[n - 1] == 0) {
			return -1;
		}
		else {
			while(true) {
				int m = (s + e)/2;
				if (arr[m - 1] != arr[m]) {
					return m;
				}
				else if (arr[m + 1] != arr[m]) {
					return m+1;
				}
				else {
					if (arr[m] == 0) {
						s = m+1;
					}
					else {
						e = m-1;
					}
				}
			}
		}
    }
}