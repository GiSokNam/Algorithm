class Solution {

    public int solution(int a, int b) {
        int parity = (a & 1) | ((b & 1) << 1);

        return switch (parity) {
            case 3 -> a * a + b * b;
            case 1, 2 -> 2 * (a + b);
            default -> Math.abs(a - b);
        };
    }
}