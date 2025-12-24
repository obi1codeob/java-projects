package adventureRPG;

import java.util.Scanner;
import java.util.Random;

public class characterCreator {
    public static void main(String[] args) {

        //Create new scanner
        Scanner sc = new Scanner(System.in);

        //Create new random
        Random rand =  new Random();

        //Declare variables

        //Character descriptors
        String characterRace;
        String characterClass;
        Boolean isMale = true;

        //Attributes
        int strength = rand.nextInt();
        int intelligence = rand.nextInt();
        int willpower = rand.nextInt();
        int agility = rand.nextInt();
        int speed = rand.nextInt();
        int endurance = rand.nextInt();
        int personality = rand.nextInt();
        int luck = rand.nextInt();

        //Game welcome screen
        System.out.println("*****************************************");
        System.out.println(" Welcome to Adventure Character Creator!");
        System.out.println("*****************************************");
        System.out.println();

        //Ask user to choose character race
        System.out.println("1. Select a race for your character from the table below: ");
        System.out.println();
        System.out.println("[a] Argonian     [b] Breton     [d] Dark Elf     [h] High Elf     [i] Imperial");
        System.out.println("[k] Khajit       [n] Nord       [o] Orc          [r] Redguard     [w] Wood Elf");
        System.out.println();
        //Get user input for character race and output race name based on user selection
        characterRace = sc.next();

        switch (characterRace) {
            case "a":
            System.out.println("You have selected: Argonian");
            System.out.println("Press ENTER to learn more about your race...");
            sc.nextLine();
            sc.nextLine();
            // Brief race summary
            System.out.println("Enigmatic and intelligent, the Argonians are experts at guerrilla warfare, and their natural abilities suit their swampy homeland, Black Marsh. They have developed immunities to the diseases that have doomed many would-be explorers in the region, and they are capable of easily exploring underwater locations due to their ability to breathe underwater. Argonians make proficient thieves, due to their increased lockpicking and sneaking skills.");
            System.out.println();

            //Ask user if they want a more detailed race summary or not
            System.out.println("Would you like to learn more background about your race? (true) or move on to abilities, powers, and initial bonuses (false)");
            boolean learnMore = true;
            learnMore = sc.nextBoolean();
            if (learnMore) {
                System.out.println("Politics\n" +
                        "\n" +
                        "After conquest of the Dunmer province of Morrowind, little is known about the politics of the Argonians in the Fourth Era. There is an Argonian political faction called the An-Xileel, but there is little information about them, except they are composed of mostly, if not all, Argonians, and that they pushed back Mehrunes Dagon's forces during the Oblivion Crisis in Black Marsh, and were also the faction responsible for orchestrating the conquest of Morrowind.\n" +
                        "Race relations\n" +
                        "\n" +
                        "In Windhelm, Argonians are sequestered from the predominantly Nordic population, and are forced to live at the Argonian Assemblage, located at the city docks. After the mass exodus of Dunmer and Argonian peoples to Windhelm, the citizens became suspicious, worrying that the immigrants would influence or otherwise dilute their culture, and so forced them into segregation. Largely, this extreme behavior was inspired by the political confrontation between the Empires of Tamriel and the rulers of Skyrim. However, this eventually just turned into blatant racism.\n" +
                        "\n" +
                        "Despite the estrangement between the Nords and the Argonians, they are more respected and tolerated in Skyrim than other foreign immigrants due to their beneficial contributions to Nord industries. This beneficial assimilation to Skyrim's economy has helped some Argonians—such as those found in Riften—ingratiate themselves to Skyrim's aloof society.\n" +
                        "Marriage\n" +
                        "\n" +
                        "Unlike the citizens of Skyrim, who prefer to marry using an Amulet of Mara, some Argonians adhere to their native marriage traditions. In Black Marsh, it is customary to present a lover with an Argonian Wedding Band, which is crafted by the courting member. Each ring is unique and has personal meaning to the creator and the recipient. \n" +
                        "\n" +
                        "\"In Black Marsh, tradition dictates we present a potential mate a unique wedding ring to represent our future bond.\"\n" +
                        "\n" +
                        "\"Every Argonian wedding proposal band is supposed to have three flawless amethysts as part of their design. Two of the gems, the ones on the outside, represent the couple to be married... one for the husband, one for the wife. The amethyst in the center represents The Hist, the entity that all Argonians consider a sacred part of our lives.\" – Talen-Jei ");
            }
            else {
                System.out.println("ABILITIES: Resist Disease 50%, Waterbreathing,Higher Unarmed Damage, Survival: Weakness to Cold 25%. May consume raw meat without food poisoning");
                System.out.println("POWERS: Histkin: Recover health 10x faster for 60 seconds, once per day");
                System.out.println("INITIAL BONUSES: +10 Lockpicking; +5 Alteration, Light Armor, Pickpocket, Restoration, Sneak");
            }
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
                System.out.println("INITIAL BONUSES: +10 Sneak, +5 Alchemy, Marksman, Lockpicking, Pickpocket, One-Handed");
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
                System.out.println("INITIAL BONUSES: +10 One-Handed, +5 Alteration, Marksman, Block, Destruction, Smithing");
                break;

            case "w":
                System.out.println("You have selected: Wood Elf");
                System.out.println();
                System.out.println("ABILITIES: Resist Poison 50%, Resist Disease 50%, Survival: Resist Fatigue 25%");
                System.out.println("POWERS: Command Animal: Make an animal an ally for 60 seconds once per day");
                System.out.println("INITIAL BONUSES: +10 Marksman, +5 Alchemy, Light Armor, Lockpicking, Pickpocket, Sneak");
                break;
        }

        //Ask user to choose a gender
        System.out.println("Is your character male? (true or false)");
        isMale = sc.nextBoolean();

        if (isMale) {
            System.out.println("You character is male.");
        }
        else {
            System.out.println("Your character is female.");
        }

        //Ask user to choose a character class
        System.out.println("Choose a class from the list below:");
        System.out.println();
        System.out.println("[1] Acrobat");
        System.out.println("The kind of person that uses agility and endurance to their advantage. Unafraid of jumping long distances.");
        System.out.println("SPECIALIZATION: Stealth");
        System.out.println("ATTRIBUTES: Agility, Endurance");
        System.out.println("SKILLS: Acrobatics, Blade, Block, Marksman, Security, Sneak, Speechcraft");
        System.out.println();






    }
}
