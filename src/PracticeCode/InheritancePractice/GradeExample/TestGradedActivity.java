package PracticeCode.InheritancePractice.GradeExample;

import java.util.Scanner;
public class TestGradedActivity {
    public static void main(String[] args) {
        double testScore;
        Scanner input = new Scanner(System.in);
        GradedActivity grade = new GradedActivity();
        System.out.println("Enter a numeric test score: ");
        testScore = input.nextDouble();
        grade.setScore(testScore);
        System.out.println("The grade for that test is: " + grade.getGrade());
    }
}
