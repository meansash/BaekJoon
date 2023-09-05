package InOut;

import java.util.Scanner;

public class _8958_OXquiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        scanner.nextLine(); // 테스트 케이스 수를 읽고 개행 문자 소비

        for (int i = 0; i < testCase; i++) {
            String ox = scanner.nextLine();
            int sum = 0;
            int count = 0;

            for (int j = 0; j < ox.length(); j++) {
                if (ox.charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
