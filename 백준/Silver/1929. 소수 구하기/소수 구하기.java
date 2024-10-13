import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        br.close();
        boolean[] prime = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= N; i++) {
            for (int j = i + i; j <= N; j += i) {
                prime[j] = false;
            }
        }

        for (int i = M; i <= N; i++) {
            if (prime[i] == true) {
                sb.append(i + "\n");
            }
        }
        System.out.print(sb);
    }
}