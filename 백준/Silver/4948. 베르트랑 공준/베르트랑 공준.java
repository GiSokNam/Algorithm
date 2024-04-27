import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                bw.flush();
                bw.close();
                break;
            }
            int M = 2 * N;
            boolean[] prime = new boolean[(2 * N) + 1];

            for (int i = 2; i <= M; i++) {
                prime[i] = true;
            }

            for (int i = 2; i * i <= M; i++) {
                for (int j = i + i; j <= M; j += i) {
                    prime[j] = false;
                }
            }

            int cnt = 0;
            for (int i = N + 1; i <= M; i++) {
                if (prime[i] == true) {
                    cnt++;
                }
            }
            bw.write(cnt + "");
            bw.newLine();
        }
    }
}