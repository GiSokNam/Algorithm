import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                } else {
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });

        int num;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if (queue.isEmpty()) {
                    bw.write(0 + "");
                } else {
                    bw.write(queue.poll() + "");
                }
                bw.newLine();
            } else {
                queue.offer(num);
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}