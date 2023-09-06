package InOut;
import java.util.Scanner;

public class _1152_wordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int result = 0;

        for (String word : words) {
            if (!word.isBlank()) {
                result++;
            }
        }

        System.out.println(result);
    }
}
