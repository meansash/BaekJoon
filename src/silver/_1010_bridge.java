package  silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1010_bridge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        long[] results = new long[test];
        for (int i = 0; i < test; i++) {
            String[] input = reader.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            long result = combinationOfBridge(n, m);
            results[i] = result;
        }
        // 결과 출력
        for (int i = 0; i < test; i++) {
            System.out.println(results[i]);
        }
    }

    private static long combinationOfBridge(int n, int m) {
        // (m! * (n-m)!)/n! 계산
        long result = 1;

        // m이 n-m보다 큰 경우 m을 n-m으로 바꿔 계산하기 위해
        if (m > n - m) {
            m = n - m;
        }

        // (m! * (n-m)!)/n! 계산
        for (int i = 1; i <= m; i++) {
            result *= n - i + 1;
            result /= i;
        }

        return result;
    }
}
