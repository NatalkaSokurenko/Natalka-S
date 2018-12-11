package task3;

public class Latte extends CoffeeMachine implements ICoffee {
    @Override
    public String makeDrink() {
        String latte = "Latte: " + getCoffee() + " " + getWater() + " "+ getMilk();
        return latte;
    }
}
