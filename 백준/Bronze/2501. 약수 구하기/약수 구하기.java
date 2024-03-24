import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int result = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                cnt++;
            }
            if (cnt == K) {
                result = i;
                break;
            }
        }

        br.close();
        System.out.println(result);
    }
}