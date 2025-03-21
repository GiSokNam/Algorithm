import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for (int num : arr) {
            while (!stk.isEmpty() && stk.peek() >= num) {
                stk.pop();
            }
            stk.push(num);
        }

        return stk.stream().mapToInt(i -> i).toArray();
    }
}