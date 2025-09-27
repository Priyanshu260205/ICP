import java.util.ArrayDeque;
import java.util.Deque;

public class leet_239 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        maxSlidingWindow(nums, 3);
        System.out.println(nums);
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }

        int n = nums.length;
        int[] res = new int[n-k+1];
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            while(!q.isEmpty() && q.peekFirst()<=i-k){
                q.pollFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            q.offerLast(i);
            if(i >= k-1){
                res[i-k+1] = nums[q.peekFirst()];
            }
        }
        return res;
    }
}
