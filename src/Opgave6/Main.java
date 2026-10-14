package Opgave6;

public class Main {
    static void main(String[] args) {
        Cafe cafe = new Cafe();

        cafe.loadData("data/menu");

        cafe.showMenu();
    }

}
