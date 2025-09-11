class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201];
        for (int[] l : lines)
            for (int i = l[0]; i < l[1]; i++)
                arr[i + 100]++;
        int answer = 0;
        for (int v : arr)
            if (v > 1) answer++;
        return answer;
    }
}