import java.io.*;

public class Main{

    static Integer[] dp;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;
        br.close();

        int result = circulate(N);
        bw.write(result + "");
        bw.flush();
        bw.close();
    }

    static int circulate(int N) {

        if (dp[N] == null) {
            if (N % 6 == 0) {
                dp[N] = Math.min(circulate(N - 1), Math.min(circulate(N / 3), circulate(N / 2))) + 1;
            } else if (N % 3 == 0) {
                dp[N] = Math.min(circulate(N / 3), circulate(N - 1)) + 1;
            } else if (N % 2 == 0) {
                dp[N] = Math.min(circulate(N / 2), circulate(N - 1)) + 1;
            } else {
                dp[N] = circulate(N - 1) + 1;
            }
        }
        return dp[N];
    }
}