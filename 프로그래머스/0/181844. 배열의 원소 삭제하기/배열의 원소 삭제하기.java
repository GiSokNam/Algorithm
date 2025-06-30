import java.util.*;
import java.util.stream.*;

public class Solution {
    public int[] solution(int[] arr, int[] deleteList) {
        Set<Integer> deleteSet = Arrays.stream(deleteList).boxed().collect(Collectors.toSet());
        return Arrays.stream(arr)
                     .filter(i -> !deleteSet.contains(i))
                     .toArray();
    }
}