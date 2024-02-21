package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;;

public class Stream {


    //Реализуйте функциональность согласно описанию


    // TODO: Напишите метод, который принимает список слов от пользователя и использует функциональный интерфейс Predicate
    //  для фильтрации слов, начинающихся с определенной буквы, и вывода отфильтрованного списка.
    public static void filter(List<String> list, Predicate<String> pr) {
        for (String s : list) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }


    // TODO: Напишите метод, который принимает список чисел от пользователя и использует функциональный интерфейс Function
    //  для преобразования каждого числа в его квадрат и вывода списка квадратов.
    public static void square(List<Integer> list, Function<Integer, Integer> f) {

        for (Integer i : list) {
            i = f.apply(i);
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        // TODO: Напишите метод, который принимает два числа от пользователя и использует функциональный интерфейс BinaryOperator
        //  для сложения этих чисел и вывода результата.
        BinaryOperator<Integer> bo = (a,b)->a+b;
        System.out.println(bo.apply(5, 2));

        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("lol");
        list.add("kek");
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        Stream.filter(list, (String str) -> str.startsWith("l"));
        Stream.square(list1, (Integer i) -> i * i);
        // TODO: Напишите метод, который принимает список строк от пользователя и использует функциональный интерфейс Consumer
        //  для вывода каждой строки в верхнем регистре.
        list.forEach(str -> System.out.println(str.toUpperCase()));
        // TODO: Преобразовать список строк в список их длин. Описание: Напишите программу, которая принимает список строк в
        //  качестве входных данных и преобразует его в список их длин с использованием стримов.
        List<Integer> list2 = list.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(list2);
        // TODO: Соединить все строки из списка в одну строку. Описание: Напишите программу, которая принимает список строк в
        //  качестве входных данных и соединяет их все в одну строку с использованием стримов.

        String str = list.stream().reduce((acum,s)->acum+s).get();
        System.out.println(str);


    }
}