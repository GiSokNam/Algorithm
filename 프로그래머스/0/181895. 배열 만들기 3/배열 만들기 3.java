import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> resultList = new ArrayList<>();
        
        // Extract the first interval [a1, b1]
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        
        for (int i = a1; i <= b1; i++) {
            resultList.add(arr[i]);
        }
        
        for (int i = a2; i <= b2; i++) {
            resultList.add(arr[i]);
        }
        
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}