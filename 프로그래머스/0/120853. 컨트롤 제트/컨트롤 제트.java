class Solution {
    public int solution(String s) {
        String[] tokens = s.split(" ");
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (String token : tokens) {
            if (token.equals("Z")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.stream().mapToInt(Integer::intValue).sum();
    }
}
