package nDimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2566_maximumValue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrixA = new int[9][9];
        int maxRow = 0; // 최댓값이 있는 행의 인덱스
        int maxCol = 0; // 최댓값이 있는 열의 인덱스
        int maxValue = Integer.MIN_VALUE; // 최댓값

        for (int i = 0; i < 9; i++) {
            String[] rowStr = reader.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                matrixA[i][j] = Integer.parseInt(rowStr[j]);
                if (matrixA[i][j] > maxValue) {
                    maxValue = matrixA[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println(maxValue);
        System.out.println((maxRow + 1) + " " + (maxCol + 1));
    }
}
