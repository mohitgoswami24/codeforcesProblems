package Array;
import java.util.*;

public class XOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int xor = a^b;
			System.out.println(xor);
		}
		
	}
}
