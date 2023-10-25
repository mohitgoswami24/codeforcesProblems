package Array;
import java.util.*;

public class Solution {

    public static int[][] findCombinations(int[] arr, int target) {
        List<int[]> combinations = new ArrayList<>();

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            int complement = target - num;
            if (freqMap.containsKey(complement) && freqMap.get(complement) > 0) {
                combinations.add(new int[] { num, complement });
                freqMap.put(complement, freqMap.get(complement) - 1);
            } else {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
        }
        int[][] result = new int[combinations.size()][2];
        for (int i = 0; i < combinations.size(); i++) {
            result[i] = combinations.get(i);
        }
        return result;
    }

    public static int[] mergeAndSort(int[] arr) {
        int n = arr.length;
        int[] mergedArray = new int[n];
        System.arraycopy(arr, 0, mergedArray, 0, n);
        Arrays.sort(mergedArray);
        return mergedArray;
    }

    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.print("[");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i < row.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static List<List<Integer>> DoubleCombinations(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        DoubleCombinationsHelper(arr, target, 0, combination, result);
        return result;
    }

    private static void DoubleCombinationsHelper(int[] arr, int target, int startIndex,
            List<Integer> combination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        if (target < 0 || startIndex >= arr.length) {
            return;
        }

        for (int i = startIndex; i < arr.length; i++) {
            combination.add(arr[i]);
            DoubleCombinationsHelper(arr, target - arr[i], i + 1, combination, result);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 2, 2, -4, -6, -2, 8 };

        int target = 4;

        int[][] firstCombination = findCombinations(arr, target);
        System.out.println("First Combination for " + target + ":");
        print2DArray(firstCombination);

        int[] mergedArray = mergeAndSort(arr);
        System.out.println("Merge into a single array: " + Arrays.toString(mergedArray));

        int doubleTarget = target * 2;
        List<List<Integer>> combinations = DoubleCombinations(arr, doubleTarget);
        System.out.println("Second Combination for double target " + doubleTarget + ":");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

}


