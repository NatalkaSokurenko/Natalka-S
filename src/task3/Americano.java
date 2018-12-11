package task3;

public class Americano extends CoffeeMachine implements ICoffee{
    public String makeDrink(){
        String americano = "Americano: " + getCoffee() + " " + getWater()+ " " + getWater();
        return americano;
    }
}
