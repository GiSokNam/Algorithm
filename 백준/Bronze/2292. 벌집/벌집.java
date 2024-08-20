import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;
        br.close();

        if (N == 1) {
            sb.append(count);
        } else {
            while (range <= N) {
                range += 6 * count;
                count++;
            }
            sb.append(count);
        }
        System.out.print(sb);
    }
}