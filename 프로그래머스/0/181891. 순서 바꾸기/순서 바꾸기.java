import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] beforeN = Arrays.copyOfRange(num_list, 0, n);
        int[] afterN = Arrays.copyOfRange(num_list, n, num_list.length);
        
        int[] result = new int[beforeN.length + afterN.length];
        System.arraycopy(afterN, 0, result, 0, afterN.length);
        System.arraycopy(beforeN, 0, result, afterN.length, beforeN.length);
        
        return result;
    }
}