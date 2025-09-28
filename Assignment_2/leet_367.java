public class leet_367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));    
    }

    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = (int)Math.floor(Math.sqrt(num));

        while(left <= right){
            int mid = left + (right-left)/2;
            int square = mid*mid;

            if(num == square){
                return true;
            }
            else if(mid > square){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return false;
    }
}
