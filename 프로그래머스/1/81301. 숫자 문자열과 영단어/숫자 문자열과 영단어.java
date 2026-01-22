import java.util.Map;

class Solution {

    private static final Map<String, String> NUMBER_WORD_MAP = Map.of(
        "zero", "0",
        "one", "1",
        "two", "2",
        "three", "3",
        "four", "4",
        "five", "5",
        "six", "6",
        "seven", "7",
        "eight", "8",
        "nine", "9"
    );

    public int solution(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder wordBuffer = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                result.append(ch);
            } else {
                wordBuffer.append(ch);

                if (NUMBER_WORD_MAP.containsKey(wordBuffer.toString())) {
                    result.append(NUMBER_WORD_MAP.get(wordBuffer.toString()));
                    wordBuffer.setLength(0);
                }
            }
        }

        return Integer.parseInt(result.toString());
    }
}