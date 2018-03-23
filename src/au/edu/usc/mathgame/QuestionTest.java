package au.edu.usc.mathgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** The Class QuestionTest is a unit tester
 * @author jjl019
 * @author ogboo3
 * **/



public class QuestionTest {

    MathQuestion q = new MathQuestion(3, 4, 1);

    @Test
    void test1() {
        assertFalse(q.checkAnswer(0));
    }

    @Test
    void test2() {
        assertTrue(q.checkAnswer(7));
    }

    @Test
    void test3(){
        assertEquals("What is 3 + 4?", q.showQuestion());
    }
}
