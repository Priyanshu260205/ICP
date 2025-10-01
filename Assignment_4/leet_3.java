public class leet_3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left_i = 0;
        int right_i = 0;
        int window[] = new int[256];
        int counter = 0;

        while(right_i<s.length())
        {
            window[s.charAt(right_i)] += 1;

            while(window[s.charAt(right_i)] > 1)
            {
                window[s.charAt(left_i)] -= 1;
                left_i ++;
            }

            counter = Math.max(counter,right_i-left_i+1);
            right_i ++;
        }

        return counter;
    }
}
