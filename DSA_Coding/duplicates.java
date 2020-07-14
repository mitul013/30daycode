/*
 * Give N size array and array element's range 0 to n-1 print repeating numbers
 * Number print only one time
 * For more info Refer https://www.geeksforgeeks.org/duplicates-array-using-o1-extra-space-set-2/
 * */


import java.util.*;
import java.lang.*;
public class duplicates {

	public static void main(String args[]) {
		int n = 8;
		int[] a = new int[] {1,4,1,2,2,5,4,0};
		
		for(int i=0;i<n;i++) {
			int index = a[i] % n;
			a[index] = a[index] + n;
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]>n*2)
				System.out.println(i);
		}
		
	}
	
}
