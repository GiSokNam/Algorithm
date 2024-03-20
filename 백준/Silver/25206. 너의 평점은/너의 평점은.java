import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String subject = "";
        double[] score = new double[20];
        String[] grade = new String[20];
        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            subject = st.nextToken();
            score[i] = Double.parseDouble(st.nextToken());
            grade[i] = st.nextToken();

            switch (grade[i]) {
                case "A+" : sum += score[i] * 4.5;
                            sum2 += score[i];
                            break;
                case "A0" : sum += score[i] * 4.0;
                            sum2 += score[i];
                            break;
                case "B+" : sum += score[i] * 3.5;
                            sum2 += score[i];
                            break;
                case "B0" : sum += score[i] * 3.0;
                            sum2 += score[i];
                            break;
                case "C+" : sum += score[i] * 2.5;
                            sum2 += score[i];
                            break;
                case "C0" : sum += score[i] * 2.0;
                            sum2 += score[i];
                            break;
                case "D+" : sum += score[i] * 1.5;
                            sum2 += score[i];
                            break;
                case "D0" : sum += score[i] * 1.0;
                            sum2 += score[i];
                            break;
                case "F" : sum += score[i] * 0.0;
                           sum2 += score[i];
                           break;
                case "P" :
                    break;
            }
        }
        br.close();
        double avg2 = sum/sum2;
        System.out.printf("%.6f",avg2);

    }
}