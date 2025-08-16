//stack

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str = "a+b*(c^d-e)";
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if operand, add to result
            if (Character.isLetterOrDigit(ch)) {
                res.append(ch);
            }
            // if (, push
            else if (ch == '(') {
                stack.push(ch);
            }
            // if ), pop until (
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    res.append(stack.pop());
                }
                stack.pop(); // remove '('
            }
            // if operator
            else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    // special case: ^ is right associative
                    if (ch == '^' && stack.peek() == '^') break;
                    res.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // pop all remaining operators
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        System.out.println(res.toString()); // ✅ output: abcd^e-*+
    }

    public static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '^');
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        if (op == '^') return 3;
        return -1;
    }
}
