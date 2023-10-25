package Array;

import java.util.*;

public class TwoArrSwap {
	
	public static void inputArr(int [] arr) {
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
	
	public static int twoArrAndSwap(int []a, int[] b,int k) {
		Arrays.sort(a);
		Arrays.sort(b);
		if (k==0) return sum(a);
		
		int n = a.length-1;
		while(k>0) {
			for(int i=0; i<=n; i++) {
				if(a[i]<b[n]) {
					int temp = a[i];
					a[i] = b[n];
					b[n] = temp;
					n--;
				}else { 
					i++;
				}
			}
			k--;
		}
			
		
		return sum(a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			inputArr(a);
			inputArr(b);
			int res = twoArrAndSwap(a,b,k);
			System.out.print(res);
		}
	}

}
