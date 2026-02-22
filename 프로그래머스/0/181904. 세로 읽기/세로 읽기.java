class Solution {
    public String solution(String myString, int m, int c) {

        int length = myString.length();
        int rowCount = length / m;

        StringBuilder sb = new StringBuilder(rowCount);

        int columnIndex = c - 1;

        for (int i = columnIndex; i < length; i += m) {
            sb.append(myString.charAt(i));
        }

        return sb.toString();
    }
}