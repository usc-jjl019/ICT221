package au.edu.usc.mathgame;

/** This is the interface for 'Question'
 *
 */
public interface Question {

    void setOperator();

    void findAnswer();

    String showQuestion();

    void showAnswer(int input);

    boolean checkAnswer(int i);

    boolean getCanScore();
}
