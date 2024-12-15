import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int num;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());

            if (num > 0) {
                queue.add(num);
            } else {
                if (!queue.isEmpty()) {
                    sb.append(queue.poll() + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            }
        }

        br.close();
        System.out.print(sb);
    }
}