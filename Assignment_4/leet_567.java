public class leet_567 {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m > n) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < m; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        if (matches(count1, count2)) return true;

        for (int i = m; i < n; i++) {
            count2[s2.charAt(i) - 'a']++;                // include new char
            count2[s2.charAt(i - m) - 'a']--;

            if (matches(count1, count2)) return true;
        }

        return false;
    }

    private static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
