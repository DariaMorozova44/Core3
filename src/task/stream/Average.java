package task.stream;

import java.util.ArrayList;
import java.util.List;

// TODO: Найти среднее значение всех чисел в списке. Описание: Напишите программу, которая принимает список чисел в качестве
//  входных данных и вычисляет их среднее значение с использованием стримов.
public class Average {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(9.0);
        list.add(4.0);
        list.add(5.0);
        double average = list.stream().mapToInt(i->i.intValue()).average().getAsDouble();
        System.out.println(average);
    }
}
