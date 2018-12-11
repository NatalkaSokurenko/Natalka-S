package task3;

public class Espresso extends CoffeeMachine implements ICoffee {
    @Override
    public String makeDrink() {
        String espresso = "Espresso: " + getCoffee() + " " + getWater();
        return espresso;
    }
}
