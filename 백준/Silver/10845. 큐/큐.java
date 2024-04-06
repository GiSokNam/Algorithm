import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] queue;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        queue = new int[N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    bw.write(pop()+"");
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

    public static void push(int i) {
        queue[size] = i;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int i = queue[0];
            queue[0] = 0;
            for (int j = 0; j < queue.length; j++) {
                if(j < queue.length -1) queue[j] = queue[j + 1];
            }
            size--;
            return i;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (size == 0) {
            return -1;
        } else {
            return queue[0];
        }
    }

    public static int back() {
        if (size == 0) {
            return -1;
        } else {
            return queue[size - 1];
        }
    }

}