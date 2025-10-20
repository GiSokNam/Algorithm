class Solution {
    public int solution(int n) {
        int i = 1;
        int factorial = 1;

        while (factorial * (i + 1) <= n) {
            i++;
            factorial *= i;
        }

        return i;
    }
}