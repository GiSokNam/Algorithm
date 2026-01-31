import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    private static class Stage implements Comparable<Stage> {
        final int id;
        final double failureRate;

        public Stage(int id, double failureRate) {
            this.id = id;
            this.failureRate = failureRate;
        }

        @Override
        public int compareTo(Stage other) {
            int rateCompare = Double.compare(other.failureRate, this.failureRate);
            if (rateCompare != 0) {
                return rateCompare;
            }
            return Integer.compare(this.id, other.id);
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] stuckCounts = new int[N + 2];
        for (int stage : stages) {
            stuckCounts[stage]++;
        }

        List<Stage> stageList = new ArrayList<>(N);
        double playersReached = stages.length;

        for (int i = 1; i <= N; i++) {
            int stuck = stuckCounts[i];
            double failureRate = 0.0;

            if (playersReached > 0) {
                failureRate = stuck / playersReached;
            }

            stageList.add(new Stage(i, failureRate));

            playersReached -= stuck;
        }

        Collections.sort(stageList);

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i).id;
        }

        return answer;
    }
}