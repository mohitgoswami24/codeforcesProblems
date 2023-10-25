package Array;

import java.util.*;
public class compositeInteger {
	 public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        scanner.close();

	      
	        int a = n + 4;

	      
	        for (int i = 2; i < a; i++) {
	            if (a % i == 0) {
	                break;
	            }
	        }

	        
	        while (a % 2 == 0 || a == 1) {
	            a++;
	        }

	       
	        int b = a - n;
	        System.out.println(a + " " + b);
	    }
	}


