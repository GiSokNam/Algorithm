class Solution {
    public int solution(String binomial) {
        final String[] tokens = binomial.split(" ");
        final int a = Integer.parseInt(tokens[0]);
        final int b = Integer.parseInt(tokens[2]);

        return switch (tokens[1]) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new IllegalArgumentException("Invalid operator: " + tokens[1]);
        };
    }
}