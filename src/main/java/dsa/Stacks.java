package dsa;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValidParanthesis(s));
    }


    /**
     * logic is stack implementation
     * optimal solution is push opp char to save time complexity
     */
    public static boolean isValidParanthesis(String s) {
        if (s.length() < 2)
            return false;
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
                continue;
            }
            if ((c == '}' || c == ']' || c == ')')) {
                if (stack.isEmpty())
                    return false;
                else {
                    if (c == '}' && stack.peek() == '{')
                        stack.pop();
                    else if (c == '}' && stack.peek() != '{')
                        return false;
                    if (c == ']' && stack.peek() == '[')
                        stack.pop();
                    else if (c == '}' && stack.peek() != '{')
                        return false;
                    if (c == ')' && stack.peek() == '(')
                        stack.pop();
                    else if (c == '}' && stack.peek() != '{')
                        return false;
                    else
                        return false;

                }
            }


        }

        return stack.isEmpty();

    }

}


