import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        long factorial = 1L;
        for (int i = N; i > 0; i--) {
            factorial = factorial * i;
        }
        br.close();
        sb.append(factorial);

        System.out.print(sb);
    }
}