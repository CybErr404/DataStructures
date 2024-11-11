package PracticeCode.InheritancePractice.GradeExample;

import java.util.Scanner;
public class TestCurvedActivity {
    public static void main(String[] args) {
        double score;
        double curvePercent;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student's raw numeric score: ");
        score = input.nextDouble();

        System.out.println("Enter the curve percentage: ");
        curvePercent = input.nextDouble();

        CurvedActivity curvedExam = new CurvedActivity(curvePercent);
        curvedExam.setScore(score);

        System.out.println("The raw score is: " + curvedExam.getRawScore() + " points.");
        System.out.println("The curved score is: " + curvedExam.getScore());
        System.out.println("The exam grade is: " + curvedExam.getGrade());
    }
}
