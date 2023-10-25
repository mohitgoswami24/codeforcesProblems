package Array;
import java.util.*;

public class SerDim {
	
	static void inputArr(int arr[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int arr[] = new int[n];
	   inputArr(arr);
	   int l=0, r=arr.length-1;
	   int ser=0,dim=0,count=0;
	   
	   while(l<=r){
		   if(arr[l]>=arr[r]) {
			   if(count%2==0) {
				   ser+=arr[l];
				   l++;
				   count++;
			   }
			   else {
				   dim+=arr[l];
				   l++;
				   count++;
			   }
		   }else {
			   if(count%2==0) {
				   ser+=arr[r];
				   r--;
				   count++;
			   }else {
				   dim+=arr[r];
				   r--;
				   count++;
			   }
		   }
	   }
	   System.out.println(ser+" "+ dim);
   }
}
