package InOut;

import java.util.Scanner;

public class _10871_smallerThanX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String[] firstLineTokens = firstLine.split(" ");
        int n = Integer.parseInt(firstLineTokens[0]);
        int x = Integer.parseInt(firstLineTokens[1]);

        String secondLine = scanner.nextLine();
        String[] secondLineTokens = secondLine.split(" ");
        int[] printNumbers = new int[n];
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(secondLineTokens[i]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] < x) {
                printNumbers[count] = numbers[i];
                count++;
            }

        }
        for (int i = 0; i < count; i++) {
            System.out.print(printNumbers[i] + " ");
        }
        }
    }

