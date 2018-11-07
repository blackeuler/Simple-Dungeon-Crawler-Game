# Reflection by Vanessa, Till, Leah, Spencer

This lab required us to explore the real-world applications of computer science
and created a dungeon crawler, This is a game where the user is initially set
with 3 characters and the characters fight their way through a series of
monsters to save the one and Funky Kong. The starts off by asking the user's
team name and then progresses to giving a brief description of the adventure.
Afterwards, the user is then able to see the statistics of the team members
(the 3 characters). Then, the 3 characters are put into 4 battles (3 regular
monsters and 1 boss battle), each with its unique story and distinct monster.
These battles prompt the user to choose out of 3 actions (attack, defend, or
heal) for all 3 of the characters and an AI chooses what the monsters would do.
Each battle consists of actions 4 turns (1 for each character and 1 for the
monster). Since it is a 3 on 1, the monsters have the ability to attack all 3
characters at once. As each character dies, their action prompt will be removed
from the choices and if all the characters die, then the game ends with
everyone being sad. But, if the user defeats all the monsters, then it will
trigger a story that tells the user that they have successfully saved Funky
Kong. Aside from the game, we were able to implement test cases to check if
each part of the game was running as expected. Also, we were able to run
experiments on how long each round/turn took to check the efficiency of the
code.

Leah's reflection:

Our source code features numerous methods necessary to running a successful
dungeon crawler. The method startGame takes the user’s team name as input and
outputs some background information about the story. This method is called at
the beginning of the game, or after the program is first run. The method roll
contains the random number generator which is essential to determining attacks,
defenses, healing, etc. It takes in the maxValue, or a cap for attacks and
other things, and returns a randomly generated number. The method attack comes
up with an attack amount. It takes in the character or monster’s predefined
attack value and randomizes it within a range and returns the randomized
number. The defend and heal methods work similarly. There are also action
prompts that take in a number that the user selects on their keyboard and
returns whatever they selected, e.g. 1 = attack, 2 = defend. There are also
getter and setters for character and monster HP values. For me, the greatest
challenge in completing this project was not the code but rather coordinating
with my group members. I think all of us had a slightly different version of
what this game would look like and sometimes I feel that our individual
progress on the project was stunted a bit due to having to check in with each
other first to make sure everyone was on board with our ideas. We tried to work
around this by talking about the project together and what our list of “to dos”
would be.

Spencer's reflection:

The game we created was childhood favorites, dungeon crawlers. It is
initialized with the user having 3 characters to control and these 3 characters
have to fight their way through a series of monster battles to save a certain
VIP. The game runs in terms of rounds and turns. Each round consists of 4
turns, one for each the characters and one for the monster the characters are
currently battling. The characters each of the choices of attacking, defending,
or healing. The monster can only attack if its health is above 50% and if it is
below 50% then a randomizer will decide if the monster attacks, defends, or
heals. After the round is over, we then check to see if either one of the
characters or the monster has died to determine where to go next. If one
character is died, then we move onto another loop where that character's choice
is not available (or so this was what I thought was suppose to happen,
evidently this wasn't what my teammates thought, as seen from the code that
they implemented--will discuss about it later on). If the monster is died, then
we progress to the next monster series. The game incorporates most of what we
learned in CMPSC 112, from organization to testing for efficiency and
correctness. Comparing projects from previous courses to this one, there is
definitely a clear difference in proficiency/usage of classes, methods, and
even objects. With all that said, there were definitely some difficulties while
creating this game. My initial thoughts on the game was surely different than
what my teammates thought the game should be. Not expressing my thoughts on the
game with my teammates was my first mistake. My second mistake was to waste
time and start implementing code that I thought was correct. I began to create
the code because I thought that we came to an understanding and we would start
off each round by 1-on-1 battles until the first character dies and then we
would be able to move onto the next character. However, my teammates wanted it
to be a 3-on-1 every round. So, all the source code that I created was then
reverted, as seen from the commit: reverted RunningRounds back to initial
stages. Then I finally realized that I was in a team situation and grasped that
rather than running with my thoughts, I should have communicated with my team
to have a better understanding of my teammates expectations. Hence, after all
that time, I realized my mistake and I discussed about it with the group--we
came to a consensus pretty easily (I was overruled). Besides for some
confusion/conflicts, the group was about to cooperatively split up the work and
successfully work together to create the game.

Vanessa's reflection:

I am super proud of the game we’ve created! It’s a pretty simple
dungeon-crawler style game, in which your randomly generated party of three
characters takes on a series of challenging monsters in turn-based combat. We
incorporated several classes to execute this, which stored things like the
monster- and character-related objects and methods, the battle actions
themselves, utilities to minimize redundant typing of repeated code “phrases,”
and, of course, a main method to run the game. Overall, I feel we were quite
successful as a team, and were able to effectively incorporate not just what we
learned in 112 but elements from our 111 projects as well, like the text
coloring that Till and I had used in our original game last semester. However,
the change from a group of two last semester to a group of four this semester
presented new challenges. Namely, we struggled at times with communication, as
evidenced by the TONS of merge conflicts you’ll see in our commit log. Perhaps
because of our schedules, existing friendships, or just our placement in the
classroom, we sort of divided into two sub-teams: me and Till and Spencer and
Leah. We ran into a couple situations where these two groups had different
senses of where we were in the project and where we wanted to go from there,
however we were usually able to sort those out with a quick conversation in
person or on Slack. There were also a couple times Till and I had created good
working code, only to have it deleted and replaced with something that wasn’t
actually working anymore. This led to a decent amount of unnecessary re-entry
and could have been avoided if we had either communicated changes in advance or
commented out code that was changed instead of outright deleting it. That being
said, I had a really nice time working with my group, and do believe we have
all been really dedicated to creating the best program we can.

Till's Reflection:

The idea behind our project was simpler in theory than execution. I ended up
learning significantly more about parameter passing and modification of
information stored within objects than I previously knew. We ran into a large
number of merge conflicts that sometimes were easy to track down (someone
didn't pull and then committed) and other times didn't make sense (we pulled
but got nothing?). At times it was simple as someone not pushing their commits,
however alas, github is a mystery. Because of the amount of files we
implemented, good and clear commit messages were necessary. It was difficult to
contain the amount of info I wanted to include within these commit messages,
and this led to methods I had created being overwritten. I'm proud of the final
product, though. The real basis for our code comes from the first lab that
worked with Credit Card objects. Using these as a means to store characters and
enemies. This means that our entire code is kind of a glorified bank
transaction. The end result works wonderfully and impressively, especially
given its foundation.
