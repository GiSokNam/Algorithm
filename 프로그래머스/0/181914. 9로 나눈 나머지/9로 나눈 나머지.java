class Solution {
    public int solution(String number) {
        char[] digits = number.toCharArray();
        int sumOfDigits = 0;

        for (char digit : digits) {
            sumOfDigits += digit - '0';
        }
        
        int remainder = sumOfDigits % 9;
        
        return remainder;
    }
}