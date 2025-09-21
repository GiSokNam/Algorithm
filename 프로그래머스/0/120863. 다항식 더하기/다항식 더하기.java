class Solution {
    public String solution(String polynomial) {
        int xSum = 0, cSum = 0;
        for (String term : polynomial.split(" \\+ ")) {
            if (term.contains("x"))
                xSum += term.equals("x") ? 1 : Integer.parseInt(term.replace("x", ""));
            else
                cSum += Integer.parseInt(term);
        }
        if (xSum == 0) return String.valueOf(cSum);
        if (cSum == 0) return xSum == 1 ? "x" : xSum + "x";
        return (xSum == 1 ? "x" : xSum + "x") + " + " + cSum;
    }
}