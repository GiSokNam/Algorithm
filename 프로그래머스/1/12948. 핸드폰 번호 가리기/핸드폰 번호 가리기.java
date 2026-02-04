class Solution {

    public String solution(String phoneNumber) {
        int length = phoneNumber.length();

        StringBuilder masked = new StringBuilder(length);

        for (int i = 0; i < length - 4; i++) {
            masked.append('*');
        }

        masked.append(phoneNumber.substring(length - 4));

        return masked.toString();
    }
}