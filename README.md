# Разбор выражения и вычисление его значения.

---

## Задание

Выражение может содержать числа, знаки операций, скобки.
В случае, если выражение записано корректно, вычислить значение, 
а противном случае - вывести сообщение об ошибке.

Дополнительно приветствуется поддержка имен переменных и различных функций.
В случае, если есть переменные, их значения нужно запросить у пользователя
(для каждой из них - по одному разу).

---
# Реализованные классы

----
## 1. Стек: Stack

Стек включает в себя несколько конструкторов и основные методы для работы с этим списком.

---
### Реализованные методы

- `push(value)`: Добавляет элемент в стек.
- `pop(index)`: Удаляет первый "верхний" элемент.
- `isEmpty()`: Проверяет стек на пустоту.
- `size()`: Возвращает размерность стека.
- `peek()`: Возвращает первый (верхний) элемент стека, не удаляет из стека.
- `clear()`: Очищает список (удаляет все элементы).

---
## 2. Маневровая станция: ShuntingYard

Класс исполняет реализацию метода маневровой станции, т.е превращение 
выражения из инфиксной в постфиксную с сортировкой операций по значимости.

---
### Реализованные методы

- `PostFixForm(String infix)`: Изменение выражения из инфиксной в постфиксную форму.

---
## 3. Создатель ответа: PostfixCreator

Класс для вычисления значения выражения. 
Для корректной работы необходимы требования:
- Выражение подаётся классу в постфиксной форме (для этого можно применить: `ShuntingYard.PostFixForm(String infix)`)
- Выражение состоит из чисел и арифметических операций (для этого можно применить: `VariablesAndFunctions.Replace (String expression)`)

---
### Реализованные методы

- `Calculation(String expression)`: Вычисление значения выражения.

---
## 4. Переменные и функции: VariablesAndFunctions

Класс для замены переменных и функций в выражении на их заданное или вычисленное значение.

---
### Реализованные методы

- `Replace (String expression)`: Изменение переменных и функций путем 
подстановки вместо них вычисленного значения или заданного пользователем числа в само выражение.

---
## 5. Путь решения: Solution

Класс для решения выражения.

---
### Реализованные методы

- `Evaluation()`: Находит значение выражения.
- `areBracketsBalanced()`: Проверка выражения на правильность расстановок скобок (любых).
- `getInstance()`: Вывод выражения.
- `isEmpty()`: Проверка на пустоту.

---
## 6. Меню: menu

Меню реализовано для удобной работы со всеми классами pakage.mishka 

---
### Реализованные методы

- `answer_expression()`: Работа с пользователем.

---