package oyun;
import java.util.Scanner;

public class oyun1 {

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num == -1) {
                    System.out.print("X ");
                } else {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }

    public static void checkNeighbors(int[][] matrix, int row, int col, int target) {
        int[] directions = {-1, 0, 1, 0}; // Yukarı, Sağ, Aşağı, Sol

        int targetValue = matrix[row][col];
        matrix[row][col] = -1; // Girilen koordinata -1 değeri atandı

        for (int i = 0; i < 4; i++) {
            int r = row + directions[i];
            int c = col + directions[(i + 1) % 4];

            while (r >= 0 && r < matrix.length && c >= 0 && c < matrix[0].length) {
                if (matrix[r][c] == targetValue) {
                    matrix[r][c] = -1; // -1, X karakterini temsil eder
                    // Aynı sayıyı bulduk, şimdi bu hücrenin komşularını kontrol et
                    for (int j = 0; j < 4; j++) {
                        int nr = r + directions[j];
                        int nc = c + directions[(j + 1) % 4];

                        while (nr >= 0 && nr < matrix.length && nc >= 0 && nc < matrix[0].length) {
                            if (matrix[nr][nc] == targetValue) {
                                matrix[nr][nc] = -1;
                            } else {
                                break;
                            }

                            nr += directions[j];
                            nc += directions[(j + 1) % 4];
                        }
                    }
                } else {
                    break;
                }

                r += directions[i];
                c += directions[(i + 1) % 4];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Verilen matris
        int[][] matrix = {
            {1, 1, 4, 5, 2, 5, 5, 6, 7},
            {1, 2, 2, 2, 6, 9, 6, 2, 8},
            {8, 5, 2, 1, 8, 8, 8, 7, 3},
            {4, 2, 1, 6, 7, 7, 7, 3, 5},
            {4, 2, 4, 6, 7, 1, 1, 5, 6},
            {4, 2, 1, 6, 9, 4, 6, 1, 9},
            {4, 2, 7, 4, 9, 9, 9, 1, 2},
            {1, 2, 2, 2, 6, 9, 6, 2, 8},
            {8, 5, 2, 1, 8, 8, 8, 7, 3}
        };

        while (true) {
            System.out.println("\nOyun Haritası:");
            printMatrix(matrix);

            System.out.print("Koordinat girin (örn: 4 5) veya oyunu sonlandırmak için 0 0 girin: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row == 0 && col == 0) {
                System.out.println("Oyun sonlandırıldı.");
                break;
            }

            if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length) {
                checkNeighbors(matrix, row, col, matrix[row][col]);
            } else {
                System.out.println("Geçersiz koordinat! Tekrar deneyin.");
            }
        }

        scanner.close();
    }
}
