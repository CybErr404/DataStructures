package PracticeCode.PolymorphismPractice.PetHospital;

public class Turtle implements Measurable {
    private double age;
    public Turtle() {
        age = 100.0;
    }
    @Override
    public double measure() {
        return age;
    }
}
