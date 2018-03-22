package au.edu.usc.mathgame;

/** The Class HighScore is used to keep track of the high score
 * @author jjl019
 * @author ogboo3
 * **/

public class HighScore {

    private int currentHighScore;

    /** Sets a new high score if the score is higher
     *
     * @param score The current game score
     */
    public void checkScore(int score) {
        if (score > currentHighScore) {
            currentHighScore = score;
        }

    }

    /** Prints the current high score
     *
     * @return string of high score
     */
    public String listHighScore() {
        return "Your high score is: " + currentHighScore;
    }

}
