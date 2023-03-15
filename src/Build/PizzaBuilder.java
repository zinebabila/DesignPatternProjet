package Build;

public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }
    public PizzaBuilder withSauce(String sauce){
        pizza.setSauce(sauce);
        return this;
    }
    public PizzaBuilder withThon(String thon){
        pizza.setThon(thon);
        return this;
    }
    public PizzaBuilder withOlive(String olive){
        pizza.setOlive(olive);
        return this;
    }
    public PizzaBuilder withViandeHachee(String viandeHachee){
        pizza.setViande_hachee(viandeHachee);
        return this;
    }
    public Pizza build(){
        return pizza;
    }
}
