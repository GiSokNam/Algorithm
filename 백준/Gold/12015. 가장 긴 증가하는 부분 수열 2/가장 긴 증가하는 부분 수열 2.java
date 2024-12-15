import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        ArrayList<Integer> LIS = new ArrayList<>();
        LIS.add(seq[0]);
        for (int i = 1; i < N; i++) {
            int key = seq[i];

            if (LIS.get(LIS.size() - 1) < key) {
                LIS.add(key);
            } else {
                int min = 0;
                int max = LIS.size() - 1;

                while (min < max) {
                    int mid = (min + max) / 2;
                    if (LIS.get(mid) >= key) {
                        max = mid;
                    } else {
                        min = mid + 1;
                    }
                }
                LIS.set(max, key);
            }
        }

        sb.append(LIS.size());
        System.out.print(sb);
    }

}