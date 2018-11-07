package game;

import java.util.Random;
import java.util.Scanner;

/**
 * A class for DDCSA2:TB that contatins utility methods
 * This is partially to simplify methods and blocks of code
 * That will be used very often.
 *
 **/
public class Utilities {

  /**
   * This method does a roll to simulate monster AI.
   **/
  public static int randomRoll() {
    Random rand = new Random();
    int rolledChoice = rand.nextInt(2);
    return rolledChoice;
  }

  /**
   * This method prompts the user to continue.
   **/
  public static void enterPrompt() {
    System.out.println("<Press Enter to continue>");
    Scanner prompt = new Scanner(System.in);
    String throwAway = prompt.nextLine();
  }

  /**
   * This method prompts a user to choose an action.
   **/
  public static int actionPrompt(String playerName) {
    Scanner prompt = new Scanner(System.in);
    System.out.println();
    System.out.println(playerName + ", action?\n");
    System.out.println("1. Attack | 2. Defend | 3. Heal\n");
    int choice = prompt.nextInt();
    return choice;
  }

  /**
   * Method to print out character and their stats.
   * Functions as expected.
   **/
  public static void characterInfo(Character character) {
    System.out.println("\nParty member: " + character.getName() + "."
        + "\n HP: " + character.getHp()
        + "\n Attack: " + character.getAtk()
        + "\n Defense: " + character.getDef()
        + "\n Magic: " + character.getMag());
    System.out.println();
  }

  /**
   * Method to print out monster and their stats.
   * Functions as expected.
   **/
  public static void monsterInfo(Monster monster) {
    System.out.println("\n" + monster.getName() + "."
        + "\n HP: " + monster.getHp()
        + "\n Attack: " + monster.getAtk()
        + "\n Defense: " + monster.getDef()
        + "\n Magic: " + monster.getMag());
    System.out.println();
  }

  /**
   * Asks the user to choose a target.
   **/
  public static int targetPrompt(String playerName) {
    Scanner prompt = new Scanner(System.in);
    System.out.println(playerName + ", heal party member #1 , 2, or 3?");
    int target = prompt.nextInt();
    return target;
  }

  /**
   * This class contains usable changes to text color and style.
   * It is sourced from stackoverflow.com
   *
   * @author "shakram02"
   *
   **/
  public class ConsoleColors {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
  }
}
