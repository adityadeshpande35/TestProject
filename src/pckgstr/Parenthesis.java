package pckgstr;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parenthesis {

    public static boolean isBalanced(String str) { // Corrected method name casing
        // Create a stack using Deque
        Deque<Character> stack = new ArrayDeque<Character>();
        
        // Traverse each character in the string
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            
            // If the character is an opening bracket, push it onto the stack
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
            } 
            else {
                // If the stack is empty when encountering a closing bracket, it's unbalanced
                if (stack.isEmpty() == true) {
                    return false;
                }
                // If the top of the stack doesn't match the current closing bracket, it's unbalanced
                else if (isMatching(stack.peek(), x)== false) {
                    return false;
                }
                // If it matches, pop the opening bracket from the stack
                else {
                    stack.pop();
                }
            }
        }
        // The string is balanced if the stack is empty at the end
        return (stack.isEmpty()==true);
    }

    public static boolean isMatching(char a, char b) {
        return (a == '(' && b == ')' ||
                a == '{' && b == '}' ||
                a == '[' && b == ']');
    }

    public static void main(String[] args) {
        String str = "{[()]}";
        
        // Call the isBalanced method and print the result
        boolean result = isBalanced(str);
        System.out.println("Is the string balanced? " + result);
    }
}
