package Opgave5;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");

        data.add("Vand, Stille kildevand, gratis");

        double totalPrice = 0;
        for (String s : data){
            String[] values = s.split(",");
            String type = values[0].trim();
            String description = values[1].trim();
            try {
                double price = Double.parseDouble(values[2].trim());
                totalPrice += price;
                System.out.println(type+" \n" +
                        "Description: "+description +"\n" +
                        "Price: "+ price);
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("Invalid price");
            }

        }
    }
}
