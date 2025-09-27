public class leet_34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        searchRange(nums, 8);    
    }

    static int Firstocc(int[] nums, int x)
    {
        int left = 0;
        int right = nums.length -1;
        int found = -1;
        
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(x==nums[mid])
            {
                found = mid;
                right = mid-1;
            }
            else if(x>nums[mid])
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return found;
        
    }
    static int Lastocc(int[] nums, int x)
    {
        int left = 0;
        int right = nums.length - 1;
        int found = -1;
        
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(x==nums[mid])
            {
                found = mid;
                left = mid+1;
            }
            else if(x>nums[mid])
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return found;
        
    }
    public static int[] searchRange(int[] nums, int target) {
        int Fi = Firstocc(nums, target);
        int Li = Lastocc(nums, target);

        int res[] = {Fi,Li};
        return res;
    }
}
