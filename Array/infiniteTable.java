package Array;
import java.util.*;
public class infiniteTable {
	public static void main(String [] str) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		int num = sc.nextInt();
		int  n = (int) Math.ceil(Math.sqrt(num));
		int c=0, r=0;
		int d = n*n - num;
		if(d<n) {
			r = n;
			c = d+1;
		}
		if(d>=n) {
			c = n;
			int x = d - n;
			r = n-x-1;
		}
		System.out.println(r + " " + c);
	}
	}
	
}
