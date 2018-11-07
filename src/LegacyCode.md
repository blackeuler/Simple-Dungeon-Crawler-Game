## This code was replaced by the characterInfo method.

System.out.println("\nCharacter #1 is " + char1.getName() + "."
    + "\n HP: " + char1.getHp()
    + "\n Attack: " + char1.getAtk()
    + "\n Defense: " + char1.getDef()
    + "\n Magic: " + char1.getMag());
System.out.println();
System.out.println("Character #2 is " + char2.getName() + "."
    + "\n HP: " + char2.getHp()
    + "\n Attack: " + char2.getAtk()
    + "\n Defense: " + char2.getDef()
    + "\n Magic: " + char2.getMag());
System.out.println();
System.out.println("Character #3 is " + char3.getName() + "."
    + "\n HP: " + char3.getHp()
    + "\n Attack: " + char3.getAtk()
    + "\n Defense: " + char3.getDef()
    + "\n Magic: " + char3.getMag());
System.out.println();

## The following code ran 1v1 combat through the game.

chars1: while (charsAlive > 0) {
  boss1: while (monstAlive == 1) {
    int charDamage = Actions.attack(finalBoss.getAtk());
    int choice1 = Utilities.actionPrompt(char1.getName());
    if (choice1 == 1) {
      int damage = Actions.attack(char1.getAtk());
      finalBoss.setHp(damage);
      char1.setHp(charDamage);
    }
    if (choice1 == 2) {
      int defense1 = Actions.defend(char1.getDef());
      if (charDamage > defense1) {
        char1.setHp(charDamage - defense1);
      } else {
        char1.setHp(0);
      }
    }
    int choice2 = Utilities.actionPrompt(char2.getName());
    if (choice2 == 1) {
      int damage = Actions.attack(char2.getAtk());
      finalBoss.setHp(damage);
      char2.setHp(charDamage);
    }
    if (choice2 == 2) {
      int defense2 = Actions.defend(char2.getDef());
      if (charDamage > defense2) {
        char2.setHp(charDamage - defense2);
      } else {
        char2.setHp(0);
      }
    }
    int choice3 = Utilities.actionPrompt(char3.getName());
    if (choice3 == 1) {
      int damage = Actions.attack(char3.getAtk());
      finalBoss.setHp(damage);
      char3.setHp(charDamage);
    }
    if (choice3 == 2) {
      int defense3 = Actions.defend(char3.getDef());
      if (charDamage > defense3) {
        char3.setHp(charDamage - defense3);
      } else {
        char3.setHp(0);
      }
    }
    if (char1.getHp() <= 0) {
      charsAlive--;
      System.out.println("Better luck next time!");
    } else if (finalBoss.getHp() <= 0) {
      monstAlive--;
      System.out.println("Char 1 HP " + char1.getHp());
      System.out.println("Char 2 HP " + char2.getHp());
      System.out.println("Char 3 HP " + char3.getHp());
      System.out.println(finalBoss.getName() + " HP " + finalBoss.getHp());
      System.out.println();
      System.out.println("Well done! You've defeated the final Boss!! You've saved...");
      System.out.println("?_ Where is Funky Kong?!");
      System.out.println("To be continued...");
      break chars1;
    } else {
        System.out.println("Round " + roundCount);
    }
    roundCount++;
    System.out.println("Char 1 HP " + char1.getHp());
    System.out.println("Char 2 HP " + char2.getHp());
    System.out.println("Char 3 HP " + char3.getHp());
    System.out.println(finalBoss.getName() + " HP " + finalBoss.getHp());
    System.out.println();
  }

  monst3: while (monstAlive == 2) {
    int charDamage = Actions.attack(monst3.getAtk());
    int choice1 = Utilities.actionPrompt(char1.getName());
    if (choice1 == 1) {
      int damage = Actions.attack(char1.getAtk());
      monst3.setHp(damage);
      char1.setHp(charDamage);
    }
    if (choice1 == 2) {
      int defense1 = Actions.defend(char1.getDef());
      if (charDamage > defense1) {
        char1.setHp(charDamage - defense1);
      } else {
        char1.setHp(0);
      }
    }
    int choice2 = Utilities.actionPrompt(char2.getName());
    if (choice2 == 1) {
      int damage = Actions.attack(char2.getAtk());
      monst3.setHp(damage);
      char2.setHp(charDamage);
    }
    if (choice2 == 2) {
      int defense2 = Actions.defend(char2.getDef());
      if (charDamage > defense2) {
        char2.setHp(charDamage - defense2);
      } else {
        char2.setHp(0);
      }
    }
    int choice3 = Utilities.actionPrompt(char3.getName());
    if (choice3 == 1) {
      int damage = Actions.attack(char3.getAtk());
      monst3.setHp(damage);
      char3.setHp(charDamage);
    }
    if (choice3 == 2) {
      int defense3 = Actions.defend(char3.getDef());
      if (charDamage > defense3) {
        char3.setHp(charDamage - defense3);
      } else {
        char3.setHp(0);
      }
    }
    if (char1.getHp() <= 0) {
      charsAlive--;
      System.out.println("Better luck next time!");
    } else if (monst3.getHp() <= 0) {
      monstAlive--;
      System.out.println("Char 1 HP " + char1.getHp());
      System.out.println("Char 2 HP " + char2.getHp());
      System.out.println("Char 3 HP " + char3.getHp());
      System.out.println(monst3.getName() + " HP " + monst3.getHp());
      System.out.println();
      System.out.println("Well done! Gnome defeated!\nNow onto the final boss!");
      System.out.println("\nMuhahaha! You'll never save Funky Kong! I am "
          + finalBoss.getName() + "." + "\n HP: " + finalBoss.getHp());
      System.out.println();
      break monst3;
    } else {
        System.out.println();
        System.out.println("Round " + roundCount);
    }
    roundCount++;
    System.out.println("Char 1 HP " + char1.getHp());
    System.out.println("Char 2 HP " + char2.getHp());
    System.out.println("Char 3 HP " + char3.getHp());
    System.out.println(monst3.getName() + " HP " + monst3.getHp());
    System.out.println();
  }

  monst2: while (monstAlive == 3) {
    int charDamage = Actions.attack(monst2.getAtk());
    int choice1 = Utilities.actionPrompt(char1.getName());
    if (choice1 == 1) {
      int damage = Actions.attack(char1.getAtk());
      monst2.setHp(damage);
      char1.setHp(charDamage);
    }
    if (choice1 == 2) {
      int defense1 = Actions.defend(char1.getDef());
      if (charDamage > defense1) {
        char1.setHp(charDamage - defense1);
      } else {
        char1.setHp(0);
      }
    }
    int choice2 = Utilities.actionPrompt(char2.getName());
    if (choice2 == 1) {
      int damage = Actions.attack(char2.getAtk());
      monst2.setHp(damage);
      char2.setHp(charDamage);
    }
    if (choice2 == 2) {
      int defense2 = Actions.defend(char2.getDef());
      if (charDamage > defense2) {
        char2.setHp(charDamage - defense2);
      } else {
        char2.setHp(0);
      }
    }
    int choice3 = Utilities.actionPrompt(char3.getName());
    if (choice3 == 1) {
      int damage = Actions.attack(char3.getAtk());
      monst2.setHp(damage);
      char3.setHp(charDamage);
    }
    if (choice3 == 2) {
      int defense3 = Actions.defend(char3.getDef());
      if (charDamage > defense3) {
        char3.setHp(charDamage - defense3);
      } else {
        char3.setHp(0);
      }
    }
    if (char1.getHp() <= 0) {
      charsAlive--;
      System.out.println("Better luck next time!");
    } else if (monst2.getHp() <= 0) {
      monstAlive--;
      System.out.println("Char 1 HP " + char1.getHp());
      System.out.println("Char 2 HP " + char2.getHp());
      System.out.println("Char 3 HP " + char3.getHp());
      System.out.println(monst2.getName() + " HP " + monst2.getHp());
      System.out.println();
      System.out.println("Well done! Gnome defeated!\nAh! Another Gnome is coming!");
      System.out.println("\nRAWR!!! I am " + monst3.getName() + "."
          + "\n HP: " + monst3.getHp());
      System.out.println();
      break monst2;
    } else {
        System.out.println();
        System.out.println("Round " + roundCount);
    }
    roundCount++;
    System.out.println("Char 1 HP " + char1.getHp());
    System.out.println("Char 2 HP " + char2.getHp());
    System.out.println("Char 3 HP " + char3.getHp());
    System.out.println(monst2.getName() + " HP " + monst2.getHp());
    System.out.println();
  }

  monst1: while (monstAlive == 4) {
    int charDamage = Actions.attack(monst1.getAtk());
    int choice1 = Utilities.actionPrompt(char1.getName());
    if (choice1 == 1) {
      int damage = Actions.attack(char1.getAtk());
      monst1.setHp(damage);
      char1.setHp(charDamage);
    }
    if (choice1 == 2) {
      int defense1 = Actions.defend(char1.getDef());
      if (charDamage > defense1) {
        char1.setHp(charDamage - defense1);
      } else {
        char1.setHp(0);
      }
    }
    int choice2 = Utilities.actionPrompt(char2.getName());
    if (choice2 == 1) {
      int damage = Actions.attack(char2.getAtk());
      monst1.setHp(damage);
      char2.setHp(charDamage);
    }
    if (choice2 == 2) {
      int defense2 = Actions.defend(char2.getDef());
      if (charDamage > defense2) {
        char2.setHp(charDamage - defense2);
      } else {
        char2.setHp(0);
      }
    }
    int choice3 = Utilities.actionPrompt(char3.getName());
    if (choice3 == 1) {
      int damage = Actions.attack(char3.getAtk());
      monst1.setHp(damage);
      char3.setHp(charDamage);
    }
    if (choice3 == 2) {
      int defense3 = Actions.defend(char3.getDef());
      if (charDamage > defense3) {
        char3.setHp(charDamage - defense3);
      } else {
        char3.setHp(0);
      }
    }
    if (char1.getHp() <= 0) {
      charsAlive--;
      System.out.println("Better luck next time!");
    } else if (monst1.getHp() <= 0) {
      monstAlive--;
      System.out.println("Char 1 HP " + char1.getHp());
      System.out.println("Char 2 HP " + char2.getHp());
      System.out.println("Char 3 HP " + char3.getHp());
      System.out.println(monst1.getName() + " HP " + monst1.getHp());
      System.out.println();
      System.out.println("Well done! " + monst1.getName() + " defeated!"
          + "\nOh no! Something else is coming!");
      System.out.println("\nYour next opponent is " + monst2.getName() + "."
          + "\n HP: " + monst2.getHp());
      System.out.println();
      break monst1;
    } else {
        System.out.println();
        System.out.println("Round " + roundCount);
    }
    roundCount++;
    System.out.println("Char 1 HP " + char1.getHp());
    System.out.println("Char 2 HP " + char2.getHp());
    System.out.println("Char 3 HP " + char3.getHp());
    System.out.println(monst1.getName() + " HP " + monst1.getHp());
    System.out.println();

## This code was changed to encounterInfo()

System.out.println("You will be fighting " + monst1.getName() + "."
    + "\n HP: " + monst1.getHp());
System.out.println();

## This code replaced code of the same name in actions.Java

public static int attackMonster(Monster monster, Character character) {
  int monsterHP = monster.getHp();
  int characterAttack = attack(character.getAtk());
  int newMonsterHP = monsterHP - characterAttack;
  //monster.setHp(newMonsterHP);
  //System.out.println("Damage: " + characterAttack);
  //System.out.println("New Monster HP: " + newMonsterHP);
  return newMonsterHP;

## This code was originally used for defending, but has been replaced by getDef

/**
 * Returns the defend value.
 */
public static int defend(int defendValue) {
  int defFinal = defendValue + roll(20); // NEEDS TO BE DEFEND MAX, 20 IS PLACEHOLDER
  return defFinal;
  /** This will actually just use the characters def value
   *  And subtract it from damage directed at them, so it will be a
   *  constant of just the char's defense.
   **

## Unused colors and styles

// Bold
public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
public static final String RED_BOLD = "\033[1;31m";    // RED
public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

// Underline
public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
public static final String RED_UNDERLINED = "\033[4;31m";    // RED
public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

// Background
public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
public static final String RED_BACKGROUND = "\033[41m";    // RED
public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

// High Intensity
public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
public static final String RED_BRIGHT = "\033[0;91m";    // RED
public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

// Bold High Intensity
public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

// High Intensity backgrounds
public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
