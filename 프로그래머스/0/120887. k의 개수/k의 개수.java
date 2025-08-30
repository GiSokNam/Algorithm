class Solution {
    public int solution(int i, int j, int k) {
        return (int) java.util.stream.IntStream.rangeClosed(i, j)
                .mapToObj(String::valueOf)
                .flatMapToInt(String::chars)
                .filter(c -> c - '0' == k)
                .count();
    }
}