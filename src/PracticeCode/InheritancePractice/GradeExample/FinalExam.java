package PracticeCode.InheritancePractice.GradeExample;

public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int questions, int missed) {
        pointsEach = 100.0 / questions;
        double numericScore = 100.0 - (missed * pointsEach);
        numQuestions = questions;
        numMissed = missed;
        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
