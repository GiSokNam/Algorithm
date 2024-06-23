import java.io.*;

public class Main {

    static int[] arr;
    static Integer[] dp;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        dp = new Integer[N + 1];


        for (int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        dp[0] = 0;
        dp[1] = arr[1];

        if (N > 1) {
            dp[2] = arr[1] + arr[2];
        }

        int result = circulate(N);

        bw.write(result + "");
        bw.flush();
        bw.close();
    }

    static int circulate(int N) {
        if (dp[N] == null) {
            dp[N] = Math.max(Math.max(circulate(N - 2), circulate(N - 3) + arr[N - 1]) + arr[N], circulate(N - 1));
        }

        return dp[N];
    }
}