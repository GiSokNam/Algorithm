class Solution {
    public int[] solution(int a, int b, int c, int d) {
        int n = a * d + b * c;
        int m = b * d;
        int g = gcd(n, m);
        return new int[]{ n / g, m / g };
    }

    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}