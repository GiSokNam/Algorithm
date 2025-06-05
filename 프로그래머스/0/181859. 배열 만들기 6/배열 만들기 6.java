import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>(arr.length);
        
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.addLast(arr[i]);
            } else if (stk.peekLast() == arr[i]) {
                stk.removeLast();
            } else {
                stk.addLast(arr[i]);
            }
        }

        if (stk.isEmpty()) return new int[] { -1 };
        
        int[] answer = new int[stk.size()];
        int idx = 0;
        for (int num : stk) answer[idx++] = num;
        return answer;
    }
}