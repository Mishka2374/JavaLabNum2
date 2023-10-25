package mishka.stack;

import mishka.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sizeTests {

    //Проверка, что метод size выводит корректный размер пустого стека
    @Test
    void testSizeInEmptyStack() {
        Stack<Integer> list = new Stack<>();

        assertEquals(0, list.size());
    }

    //Проверка, что метод size выводит корректный размер очищенного стека
    @Test
    void testSizeInClearStack() {
        Integer[] i = {1,2,3,4,5};
        Stack<Integer> list = new Stack<>(i);

        list.clear();

        assertEquals(0, list.size());
    }

    //Проверка, что метод size выводит корректный размер стека после добавления элемента
    @Test
    void testSizeAfterPush() {
        Integer[] i = {1,2,3,4,5};
        Stack<Integer> list = new Stack<>(i);

        int size = list.size();

        assertEquals(size, list.size());

        list.push(6);

        assertEquals(size+1 , list.size());
    }

    //Проверка, что метод size выводит корректный размер стека после удаления элемента
    @Test
    void testSizeAfterPop() {
        Integer[] i = {1,2,3,4,5};
        Stack<Integer> list = new Stack<>(i);

        int size = list.size();

        list.pop();

        assertEquals(size - 1, list.size());
    }

}