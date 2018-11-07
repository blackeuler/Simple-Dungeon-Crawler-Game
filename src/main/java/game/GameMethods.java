package game;

import java.util.Scanner;

/**
 * This class is used to store narrative material.
 * I've implemented this in an attempt to lower boot time
 * of the main method.
 **/
public class GameMethods {

  // Colors for dynamic and fun output.
  public static final String RESET = "\033[0m";  // Text Reset
  public static final String RED = "\033[0;31m";     // RED
  public static final String GREEN = "\033[0;32m";   // GREEN
  public static final String YELLOW = "\033[0;33m";  // YELLOW
  public static final String BLUE = "\033[0;34m";    // BLUE
  public static final String PURPLE = "\033[0;35m";  // PURPLE
  public static final String WHITE = "\033[0;37m";   // WHITE

  /**
   * Initial story and asks for team name.
   * Moved from Actions class.
   */
  public static void startGame() {
    Scanner scan = new Scanner(System.in);
    System.out.println(WHITE + "Greetings, brave adventurer!"
        + "\nYou are about to embark on a quest to save Funky Kong."
        + "\nThis venture, however, is not for the faint of heart."
        + "\nAnything can go wrong here."
        + "\nIf you are brave enough to begin, please enter your team name.\n");
    String teamName = scan.nextLine();
    System.out.println("\nGood luck, Team " + teamName + "." + RESET);
  }

  /**
   * This method is called before the first encounter.
   * It provides narrative.
   **/
  public static void encounterOne() {
    System.out.println(WHITE + "Your party has been journeying for some time when"
        + " \nthey notice smoke over a nearby hill.");
    Utilities.enterPrompt();
    System.out.println(WHITE + "There is a group of Gnome bandits cooking a meal."
        + " \nBefore you can hide, they notice you and draw their weapons." + RESET);
    Utilities.enterPrompt();
  }

  /**
   * This method is called before the second encounter.
   * It provides narrative.
   **/
  public static void encounterTwo() {

    System.out.println(WHITE + "Your team rests for a bit before continuing on."
        + "\nGnomes are approaching. The moonlight illuminates their"
        + "\n menacing smiles." + RESET);
    Utilities.enterPrompt();
  }

  /**
   * This method is called before the third encounter.
   * It provides narrative.
   **/
  public static void encounterThree() {
    System.out.println(WHITE + "The team is pretty weak. Before you can"
        + "\n rest, more of those goshdarned gnomes emerge"
        + "\n from the trees, bearing weapons." + RESET);
    Utilities.enterPrompt();
  }

  /**
   * This method is called before the boss encounter.
   * It provides narrative.
   **/
  public static void encounterFour() {
    System.out.println(WHITE + "After defeating all of the gnomes,"
        + "\n you climb the steps of the creepy computer science"
        + "\n castle. Eerie white dry erase boards with multicolored code"
        + "\n written on them surround the team. You can hardly read one"
        + "\n println statement before you hear it…");
    Utilities.enterPrompt();
    System.out.println("...");
    Utilities.enterPrompt();
    System.out.println("HELLO ESTEEMED COLLEAGUES."
        + "\n THANK YOU FOR ATTENDING COMPSCI 666."
        + "\n YOU MIGHT WANT TO SEND A SLACK MESSAGE"
        + "\n TO YOUR FRIEND FUNKY KONG...FOR HE WON’T BE"
        + "\n IN CLASS TODAY.");
    System.out.println("You look over and see Funky Kong in a cage." + RESET);
    Utilities.enterPrompt();
  }
  /**
   * Method that collects data from Monster object
   * And returns it to be read by the player.
   **/

  public static void encounterInfo(Monster monster) {
    System.out.println(WHITE + "You will be fighting " + GREEN +  monster.getName() + WHITE + ".");
    System.out.println();
    System.out.println(WHITE + "HP: " + GREEN +  monster.getHp());
    System.out.println(WHITE + "Attack: " + GREEN + monster.getAtk());
    System.out.println(WHITE + "Defense: " + GREEN + monster.getDef());
    System.out.println(WHITE + "Magic: " + GREEN + monster.getMag() + RESET);
  }

