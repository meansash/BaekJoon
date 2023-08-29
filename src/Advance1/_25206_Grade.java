package Advance1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _25206_Grade {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> grade = new HashMap<>();
        grade.put("A+", 4.5);
        grade.put("A0", 4.0);
        grade.put("B+", 3.5);
        grade.put("B0", 3.0);
        grade.put("C+", 2.5);
        grade.put("C0", 2.0);
        grade.put("D+", 1.5);
        grade.put("D0", 1.0);
        grade.put("F", 0.0);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numSubjects = 20;

        String[] subjects = new String[numSubjects];
        Double[] subjectsCredit = new Double[numSubjects];
        Double[] subjectsScore = new Double[numSubjects];

        double totalCredits = 0.0;
        double totalWeightedScore = 0.0;

        for (int i = 0; i < numSubjects; i++) {
            subjects[i] = reader.readLine();
            String[] info = subjects[i].split(" ");
            String gradeString = info[2];

            if (grade.containsKey(gradeString)) {
                subjectsScore[i] = grade.get(gradeString);

                String creditString = info[1];
                if (!creditString.isEmpty()) {
                    subjectsCredit[i] = Double.parseDouble(creditString);
                    totalCredits += subjectsCredit[i];
                    totalWeightedScore += subjectsCredit[i] * subjectsScore[i];
                }
            }
        }

        if (totalCredits != 0.0) {
            double gpa = totalWeightedScore / totalCredits;
            System.out.println(gpa);
        } else {
            System.out.println("No valid subjects with credits found.");
        }
    }
}
