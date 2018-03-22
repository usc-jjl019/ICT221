package au.edu.usc.mathgame;

/** Class JokeQuestion, This a
 * @author jjl019
 * @author ogboo3
 */

public class JokeQuestion implements Question {

    public boolean canScore;

    public JokeQuestion(){

        this.canScore = true;

    }

    @Override
    public void setOperator(){}

    @Override
    public void findAnswer(){}

    /** Outputs question
     * @return question string for unit testing **/
    @Override
    public String showQuestion() {
        String question = "How many Mexicans does it take to change a light bulb?\n1. Five\n2. Two\n3. Juan\n4. Ten";
        System.out.println(question);
        return question;
    }

    /** Outputs result of input
     * @param input The users answer **/
    @Override
    public void showAnswer(int input) {
        if (checkAnswer(input)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong answer, try again");
            this.canScore = false;
        }
        System.out.println("");
    }

    /** Checks if the joke answer is answered correctly.
     *
     * @param i The int to check against
     * @return true if i matches answer
     */
    @Override
    public boolean checkAnswer(int i) {

        return (i == 3);

    }

    @Override
    public boolean getCanScore(){
        return canScore;
    }

}
