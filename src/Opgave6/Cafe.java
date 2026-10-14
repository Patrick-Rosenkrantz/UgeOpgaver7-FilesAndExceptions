package Opgave6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {



    ArrayList<Drink> coffeeMenu = new ArrayList<>();


    public void loadData(String pathName){
            File path = new File(pathName);
            try {
                Scanner scan = new Scanner(path);

                scan.nextLine();
                while (scan.hasNextLine()) {
                    String saveString = scan.nextLine();
                    String[] values = saveString.split(",");
                    String drinkName = values[0].trim();
                    try{
                        int drinkPrice = Integer.parseInt(values[1].trim());
                        int drinkSoldNumber = Integer.parseInt(values[2].trim());

                        coffeeMenu.add(new Drink(drinkName,drinkPrice,drinkSoldNumber));


                    } catch (NumberFormatException e){
                        System.out.println("Invalid drink number");
                    }
                }
                scan.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }


        public void saveData(){
        File file = new File("data/menu");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Name, Price, SoldNumber\n");
            for (Drink d : coffeeMenu){
                fileWriter.write(d.toString()+"\n");

            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File not read");
        }
        }


        public void showMenu(){
        for (Drink d : coffeeMenu){
            System.out.println(d);
        }
        }
    }
