package mishka.stack;

import mishka.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class popTests {
    //Проверка, что pop удаляет верхнее значение.
    @Test
    public void testPopTrueValue(){
        Integer[] i = {1,2,3,4,5};
        Stack<Integer> list = new Stack<>(i);
        int size = list.size();

        list.pop();

        assertEquals(4, (int) list.peek());
        assertEquals(size - 1, list.size());
    }

    //Проверка на удаление в пустом стеке.
    @Test
    void testPopInEmptyStack() {
        Stack<Integer> list = new Stack<>();

        assertEquals(0, list.size());
        assertNull(list.pop());
    }

}