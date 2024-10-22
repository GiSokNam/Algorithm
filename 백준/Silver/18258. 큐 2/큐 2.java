import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push" :
                    deque.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    Integer item = deque.poll();
                    if (item == null) {
                        sb.append("-1" + "\n");
                    } else {
                        sb.append(item + "\n");
                    }
                    break;
                case "size" :
                    sb.append(deque.size() + "\n");
                    break;
                case "empty" :
                    if (deque.isEmpty()) {
                        sb.append("1" + "\n");
                    } else {
                        sb.append("0" + "\n");
                    }
                    break;
                case "front" :
                    Integer front = deque.peek();
                    if (front == null) {
                        sb.append("-1" + "\n");
                    } else {
                        sb.append(front + "\n");
                    }
                    break;
                case "back" :
                    Integer back = deque.peekLast();
                    if (back == null) {
                        sb.append("-1" + "\n");
                    } else {
                        sb.append(back + "\n");
                    }
                    break;
            }
        }
        br.close();
        String result = sb.toString();
        System.out.print(result);
    }
}