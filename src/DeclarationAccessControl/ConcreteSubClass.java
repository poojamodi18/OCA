package DeclarationAccessControl;

public class ConcreteSubClass extends AbClass{

    private ConcreteSubClass(){
        System.out.println("private constructor");
    }

    @Override
    public void printLine() {
        System.out.println("Impl of interface method");
        line();
    }

    public static void main(String[] args) {
        ConcreteSubClass aClass = new ConcreteSubClass();
        aClass.printLine();
    }
}
