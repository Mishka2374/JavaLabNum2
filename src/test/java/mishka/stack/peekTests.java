package mishka.stack;

import mishka.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class peekTests {
    //Проверка, что метод peek выводит корректно элемент пустого стека
    @Test
    void testPeekInEmptyStack() {
        Stack<Integer> list = new Stack<>();

        assertNull(list.peek());
    }

    //Проверка, что метод peek выводит корректно элемент очищенного стека
    @Test
    void testPeekInClearStack() {
        Integer[] i = {1,2,3,4,5};
        Stack<Integer> list = new Stack<>(i);

        list.clear();

        assertNull(list.peek());
    }

    //Проверка, что метод peek выводит корректно верхний элемент стека до и после добавления элемента
    @Test
    void testPeekAfterPush() {
        Integer[] i = {1,2,3,4,5};
        Stack<Integer> list = new Stack<>(i);

        assertEquals(5, list.peek());

        list.push(6);

        assertEquals( 6, list.peek());
    }

    //Проверка, что метод peek выводит корректно верхний элемент стека после удаления элемента
    @Test
    void testPeekAfterPop() {
        Integer[] i = {1,2,3,4,5};
        Stack<Integer> list = new Stack<>(i);

        int x = list.pop();

        assertEquals(x-1, list.peek());
    }

}