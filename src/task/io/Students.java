package task.io;
// TODO: Реализуйте класс, который представляет список студентов. Реализуйте метод для добавления
//  студента в список. Обработайте исключение, если список уже содержит студента с таким же именем.

import java.util.ArrayList;
import java.util.List;


public class Students {
    String name;

    Students(String name) {
        this.name = name;
    }

    public static void addStudents(List<String> list, String name) throws Exception {
            if (!list.contains(name)){
                list.add(name);
                System.out.println(list);
            } else {
                throw new Exception("имена не должны повторяться");

            }



    }


    public static void main(String[] args) throws Exception {
        List <String> list = new ArrayList<>();
        Students.addStudents(list,"akim");
       // Students.addStudents(list,"akim");
        Students.addStudents(list,"dasha");





    }
}
