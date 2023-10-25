package Array;
import java.util.*;
public class str {
	public static void encode(String message) {
		// Write your code here.
		String newMsg="";
		int n = message.length();
		for(int i=0; i<n; i++){
			int count = 1;
			while(i<n-1 && message.charAt(i)==message.charAt(i+1)){
				count++;
				i++;
			}
			newMsg += message.charAt(i)+Integer.toString(count);
		}
		System.out.print(newMsg);
	}
	
	public static void main(String[] args) {
		String str = "abbdcaas";
		encode(str);
		
	}

}
