class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) st.push(c);
        }
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c))
                sb.append(st.pop());
            else
                sb.append(c);
        }
        return sb.toString();
    }
}