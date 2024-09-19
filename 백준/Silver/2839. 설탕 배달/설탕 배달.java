import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        br.close();

        int a = 3;
        int b = 5;
        int count = 0;
        while (N > 0) {
            if (N % b == 0) {
                count += N / 5;
                break;
            }
            if (N < a) {
                count = -1;
                break;
            }
            N -= a;
            count++;
        }
        sb.append(count);
        System.out.print(sb);
    }
}