import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String star = "*";

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                sb.append(star);
            }
            sb.append("\n");
        }

        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < N - i; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                sb.append(star);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}