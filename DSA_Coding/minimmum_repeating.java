/*
 * 
 Given an unsorted array of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Note: If you find multiple answers then print the Smallest number found. Also, expected solution is O(n) time and constant extra space.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print B, the repeating number followed by A which is missing in a single line.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106
1 ≤ A[i] ≤ N

Example:
Input:
2
2
2 2
3 
1 3 3

Output:
2 1
3 2
 * 
 */


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class minimmum_repeating {
	public static void main (String[] args) {
				Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
        	int max = 0;
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            max = n+1;
          //  System.out.println("max"+max);
            int[] x = new int[max];
            
            for (int i=0;i<n;i++) {
            	x[arr[i]]++;
            }
            int mis=0;
            int dbl=0;
            for(int i=0;i<max;i++) {
            	if(x[i]==0 && mis==0) {mis = i;}
            	if(x[i]>1 && dbl==0) {dbl = i;}
            }
            System.out.println(dbl+" "+mis);		
            T--;
        }
	}
}