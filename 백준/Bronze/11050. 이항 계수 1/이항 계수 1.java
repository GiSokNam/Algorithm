import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        br.close();

        bw.write((factorial(N)/(factorial(K)*factorial(N-K))) + "");
        bw.flush();
        bw.close();
    }

    static int factorial(int num) {
        int result = 1;

        for (int i = num; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}