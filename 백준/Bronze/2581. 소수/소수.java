import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
            bw.write(-1+"");
        } else {
            bw.write(sum+"");
            bw.newLine();
            bw.write(min+"");
        }
        bw.flush();
        bw.close();
    }
}