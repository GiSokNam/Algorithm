import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            int[] prime = new int[n + 1];

            for (int j = 2; j * j <= n; j++) {
                for (int k = j + j; k <= n; k += j) {
                    prime[k] = 1;
                }
            }

            for (int j = 2; j <= n / 2; j++) {
                if (prime[j] == 0 && prime[n - j] == 0) {
                    cnt++;
                }
            }
            bw.write(cnt + "");
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}