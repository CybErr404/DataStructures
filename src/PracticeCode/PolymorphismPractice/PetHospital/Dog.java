package PracticeCode.PolymorphismPractice.PetHospital;

public class Dog implements Measurable {
    private double weight;
    public Dog() {
        weight = 10.0;
    }
    @Override
    public double measure() {
        return weight;
    }
}
