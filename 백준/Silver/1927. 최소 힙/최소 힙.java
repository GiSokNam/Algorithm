import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int num;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());

            if (num > 0) {
                queue.add(num);
            } else {
                if (!queue.isEmpty()) {
                    bw.write(queue.poll() + "");
                    bw.newLine();
                } else {
                    bw.write(0 + "");
                    bw.newLine();
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}