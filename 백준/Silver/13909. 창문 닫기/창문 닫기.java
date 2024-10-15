import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i * i <= N; i++) {
            cnt++;
        }
        br.close();

        sb.append(cnt);
        System.out.print(sb);
    }
}