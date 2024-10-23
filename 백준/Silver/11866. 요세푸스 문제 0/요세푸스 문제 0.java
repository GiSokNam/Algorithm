import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 0) {
            for (int i = 1; i < K; i++) {
                queue.offer(queue.poll());
            }
            result.offer(queue.poll());
        }
        sb.append("<");
        for (int i = 1; i <= N; i++) {
            if(i == N) sb.append(result.poll());
            else sb.append(result.poll() + ", ");
        }
        sb.append(">");
        br.close();
        System.out.print(sb);
    }
}