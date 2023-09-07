package InOut;

import java.util.Scanner;

public class _10872_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long factorial = 1;
        if (number != 0)
        {
            for (int i = 1 ; i <= number; i++) {
                factorial *= i;
            }
        }

        System.out.println(factorial);
    }
}
