import java.util.ArrayDeque;
import java.util.Deque;

public class leet_901 {
    public static void main(String[] args) {
            
    }

    private Deque<int[]> stk = new ArrayDeque<>();

    public int next(int price) {
        int cnt = 1;
        while (!stk.isEmpty() && stk.peek()[0] <= price) {
            cnt += stk.pop()[1];
        }
        stk.push(new int[] {price, cnt});
        return cnt;
    }
}
