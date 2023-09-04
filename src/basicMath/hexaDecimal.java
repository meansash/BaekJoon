package basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class hexaDecimal {
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> decimal = new HashMap<>();
        for (char c = 'A'; c<= 'Z'; c++)
        {
            decimal.put(String.valueOf(c),10 + (c-'A'));
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        String hexNumber = input[0];
        int base = Integer.parseInt(input[1]);

        int decimalValue = 0;
        int positionValue = 1;

        // 오른쪽에서 왼쪽으로 자리수를 곱해가며 10진법 값 계산
        for (int i = hexNumber.length()-1; i >= 0; i--) {
            String digit = String.valueOf(hexNumber.charAt(i));
            int digitValue = decimal.containsKey(digit) ? decimal.get(digit) : Integer.parseInt(digit);
            decimalValue += digitValue * positionValue;
            positionValue *= base;
        }

        System.out.println(decimalValue);
    }
}
