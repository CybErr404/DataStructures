package PracticeCode.InheritancePractice.GradeExample;

import java.util.Scanner;
public class TestFinalExam {
    public static void main(String[] args) {
        int questions;
        int missed;

        Scanner input = new Scanner(System.in);
        System.out.print("How many questions are on the final exam? ");
        questions = input.nextInt();

        System.out.print("How many questions did the student miss? ");
        missed = input.nextInt();

        FinalExam exam = new FinalExam(questions, missed);

        System.out.println("Each question is worth " + exam.getPointsEach() + " points. " +
                "The exam score is " + exam.getScore() + " and the grade is a " + exam.getGrade() + ".");
    }
}
