package Array;
import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
    	Scanner sc  = new Scanner(System.in);
    	String str = sc.nextLine();
      

    	String[] arr = str.split("\\+");
    	Arrays.sort(arr);

    	int t=0;
    	StringBuilder newSum = new StringBuilder();
    	for (int i = 0; i < str.length(); i++) {
            if (i%2 == 0 ) {
                newSum.append(arr[t]);
                t++;
            }
            else newSum.append("+");
        }
      System.out.println(newSum.toString());
    }
}
