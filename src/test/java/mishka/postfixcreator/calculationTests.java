package mishka.postfixcreator;

import mishka.answerbook.PostfixCreator;
import mishka.answerbook.ShuntingYard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculationTests {

    //Проверка, что метод Calculation корректно работает с пустой строкой.
    @Test
    public void testPostFixFormInEmptyString(){

        assertEquals(0,PostfixCreator.Calculation(null));
    }


    //Проверка, что метод Calculation корректно решает правильные выражения.
    // (предварительно необходимо составить постфиксную форму)
    @Test
    public void testPostFixFormInCorrectExpression(){
        String str1 = "1";
        String str2 = "1+2-5";
        String str3 = "4*(2.1/3)";
        String str4 = "1.5^2";
        String str5 = "1-=1"; //Это эквивалентно: 1-(-1)


        assertEquals(1.0,PostfixCreator.Calculation(ShuntingYard.PostFixForm(str1)));
        assertEquals(-2.0,PostfixCreator.Calculation(ShuntingYard.PostFixForm(str2)));
        assertEquals(2.8,PostfixCreator.Calculation(ShuntingYard.PostFixForm(str3)));
        assertEquals(2.25,PostfixCreator.Calculation(ShuntingYard.PostFixForm(str4)));
        assertEquals(2,PostfixCreator.Calculation(ShuntingYard.PostFixForm(str5)));
    }

    //Проверка, что метод Calculation не решает неправильные выражения.
    // (предварительно необходимо составить постфиксную форму)
    @Test
    public void testPostFixFormInNotCorrectExpression(){
        String str1 = " ";
        String str2 = "1--=1"; //Это эквивалентно: 1-(-1)
        String str3 = "100/0";
        String str4 = "1 + - *";
        String str5 = "abc";
        String str6 = "1.5^2";



        assertEquals(0.0,PostfixCreator.Calculation(ShuntingYard.PostFixForm(str1)));
        assertEquals(0.0,PostfixCreator.Calculation(ShuntingYard.PostFixForm(str2)));
        assertEquals(0.0,PostfixCreator.Calculation(ShuntingYard.PostFixForm(str3)));
        assertEquals(0.0,PostfixCreator.Calculation(str4));
        assertEquals(0.0,PostfixCreator.Calculation(str5));
        assertEquals(0.0,PostfixCreator.Calculation(str6));


    }

}