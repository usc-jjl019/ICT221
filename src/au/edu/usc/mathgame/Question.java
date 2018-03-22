package au.edu.usc.mathgame;

public interface Question {

    void setOperator();

    void findAnswer();

    String showQuestion();

    void showAnswer(int input);

    boolean checkAnswer(int i);

    boolean getCanScore();
}
