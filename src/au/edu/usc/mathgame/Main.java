package au.edu.usc.mathgame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A simple console-based maths quiz for primary school children.
 *
 * @author jjl019
 * @author ogboo3
 */

/** Class  Main, this is the main loop the handles the program at runtime **/

public class Main {

    private HighScore highScore;

    public static void main(String[] args) {
        Main main = new Main();
        main.gameNumberQuestion();
    }
    /**
     * Handles initiation of each game
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

    /** This handles each round
     *
     * @return The end score for this game session
     */
    public int game() {
        int count = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<Question> questions = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            questions.add(new Question());
        }
        for (int i = 0; i < questions.size(); ++i) {
            questions.get(i).showQuestion();
            int response = input.nextInt();
            questions.get(i).showAnswer(response);
            if (questions.get(i).checkAnswer(response)) {
                if (questions.get(i).canScore) {
                    count++;
                }
            } else {
                questions.get(i).canScore = false;
                i--;
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