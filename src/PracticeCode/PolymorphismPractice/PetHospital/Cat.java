package PracticeCode.PolymorphismPractice.PetHospital;

public class Cat implements Measurable {
    private double weight;
    public Cat() {
        weight = 5.0;
    }
    @Override
    public double measure() {
        return weight;
    }
}
