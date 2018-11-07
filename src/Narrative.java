package game;

import java.util.Scanner;

/**
 * This class is used to store narrative material.
 * I've implemented this in an attempt to lower boot time
 * of our main method.
 **/
public Class Narrative {

  /**
   * Initial story and asks for team name.
   * Moved from Actions class.
   */
  public static void startGame() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Greetings, brave adventurer!"
        + "\nYou are about to embark on a quest to save Funky Kong."
        + "\nThis venture, however, is not for the faint of heart."
        + "\nYou will be slaying tons of gnome children."
        + "\nIf you are brave enough to begin, please enter your team name.");
    String teamName = scan.nextLine();
    System.out.println("Good luck, " + teamName);
  }

  /**
   * This method is called before the first encounter.
   * It provides narrative.
   **/
  public static void encounterOne() {
    System.out.println("Your party has been journeying for some time when"
        + " \nthey notice smoke over a nearby hill.")
    Utilities.enterPrompt;
    System.out.println("There is a group of Gnome bandits cooking a nice meal."
        + " \nBefore you can hide, they notice you and draw their weapons.")
    Utilities.enterPrompt;
}
