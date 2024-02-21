package task.io;
// TODO: Напишите программу, которая делит одно число на другое и выводит результат. Обработайте
//  исключение, если введены некорректные данные (например, вместо числа введена строка).

import static java.lang.Integer.parseInt;

public class Del {
    public static void main(String[] args) {


        try {
            int  value1=10;
            int value2 = parseInt("5");
            int del = value1 / value2;
            System.out.println(del);
        } catch (NumberFormatException e) {
            System.out.println(e + "значение должно быть числом");
        }
    }
}
