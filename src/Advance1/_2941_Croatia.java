package Advance1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941_Croatia {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String croatiaWord = reader.readLine();

        croatiaWord = croatiaWord.replace("c=", "a");
        croatiaWord = croatiaWord.replace("c-", "a");
        croatiaWord = croatiaWord.replace("dz=", "a");
        croatiaWord = croatiaWord.replace("d-", "a");
        croatiaWord = croatiaWord.replace("lj", "a");
        croatiaWord = croatiaWord.replace("nj", "a");
        croatiaWord = croatiaWord.replace("s=", "a");
        croatiaWord = croatiaWord.replace("z=", "a");

        System.out.println(croatiaWord.length());
    }
}
