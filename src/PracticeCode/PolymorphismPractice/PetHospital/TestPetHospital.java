package PracticeCode.PolymorphismPractice.PetHospital;

public class TestPetHospital {
    public static void main(String[] args) {
        PetHospital test = new PetHospital();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Turtle turtle = new Turtle();
        System.out.println(test.getInfo(dog));
        System.out.println(test.getInfo(cat));
        System.out.println(test.getInfo(turtle));
    }
}
