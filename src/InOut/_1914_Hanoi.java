package InOut;

import java.util.Scanner;
import java.math.BigInteger;

public class _1914_Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 20) {
            long tempResult = 1;
            for (int i = 0; i < n; i++) {
                tempResult *= 2;
            }
            long result = tempResult - 1;
            System.out.println(result);
        } else {
            // 2의 n승 - 1을 BigInteger로 계산
            BigInteger bigResult = BigInteger.valueOf(2).pow(n).subtract(BigInteger.ONE);
            System.out.println(bigResult);
        }

        hanoi(n, 1, 2, 3);
    }

    static void hanoi(int n, int start, int via, int to) {
        if (0 < n && n <= 20) {
            if (n == 1) {
                move(start, to);
                return;
            } else {
                hanoi(n - 1, start, to, via);
                move(start, to);
                hanoi(n - 1, via, start, to);
            }
        }
    }

    static void move(int start, int to) {
        System.out.println(start + " " + to);
    }
}
