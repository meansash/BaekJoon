package Advance1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class wordCompare {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String word = reader.readLine();
        word = word.toLowerCase();

        Map<String,Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            String c = String.valueOf(word.charAt(i));
            if (frequencyMap.containsKey(c)){
                frequencyMap.put(c,frequencyMap.get(c) + 1);
            }
            else{
                frequencyMap.put(c,1);
            }
        }

        int maxFrequency = 0;
        String mostFrequentAlphabet = "";
        boolean ismultiple = false;

        for (String a :
                alphabet) {
            if (frequencyMap.containsKey(a)){
                int frequency = frequencyMap.get(a);
                if (frequency > maxFrequency)
                {
                    maxFrequency = frequency;
                    mostFrequentAlphabet = a;
                    ismultiple = false;
                } else if (frequency == maxFrequency) {
                    ismultiple = true;

                }
            }
        }
        if (ismultiple)
        {
            System.out.println("?");
        }
        else {
            System.out.println(mostFrequentAlphabet.toUpperCase());
        }
    }
}
