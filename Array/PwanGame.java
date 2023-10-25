package Array;
import java.util.*;

public class PwanGame {
	
	static void inputArr(int arr[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int[] arr1 = new int[n];
	   int[] arr2 = new int[n];
	   
	   inputArr(arr1);
	   inputArr(arr2);
	   
	   int c0=0, c1=0, n0=0, n1=0;
	   
	   for(int i=0;i<n;i++) {
		   if(arr1[i]==0) {
			   c0++;
		   }
		   if(arr1[i]==1) {
			   c1++;
		   }
		   if(arr2[i]==0) {
			   n0++;
		   }
		   if(arr2[i]==1) {
			   n1++;
		   }
		   if(n1==n && c0==0) {
			   System.out.print(n1);
		   }
		   if(n1==0) {
			   System.out.print(n1);
		   }
	   }
	   
	   
   }
}
