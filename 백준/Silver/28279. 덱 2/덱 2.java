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
                case "1" :
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "2" :
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "3" :
                    Integer front = deque.pollFirst();
                    if (front == null) {
                        bw.write("-1");
                        bw.newLine();
                    } else {
                        bw.write(front + "");
                        bw.newLine();
                    }
                    break;
                case "4" :
                    Integer back = deque.pollLast();
                    if (back == null) {
                        bw.write("-1");
                        bw.newLine();
                    } else {
                        bw.write(back + "");
                        bw.newLine();
                    }
                    break;
                case "5" :
                    bw.write(deque.size() + "");
                    bw.newLine();
                    break;
                case "6" :
                    if (deque.isEmpty()) {
                        bw.write("1");
                        bw.newLine();
                    } else {
                        bw.write("0");
                        bw.newLine();
                    }
                    break;
                case "7" :
                    Integer item = deque.peekFirst();
                    if (item == null) {
                        bw.write("-1");
                        bw.newLine();
                    } else {
                        bw.write(item + "");
                        bw.newLine();
                    }
                    break;
                case "8" :
                    Integer item2 = deque.peekLast();
                    if (item2 == null) {
                        bw.write("-1");
                        bw.newLine();
                    } else {
                        bw.write(item2 + "");
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