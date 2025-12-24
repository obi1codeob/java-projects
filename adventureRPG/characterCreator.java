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
        System.out.println();
        //Get user input for character race and output race name based on user selection
        String race = sc.next();

        switch (race) {
            case "a":
            System.out.println("You have selected: Argonian");
            System.out.println();
            System.out.println("ABILITIES: Resist Disease 50%, Waterbreathing,Higher Unarmed Damage, Survival: Weakness to Cold 25%. May consume raw meat without food poisoning");
            System.out.println("POWERS: Histkin: Recover healt 10x faster for 60 seconds, once per day");
            System.out.println("INITIAL BONUSES: +10 Lockpicking; +5 Alteration, Light Armor, Pickpocket, Restoration, Sneak");
            break;

            case "b":
                System.out.println("You have selected: Breton");
                System.out.println();
                System.out.println("ABILITIES: Resist Magic 25%");
                System.out.println("POWERS: Dragonskin: Absorb 50% of the magika from hostile spells for 60 seconds, once per day");
                System.out.println("INITIAL BONUSES: +10 Conjuration; +5 Alchemy, Alteration, Illusion, Restoration, Speech");
                System.out.println("SPELLS: Conjure Familiar");
                break;
        }

    }
}
