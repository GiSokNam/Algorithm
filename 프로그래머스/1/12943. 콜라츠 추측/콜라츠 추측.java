class Solution {

    public int solution(int num) {

        if (num == 1) {
            return 0;
        }

        long current = num;
        int count = 0;

        while (current != 1 && count < 500) {

            if ((current & 1) == 0) {
                current /= 2;
            } else {
                current = current * 3 + 1;
            }

            count++;
        }

        return current == 1 ? count : -1;
    }
}