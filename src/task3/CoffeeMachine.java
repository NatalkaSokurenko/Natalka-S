package task3;

public class CoffeeMachine {
    public static void main(String[] args) {
                Americano americano = new Americano();
        System.out.println(americano.makeDrink());

        Doppio doppio = new Doppio();
        System.out.println(doppio.makeDrink());

        Espresso espresso = new Espresso();
        System.out.println(espresso.makeDrink());

        FlatWhite flatWhite = new FlatWhite();
        System.out.println(flatWhite.makeDrink());

        Latte latte = new Latte();
        System.out.println(latte.makeDrink());
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
