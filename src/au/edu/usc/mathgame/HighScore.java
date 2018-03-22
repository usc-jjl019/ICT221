package au.edu.usc.mathgame;

public class HighScore {

    private int currentHighScore;

    public void checkScore(int score) {
        if (score > currentHighScore) {
            currentHighScore = score;
        }

    }

    public String listHighScore() {
        return "Your high score is: " + currentHighScore;
    }

}
