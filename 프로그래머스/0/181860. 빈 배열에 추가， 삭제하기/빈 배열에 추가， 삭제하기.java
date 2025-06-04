import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> X = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                int valueToAdd = arr[i];
                int count = arr[i] * 2;
                for (int j = 0; j < count; j++) {
                    X.add(valueToAdd);
                }
            } else {
                int countToRemove = arr[i];
                for (int j = 0; j < countToRemove; j++) {
                    if (!X.isEmpty()) {
                        X.remove(X.size() - 1);
                    }
                }
            }
        }

        int[] answer = X.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
        
        return answer;
    }
}