import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> input = new HashMap<>();
        HashMap<String, Integer> input2 = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String key = br.readLine();
            input.put(key, input.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < M; i++) {
            String key = br.readLine();
            if (input.getOrDefault(key, 0) != 0) {
                input2.put(key, i);
            }
        }
        br.close();

        ArrayList<String> result = new ArrayList<String>(input2.keySet());
        Collections.sort(result);

        bw.write(result.size() + "");
        bw.newLine();
        for (String str : result) {
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}