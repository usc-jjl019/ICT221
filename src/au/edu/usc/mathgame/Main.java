package au.edu.usc.mathgame;

import java.util.Random;
import java.util.Scanner;

/**
 * A simple console-based maths quiz for primary school children.
 *
 * @author jjl019
 * @author ogboo3
 */

/** Class  Main, it's method is gameNumberQuestion used to prompt for how many games the user desires **/


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.gameNumberQuestion();
    }

    /**
     * This is a for loop that runs depending on the input number the user has chosen
     **/

    public void gameNumberQuestion() {
        System.out.println("10 questions per game, how many rounds would you like to play? ");
        Scanner input = new Scanner(System.in);
        int rounds = input.nextInt();
        int roundsCount;
        roundsCount = rounds * 10;
        for (int i = 0; i < rounds; ++i) {
            roundsCount = rounds;
            System.out.println("You have elected to play" + " " + roundsCount + " " + "rounds");
            game();

        }
    }

    int rounds;

    /**
     * This starts the game using the parameters set from gameNumberQuestion
     **/

    public void game() {
        int count = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; ++i) {
            Question question1 = new Question();
            question1.showQuestion();
            int response = input.nextInt();
            question1.findAnswer();
            question1.showAnswer(response);
            if (response == question1.answer) {
                ++count;
                System.out.println("Your score is" + " " + count + " " + "out of" + " " + (i+1));
            }
        }

    }
}