import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> indices = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                indices.add(i);
            }
        }
        
        if (indices.size() == 0) {
            return new int[]{-1};
        }
        
        if (indices.size() == 1) {
            return new int[]{2};
        }

        int start = indices.get(0);
        int end = indices.get(indices.size() - 1);
        
        int[] answer = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            answer[i - start] = arr[i];
        }
        
        return answer;
    }
}