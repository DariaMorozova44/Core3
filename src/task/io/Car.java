package task.io;
// TODO: Создайте класс, который представляет автомобиль. Реализуйте метод для запуска двигателя.
//  Обработайте исключение, если двигатель уже запущен.

public class Car {
    String engine="двигатель уже запущен";
    public  void launch() throws Exception {
        if (engine.equals("двигатель уже запущен")) {
            throw new Exception("двигатель уже запущен");
        }
            engine="запустить двигатель";
        System.out.println("двигатель еще не запущен");

            }

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.launch();

    }
        }



