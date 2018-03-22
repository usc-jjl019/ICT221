package au.edu.usc.mathgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuestionTest {

    Question q = new Question(3, 4, 1);

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
