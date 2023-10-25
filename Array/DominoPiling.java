package Array;
import java.util.*;

public class DominoPiling {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int m = sc.nextInt();
    	int n = sc.nextInt();
    	int dp = 2;
    	int ar = m*n;
    	if(ar == 0 || ar == 1) {
    		System.out.println(0);
    	}
    	else if(ar%dp == 0) {
    		System.out.println(ar/dp);
    	}
    	else {
    		System.out.println((ar-1)/dp);
    	}
    }
}
