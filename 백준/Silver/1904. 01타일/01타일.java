import java.io.*;

public class Main {

    static int arr[] = new int[1000001];

    static int cal(int N) {
        if (arr[N] == -1) {
            arr[N] = (cal(N-1)+cal(N-2))%15746;
        }
        return arr[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = -1;
        }
        int result = cal(N);
        br.close();
        sb.append(result);
        System.out.print(sb);
    }

}