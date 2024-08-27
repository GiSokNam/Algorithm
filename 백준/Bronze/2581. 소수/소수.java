import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        br.close();

        int sum = 0;
        int min = N;
        boolean check;
        for (int i = M; i <= N; i++) {
            check = true;
            if (i == 1) {
                continue;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                }
            }
            if (check) {
                sum += i;
                if(min > i) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            sb.append(-1);
        } else {
            sb.append(sum + "\n" + min);
        }
        System.out.print(sb);
    }
}
