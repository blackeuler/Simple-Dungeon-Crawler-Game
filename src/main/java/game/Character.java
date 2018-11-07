package game;

//import
//import
//import

/**
 * A class for DDCSA2:TB that contains the character object.
 *
 * @author Spencer
 */

public class Character {

  private String characterName; // character name
  private int hitPoints; // character HP
  private int attack; // character attack
  private int defense; // character defense
  private int magic; // character magic

  /**
   * Constructs a new character instance.
   * @param name        the name of the character
   * @param hp          the hit points of the character
   * @param atk         the attack points of the character
   * @param def         the defense points of the character
   * @param mag         the magic points of the character
   */
  public Character(String name, int hp, int atk, int def, int mag) {
    characterName = name;
    hitPoints = hp;
    attack = atk;
    defense = def;
    magic = mag;
  }

  /** Returns the name of the character. */
  public String getName() {
    return characterName;
  }

  /** Returns the HP of the character. */
  public int getHp() {
    return hitPoints;
  }

  /** Returns the attack points of the character. */
  public int getAtk() {
    return attack;
  }

  /** Returns the defense points of the character. */
  public int getDef() {
    return defense;
  }

  /** Returns the magic points of the character. */
  public int getMag() {
    return magic;
  }

  /** Changes the HP. */
  public void setHp(int health) {
    this.hitPoints = health;
  }
}
