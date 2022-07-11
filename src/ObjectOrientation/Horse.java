package ObjectOrientation;

public class Horse extends Animal{
    Horse(){
        System.out.println("Horse no-arg constructor");
    }
    Horse(int h){
        this(); // will call no-arg constructor of horse
        System.out.println("Horse int constructor");
    }
}
