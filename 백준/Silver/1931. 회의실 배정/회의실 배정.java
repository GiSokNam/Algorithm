import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] time = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {

                if (t1[1] == t2[1]) {
                    return t1[0] - t2[0];
                }
                return t1[1] - t2[1];
            }
        });

        int cnt = 0;
        int prev_end_time = 0;

        for (int i = 0; i < N; i++) {
            if (prev_end_time <= time[i][0]) {
                prev_end_time = time[i][1];
                cnt++;
            }
        }
        sb.append(cnt);
        System.out.print(sb);
    }
}