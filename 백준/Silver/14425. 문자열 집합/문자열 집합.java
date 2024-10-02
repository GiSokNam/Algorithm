import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> input = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            input.put(br.readLine(), i);
        }

        int cnt = 0;
        for (int i = 0; i < M; i++) {
            if (input.get(br.readLine()) != null) {
                cnt += 1;
            }
        }
        br.close();
        sb.append(cnt);
        System.out.print(sb);

    }
}