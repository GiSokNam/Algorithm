class Solution {
    public int[] solution(int[] num_list) {
        long even = java.util.Arrays.stream(num_list).filter(n -> n % 2 == 0).count();
        return new int[]{(int) even, num_list.length - (int) even};
    }
}