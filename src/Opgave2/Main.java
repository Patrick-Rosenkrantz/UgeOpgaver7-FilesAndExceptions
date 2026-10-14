package Opgave2;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        /*
        Drink drink = new Drink("Cola", 20.0);

        try{
            drink.setPrice(-20);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

         */



        Lister lister = new Lister();
        ArrayList<String> names = new ArrayList<>();

        String name = "James";
        String name1 = "Buddy";
        String name2 = "Luna";
        String name3 = "Patrick";

        names.add(name);
        names.add(name1);
        names.add(name2);
        names.add(name3);

        try {
            lister.getItem(names, 5);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }


    }
}
