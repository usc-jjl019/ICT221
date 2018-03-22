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



/** Instantiate Main and HighScore**/


public class Main {

    private HighScore highScore;

    public static void main(String[] args) {
        Main main = new Main();
        main.gameNumberQuestion();
    }
    /**
     * This is a for loop that runs depending on the input number the user has chosen
     **/

    public void gameNumberQuestion() {
        highScore = new HighScore();
        System.out.println("10 questions per game, how many games would you like to play? ");
        Scanner input = new Scanner(System.in);
        int games = input.nextInt();
        System.out.println("You have elected to play " + (games * 10) + " rounds of questions");
        int count = 0;
        for (int i = 1; i <= games; ++i) {
            int gameCount = game();
            count += gameCount;
            System.out.println("Your score is " + count + " " + "out of " + (i * 10));

            highScore.checkScore(gameCount);
            System.out.println(highScore.listHighScore());
        }
    }

    /**
     * This starts the game using the parameters set from gameNumberQuestion
     **/

    public int game() {
        int count = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; ++i) {
            Question question1 = new Question();
            question1.showQuestion();
            int response = input.nextInt();
            question1.showAnswer(response);
            if (question1.checkAnswer(response)) {
                count++;
            }

        }
        if (count >= 0 && count <= 5) {
            System.out.println("Good start, you can do better");
        } else if (count > 5 && count <=7) {
            System.out.println("Great work!, maybe you might do better if you try again");
        } else if (count > 7) {
            System.out.println("Fantastic!, you did splendid");
        }


        return count;
    }
}