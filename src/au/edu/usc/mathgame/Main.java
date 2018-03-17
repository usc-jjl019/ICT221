package au.edu.usc.mathgame;

import java.util.Random;
import java.util.Scanner;

/**
 * A simple console-based maths quiz for primary school children.
 *
 * @author jjl019
 * @author ogboo3
 */

public class Question {
    private int value1;
    private int value2;
    //   private String operator;


    public Question(int v1, int v2, String op) {
        value1 = v1;
        value2 = v2;
        operator = op;
    }

    public void showQuestion() {
        System.out.printf("What is %d + %d?\n", value1, value2);
    }

    public boolean checkAnswer(int response) {
        // TODO: check responce against value1+value2...
        return false;
    }
}


public class Main {

    public static void main(String[] args) {

    Question q =new Question(a,b,"+");
    q.showQuestion();
    int response = input.nextint();
    q.checkAnswer(response);


        /**
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        // now ask some random addition questions.
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(20);
            int b = rand.nextInt(20);
            int correct = a + b;
            System.out.printf("What is %2d + %2d? ", a, b);
            int response = input.nextInt();
            if (response == correct) {
                System.out.printf("  Yes!\n");
            } else {
                System.out.printf("  No, the answer is %d.\n", correct);
            }
        } **/
    }
}


