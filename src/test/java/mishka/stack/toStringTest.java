package mishka.stack;

import mishka.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class toStringTest {

    //Проверка, что метод toString работает с пустым стеком
    @Test
    void testToStringInEmptyStack() {
        Stack<Integer> list = new Stack<>();

        assertEquals("Список:\t", list.toString());
    }

    //Проверка, что метод toString работает с непустым стеком
    @Test
    void testToStringInNotEmptyStack() {
        Integer[] i = {1,2,3,4,5};
        Stack<Integer> list = new Stack<>(i);

        assertEquals("Стек:\t5 <--- 4 <--- 3 <--- 2 <--- 1", list.toString());
    }

}