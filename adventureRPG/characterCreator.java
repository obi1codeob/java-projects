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
            System.out.println("POWERS: Histkin: Recover health 10x faster for 60 seconds, once per day");
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

            case "d":
                System.out.println("You have selected: Dark Elf");
                System.out.println();
                System.out.println("ABILITIES: Resist Fire 50%");
                System.out.println("POWERS: Ancestor's Wrath: Opponents getting to close take 8 points of damage per second for 60 seconds, once per day");
                System.out.println("INITIAL BONUSES: +10 Destruction; +5 Alchemy, Alteration, Illusion, Light Armor, Sneak");
                System.out.println("SPELLS: Sparks");
                break;

            case "h":
                System.out.println("You have selected: High Elf");
                System.out.println();
                System.out.println("ABILITIES: +50 Magika, Survival: Resist Fatigue 25%");
                System.out.println("POWERS: Highborn: Regenerate magika 25x faster for 60 seconds, once per day");
                System.out.println("INITIAL BONUSES: +10 Illusion, +5 Alteration, Conjuration, Destruction, Enchanting, Restoration");
                System.out.println("SPELLS: Fury");
                break;

            case "i":
                System.out.println("You have selected: Imperial");
                System.out.println();
                System.out.println("ABILITIES: Imperial Luck: Imperials always find more gold");
                System.out.println("POWERS: Voice of the Emperor: Calms nearby people for 60 seconds, once per day");
                System.out.println("INITIAL BONUSES: +10 Restoration, +5 Block, Destruction, Enchanting, Heavy Armor, One-Handed");
                break;

            case "k":
                System.out.println("You have selected: Khajit");
                System.out.println();
                System.out.println("ABILITIES: Claws: 12 damage, Survival: +15 Warmth. May consume raw meat without food poisoning");
                System.out.println("POWERS: Nighteye: Improved night vision for 60 seconds; unlimited use per day");
                System.out.println("INITIAL BONUSES: +10 Sneak, +5 Alchemy, Archery, Lockpicking, Pickpocket, One-Handed");
                break;

            case "n":
                System.out.println("You have selected: Nord");
                System.out.println();
                System.out.println("ABILITIES: Resist Frost 50%, Survival: +25 Warmth");
                System.out.println("POWERS: Battle Cry: Targets flee for 30 seconds, once per day");
                System.out.println("INITIAL BONUSES: +10 Two-Handed, +5 Block, Light Armor, One-Handed, Smithing, Speech");
                break;

            case "o":
                System.out.println("You have selected: Orc");
                System.out.println();
                System.out.println("ABILITIES: Survival: Resist Fatigue and Hunger 15%, +10 Warmth");
                System.out.println("POWERS: Berserker Rage: You take half damage and do double damage for 60 seconds, once per day");
                System.out.println("INITIAL BONUSES: +10 Heavy Armor, +5 Block, Enchanting, One-Handed, Smithing, Two-Handed");
                break;

            case "r":
                System.out.println("You have selected: Redguard");
                System.out.println();
                System.out.println("ABILITIES: Resist Poison 50%");
                System.out.println("POWERS: Adrenaline Rush: Stamina regenerates 10x faster for 60 seconds, once per day");
                System.out.println("INITIAL BONUSES: +10 One-Handed, +5 Alteration, Archery, Block, Destruction, Smithing");
                break;

            case "w":
                System.out.println("You have selected: Wood Elf");
                System.out.println();
                System.out.println("ABILITIES: Resist Poison 50%, Resist Disease 50%, Survival: Resist Fatigue 25%");
                System.out.println("POWERS: Command Animal: Make an animal an ally for 60 seconds once per day");
                System.out.println("INITIAL BONUSES: +10 Archery, +5 Alchemy, Light Armor, Lockpicking, Pickpocket, Sneak");
                break;
        }

    }
}
