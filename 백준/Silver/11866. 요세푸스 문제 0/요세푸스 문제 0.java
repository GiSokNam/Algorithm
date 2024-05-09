import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
        bw.write("<");
        for (int i = 1; i <= N; i++) {
            if(i == N) bw.write(result.poll() + "");
            else bw.write(result.poll() + ", ");
        }
        bw.write(">");
        br.close();
        bw.flush();
        bw.close();
    }
}