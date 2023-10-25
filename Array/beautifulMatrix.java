package Array;
import java.util.*;
public class beautifulMatrix {
   public static void main(String [ ] args) {
	   Scanner sc = new Scanner (System.in);
	   int arr[][] = new int[5][5];
	   for(int i=0; i<arr.length; i++) {
		   for(int j=0; j<arr[0].length; j++) {
			   arr[i][j] = sc.nextInt();
		   }
	   }
	   int x = 0, y = 0;
	   for(int i=0; i<arr.length; i++) {
		   for(int j=0; j<arr[0].length; j++) {
			   if (arr[i][j] == 1) {
				   x = i;
				   y = j;
			   }
		   }
	   }
	   int res=0;
	   if(x>=2 && y>=2) {
		   res = (x-2)+(y-2);
	   }
	   if(x<=2 && y<=2) {
		   res = (2-x)+(2-y);
	   }
	   if(x>=2 && y<=2) {
		   res = (x-2)+(2-y);
	   }
	   if(x<=2 && y>=2) {
		   res = (2-x)+(y-2);
	   }
	   System.out.println(res);
   }
}
