import java.util.*;
public class leet_438 {
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] need = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) {
            need[c - 'a']++;
        }

        int len = p.length();
        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;

            if (i >= len) {
                window[s.charAt(i - len) - 'a']--;
            }

            if (Arrays.equals(need, window)) {
                result.add(i - len + 1);
            }
        }

        return result;
    }
}
