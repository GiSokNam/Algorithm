import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[10];
        int a;
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            arr[i] = a%42;
        }
        br.close();
        int[] newArr = Arrays.stream(arr).distinct().toArray();
        System.out.print(newArr.length);
    }
}