import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>();
        int[] num = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            deque.offer(new int[]{(i + 1), num[i]});
        }

        br.close();

        while (!deque.isEmpty()) {
            int idx = deque.peek()[0];
            int number = deque.peek()[1];

            if (idx == 1) {
                sb.append(deque.remove()[0] + " ");

                if (number > 0) {
                    number -= 1;
                    while (number-- > 0) {
                        deque.offerLast(deque.pollFirst());
                    }
                } else {
                    while (number++ < 0) {
                        deque.offerFirst(deque.pollLast());
                    }
                }
            } else {
                sb.append(deque.remove()[0] + " ");
                if (deque.size() == 0) {
                    break;
                }

                if (number > 0) {
                    number -= 1;
                    while (number-- > 0) {
                        deque.offerLast(deque.pollFirst());
                    }
                } else {
                    while (number++ < 0) {
                        deque.offerFirst(deque.pollLast());
                    }
                }
            }

        }
        System.out.print(sb);
    }
}