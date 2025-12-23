//*** Text Adventure Program ***

//Import scanner module to collect user input
import java.util.Scanner;

public class text_adventure {
    public static void main (String[] args) {

        //Create a scanner to store user input
        Scanner scnr = new Scanner(System.in);

        //Introduction screen to game
        System.out.println("***********************************************");
        System.out.println("    Welcome to Oblivion: The Text Adventure    ");
        System.out.println("***********************************************\n");
        System.out.println("Oblivion is a massive open world where you can search for treasure, fight monsters, and gain experience becoming a powerful wizard, warrior, or thief. In this demo version you will only be able to choose the warrior class.\n");
        System.out.println("***********************************************\n");

        System.out.println("The first step before you can explore the world of Oblivion is to create a character. Even though the warrior class is the only class you can choose, there are many other options you can choose to customize you character for each playthrough.\n");

        System.out.println("***********************************************");
        System.out.println("               CHARACTER CREATION              ");
        System.out.println("***********************************************\n");

        //Display stats for races
        System.out.println("--------------------- RACES -------------------\n");
        System.out.println("Race: Argonian\n");
        System.out.println("Origin: Arnesia");
        System.out.println("You hail from Arnesia, where the slavers of Morrowind are still active. The hide and seek everytime there was a raid made you extremely quick and nimble.\n");
        System.out.println("*** Attributes ***");
        System.out.println("     Male     Female");
        System.out.println("Str:  40        40");
        System.out.println("Int:  40        50");
        System.out.println("Wil:  30        40");
        System.out.println("Agi:  50        40");
        System.out.println("Spd:  50        40");
        System.out.println("End:  30        30");
        System.out.println("Per:  30        30");
        System.out.println("Lck:  50        50\n");
        System.out.println("*** Skill Bonuses ***\n");
        System.out.println("Alchemy: +5");
        System.out.println("Athletics: +10");
        System.out.println("Blade: +5");
        System.out.println("Hand to Hand: +5");
        System.out.println("Illusion: +5");
        System.out.println("Mysticism: +5");
        System.out.println("Security: +10\n");
        System.out.println("*** Resistances ***\n");
        System.out.println("Poison: 100");
        System.out.println("Disease: 75\n");
        System.out.println("--------------------------------------------------");

        System.out.println("Race: Breton");
        System.out.println("Origin: Systres");
        System.out.println("As a child you were always spending time on the docks of one of the islands, gaining some money by helping merchants carrying their goods and learning from their adventures.\n");
        System.out.println("     Male     Female");
        System.out.println("Str:  40        30");
        System.out.println("Int:  50        50");
        System.out.println("Wil:  50        50");
        System.out.println("Agi:  30        30");
        System.out.println("Spd:  30        40");
        System.out.println("End:  30        30");
        System.out.println("Per:  40        40");
        System.out.println("Lck:  50        50\n");
        System.out.println("*** Skill Bonuses ***\n");
        System.out.println("Alchemy: +5");
        System.out.println("Alteration: +5");
        System.out.println("Conjuration: +10");
        System.out.println("Illusion: +5");
        System.out.println("Mysticism: +10");
        System.out.println("Restoration: +10\n");
        System.out.println("*** Resistances ***\n");
        System.out.println("Magic: 50\n");
        System.out.println("--------------------------------------------------");

        System.out.println("Race: Dark Elf");
        System.out.println("Origin: Vvardenfell");
        System.out.println("You are a true child of Vvardenfell. Amongst the volcanic wasteland you were taught that resilience is the greatest of all Dunmer quality.\n");
        System.out.println("     Male     Female");
        System.out.println("Str:  40        40");
        System.out.println("Int:  40        40");
        System.out.println("Wil:  30        30");
        System.out.println("Agi:  40        40");
        System.out.println("Spd:  50        50");
        System.out.println("End:  40        30");
        System.out.println("Per:  30        40");
        System.out.println("Lck:  50        50\n");
        System.out.println("*** Skill Bonuses ***\n");
        System.out.println("Athletics: +5");
        System.out.println("Blade: +10");
        System.out.println("Blunt: +5");
        System.out.println("Destruction: +10");
        System.out.println("Light Armor: +5");
        System.out.println("Marksman: +5");
        System.out.println("Mysticism: +5\n");
        System.out.println("*** Resistances ***\n");
        System.out.println("Fire: 75\n");
        System.out.println("--------------------------------------------------");

        System.out.println("Race: High Elf");
        System.out.println("Origin: Auridon");
        System.out.println("Born on the island of Auridon, you were proud to live on the first island of the Summersets. There, you spent countless hours swimming in the pristine waters.\n");
        System.out.println("     Male     Female");
        System.out.println("Str:  30        30");
        System.out.println("Int:  50        50");
        System.out.println("Wil:  40        40");
        System.out.println("Agi:  40        40");
        System.out.println("Spd:  30        40");
        System.out.println("End:  40        30");
        System.out.println("Per:  40        40");
        System.out.println("Lck:  50        50\n");
        System.out.println("*** Skill Bonuses ***\n");
        System.out.println("Alchemy: +5");
        System.out.println("Alteration: +10");
        System.out.println("Conjuration: +5");
        System.out.println("Destruction: +10");
        System.out.println("Illusion: +5");
        System.out.println("Mysticism: +5\n");
        System.out.println("*** Resistances ***\n");
        System.out.println("Fire: -25");
        System.out.println("Frost: -25");
        System.out.println("Shock: -25\n");
        System.out.println("--------------------------------------------------");

        System.out.println("Race: Imperial");
        System.out.println("Origin: Nibenay");
        System.out.println("You are a true Imperial, born into the heart of the Empire. The number of cities and their size led you to travel hastily.\n");
        System.out.println("     Male     Female");
        System.out.println("Str:  40        40");
        System.out.println("Int:  40        40");
        System.out.println("Wil:  30        40");
        System.out.println("Agi:  30        30");
        System.out.println("Spd:  40        30");
        System.out.println("End:  40        40");
        System.out.println("Per:  50        50");
        System.out.println("Lck:  50        50\n");
        System.out.println("*** Skill Bonuses ***\n");
        System.out.println("Blade: +5");
        System.out.println("Blunt: +5");
        System.out.println("Hand to Hand: +5");
        System.out.println("Heavy Armor: +10");
        System.out.println("Mercantile: +10");
        System.out.println("Speechcraft: +10\n");
        System.out.println("*** Resistances ***\n");
        System.out.println("None\n");
        System.out.println("--------------------------------------------------");

        System.out.println("Race: Khajit");
        System.out.println("Origin: Elsweyr");
        System.out.println("The harsh region where you lived and trained hardened your body and taught you how to defend yourself, with your bare fists or any weapon you could find.\n");
        System.out.println("     Male     Female");
        System.out.println("Str:  40        30");
        System.out.println("Int:  40        40");
        System.out.println("Wil:  30        30");
        System.out.println("Agi:  50        50");
        System.out.println("Spd:  40        40");
        System.out.println("End:  30        40");
        System.out.println("Per:  40        40");
        System.out.println("Lck:  50        50\n");
        System.out.println("*** Skill Bonuses ***\n");
        System.out.println("Acrobatics: +10");
        System.out.println("Athletics: +5");
        System.out.println("Blade: +5");
        System.out.println("Hand to Hand: +10");
        System.out.println("Light Armor: +5");
        System.out.println("Security: +5");
        System.out.println("Sneak: +5\n");
        System.out.println("*** Resistances ***\n");
        System.out.println("None\n");
        System.out.println("--------------------------------------------------");

        System.out.println("Race: Nord");
        System.out.println("Origin: Skyrim");
        System.out.println("You lived in the west of Skyrim, a rugged environment filled with rough terrain and dangerous beasts. You are prepared to survive in even the most challenging climates.\n");
        System.out.println("     Male     Female");
        System.out.println("Str:  50        50");
        System.out.println("Int:  30        30");
        System.out.println("Wil:  30        40");
        System.out.println("Agi:  40        40");
        System.out.println("Spd:  40        40");
        System.out.println("End:  50        40");
        System.out.println("Per:  30        30");
        System.out.println("Lck:  50        50\n");
        System.out.println("*** Skill Bonuses ***\n");
        System.out.println("Armorer: +5");
        System.out.println("Blade: +10");
        System.out.println("Block: +5");
        System.out.println("Blunt: +10");
        System.out.println("Heavy Armor: +10");
        System.out.println("Restoration: +15\n");
        System.out.println("*** Resistances ***\n");
        System.out.println("Frost: 50\n");
        System.out.println("--------------------------------------------------");

        System.out.println("Race: Orc");
        System.out.println("Origin: Orsinium");
        System.out.println("Your fate was decided when you were born. As a member of a Stronghold, you would serve your chieftain with honor and would make the orcs proud. Your Charisma and resilience were honed for when you'd serve.\n");
        System.out.println("     Male     Female");
        System.out.println("Str:  45        45");
        System.out.println("Int:  30        40");
        System.out.println("Wil:  50        45");
        System.out.println("Agi:  35        35");
        System.out.println("Spd:  30        30");
        System.out.println("End:  50        50");
        System.out.println("Per:  30        25");
        System.out.println("Lck:  50        50\n");
        System.out.println("*** Skill Bonuses ***\n");
        System.out.println("Armorer: +10");
        System.out.println("Block: +10");
        System.out.println("Blunt: +10");
        System.out.println("Hand to Hand: +5");
        System.out.println("Heavy Armor: +10\n");
        System.out.println("*** Resistances ***\n");
        System.out.println("Magic: 25\n");
        System.out.println("--------------------------------------------------");

        System.out.println("Race: Redguard");
        System.out.println("Origin: Hammerfell");
        System.out.println("Your uprising [sic] under the shadow of the mountain peaks was a happy one. Immersed in Redguard customs, you developed charm, wit and the ability to turn a conversation around.\n");
        System.out.println("     Male     Female");
        System.out.println("Str:  50        40");
        System.out.println("Int:  30        30");
        System.out.println("Wil:  30        30");
        System.out.println("Agi:  40        40");
        System.out.println("Spd:  40        30");
        System.out.println("End:  50        50");
        System.out.println("Per:  30        40");
        System.out.println("Lck:  50        50\n");
        System.out.println("*** Skill Bonuses ***\n");
        System.out.println("Athletics: +10");
        System.out.println("Blade: +10");
        System.out.println("Blunt: +10");
        System.out.println("Heavy Armor: +5");
        System.out.println("Mercantile: +5\n");
        System.out.println("*** Resistances ***\n");
        System.out.println("Poison: 75");
        System.out.println("Disease: 75\n");
        System.out.println("--------------------------------------------------");

        System.out.println("Race: Wood Elf");
        System.out.println("Origin: Valenwood");
        System.out.println("You spent your childhood in Grahtwood, near the region devastated by Molag Bal. The foul energies still linger there, and your resilience grew amidst the danger.\n");
        System.out.println("     Male     Female");
        System.out.println("Str:  30        30");
        System.out.println("Int:  40        40");
        System.out.println("Wil:  30        30");
        System.out.println("Agi:  50        50");
        System.out.println("Spd:  50        50");
        System.out.println("End:  40        30");
        System.out.println("Per:  30        40");
        System.out.println("Lck:  50        50\n");
        System.out.println("*** Skill Bonuses ***\n");
        System.out.println("Acrobatics: +5");
        System.out.println("Alchemy: +10");
        System.out.println("Alteration: +5");
        System.out.println("Light Armor: +5");
        System.out.println("Marksman: +10");
        System.out.println("Sneak: +10\n");
        System.out.println("*** Resistances ***\n");
        System.out.println("Disease: 75\n");
        System.out.println("--------------------------------------------------");

        System.out.println("************************************************");
        System.out.println("Scroll up to see all race attributes, skills, and resistances. Then return here to choose your character's race.");
        System.out.println("************************************************\n");

        //Ask user to choose character race
        System.out.println("[a] Argonian   [b] Breton       [d] Dark Elf\n");
        System.out.println("[h] High Elf   [i] Imperial     [k] Khajit\n");
        System.out.println("[n] Nord       [o] Orc          [r] Redguard\n");
        System.out.println("[w] Wood Elf\n");
        System.out.println("Choose a race for your character by typing the corresponding letter:\n");
        String character_race = scnr.nextLine();

        switch (character_race) {
            case "a": {
                character_race = "Argonian";
                System.out.println("Argonian");
                break;
            }

            case "b": {
                character_race = "Breton";
                break;
            }

            case "d": {
                character_race = "Dark Elf";
                break;
            }

            case "h": {
                character_race = "High Elf";
                break;
            }

            case "i": {
                character_race = "Imperial";
                break;
            }

            case "k": {
                character_race = "Khajit";
                break;
            }

            case "n": {
                character_race = "Nord";
                break;
            }

            case "o": {
                character_race = "Orc";
                break;
            }

            case "r": {
                character_race = "RedGuard";
                break;
            }

            case "w": {
                character_race = "Wood Elf";
                break;
            }

            default: {
                System.out.println("That is not a valid character race key. Please retry.");
            }
        }

        //Ask user to choose a male or female character. Display error if user pressed key other than 'm' or 'f'
        System.out.println("Do you want your character to be male or female? m or f");
        String character_gender = scnr.nextLine();

             if (character_gender.equals("m")) {
                 character_gender = "Male";
             }
             else if (character_gender.equals("f")) {
                character_gender = "Female";
            }
             else {
                 System.out.println("Invalid input. Please input 'm' or 'f'.");
             }

            System.out.println("Race: " + character_race);
            System.out.println("Gender: " + character_gender);

            //Choose a sign

            scnr.close();
        }

    }
