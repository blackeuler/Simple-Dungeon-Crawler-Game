package game;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import game.Actions;
import game.Character;
import game.Monster;
import game.RunningRounds;
import game.Utilities;
import org.junit.Test;

import java.util.NoSuchElementException;

/**
 * A JUnit test suite for the game.
 *
 * @author gnomejr
 */

public class TestGame {

  @Test
    public void testCharacterAttackRoll() {
    Character character = new Character("character", 70, 10, 10, 10);
    int damage = Actions.attack(character.getAtk());
    assertTrue(damage >= 10);
  }

  @Test
    public void testMonsterAttackRoll() {
    Monster monster = new Monster("monster", 70, 90, 10, 10);
    int damage = Actions.attack(monster.getAtk());
    assertTrue(damage >= 90);
  }

  @Test
  public void testHpSetterCharacter() {
    Character character = new Character("character", 70, 10, 10, 10);
    Monster monster = new Monster("monster", 70, 90, 10, 10);
    int damage = Actions.attack(monster.getAtk());
    character.setHp(damage);
    assertEquals(character.getHp(), damage); // Not sure if this is the correct notation...
  }

  @Test
  public void testHpSetterMonster() {
    Character character = new Character("character", 70, 10, 10, 10);
    Monster monster = new Monster("monster", 70, 90, 10, 10);
    int damage = Actions.attack(character.getAtk());
    monster.setHp(damage);
    assertEquals(monster.getHp(), damage); // Not sure if this is the correct notation...
  }

  @Test
  public void testCharacterHealMethod() {
    Character character1 = new Character("character", 70, 10, 10, 10);
    Character character2 = new Character("character", 70, 10, 10, 10);
    int healing = Actions.heal(character1.getMag());
    Actions.healTarget(character2, healing);
    assertTrue(character2.getHp() > 70);
  }

  @Test
  public void testMonsterHealMethod() {
    Monster monster = new Monster("monster", 70, 10, 10, 10);
    int healing = Actions.heal(monster.getMag());
    Actions.healTargetM(monster, healing);
    assertTrue(monster.getHp() > 70);
  }

  @Test
  public void testCharacterDealDamageMethod() {
    Character character = new Character("character", 70, 10, 10, 10);
    Monster monster = new Monster("monster", 70, 10, 10, 10);
    int charDamage = Actions.attack(character.getAtk());
    monster.setHp(Actions.dealDamage(charDamage, monster.getHp(), monster.getDef()));
    assertTrue(monster.getHp() < 70);
  }

  @Test
  public void testMonsterDealDamageMethod() {
    Character character = new Character("character", 70, 10, 10, 10);
    Monster monster = new Monster("monster", 70, 10, 10, 10);
    int monsterDamage = Actions.attack(monster.getAtk());
    character.setHp(Actions.dealDamage(monsterDamage, character.getHp(), character.getDef()));
    assertTrue(character.getHp() < 70);
  }

  @Test
  public void testCharacterGetMagicMethod() {
    Character character = new Character("character", 70, 10, 10, 10);
    int characterMag = character.getMag();
    assertEquals(characterMag, 10);
  }

  @Test
  public void testMonsterGetMagicMethod() {
    Monster monster = new Monster("monster", 70, 10, 10, 10);
    int monsterMag = monster.getMag();
    assertEquals(monsterMag, 10);
  }
}
