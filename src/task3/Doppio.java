package task3;

public class Doppio extends CoffeeMachine implements ICoffee{
    @Override
    public String makeDrink() {
        String doppio = "Doppio: " + getCoffee() + " " + getCoffee() + " " + getWater();
        return doppio;
    }
}
