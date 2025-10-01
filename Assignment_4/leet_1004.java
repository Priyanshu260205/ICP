public class leet_1004 {
    public static void main(String[] args) {
        int[] nums = { 1,1,1,0,0,0,1,1,1,1,0 };
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        int j=0;
        int res = 0;
        int check = 0;
        while(j < n){
            if(nums[j] == 0){
                check++;
            }

            while(check > k){
                if(nums[i] == 0){
                    check--;
                }
                i++;
            }
            j++;
            res = Math.max(res, j-i);
        }
        return res;
    }
}
