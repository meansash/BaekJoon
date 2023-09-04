package InOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _2588_Product {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        if (!y.isEmpty()){
            char firstChar = y.charAt(0);
            char middleChar = y.charAt(y.length()-2);
            char lastChar = y.charAt(y.length()-1);
            int firstInt = Character.getNumericValue(firstChar);
            int middleInt = Character.getNumericValue(middleChar);
            int lastInt = Character.getNumericValue(lastChar);

            System.out.println(Integer.parseInt(x) * lastInt);
            System.out.println(Integer.parseInt(x) * middleInt);
            System.out.println(Integer.parseInt(x) * firstInt);
            System.out.println(Integer.parseInt(x) * Integer.parseInt(y));
        }






    }
}
