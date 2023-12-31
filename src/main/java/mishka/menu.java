package mishka;

import mishka.answerbook.ShuntingYard;
import mishka.answerbook.VariablesAndFunctions;

import java.util.Scanner;
/**
 * Класс menu представляет собой реализацию работы "меню" упрощённой работы
 * с чем-либо. В данном случае меню работает для работы с выражениями
 *
 * @author Mishka2374
 */
public class menu {
    /**
     * Метод для реализации работы с выражением
     */
    public static void answer_expression()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, введите выражение:");
        String expression = scanner.nextLine();
        System.out.println("Если вы вводили отрицательные числа, пожалуйста, измените знак \"-\" на \"=\" до вычислений");
        System.out.println("Если вы вводили заглавные символы, пожалуйста, измените их на незаглавные до вычислений");
        System.out.println("Выберите действие:");
        System.out.println("1) Посчитать выражение - нажмите \"1\"");
        System.out.println("2) Поменять переменные и функции в выражении на числа - нажмите \"2\"");
        System.out.println("3) Посмотреть инфиксную форму выражения - нажмите \"3\"");
        System.out.println("4) Посмотреть постфиксную форму выражения - нажмите \"4\"");
        System.out.println("5) Проверить на правильность расстановки скобок - нажмите \"5\"");
        System.out.println("6) Изменить выражение (написать 9, пробел, и само выражение) - нажмите \"9\"");
        System.out.println("7) Выход - нажмите любое отрицательное число");
        int x = 0;
        do {
            System.out.println("Вернуться в меню - \"0\" \t Выход - \"-1\"");
            x = scanner.nextInt();
            switch (x) {
                case 0:
                    System.out.println("Выберите действие:");
                    System.out.println("Посчитать выражение - нажмите \"1\"");
                    System.out.println("Поменять переменные и функции в выражении на числа - нажмите \"2\"");
                    System.out.println("Посмотреть инфиксную форму выражения - нажмите \"3\"");
                    System.out.println("Посмотреть постфиксную форму выражения - нажмите \"4\"");
                    System.out.println("Проверить на правильность расстановки скобок - нажмите \"5\"");
                    System.out.println("Изменить выражение (написать 9, пробел, и само выражение) - нажмите \"9\"");
                    System.out.println("Выход - нажмите любое отрицательное число");
                case 1:
                    Solution sol = new Solution(VariablesAndFunctions.Replace(expression));
                    if (!sol.isEmpty()) {
                       double answer = sol.Evaluation();
                        //Если число целое получится, то выводится без точки
                        if (answer == Math.floor(answer)) {
                            System.out.printf("%.0f%n", answer);
                        } else {
                            System.out.println(answer);
                        }
                    }
                    break;
                case 2:
                    expression = VariablesAndFunctions.Replace(expression);
                    System.out.println("Выражение изменено!");
                    break;
                case 3:
                    System.out.println("Выражение в инфиксной форме:\n" + expression);
                    break;
                case 4:
                    System.out.println("Выражение в постфиксной форме:\n" + ShuntingYard.PostFixForm(expression));
                    break;
                case 5:
                    Solution los = new Solution(expression);
                    if (los.areBracketsBalanced() && !los.isEmpty())
                        System.out.println("Выражение сбалансировано!");
                    else
                        System.out.println("Выражение несбалансированно!");
                    break;
                case 9:
                    System.out.println("Выражение изменено!");
                    expression = scanner.nextLine();
                    break;
                default:
                    System.out.println("До свидания!");
            }

        } while (x >= 0);
    }
}
