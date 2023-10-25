package mishka.stack;

import mishka.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isEmptyTests {
    //Проверка, что isEmpty работает в пустом стеке.
    @Test
    public void testIsEmptyInEmptyStack(){
        Stack<Integer> list = new Stack<>();

        assertTrue(list.isEmpty());
    }

    //Проверка, что isEmpty работает в непустом стеке из одного элемента.
    @Test
    public void testIsEmptyInLonelyStack(){
        Stack<Integer> list = new Stack<>(1);

        assertFalse(list.isEmpty());
    }

    //Проверка, что isEmpty работает в непустом стеке из нескольких элементов.
    @Test
    public void testIsEmptyInNotLonelySTack(){
        Integer[] i = {1,2,3,4,5};
        Stack<Integer> list = new Stack<>(i);

        assertFalse(list.isEmpty());
    }

    //Проверка, что isEmpty работает после удаления всех элементов.
    @Test
    public void testIsEmptyAfterClear() {
        Integer[] i = {1,2,3,4,5};
        Stack<Integer> list = new Stack<>(i);

        list.clear();

        assertTrue(list.isEmpty());
    }

}