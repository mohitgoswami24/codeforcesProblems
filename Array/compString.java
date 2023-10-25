
import java.util.Scanner;
public class compString {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String genome1 = scanner.nextLine();
	        String genome2 = scanner.nextLine();
	        scanner.close();

	        if (isSameRace(genome1, genome2)) {
	            System.out.println("YES");
	        } else {
	            System.out.println("NO");
	        }
	    }

	    public static boolean isSameRace(String genome1, String genome2) {
	        if (genome1.length() != genome2.length()) {
	            return false;
	        }

	        int firstDiffIndex = -1;
	        int secondDiffIndex = -1;

	        for (int i = 0; i < genome1.length(); i++) {
	            if (genome1.charAt(i) != genome2.charAt(i)) {
	                if (firstDiffIndex == -1) {
	                    firstDiffIndex = i;
	                } else if (secondDiffIndex == -1) {
	                    secondDiffIndex = i;
	                } else {
	                    return false; // More than 2 differences found
	                }
	            }
	        }

	        // Check if exactly two differences are found at valid positions
	        return (firstDiffIndex != -1 && secondDiffIndex != -1) && 
	               (genome1.charAt(firstDiffIndex) == genome2.charAt(secondDiffIndex)) && 
	               (genome1.charAt(secondDiffIndex) == genome2.charAt(firstDiffIndex));
	    }
	}