package au.edu.usc.mathgame;

import java.util.Random;

/** Class MathQuestion, stores information about each question
 * @author jjl019
 * @author ogboo3
 */

public class MathQuestion implements Question {

    int answer;
    Random rand = new Random();

    private int v1 = rand.nextInt(13 - 0) + 1;
    private int v2 = rand.nextInt(13 - 0) + 1;
    private int o = rand.nextInt(4 - 0) + 1;
    private String operator;

    public boolean canScore;

    public MathQuestion() {

        this.canScore = true;

        setOperator();

        findAnswer();
    }

    /** Unit testing constructor
     * @param v1 the first value in the equation
     * @param v2 the second value in the equation
     * @param o the math operator in the equation
     * **/
    public MathQuestion(int v1, int v2, int o) {
        this.v1 = v1;
        this.v2 = v2;
        this.o = o;
        this.canScore = true;
        setOperator();
        findAnswer();
    }

    /** Sets the textual representation of the operator **/
    @Override
    public void setOperator() {

        if (o == 1) {
            operator = " " + "+" + " ";
        } else if (o == 2) {
            operator = " " + "-" + " ";
        } else if (o == 3) {
            operator = " " + "X" + " ";
        } else if (o == 4) {
            operator = " "+ "/" + " ";
        }
    }
    /** Calculates the answer and stores it for later use **/
    @Override
    public void findAnswer() {

        if (o == 1) {
            answer = v1 + v2;
        } else if (o == 2) {
            answer = v1 - v2;
        } else if (o == 3) {
            answer = v1 * v2;
        } else if (o == 4) {
            answer = v1 / v2;
        }
    }

    /** Outputs question
     * @return question string for unit testing **/
    @Override
    public String showQuestion() {
        String question = "What is " + v1 + operator + v2 + "?";
        System.out.println(question);
        return question;
    }

    /** Outputs result of input
     * @param input The users answer **/
    @Override
    public void showAnswer(int input) {
        //System.out.println("Answer is " + answer);
        if (checkAnswer(input)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong answer, try again");
        }
        System.out.println("");
    }

    /** Checks if i is equal to answer
     *
     * @param i The int to check against
     * @return true if i matches answer
     */
    @Override
    public boolean checkAnswer(int i) {
        if (i == answer){
            return true;
        }else {
            this.canScore = false;
            return false;
        }

    }

    @Override
    public boolean getCanScore(){
        return canScore;
    }

}