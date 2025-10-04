import java.util.ArrayList;
import java.util.List;

public class leet_77 {
    public static void main(String[] args) {
        System.out.println(combine(4, 2));   
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        // The helper method does all the work. We start from number 1 and an empty list.
        backtrack(n, k, 1, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int n, int k, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        if (currentCombination.size() == k) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        // Recursive step: iterate through numbers from 'start' to 'n'.
        for (int i = start; i <= n; i++) {
            if (n - i + 1 < k - currentCombination.size()) {
                break;
            }

            currentCombination.add(i);
            backtrack(n, k, i + 1, currentCombination, result);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
