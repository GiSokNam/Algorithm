import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        int start = a;
        int end = b + 1;
        
        switch (n) {
            case 1:
                return Arrays.copyOfRange(num_list, 0, end);
            case 2:
                return Arrays.copyOfRange(num_list, start, num_list.length);
            case 3:
                return Arrays.copyOfRange(num_list, start, end);
            case 4:
                ArrayList<Integer> result = new ArrayList<>();
                for (int i = start; i < end; i += c) {
                    result.add(num_list[i]);
                }
                return result.stream().mapToInt(i -> i).toArray();
            default:
                return new int[]{};
        }
    }
}