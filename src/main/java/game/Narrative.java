package game;

import java.util.Scanner;

/**
 * This class is used to store narrative material.
 * I've implemented this in an attempt to lower boot time
 * of our main method.
 **/
public class Narrative {

  /**
   * Initial story and asks for team name.
   * Moved from Actions class.
   */
  public static void startGame() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Greetings, brave adventurer!"
        + "\nYou are about to embark on a quest to save Funky Kong."
        + "\nThis venture, however, is not for the faint of heart."
        + "\nAnything can go wrong here."
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
        + " \nthey notice smoke over a nearby hill.");
    Utilities.enterPrompt();
    System.out.println();
    System.out.println("There is a group of Gnome bandits cooking a meal."
        + " \nBefore you can hide, they notice you and draw their weapons.");
    Utilities.enterPrompt();
  }

  /**
   * This method is called before the second encounter.
   * It provides narrative.
   **/
  public static void encounterTwo() {
    System.out.println("\nYour team rests for a bit, the team continues on."
        + "\nGnomes are approaching. The moonlight illuminates their"
        + "\n menacing smiles.");
    Utilities.enterPrompt();
  }

  /**
   * This method is called before the third encounter.
   * It provides narrative.
   **/
  public static void encounterThree() {
    System.out.println("The team is pretty weak. Before you can"
        + "\n rest, more of those goshdarned gnomes emerge"
        + "\n from the trees, bearing weapons.");
    Utilities.enterPrompt();
  }

  /**
   * This method is called before the boss encounter.
   * It provides narrative.
   **/
  public static void encounterFour() {
    System.out.println("After defeating all of the gnomes,"
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
    System.out.println("You look over and see Funky Kong in a cage.");
    Utilities.enterPrompt();
  }
}
