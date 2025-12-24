package adventureRPG;

import java.util.Scanner;
import java.util.Random;

public class characterCreator {
    public static void main(String[] args) {

        //Create new scanner
        Scanner sc = new Scanner(System.in);

        //Create new random
        Random rand =  new Random();

        //Game welcome screen
        System.out.println("*****************************************");
        System.out.println(" Welcome to Adventure Character Creator!");
        System.out.println("*****************************************");
        System.out.println();

        //Ask user to choose character race
        System.out.println("1. Select a race for your character from the table below: ");
        System.out.println("[a] Argonian     [b] Breton     [d] Dark Elf     [h] High Elf     [i] Imperial");
        System.out.println("[k] Khajit       [n] Nord       [o] Orc          [r] Redguard     [w] Wood Elf");
        String race = sc.next();


    }
}
