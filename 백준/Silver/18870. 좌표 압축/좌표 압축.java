import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] origin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        Arrays.sort(sorted);

        int rank = 0;
        for (int i : sorted) {
            if (!rankMap.containsKey(i)) {
                rankMap.put(i, rank);
                rank++;
            }
        }

        for (int key : origin) {
            int result = rankMap.get(key);
            sb.append(result + " ");
        }
        System.out.print(sb);
    }
}