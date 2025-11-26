import java.util.Stack;

class Solution {
    public static boolean DuplicateParentheses(String s) {
        Stack<Character>st= new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ')') {
                int count = 0;

                // pop until '('
                while (!st.isEmpty() && st.peek() != '(') {
                    st.pop();
                    count++;
                }

                // if count == 0 → nothing between () → duplicate
                if (count == 0) return true;

                // pop '('
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s= "((a+b))";
        System.out.println(DuplicateParentheses(s));
    }
}
