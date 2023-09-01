package nDimensionalArrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10798_verticalReading {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[][] matrixA = new String[15][15];

        for (int i = 0; i < 5; i++) {
            String rowStr = reader.readLine();
            for (int j = 0; j < rowStr.length(); j++) {
                matrixA[j][i] = String.valueOf(rowStr.charAt(j));
            }
        }

        // 행과 열을 뒤집은 배열을 만들기 위한 임시 배열
        String[][] transposedMatrix = new String[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                transposedMatrix[i][j] = matrixA[j][i];
            }
        }

        // 뒤집은 배열 출력
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (transposedMatrix[j][i] != null) {
                    System.out.print(transposedMatrix[j][i]);
                }
            }
        }
        System.out.println();
    }
}
