package mishka.solution;

import mishka.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class evaluationTests {

    //Проверка, что метод Calculation корректно работает с пустой строкой.
    @Test
    public void testEvaluationInEmptyString(){

        Solution sol = new Solution();
        assertEquals(0,sol.Evaluation());
    }

    //Проверка, что метод Calculation корректно работает с непустой строкой.
    @Test
    public void testEvaluationInNotEmptyString(){

        Solution sol = new Solution("1^2*3-4+5+0.5");

        assertEquals(4.5,sol.Evaluation());
    }

}