  /**
  * This method is used for each monster encounter, running turns effectively.
  * It should work perfectly, missing only safeguards at this point
  * That need to be put in place in order to keep the program running.
  **/
  public static void combatRun(Character char1, Character char2, Character char3, Monster monst1) {
    // Establishes parameters for loop runtime.
    boolean char1Alive = true;
    boolean char2Alive = true;
    boolean char3Alive = true;
    boolean monstAlive = true;
    int roundCount = 1;

    // This block initializes multiple used values.
    int char1Defense = 0;
    int char2Defense = 0;
    int char3Defense = 0;
    int monst1Defense = 0;
    int monsterDamage = 0;
    int damage = 0;
    int choice = 0;
    int turn = 1;

    // This block defaults healing and heal targets to none.
    int healing = 0;
    int healChoice = 0;
    int newHealth = 0;

    // Loop for fight 1. TODONE: Finish loop implementation.
    while ((char1Alive == true || char2Alive == true || char3Alive == true) && monstAlive == true) {
      // turn 1 belongs to char1, 2 to char2 and so on.
      while (turn == 1 && char1.getHp() > 0) {
        choice = Utilities.actionPrompt(char1.getName());
        if (choice == 1) {
          // Rolls damage and subtracts it from monster health - defense.
          damage = Actions.attack(char1.getAtk());
          newHealth = Actions.dealDamage(damage, monst1.getHp(), monst1Defense);
          System.out.println(WHITE + "\nDid " + RED + damage + WHITE + " damage!\n" + RESET);
          monst1.setHp(newHealth);
          turn++;
        } else if (choice == 2) {
          // TODONE: Replace with new, better defend method.
          char1Defense = char1.getDef();
          System.out.println(WHITE + char3.getName() + " is defending!");
          turn++;
        } else if (choice == 3) {
          // This should allow for healing.
          healing = Actions.heal(char1.getMag());
          healChoice = Utilities.targetPrompt(char3.getName());
          if (healChoice == 1) {
            Actions.healTarget(char1, healing);
            System.out.println(WHITE + "\nHealed "
                + char1.getName() + " for " + healing + " points!\n" + RESET);
          } else if (healChoice == 2) {
            Actions.healTarget(char2, healing);
            System.out.println(WHITE + "\nHealed "
                + char2.getName() + " for " + healing + " points!\n" + RESET);
          } else if (healChoice == 3) {
            Actions.healTarget(char3, healing);
            System.out.println(WHITE + "\nHealed "
                + char3.getName() + " for " + healing + " points!\n" + RESET);
          }
          turn++;
        } else {
          System.out.println(PURPLE + "Invalid entry...please choose again!" + RESET);
        }
      }

      while (turn == 2 && char2.getHp() > 0) {
        choice = Utilities.actionPrompt(char2.getName());
        if (choice == 1) {
          damage = Actions.attack(char2.getAtk());
          newHealth = Actions.dealDamage(damage, monst1.getHp(), monst1Defense);
          System.out.println(WHITE + "\nDid " + BLUE + damage + WHITE + " damage!\n" + RESET);
          monst1.setHp(newHealth);
          turn++;
        } else if (choice == 2) {
          char2Defense = char2.getDef();
          System.out.println(WHITE + char3.getName() + " is defending!");
          turn++;
        } else if (choice == 3) {
          healing = Actions.heal(char3.getMag());
          healChoice = Utilities.targetPrompt(char2.getName());
          if (healChoice == 1) {
            Actions.healTarget(char1, healing);
            System.out.println(WHITE + "\nHealed "
                + char1.getName() + " for " + healing + " points!\n" + RESET);
          } else if (healChoice == 2) {
            Actions.healTarget(char2, healing);
            System.out.println(WHITE + "\nHealed "
                + char2.getName() + " for " + healing + " points!\n" + RESET);
          } else if (healChoice == 3) {
            Actions.healTarget(char3, healing);
            System.out.println(WHITE + "\nHealed "
                + char3.getName() + " for " + healing + " points!\n" + RESET);
          }
          turn++;
        } else {
          System.out.println(PURPLE + "Invalid entry...please choose again!" + RESET);
        }
      }

      while (turn == 3 && char3.getHp() > 0) {
        choice = Utilities.actionPrompt(char3.getName());
        if (choice == 1) {
          damage = Actions.attack(char3.getAtk());
          newHealth = Actions.dealDamage(damage, monst1.getHp(), monst1Defense);
          System.out.println(WHITE + "\nDid " + YELLOW + damage + WHITE + " damage!\n" + RESET);
          monst1.setHp(newHealth);
          turn++;
        } else if (choice == 2) {
          char3Defense = char3.getDef();
          System.out.println(WHITE + char3.getName() + " is defending!");
          turn++;
        } else if (choice == 3) {
          healing = Actions.heal(char3.getMag());
          healChoice = Utilities.targetPrompt(char3.getName());
          if (healChoice == 1) {
            Actions.healTarget(char1, healing);
            System.out.println(WHITE + "\nHealed "
                + char1.getName() + " for " + healing + " points!\n" + RESET);
          } else if (healChoice == 2) {
            Actions.healTarget(char2, healing);
            System.out.println(WHITE + "\nHealed "
                + char2.getName() + " for " + healing + " points!\n" + RESET);
          } else if (healChoice == 3) {
            Actions.healTarget(char3, healing);
            System.out.println(WHITE + "\nHealed "
                + char3.getName() + " for " + healing + " points!\n" + RESET);
          }
          turn++;
        } else {
          System.out.println(PURPLE + "Invalid entry...please choose again!" + RESET);
        }
      }

      while (turn == 4 && monst1.getHp() > 0) {

        if (monst1.getHp() > (monst1.getHp() / 2)) {
          monsterDamage = Actions.attack(monst1.getAtk());
          char1.setHp(Actions.dealDamage(monsterDamage, char1.getHp(), char1Defense));
          char2.setHp(Actions.dealDamage(monsterDamage, char2.getHp(), char2Defense));
          char3.setHp(Actions.dealDamage(monsterDamage, char3.getHp(), char3Defense));
          turn++;
        } else if (monst1.getHp() <= 0) {
          System.out.println();
          System.out.println(GREEN + monst1.getName() + " has no more strength!\n" + RESET);
          turn++;
        } else {
          int aiChoice = Utilities.randomRoll();
          if (aiChoice == 0) {
            monsterDamage = Actions.attack(monst1.getAtk());
            char1.setHp(Actions.dealDamage(monsterDamage, char1.getHp(), char1Defense));
            char2.setHp(Actions.dealDamage(monsterDamage, char2.getHp(), char2Defense));
            char3.setHp(Actions.dealDamage(monsterDamage, char3.getHp(), char3Defense));
            System.out.println();
            System.out.println(WHITE + monst1.getName() + " dealt "
                + GREEN + monsterDamage + WHITE + " to the party!\n" + RESET);
            turn++;
          } else if (aiChoice == 1) {
            monst1Defense = monst1.getDef();
            System.out.println();
            System.out.println(WHITE + monst1.getName() + "is defending!\n" + RESET);
            turn++;
          } else if (aiChoice == 2) {
            healing = Actions.heal(monst1.getMag());
            Actions.healTargetM(monst1, healing);
            System.out.println();
            System.out.println(WHITE + monst1.getName() + " healed for "
                + healing + " points!\n" + RESET);
            turn++;
          }
        }
      }
      System.out.println(WHITE + "Here's how your party is doing: \n");
      Utilities.characterInfo(char1);
      Utilities.characterInfo(char2);
      Utilities.characterInfo(char3);
      System.out.println("\nHere's how your enemy is doing: \n");
      System.out.println();
      GameMethods.encounterInfo(monst1);

      if (char1.getHp() <= 0 || char2.getHp() <= 0 || char3.getHp() <= 0) {
        if (char1.getHp() <= 0) {
          turn = 2;
          char1Alive = false;
        } else if (char2.getHp() <= 0) {
          turn = 3;
          char2Alive = false;
        } else if (char3.getHp() <= 0) {
          char3Alive = false;
        } else if (char1.getHp() <= 0 && char2.getHp() <= 0 && char3.getHp() <= 0) {
          System.out.println(WHITE + "Your party has been defeated!" + RESET);
        }
      } else if (monst1.getHp() <= 0) {
        monstAlive = false;
        System.out.println(WHITE + "\nWell done! " + monst1.getName() + " defeated!" + RESET);
      } else {
        System.out.println(WHITE + "Round " + roundCount + " finished!" + RESET);
        turn = 1;
      }
      roundCount++;
    }
  }
}
