class Solution {

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video = toSec(video_len);
        int cur = toSec(pos);
        int opS = toSec(op_start);
        int opE = toSec(op_end);

        for (String cmd : commands) {

            if (cur >= opS && cur <= opE) cur = opE;
            if (cmd.equals("prev")) {
                cur = Math.max(0, cur - 10);
            } else {
                cur = Math.min(video, cur + 10);
            }
        }

        if (cur >= opS && cur <= opE) cur = opE;

        return String.format("%02d:%02d", cur / 60, cur % 60);
    }

    private int toSec(String t) {
        return Integer.parseInt(t.substring(0, 2)) * 60
             + Integer.parseInt(t.substring(3));
    }
}