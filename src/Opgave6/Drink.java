package Opgave6;

public class Drink {
    private String name;
    private int price;
    private int soldNumber;

    public Drink(String name, int price, int soldNumber) {
        this.name = name;
        this.price = price;
        this.soldNumber = soldNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSoldNumber() {
        return soldNumber;
    }

    public void setSoldNumber(int soldNumber) {
        this.soldNumber = soldNumber;
    }

    public String toString(){
        return name+", "+price+", "+soldNumber;
    }
}
