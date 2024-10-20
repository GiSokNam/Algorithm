import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        int start = 1;
        String result = "Nice";

        while (!queue.isEmpty()) {
            if (queue.peek() == start) {
                queue.poll();
                start++;
            } else if (!stack.isEmpty() && stack.peek() == start) {
                stack.pop();
                start++;
            } else {
                stack.push(queue.poll());
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == start) {
                stack.pop();
                start++;
            } else {
                result = "Sad";
                break;
            }
        }
        
        br.close();
        sb.append(result);
        String str = sb.toString();
        System.out.print(str);
    }
}