package nDimensionalArrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2738_matrixMultiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] dimensions = reader.readLine().split(" ");
        int n = Integer.parseInt(dimensions[0]); // 행의 개수
        int m = Integer.parseInt(dimensions[1]); // 열의 개수

        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[n][m];

        // 행렬 A 입력 받기
        for (int i = 0; i < n; i++) {
            String[] row = reader.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = Integer.parseInt(row[j]);
            }
        }

        // 행렬 B 입력 받기
        for (int i = 0; i < n; i++) {
            String[] row = reader.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrixB[i][j] = Integer.parseInt(row[j]);
            }
        }

        int[][] resultMatrix = new int[n][m];

        // 행렬 곱셈 수행
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println(); // 다음 행으로 넘어가기 위해 줄바꿈
        }
    }
}
