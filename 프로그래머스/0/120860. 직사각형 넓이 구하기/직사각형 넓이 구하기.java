import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        int width = Arrays.stream(dots).mapToInt(dot -> dot[0]).max().getAsInt() -
                    Arrays.stream(dots).mapToInt(dot -> dot[0]).min().getAsInt();

        int height = Arrays.stream(dots).mapToInt(dot -> dot[1]).max().getAsInt() -
                     Arrays.stream(dots).mapToInt(dot -> dot[1]).min().getAsInt();

        return width * height;
    }
}