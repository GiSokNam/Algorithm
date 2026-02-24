class Solution {

    public int[] solution(String myString) {
        int[] result = new int[52]; 

        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result[ch - 'A']++;
            } else {
                result[ch - 'a' + 26]++;
            }
        }

        return result;
    }
}