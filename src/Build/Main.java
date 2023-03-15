package Build;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder=new PizzaBuilder();
        Pizza pizzaThon=pizzaBuilder.withThon("thon de tomate").withSauce("tomate").build();
        System.out.println("Pizza thon : "+pizzaThon);
    }
}
