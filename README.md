# Simple Dungeon Game

This repository contains Java source code that runs a simple dungeon game in
the command-line. As the name states, the game is fairly straightforward. You
start off with 3 unique characters randomly chosen from a list of 10 possible
characters. Then, you enter the dungeon and fight`!!!`Each fight, you are given
options to either 1.) attack 2.) defend or 3.) heal a designated ally. There
are a total of 4 opponents. Stay alive as long as possible to beat the final
raid boss to win the game!

## Requirements

In order to run the program, you will need the following apps to be in your disposal:

* gradle 4.1
* java 1.8.0
* mdl 0.4.0
* proselint 0.7.0

## Commands

You can run the program using the following the commands:

* `gradle build`: create the bytecode from the Java source code
* `gradle run`: run the Java program in the command-line
* `gradle -q --console plain run`: run the Java program in the command-line
  while silencing all the unnecessary outputs

You can also complete several important Java programming tasks by using the
`gradle` tool. Here are additional commands that you can type:

* `gradle clean`: clean the project of all the derived files
* `gradle check`: check the quality of the code using Checkstyle
* `gradle tasks`: display details about the Gradle system

## Travis

This program uses [Travis CI](https://travis-ci.com/) to automatically run
a checking program every time there is a commit to the GitHub repository. If
you are using Travis for the first time, you will need to authorize Travis CI to
access the private repositories that you created on GitHub.
