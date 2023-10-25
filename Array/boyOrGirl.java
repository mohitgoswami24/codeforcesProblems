package Array;
import java.util.*;
public class boyOrGirl {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		HashSet <Character> s = new HashSet<Character>();
		for(int i=0; i<str.length(); i++) {
			s.add(str.charAt(i));
		}
		if(s.size()%2==0) {
			System.out.println("CHAT WITH HER!");
		}
		else System.out.println("IGNORE HIM!");
	}

}
