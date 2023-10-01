package stack_Assignments;


import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        
        String currentStr = "";
        int currentNum = 0;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            } else if (c == '[') {
                numStack.push(currentNum);
                strStack.push(currentStr);
                currentNum = 0;
                currentStr = "";
            } else if (c == ']') {
                int repeatTimes = numStack.pop();
                String repeatedStr = "";
                for (int i = 0; i < repeatTimes; i++) {
                    repeatedStr += currentStr;
                }
                currentStr = strStack.pop() + repeatedStr;
            } else {
                currentStr += c;
            }
        }
        
        return currentStr;
    }

    public static void main(String[] args) {
        DecodeString decoder = new DecodeString();
        
        String s1 = "3[a]2[bc]";
        String s2 = "3[a2[c]]";
        String s3 = "2[abc]3[cd]ef";

        System.out.println(decoder.decodeString(s1));  
        System.out.println(decoder.decodeString(s2));  
        System.out.println(decoder.decodeString(s3));  
    }
}
