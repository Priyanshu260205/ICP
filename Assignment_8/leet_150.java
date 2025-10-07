import java.util.*;
public class leet_150 {
    public static void main(String[] args) {
        String[] token = { "2","1","+","3","*" };
        System.out.println(evalRPN(token));
    }

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String token : tokens){
            if(isOperator(token)){
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if(token.equals("+")){
                    res = num1 + num2;
                }
                else if(token.equals("-")){
                    res = num1 - num2;
                }
                else if(token.equals("*")){
                    res = num1 * num2;
                }
                else if(token.equals("/")){
                    res = num1 / num2;
                }
                stack.push(Integer.toString(res));
            }
            else{
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.peek());
    }
    private static boolean isOperator(String str){
        if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
            return true;
        }
        return false;
    }
}
