class Solution {
    public int solution(int[] array) {
        return (int) java.util.Arrays.stream(array)
            .mapToObj(String::valueOf)
            .flatMapToInt(String::chars)
            .filter(c -> c == '7')
            .count();
    }
}