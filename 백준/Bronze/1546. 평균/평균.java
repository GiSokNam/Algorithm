import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        double[] score = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(st.nextToken());
        }
        br.close();
        Arrays.sort(score);
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
           sum += ((score[i] / score[score.length -1]) * 100);
        }
        double avg = sum / N;
        sb.append(avg);
        System.out.print(sb);
    }
}