import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int X = Integer.parseInt(br.readLine());
        br.close();
        int numberOfDiagonalCells = 1;
        int sum = 0;

        while (true) {
            if (X <= numberOfDiagonalCells + sum) {
                if (numberOfDiagonalCells % 2 == 1) {
                    sb.append((numberOfDiagonalCells - (X - sum - 1)) + "/" + (X - sum));
                    break;
                } else {
                    sb.append((X - sum) + "/" + (numberOfDiagonalCells - (X - sum - 1)));
                    break;
                }
            } else {
                sum += numberOfDiagonalCells;
                numberOfDiagonalCells++;
            }
        }
        System.out.print(sb);
    }
}