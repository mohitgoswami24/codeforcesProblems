package Array;
import java.util.*;

public class IWannaBetheGuy {
	static void inputArr(int arr[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lvl = sc.nextInt();
		int arr1[] = new int[lvl];
		inputArr(arr1);
		int arr2[] = new int[lvl-1];
		inputArr(arr2);
		int[] mergedArr = new int[arr1.length + arr2.length];
		int i=0, j=0, k=0;
		while(i<arr1.length) {
			mergedArr[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			mergedArr[k] = arr2[j];
			k++;
			j++;
		}
		Set <Integer> setWithNoDuplicates = new HashSet<>();
		for (int m = 0; m < mergedArr.length; m++) 
        {
            setWithNoDuplicates.add(mergedArr[m]);
        }
		int x=1;
		while(x<=lvl) {
			if(setWithNoDuplicates.contains(x)) {
				x++;
			}
			else {
				System.out.println("Oh, my keyboard!");
				return;
			}
			
		}
		System.out.println("I become the guy.");
		
	}

}
