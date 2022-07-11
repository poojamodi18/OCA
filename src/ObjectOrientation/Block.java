package ObjectOrientation;

public class Block {
    static {
        System.out.println("Static block");
    }
    {
        System.out.println("instance block");
    }
    Block(){
        System.out.println("block no-arg constructor");
    }
}
