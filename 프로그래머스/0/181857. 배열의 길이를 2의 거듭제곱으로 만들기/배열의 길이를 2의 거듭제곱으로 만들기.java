class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int pow = 1;
        while (pow < len) pow <<= 1;

        if (pow == len) return arr;
        int[] answer = new int[pow];
        System.arraycopy(arr, 0, answer, 0, len);
        return answer;
    }
}