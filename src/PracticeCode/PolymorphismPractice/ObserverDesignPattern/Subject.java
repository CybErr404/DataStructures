package PracticeCode.PolymorphismPractice.ObserverDesignPattern;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observerCollection;

    public Subject() {
        observerCollection = new ArrayList<>();
    }

    public String registerObserver(Observer observer, String name) {
        observer.setName(name);
        observerCollection.add(observer);
        return "User " + observer.getName() + " has been added.";
    }

    public String unregisterObserver(Observer observer) {
        if(observerCollection.contains(observer)) {
            observerCollection.remove(observer);
            return "The following user has been removed: " + observer.getName();
        }
        else {
            return "This user is not currently in the mailing list.";
        }
    }

    public String notifyUsers() {
        int count = 0;
        for(int i = 0; i < observerCollection.size(); i++) {
            if(i % 2 == 0) {
                observerCollection.get(i).update();
                count++;
            }
        }
        return "Users have been updated! Total number of users updated: " + count;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < observerCollection.size(); i++) {
            if(i == observerCollection.size() - 1) {
                result = result + observerCollection.get(i).getName();
            }
            else {
                result = result + observerCollection.get(i).getName() + ", ";
            }
        }
        return result;
    }
}
