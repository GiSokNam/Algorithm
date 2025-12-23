class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length, w = park[0].length();
        int r = 0, c = 0;

        for (int i = 0; i < h; i++) {
            int idx = park[i].indexOf('S');
            if (idx != -1) {
                r = i;
                c = idx;
                break;
            }
        }

        for (String route : routes) {
            String[] cmd = route.split(" ");
            char dir = cmd[0].charAt(0);
            int dist = cmd[1].charAt(0) - '0';

            int nr = r, nc = c;
            boolean valid = true;

            for (int i = 0; i < dist; i++) {
                switch (dir) {
                    case 'N' -> nr--;
                    case 'S' -> nr++;
                    case 'W' -> nc--;
                    case 'E' -> nc++;
                }

                if (nr < 0 || nr >= h || nc < 0 || nc >= w || park[nr].charAt(nc) == 'X') {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                r = nr;
                c = nc;
            }
        }

        return new int[]{r, c};
    }
}