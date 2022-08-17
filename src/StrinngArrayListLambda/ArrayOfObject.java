package StrinngArrayListLambda;

import java.util.ArrayList;
import java.util.List;

class Car{
    String name(){
        return "Car";
    }
}
class Kia extends Car{
    String name(){
        return "Kia";
    }
}
class Mg extends Car{
    String name(){
        return "Mg";
    }
}
public class ArrayOfObject {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car();
        cars[1] = new Kia();
        cars[2] = new Mg();

        List<String> l = new ArrayList<>();
        l.add("O");
        l.add("T");
        l.add("OR");
        l.add("OR");

        String s = l.remove(2);
        System.out.println(s);


        System.out.println(l);
        for (Car car : cars) {
            System.out.println(car.name());
        }


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
    }
}
