class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        
        for (String token: tokens){
            if (Character.isDigit(token.charAt(0)) || token.length() > 1){
                int num = Integer.parseInt(token);
                stack.push(num);
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                char op = token.charAt(0);
                if (op == '+'){
                    cur = num1 + num2;
                } else if (op == '-'){
                    cur = num2 - num1;
                } else if (op == '*'){
                    cur = num2 * num1;
                } else {
                    cur = num2 / num1;
                }
                stack.push(cur);
            }
        }
        return stack.pop();

    }
}