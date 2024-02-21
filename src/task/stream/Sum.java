package task.stream;

import java.util.ArrayList;
import java.util.List;
// TODO: Найти сумму всех чисел в списке. Описание: Напишите программу, которая принимает список целых чисел в качестве
//  входных данных и вычисляет их сумму с использованием стримов.

public class Sum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(5);
        int sum =list.stream().mapToInt(i->i.intValue()).sum();
        System.out.println(sum);
    }
}
