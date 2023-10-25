package mishka.variablesandfunction;

import mishka.answerbook.VariablesAndFunctions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class replaceTests {

    //Проверка, что метод Replace корректно работает с выражениями без параметров.
    @Test
    void testReplaceInExpressionWithoutParams() {
        String str1 = " ";
        String str2 = "1+2+3";
        String str3 = "1 + - *";
        String str4 = "(1+2)*(3-4)";
        String str5 = "12345657890";

        assertEquals(str1, VariablesAndFunctions.Replace(str1));
        assertEquals(str2, VariablesAndFunctions.Replace(str2));
        assertEquals(str3, VariablesAndFunctions.Replace(str3));
        assertEquals(str4, VariablesAndFunctions.Replace(str4));
        assertEquals(str5, VariablesAndFunctions.Replace(str5));
    }

    //Проверка, что метод Replace корректно реагирует на неправильные выражения.
    @Test
    void testReplaceInIncorrectExpression() {
        String str1 = "abc(";
        String str2 = "sin(1)";
        String str3_1 = "cos(c)";
        String str3_2 = "cos(o)";
        String str3_3 = "cos(s)";
        String str4 = "error";

        assertEquals("error", VariablesAndFunctions.Replace(str1));
        assertEquals("error", VariablesAndFunctions.Replace(str2));
        assertEquals("error", VariablesAndFunctions.Replace(str3_1));
        assertEquals("error", VariablesAndFunctions.Replace(str3_2));
        assertEquals("error", VariablesAndFunctions.Replace(str3_3));
        assertEquals("0", VariablesAndFunctions.Replace(str4));
    }

    //Проверка, что метод Replace корректно работает с выражениями, содержащими параметры.
    @Test
    public void testReplaceInExpressionWithParams() {
        String expression = "a+b";
        InputStream stdin = System.in;

        try {
            //  Входные данные для программы
            String input = "1\n2\n";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            // Вызов метода
            String result = VariablesAndFunctions.Replace(expression);

            // Проверка результат
            assertEquals("1+2", result);
        } finally {
            // Восстановите исходный входной поток
            System.setIn(stdin);
        }
    }

    //Проверка, что метод Replace корректно работает с выражениями, содержащими функции с параметрами.
    //Это также проверка с взаимодействием закрытого класса function
    @Test
    public void testReplaceAndFunctionInExpressionWithFunctions() {
        String expression = "sin(d)+cos(d)+tan(d)+cbrt(m)+log(r)+exp(d)";
        InputStream stdin = System.in;

        try {
            //  Входные данные для программы
            String input = "0\n8\n1\n";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            // Вызов метода
            String result = VariablesAndFunctions.Replace(expression);

            // Проверка результат
            assertEquals("0.0+1.0+0.0+2.0+0.0+1.0", result);
        } finally {
            // Восстановите исходный входной поток
            System.setIn(stdin);
        }
    }

    //Проверка, что метод Replace корректно реагирует на неправильные выражения с параметром.
    @Test
    public void testReplaceInIncorrectExpressionWithParams() {
        String expression1 = "log(x)";
        String expression2 = "sin(1+x)";
        InputStream stdin = System.in;

        try {
            String input = "-1\n";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            String result1 = VariablesAndFunctions.Replace(expression1);

            input = "1\n";
            in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            String result2 = VariablesAndFunctions.Replace(expression2);


            assertEquals("error", result1);
            assertEquals("error", result2);
        } finally {
            // Восстановите исходный входной поток
            System.setIn(stdin);
        }

    }

}