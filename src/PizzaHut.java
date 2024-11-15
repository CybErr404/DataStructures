public class PizzaHut {
    public static void main(String[] args) {
        System.out.println("Welcome to Pizza Hut!");
        PizzaFactory order = new PizzaFactory();
        order.generate("sicilian");
        order.generate("new york");
        order.generate("chicago");
        order.generate("fjesiogjrougjr");
    }
}
