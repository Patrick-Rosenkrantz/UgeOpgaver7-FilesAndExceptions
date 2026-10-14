package Opgave3;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    void main(String[] args) {

        try {
            ArrayList<String> lines = readLines("data/players");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }



        /*
        try {
            ArrayList<String> lines = readLines("data/players");
            for(String line : lines){
                System.out.println(line);
                    }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
         */
    }

    public ArrayList<String> readLiness(String path) throws FileNotFoundException{
        ArrayList<String> lines = new ArrayList<>();
        Scanner scan = new Scanner(new File(path));
        while (scan.hasNextLine()){
            lines.add(scan.nextLine());
        }
        scan.close();
        return lines;
    }

    public ArrayList readLines(String path) throws FileNotFoundException {
        ArrayList lines = new ArrayList<>();
            Scanner scan = new Scanner(new File(path));
            while (scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }
            scan.close();
        return lines;
        }
    }


