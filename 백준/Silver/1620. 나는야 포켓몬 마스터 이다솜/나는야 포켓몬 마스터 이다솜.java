import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> input = new HashMap<>();
        HashMap<Integer, String> input2 = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            input.put(str, i+1);
            input2.put(i+1, str);
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (input.containsKey(str)) {
                sb.append(input.get(str) + "\n");

            } else if (input2.containsKey(Integer.parseInt(str))) {
                sb.append(input2.get(Integer.parseInt(str)) + "\n");
            }
        }
        br.close();
        System.out.print(sb);
    }
}