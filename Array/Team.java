package Array;
import java.util.*;

public class Team {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int r = sc.nextInt();
    	int c = 3;
    	int arr[][] = new int[r][c];
    	for(int i=0; i<r; i++) {
    		for(int j=0; j<c; j++) {
    			arr[i][j] = sc.nextInt();
    		}
    	}
    	
    	
    	int count = 0;
    	for(int i=0; i<r; i++) {
    		int count1 = 0;
    		for(int j=0; j<c; j++) {
    			if(arr[i][j] == 1) {
    				count1++;
    			}
    			if(count1>=2) {
    				count++;
    				break;
    			}
    				
    		}
    	}
    	
    	System.out.println(count);
    }
}
