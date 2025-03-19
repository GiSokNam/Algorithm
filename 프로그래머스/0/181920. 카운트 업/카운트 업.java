import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public List<Integer> solution(int start_num, int end_num) {
        return IntStream.rangeClosed(start_num, end_num)
                        .boxed()
                        .collect(Collectors.toList());
    }
}