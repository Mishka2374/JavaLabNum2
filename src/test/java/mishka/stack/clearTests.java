package mishka.stack;

import mishka.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class clearTests {
    //Проверка, что метод clear работает корректно с пустым стеком
    @Test
    void testClearInEmptyStack() {
        Stack<Integer> list = new Stack<>();
        int size = list.size();

        list.clear();

        assertEquals(size, list.size());
    }

    //Проверка, что метод clear работает корректно с непустым стеком
    @Test
    void testClearInNotEmptyStack() {
        Integer[] i = {1,2,3,4,5};
        Stack<Integer> list = new Stack<>(i);

        int size = list.size();

        list.clear();

        assertEquals(size - 5, list.size());
        assertEquals(0,list.size());
    }

}