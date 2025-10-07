import java.util.ArrayDeque;
import java.util.Deque;

public class leet_71 {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
    }

    public static String simplifyPath(String path) {
        Deque<String> stk = new ArrayDeque<>();
        for (String s : path.split("/")) {
            if ("".equals(s) || ".".equals(s)) {
                continue;
            }
            if ("..".equals(s)) {
                stk.pollLast();
            } else {
                stk.offerLast(s);
            }
        }
        return "/" + String.join("/", stk);
    }
}
