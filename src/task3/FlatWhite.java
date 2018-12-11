package task3;

public class FlatWhite extends CoffeeMachine implements ICoffee{
    @Override
    public String makeDrink() {
        String flatWhite = "Flat White: " + getCoffee() + " " + getWater() +" " + getCoffee() + " "+ getMilk();
        return flatWhite;
    }
}
