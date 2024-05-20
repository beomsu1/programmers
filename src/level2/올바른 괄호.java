package level2;

import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            Character parenthesis = s.charAt(i);

            if (parenthesis.equals('(')) {
                stack.push(parenthesis);

            } else {

                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if (!stack.empty()) {
            return false;
        }

        return answer;
    }
}