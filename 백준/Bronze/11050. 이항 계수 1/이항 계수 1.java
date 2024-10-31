import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        br.close();

        sb.append((factorial(N) / (factorial(K) * factorial(N - K))));
        System.out.print(sb);
    }

    static int factorial(int num) {
        int result = 1;

        for (int i = num; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}