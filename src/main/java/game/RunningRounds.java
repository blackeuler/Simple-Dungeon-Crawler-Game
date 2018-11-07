package game;

import java.util.Random;

public class RunningRounds {

  /**
   * This is the main entry point to game.
   * This class will establish characters and monsters
   * and will use other classes to run the game.
   * Vharacter selection will be run in this method as well as each combat loop.
   *
   * @author Spencer
   *
   */
  public static void main(String[] args) {

    // This creates the character object array, storing 9 possible characters.
    // Could this be built in a different class? Would that make sense to do?
    final long startTime = System.currentTimeMillis();
    Character[] characters = new Character[9];
    characters[0] = new Character("The Wizard", 80, 15, 10, 20);
    characters[1] = new Character("The Warlock", 80, 20, 0, 10);
    characters[2] = new Character("The Priest", 80, 5, 5, 20);
    characters[3] = new Character("The Warrior", 110, 15, 15, 0);
    characters[4] = new Character("The Paladin", 120, 10, 20, 10);
    characters[5] = new Character("The Shaman", 105, 15, 10, 15);
    characters[6] = new Character("The Rogue", 100, 20, 5, 5);
    characters[7] = new Character("The Hunter", 100, 15, 5, 10);
    characters[8] = new Character("The Druid", 90, 10, 10, 15);
    long endTime = System.currentTimeMillis();
    long lapse = endTime - startTime;
    System.out.println(lapse);

    // Opens game and takes team name.
    GameMethods.startGame();

    // Character selection in three brackets of character professions.
    Random rand = new Random();
    final Character char1 = characters[rand.nextInt(3)];
    final Character char2 = characters[rand.nextInt(3) + 3];
    final Character char3 = characters[rand.nextInt(3) + 6];

    // Tells player their party and stats.
    System.out.println();
    System.out.println("YOUR PARTY:");
    // Refer to LegacyCode.md for original implementation.
    Utilities.characterInfo(char1);
    Utilities.characterInfo(char2);
    Utilities.characterInfo(char3);

    // Monsters are constructed, could be done the same as characters?
    Monster monst1 = new Monster("Gnome Bandits", 210, 10, 10, 10);
    Monster monst2 = new Monster("Gnome Village", 420, 5, 0, 0);
    Monster monst3 = new Monster("Gnome Horde", 350, 15, 20, 10);
    Monster finalBoss = new Monster("Boss Kapfhammer", 1000, 20, 20, 20);

    // Sets up narrative using input name and characters.
    // Actions.startGame needs to be fixed otherwise name value is lost.
    GameMethods.encounterOne();
    // Displays monster info.
    GameMethods.encounterInfo(monst1);

    GameMethods.combatRun(char1, char2, char3, monst1);
    GameMethods.encounterTwo();
    GameMethods.encounterInfo(monst2);
    GameMethods.combatRun(char1, char2, char3, monst2);
    GameMethods.encounterThree();
    GameMethods.encounterInfo(monst3);
    GameMethods.combatRun(char1, char2, char3, monst3);
    GameMethods.encounterFour();
    GameMethods.encounterInfo(finalBoss);
    GameMethods.combatRun(char1, char2, char3, finalBoss);
  }
}
