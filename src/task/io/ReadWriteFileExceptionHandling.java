package task.io;

import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

// Реализуйте функциональность согласно описанию
public class ReadWriteFileExceptionHandling {
    public static void main(String[] args)  {
       // ReadWriteFileExceptionHandling.createFail();
        // TODO: Напишите программу, в которой при запуске приложения вы вводите в консоль текст и на основе
        //  введенного текста создается файл
        Scanner scanner = new Scanner(System.in);
       /* String s = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test2.txt"))){
            writer.write(s);
            System.out.println("ok");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        //System.out.println(ReadWriteFileExceptionHandling.del(6,0));
        // TODO: Напишите программу, которая считывает число с клавиатуры и выводит его квадрат. Обработайте
        //  исключение, если введено не число

     /*  try {
           int value = scanner.nextInt();
           System.out.println(value*value);
       } catch (Exception e){
           System.out.println(e + " введите число");
       }*/
        // TODO: Напишите программу, которая считывает данные из файла и выводит их на экран. Обработайте
        //  исключение, если файл не найден.
        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\daram\\Desktop\\1663345723_28-mykaleidoscope-ru-p-agressiya-u-koshki-emotsii-32.jpg"));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("1663345723_28-mykaleidoscope-ru-p-agressiya-u-koshki-emotsii-32.jpg")) ) {
            int value;
            while ((value=inputStream.read())!=-1){
                outputStream.write(value);
            }
            System.out.println("good");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        scanner.close();
        System.out.println(ReadWriteFileExceptionHandling.parsInt("jhjhjh"));

        }


    // TODO: Напишите программу, которая создает новый файл и записывает в него данные, которые передаются
    //  строкой
    public static void  createFail()  {
        String s = "lol kek";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test1.txt"))){
            writer.write(s);
            System.out.println("ok");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // TODO: Создайте метод, который делит два числа и возвращает результат. Обработайте исключение,
    //  если второе число равно нулю
    public static int del(int value1, int value2){
        int value3 =0;
        try {
            value3 = value1 / value2;
        }
        catch (ArithmeticException e){
            System.out.println("нельзя делить на ноль");
        }
        return value3;
    }



    // TODO: Создайте метод, который преобразует строку в число. Обработайте исключение, если строка не
    //  может быть преобразована в число.
    public static int parsInt(String str){
        int value = 0;
        try {
            value = parseInt(str);
        }
        catch (Exception e){
            System.out.println(e + " строка может быть только числом");
        } return value;
    }


/*
    // TODO: Напишите программу, которая делит одно число на другое и выводит результат. Обработайте
    //  исключение, если введены некорректные данные (например, вместо числа введена строка).
    public static int del1(int value1, int value2){
        int del =0;
        try {
            del = value1/value2;
        }
        catch (Exception e){
            System.out.println(e + " значение может быть только числом");
        } return del;
    }*/


}