package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
// TODO: Проверить, содержит ли список определенное значение. Описание: Напишите программу, которая принимает список
//  элементов и определенное значение в качестве входных данных и проверяет, содержит ли список это значение с использованием
//  стримов.

// TODO: Удалить дубликаты из списка. Описание: Напишите программу, которая принимает список элементов в качестве входных
//  данных и удаляет все дубликаты, оставляя только уникальные элементы с использованием стримов.

// TODO: Отфильтровать список чисел, оставив только четные числа. Описание: Напишите программу, которая принимает список
//  чисел в качестве входных данных и фильтрует его, оставляя только четные числа с использованием стримов.

public class Element {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(23);
        list.add(2);
        list.add(23);
        list.add(18);
        boolean b = list.stream().anyMatch(i->i==11);
        System.out.println(b);
        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
        List<Integer> list2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list2);
    }
}
