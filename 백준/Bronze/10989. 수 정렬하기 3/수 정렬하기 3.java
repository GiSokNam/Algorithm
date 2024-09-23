import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] x = new int[10001];

        for (int i = 0; i < N; i++) {
            x[Integer.parseInt(br.readLine())] ++;
        }
        br.close();

        for (int i = 1; i < 10001; i++) {
            while (x[i] > 0) {
                sb.append(i + "\n");
                x[i]--;
            }
        }
        System.out.print(sb);
    }
}