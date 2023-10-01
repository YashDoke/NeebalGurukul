package stack_Assignments;


import java.util.Stack;

public class ReversePolishNotation {
    public static int evaluatePostFix(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (isOperator(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(operand1, operand2, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
    
   static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    
   static int performOperation(int operand1, int operand2, String operator) {
        if (operator.equals("+")) {
            return operand1 + operand2;
        } else if (operator.equals("-")) {
            return operand1 - operand2;
        } else if (operator.equals("*")) {
            return operand1 * operand2;
        } else if (operator.equals("/")) {
         
            if (operand1 * operand2 < 0) {
                return -Math.abs(operand1) / Math.abs(operand2);
            } else {
                return operand1 / operand2;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
  

        String[] tokens1 = {"2", "1", "+", "3", "*"};
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        System.out.println(evaluatePostFix(tokens1));  
        System.out.println(evaluatePostFix(tokens2));  
        System.out.println(evaluatePostFix(tokens3));  
    }
}

