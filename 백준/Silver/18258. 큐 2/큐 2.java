import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
                        bw.write("-1");
                        bw.newLine();
                    } else {
                        bw.write(item + "");
                        bw.newLine();
                    }
                    break;
                case "size" :
                    bw.write(deque.size() + "");
                    bw.newLine();
                    break;
                case "empty" :
                    if (deque.isEmpty()) {
                        bw.write("1");
                        bw.newLine();
                    } else {
                        bw.write("0");
                        bw.newLine();
                    }
                    break;
                case "front" :
                    Integer front = deque.peek();
                    if (front == null) {
                        bw.write("-1");
                        bw.newLine();
                    } else {
                        bw.write(front + "");
                        bw.newLine();
                    }
                    break;
                case "back" :
                    Integer back = deque.peekLast();
                    if (back == null) {
                        bw.write("-1");
                        bw.newLine();
                    } else {
                        bw.write(back + "");
                        bw.newLine();
                    }
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}