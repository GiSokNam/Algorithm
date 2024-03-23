import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        br.close();
        int numberOfDiagonalCells = 1;
        int sum = 0;

        while (true) {
            if (X <= numberOfDiagonalCells + sum) {
                if (numberOfDiagonalCells % 2 == 1) {
                    bw.write((numberOfDiagonalCells - (X - sum - 1)) + "/" + (X - sum));
                    break;
                } else {
                    bw.write((X - sum) + "/" + (numberOfDiagonalCells - (X - sum - 1)));
                    break;
                }
            } else {
                sum += numberOfDiagonalCells;
                numberOfDiagonalCells++;
            }
        }
        bw.flush();
        bw.close();
    }
}