import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = Integer.parseInt(sc.nextLine());
        char[][] image = new char[n][n];
        for (int i = 0; i < n; i++) {
            image[i] = sc.nextLine().toCharArray();
        }
        String result = compress(image, 0, 0, n);
        System.out.println(result);
    }

    private static String compress(char[][] image, int row, int col, int size) {
        if (isUniform(image, row, col, size)) {
            return String.valueOf(image[row][col]);
        }
        int half = size / 2;
        StringBuilder sb = new StringBuilder("(");
        sb.append(compress(image, row, col, half));
        sb.append(compress(image, row, col + half, half));
        sb.append(compress(image, row + half, col, half));
        sb.append(compress(image, row + half, col + half, half));
        sb.append(")");
        return sb.toString();
    }

    private static boolean isUniform(char[][] image, int row, int col, int size) {
        char base = image[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (image[i][j] != base) return false;
            }
        }
        return true;
    }
}
