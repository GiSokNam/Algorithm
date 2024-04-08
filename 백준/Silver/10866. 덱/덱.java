import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    private static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push_front" :
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" :
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    bw.write(pop_front()+"");
                    bw.newLine();
                    break;
                case "pop_back" :
                    bw.write(pop_back()+"");
                    bw.newLine();
                    break;
                case "size" :
                    bw.write(size() + "");
                    bw.newLine();
                    break;
                case "empty" :
                    bw.write(empty() + "");
                    bw.newLine();
                    break;
                case "front" :
                    bw.write(front() + "");
                    bw.newLine();
                    break;
                case "back" :
                    bw.write(back() + "");
                    bw.newLine();
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static void push_front(int i) {
        deque.addFirst(i);
    }

    public static void push_back(int i) {
        deque.addLast(i);
    }

    public static int pop_front() {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.pollFirst();
        }
    }

    public static int pop_back() {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.pollLast();
        }
    }

    public static int size() {
        return deque.size();
    }

    public static int empty() {
        if (deque.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.peekFirst();
        }
    }

    public static int back() {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.peekLast();
        }
    }
}