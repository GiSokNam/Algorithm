import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        stack = new int[N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (Integer.parseInt(st.nextToken())) {
                case 1 :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case 2 :
                    sb.append(pop() + "\n");
                    break;
                case 3 :
                    sb.append(size() + "\n");
                    break;
                case 4 :
                    sb.append(empty() + "\n");
                    break;
                case 5 :
                    sb.append(top() + "\n");
                    break;
            }
        }
        br.close();
        String result = sb.toString();
        System.out.print(result);
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