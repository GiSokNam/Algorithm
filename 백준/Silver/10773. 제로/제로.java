import java.io.*;

public class Main {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        stack = new int[N];

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            if (K == 0) {
                pop();
            } else {
                push(K);
            }
        }

        long sum = 0;
        for (int i : stack) {
            sum += i;
        }

        bw.write(sum + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void push(int i) {
        stack[size] = i;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int i = stack[size - 1];
            stack[size - 1] = 0;
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

    public static int top() {
        if (size == 0) {
            return -1;
        } else {
            return stack[size - 1];
        }
    }
}