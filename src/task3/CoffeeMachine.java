package task3;

public class CoffeeMachine {
    public static void main(String[] args) {
        ICoffee[] drinks = {new Americano(), new Doppio(), new Espresso(), new FlatWhite(), new Latte() };
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i].makeDrink());
        }
    }

    private String coffee = "coffee";
    private String water ="water";
    private String milk ="milk";

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

}
