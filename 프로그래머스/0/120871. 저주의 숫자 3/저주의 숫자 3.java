class Solution {
    public int solution(int n) {
        int count = 0, num = 0;
        while (count < n) {
            num++;
            if (num % 3 == 0) continue;
            if (String.valueOf(num).contains("3")) continue;
            count++;
        }
        return num;
    }
}