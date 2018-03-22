package au.edu.usc.mathgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuestionTest {
    @Test
void testCreate() {
    Question q = new Question(3, 4, 1);
    assertFalse(q.checkAnswer(0));
  //  assertTrue(q.checkAnswer(7));
}

}
