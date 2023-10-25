package Array;
import java.util.*;

public class NewYear {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int tc = 240 - t;
		int tt = 0, count = 0;
		for(int i=1; i<=n; i++) {
			tt += i*5;
			if(tt<=tc) count++;
			else break;	
		}
		System.out.println(count);
	}

}
