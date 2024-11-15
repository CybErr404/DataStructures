public class PizzaFactory {
    //Super class pizza - sub out to chicago style, new york style, and sicilian style
    //Write a class Factory. It will contain a switch statement that returns a construction
    //of one of those types of pizza.
    //Another class - constructs a pizza factory and asks the pizza to construct pizzas for them.
        //Pizza hut has a pizza factory. "hey pizza factory, generate a sicilian pizza!"
            //calls ONLY the pizza factory object and pz.generate(sicilian) which will give that pizza.

    //GOAL - Pizza hut can ask a pizza factory to construct unique classes at runtime

    private Pizza pizza;
    public PizzaFactory() {
        pizza = new Pizza();
    }

    public void generate(String pizzaType) {
        switch(pizzaType) {
            case "sicilian":
                Sicilian newSicilian = new Sicilian();
                System.out.println("You ordered a " + newSicilian.getName() +
                        " pizza! A Sicilian pizza object has been created.");
                break;
            case "new york":
                NewYork newNewYork = new NewYork();
                System.out.println("You ordered a " + newNewYork.getName() +
                        " pizza! A New York style pizza object has been created.");
                break;
            case "chicago":
                Chicago newChicago = new Chicago();
                System.out.println("You ordered a " + newChicago.getName() +
                        " pizza! A Chicago style pizza object has been created.");
                break;
            default:
                System.out.println("That is not a valid pizza type. Enter a valid pizza type!");
        }
    }
}
