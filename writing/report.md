# Report by Leah, Spencer, Vanessa, Till.


Our objective was to create a dungeon crawler game using the information we
learned in computer science 112. Our game, Doki Doki Computer Science Club 2:
The Bloodletting allows one to manage a team of wizards in a quest to save
Funky Kong, who has been kidnapped by the evil Kapfhammer. This is by no means
easy, as Kapfhammer has many gnomes guarding his dungeon. The player has three
characters in their party. The player chooses to either attack or defend
against the enemy. As enemies are killed, more enemies appear until the final
boss is reached. To implement this game, multiple classes were created that
contained information for character objects, monster objects, action methods,
the main method and battle conditional logic, and a test suite. We tested our
code with a series of test cases that ensure that the character and monster
attack values are within an appropriate range, as well as to ensure that the
character and monster hp values are modified accordingly given a known attack
value. To evaluate the overall effectiveness of this game, we played the game
at all developmental stages, calculated expected outcomes by hand, checked that
the appropriate outcome happened given a battle win (Congratulations message
and progression to the next enemy) or loss (loss message and a halt in the
progression), and evaluated the monster AI to ensure that 1. It attacked back
and 2. That it did so in an unpredictable (but “legal” given its attack max)
way. We noticed that booting up the game could be either a slow or quick process
depending on if we had selected to do a clean run or a normal run. To gain
insight on this, we timed how long it took to create the characters. It
consistently took 2 milliseconds. This tells us that the character creation
step was not responsible for slowing the start up of the game at times. Future
steps we could take with this project involve timing other parts of the game.
