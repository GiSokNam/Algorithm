import java.util.Comparator;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {

        int[] top3 = IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .boxed()
                .sorted(Comparator.comparingInt(i -> rank[i]))
                .limit(3)
                .mapToInt(Integer::intValue)
                .toArray();

        return 10000 * top3[0] + 100 * top3[1] + top3[2];
    }
}