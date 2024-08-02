import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        br.close();
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] += -1;
        }
        int location = 0;
        for (int i = 0; i < str.length(); i++) {
            location = str.charAt(i) - 'a';
            if (arr[location] == -1) {
                arr[location] = i;
            }
        }

        for (int i : arr) {
            sb.append(i + " ");
        }
        System.out.print(sb);
    }
}