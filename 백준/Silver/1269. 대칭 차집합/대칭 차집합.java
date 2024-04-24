import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> input = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            input.put(key, input.getOrDefault(key, 0) + 1);
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            if (input.getOrDefault(key, 0) != 0) {
                cnt++;
            }
        }
        int result = (N - cnt) + (M - cnt);
        br.close();
        bw.write(result + " ");
        bw.flush();
        bw.close();
    }
}