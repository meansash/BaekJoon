package Advance1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1316_Checker {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int totalWord = Integer.parseInt(reader.readLine());
        String[] values = new String[totalWord];
        for (int i = 0; i < totalWord; i++) {
            values[i] = reader.readLine();
        }
        reader.close();
        // 주어진 단어가 그룹 단어인지 확인하기 위해서는 단어 내의 각 문자에 대해 순회하며 이전 문자와 동일한지
        // 그리고 이미 나온 문자인지 확인
        int groupWordCount = 0;
        for (int i = 0; i < totalWord; i++) {
            String word = values[i];
            boolean[] visited = new boolean[123];
            // 첫 번째 문자를 이전 문자로 설정
            char prevChar = word.charAt(0);
            visited[prevChar - 'a'] = true;
            boolean isGroupWord = true;
            for (int j = 0; j < word.length(); j++) {
                // 현재 문자
                char currentChar = word.charAt(j);
                // 이전 문자와 다르고, 이미 방문한 적 없는 경우
                if (prevChar != currentChar && !visited[currentChar - 'a']) {
                    visited[currentChar - 'a'] = true;
                    prevChar = currentChar; // 이전 문자 업데이트
                }
                // 이전문자랑 다른데, 이미 방문했을때 즉 단어 조건 위배
                else if (prevChar != currentChar && visited[currentChar - 'a']) {
                    isGroupWord = false;
                    break;
                }
                // 이전 문자와 같은 경우지만 그룹 단어 조건 만족할때
                else if (prevChar == currentChar) {
                    // 계속 진행
                }


            }

            if (isGroupWord) {
                groupWordCount++;
            }

        }
        System.out.println(groupWordCount);
    }
}