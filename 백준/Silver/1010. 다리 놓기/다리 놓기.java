import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        long N;
        long M;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Long.parseLong(st.nextToken());
            M = Long.parseLong(st.nextToken());
            bw.write(factorial(M,N)+ "");
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }

    static long factorial(long M, long N) {
        long result = 1L;

        for (int i = 1; i <= N; i++) {
            result = result * (M - i + 1) / i;
        }
        return result;
    }
}