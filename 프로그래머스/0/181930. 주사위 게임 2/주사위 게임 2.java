import java.util.stream.Stream;

class Solution {
    public int solution(int a, int b, int c) {
        
        int sum = a + b + c;
        int sumOfSquares = (int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2);
        int sumOfCubes = (int) Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3);

        long distinctCnt = Stream.of(a, b, c).distinct().count();

        if (distinctCnt == 1) {
            return sum * sumOfSquares * sumOfCubes;
        } else if (distinctCnt == 2) {
            return sum * sumOfSquares;
        } else {
            return sum;
        }
        
    }
}