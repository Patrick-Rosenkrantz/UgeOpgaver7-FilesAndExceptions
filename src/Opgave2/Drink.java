package Opgave2;

public class Drink {

    private String name;
    private double price;

    public Drink(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new IllegalArgumentException("Price cant be under 0");
        }
        this.price = price;
    }
}
