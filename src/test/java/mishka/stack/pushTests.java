package mishka.stack;

import mishka.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pushTests {
    //Проверка, что метод pushBack корректно добавляет элемент в пустой стек.
    @Test
    public void testPushBackInEmptyStack(){
        Stack<Integer> list = new Stack<>();

        list.push(1);

        assertEquals(1,list.size());
        assertEquals(1, (int) list.peek());
        assertFalse(list.isEmpty());
    }

    //Проверка, что метод pushBack корректно добавляет элемент в непустой стек.
    @Test
    public void testPushBackInNotEmptyStack(){
        Integer [] a = {1,2,3,4,5,6,7};
        Stack<Integer> list = new Stack<>(a);

        int size = list.size();

        list.push(8);

        assertEquals(size + 1, list.size());
        assertEquals(8, (int) list.peek());
        assertFalse(list.isEmpty());
    }

}