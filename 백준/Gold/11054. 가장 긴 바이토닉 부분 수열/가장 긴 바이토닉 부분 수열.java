import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] seq;
    static Integer[] dp_r;
    static Integer[] dp_l;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        dp_r = new Integer[N];
        dp_l = new Integer[N];
        seq = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for (int i = 0; i < N; i++) {
            LIS(i);
            LDS(i);
        }

        int max = -1;
        for (int i = 0; i < N; i++) {
            max = Math.max(dp_r[i] + dp_l[i], max);
        }

        int result = max - 1;
        bw.write( result+ "");
        bw.flush();
        bw.close();
    }

    static int LIS(int N) {
        if (dp_r[N] == null) {
            dp_r[N] = 1;

            for (int i = N - 1; i >= 0; i--) {
                if (seq[i] < seq[N]) {
                    dp_r[N] = Math.max(dp_r[N], LIS(i) + 1);
                }
            }
        }
        return dp_r[N];
    }

    static int LDS(int N) {
        if (dp_l[N] == null) {
            dp_l[N] = 1;

            for (int i = N + 1; i < dp_l.length; i++) {
                if (seq[i] < seq[N]) {
                    dp_l[N] = Math.max(dp_l[N], LDS(i) + 1);
                }
            }

        }
        return dp_l[N];
    }

}