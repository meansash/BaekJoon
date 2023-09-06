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
        sc.nextLine();
        int students[] = new int[testCase];
        double gradeAverage[] = new double[testCase];

        for (int i = 0; i < testCase; i++) {
            String input = sc.nextLine();
            // 공백을 기준으로 문자열 나눠서 저장
            String[] parts = input.split(" ");
            // 나눈 문자중 가장 첫번째의 문자를 학생 수로 저장
            students[i] = Integer.parseInt(parts[0]);
            // 점수평균을 내기위한 총점수 변수
            int totalGrade = 0;
            int aboveAverageCount = 0; // 평균 이상의 학생 수

            for (int j = 1; j <= students[i]; j++) {
                // input 문자열의 1번째 인덱스부터 불러들임
                // 즉 학생들의 점수를 저장하는 변수
                int grade = Integer.parseInt(parts[j]);
                totalGrade += grade;
            }
            // 각 줄의 점수 평균을 구함
            gradeAverage[i] = (double) totalGrade / students[i];

            // 평균 이상의 학생 수 세기
            for (int j = 1; j <= students[i]; j++) {
                int grade = Integer.parseInt(parts[j]);
                if (grade > gradeAverage[i]) {
                    aboveAverageCount++;
                }
            }

            // 평균 이상의 학생 비율 계산
            double aboveAverageRatio = (double) aboveAverageCount / students[i];

            // 결과 출력
            System.out.println((aboveAverageRatio * 100) + "%");
        }
    }
}