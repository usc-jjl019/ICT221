package au.edu.usc.mathgame;

import java.util.Random;

public class Question {
    /** calculates Random Int from Random library **/
    int answer;
    Random rand = new Random();

    private int v1 = rand.nextInt(13 - 0) + 1;
    private int v2 = rand.nextInt(13 - 0) + 1;
    private int o = rand.nextInt(4 - 0) + 1;
    private String operator;
    public boolean canScore = true;

    public Question() {

        setOperator();

        findAnswer();
    }
    /** checks answer **/
    public Question(int v1, int v2, int o) {
        this.v1 = v1;
        this.v2 = v2;
        this.o = o;
        setOperator();
        findAnswer();
    }

    private void setOperator() {

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

    private void findAnswer() {

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

    /** Makes question with v1 and v2 using random operator for values **/
    public String showQuestion() {
        String question = "What is " + v1 + operator + v2 + "?";
        System.out.println(question);
        return question;
    }

    /** checks answer */
    public void showAnswer(int input) {
        //System.out.println("Answer is " + answer);
        if (input == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong answer, try again");
        }
        System.out.println("");
    }
    public boolean checkAnswer(int i) {

        return (i == answer);

    }
}