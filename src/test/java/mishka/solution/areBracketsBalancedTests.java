package mishka.solution;

import mishka.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class areBracketsBalancedTests {

    //Проверка, что метод AreBracketsBalanced корректно работает с пустой строкой.
    @Test
    public void testAreBracketsBalanced1(){
        Solution sol = new Solution();

        assertTrue(sol.areBracketsBalanced());
    }

    //Проверка, что метод AreBracketsBalanced корректно работает заполненной строкой.
    @Test
    public void testAreBracketsBalanced2(){

        Solution sol1 = new Solution("(123)");
        Solution sol2 = new Solution("({[123]})");
        Solution sol3 = new Solution(")([]}{");
        Solution sol4 = new Solution("()()())");
        Solution sol5 = new Solution("((())(()))");

        assertTrue(sol1.areBracketsBalanced());
        assertTrue(sol2.areBracketsBalanced());
        assertFalse(sol3.areBracketsBalanced());
        assertFalse(sol4.areBracketsBalanced());
        assertTrue(sol5.areBracketsBalanced());
    }

}