package PracticeCode;

public class TestSheep {
    public static void main(String[] args) {
        //jerry is a copy of the sheep program and can do program things.
        //used the default, basic constructor to create a sheep. named jerry.
        //Sheep jerry = new Sheep();

        //used the filled constructor to create a new sheep.
        Sheep jerry = new Sheep("Orange", 10000);

        //sets the color to green, which can be done because jerry is a copy of the sheep program.
        jerry.setColor("Green");
    }
}
