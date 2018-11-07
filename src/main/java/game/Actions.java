package game;

import java.util.Random;
import java.util.Scanner;

/**
 * A class for DDCSA2:TB that contains action methods.
 *
 * @author team gnome jr.
 */
public class Actions {

  /**
   * Randomly generates a number and the given max number (inclusive).
   */
  public static int roll(int maxValue) {
    Random rand = new Random();
    int randomNumber = rand.nextInt(maxValue + 1);
    return randomNumber;
  }

  /**
   * Simplified damage dealing method.
   * This should be used to deal damage.
   **/
  public static int dealDamage(int damage, int hitPoints, int defense) {
    hitPoints -= (damage - defense);
    return hitPoints;
  }

  /**
   * Heals a desired target.
   **/
  public static void healTarget(Character player, int healing) {
    int targetHp = player.getHp();
    targetHp += healing;
    player.setHp(targetHp);
  }

  /**
   * Heals the monster.
   **/
  public static void healTargetM(Monster monst, int healing) {
    int targetHp = monst.getHp();
    targetHp += healing;
    monst.setHp(targetHp);
  }


  /**
   * Returns the attack value.
   */
  public static int attack(int attValue) {
    int attFinal = attValue + roll(20);
    return attFinal;
  }

  /**
   * Returns the heal value.
   */
  public static int heal(int healValue) {
    int healFinal = healValue / 2 + roll(8); // Testing for rounded div.
    return healFinal;
    /** Pseudocode thought:
     *  int healFinal = [magic] / 2 (rounded) + 10
     *  in order to prevent healing being overpowered.
     **/
  }

  /**
  // This method uses a monsters defense value to reduce damage for a turn.
  public static void defendMonster(Monster monster, Character character) {
    int monsterAttack = attack(monster.getAtk());
    int defendNumber = defend(character.getDef());
    int newAttack = monsterAttack - defendNumber;
    character.setHp(newAttack);
  }

  public static int attackCharacter(Character character, Monster monster) {
    int characterHP = character.getHp();
    int monsterAttack = attack(monster.getAtk());
    int newCharacterHP = characterHP - monsterAttack;
    //character.setHp(newCharacterHP);
    //System.out.println("Damage: " + monsterAttack);
    //System.out.println("New Character HP: " + newCharacterHP);
    return newCharacterHP;
  }
  **/
  // This method allows a character to heal someone based on their magic.
  // public static void healCharacter(Character characterA, Character characterB) {
  // int hurtCharacterHP = characterA.getHp();
  // int healNumber = characterB.heal();
  // int newHealth = hurtCharacterHP + healNumber;
  // characterA.setHP(newHealth);
  // }
}
