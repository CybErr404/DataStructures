package PracticeCode.PolymorphismPractice.ObserverDesignPattern;

public class Youths implements Observer {
    private String userName;
    public void update() {
        System.out.println("User " + this.getName() + " has been updated.");
    }

    public void setName(String name) {
        userName = name;
    }
    public String getName() {
        return userName;
    }
}
