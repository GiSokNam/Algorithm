import java.util.Arrays;

class Solution {

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int commandIndex = 0; commandIndex < commands.length; commandIndex++) {

            int startIndex = commands[commandIndex][0] - 1;
            int endIndex = commands[commandIndex][1];
            int targetIndex = commands[commandIndex][2] - 1;

            int[] sliced = Arrays.copyOfRange(array, startIndex, endIndex);

            Arrays.sort(sliced);

            answer[commandIndex] = sliced[targetIndex];
        }

        return answer;
    }
}