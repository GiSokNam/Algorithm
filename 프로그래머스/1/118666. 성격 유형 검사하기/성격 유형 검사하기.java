import java.util.HashMap;
import java.util.Map;

class Solution {

    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scoreMap = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            char disagreeType = survey[i].charAt(0);
            char agreeType = survey[i].charAt(1);
            int choice = choices[i];

            if (choice < 4) {
                scoreMap.put(
                    disagreeType,
                    scoreMap.getOrDefault(disagreeType, 0) + (4 - choice)
                );
            } else if (choice > 4) {
                scoreMap.put(
                    agreeType,
                    scoreMap.getOrDefault(agreeType, 0) + (choice - 4)
                );
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(selectType(scoreMap, 'R', 'T'));
        result.append(selectType(scoreMap, 'C', 'F'));
        result.append(selectType(scoreMap, 'J', 'M'));
        result.append(selectType(scoreMap, 'A', 'N'));

        return result.toString();
    }

    private char selectType(Map<Character, Integer> scoreMap, char first, char second) {
        int firstScore = scoreMap.getOrDefault(first, 0);
        int secondScore = scoreMap.getOrDefault(second, 0);

        if (firstScore > secondScore) return first;
        if (firstScore < secondScore) return second;

        return first < second ? first : second;
    }
}