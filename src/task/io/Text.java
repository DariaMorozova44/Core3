package task.io;

import java.io.*;

// TODO: Напишите программу, которая создает файл из текста, который подается строкой, а потом
//  считывает первое слово из файла
public class Text {

    public static void main(String[] args) throws IOException {
        String line = "привет как дела?";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt")))
        {
            writer.write(line);
            System.out.println("ok");

        }
        try (BufferedReader reader = new BufferedReader(new FileReader("test3.txt")) ) {
            int value;
            while ((value= reader.read())!=32){
                System.out.print((char) value);
            }

        }
    }
}
