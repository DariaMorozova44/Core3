package task.stream;
// TODO: Найти наибольшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
//  данных и находит наибольшее число с использованием стримов.

// TODO: Найти наименьшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
//  данных и находит наименьшее число с использованием стримов.


import java.util.ArrayList;
import java.util.List;

public class Max {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(23);
        int max = list.stream().mapToInt(i->i.intValue()).max().getAsInt();
        System.out.println(max);
        int min = list.stream().mapToInt(i->i.intValue()).min().getAsInt();
        System.out.println(min);
    }
}
