package Opgave1;

import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);

     void main(String[] args) {
        System.out.println(promptNumber("Write a number"));
    }

    public int promptNumber(String msg) {
        System.out.println(msg);
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Use a number");
            return promptNumber(msg);
        }
    }


}
