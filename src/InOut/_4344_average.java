package InOut;


import java.util.Scanner;

//        Scanner 클래스의 메서드를 사용할 때, nextLine() 메서드를 주의하자!
//        nextLine() 앞에 공백문자를 사용할 때, 특히 Enter를 사용할 때
//        웬만하면 nextLine()을 한번 더 써주어서 공백문자를 없애주자.
public class _4344_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스의 개수
        int testCase = sc.nextInt();
        // 테스트 케이스의 개수 입력후 엔터를 누르면 입력으로 처리돼서 만약에 테스트 케이스
        // 길이가 5라면 4줄밖에 입력받지 못하기 때문에 nextLine()을 한번 더 써서 공백문자 없애기.
        sc.nextLine();
        int students[] = new int[testCase];
        double gradeAverage[] = new double[testCase];
        double studnetAverage[] = new double[testCase];
        for (int i = 0; i < testCase; i++) {
            String input = sc.nextLine();
            // 공백을 기준으로 input값을 나눈다
            String[] parts = input.split(" ");
            // 나눈 input값 중에서 첫번째 입력값을 학생수로 설정
            students[i] = Integer.parseInt(parts[0]);
            int totalGrade = 0;
            for (int j = 1; j <= students[i]; j++) {
                int grade = Integer.parseInt(parts[j]);
                totalGrade += grade;
            }
            gradeAverage[i] = (double) totalGrade/students[i];
        }
        for (int i = 0; i < testCase; i++) {
            System.out.println(gradeAverage[i]);
        }




    }
}

