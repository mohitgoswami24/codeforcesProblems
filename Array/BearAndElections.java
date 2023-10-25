package Array;

import java.util.Scanner;

public class BearAndElections {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         int[] votes = new int[n];

         // Read the votes for each candidate
         for (int i = 0; i < n; i++) {
             votes[i] = scanner.nextInt();
         }
         scanner.close();

         int limakVotes = votes[0];
         int bribes = 0;

         // Iterate through the other candidates' votes and make necessary bribes
         for (int i = 1; i < n; i++) {
             while (limakVotes >= votes[i]) {
                 // Bribing one citizen at a time
                 votes[i]++;
                 limakVotes++;
                 bribes++;
             }
         }

         System.out.println(bribes);
     }
 }