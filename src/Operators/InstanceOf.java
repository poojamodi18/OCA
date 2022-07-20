package Operators;
interface Foo{}
class A implements Foo{
}
class B extends A{
}

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        if(a instanceof Foo){
            System.out.println("a Foo");
        }
        if(b instanceof Foo){
            System.out.println("b Foo");
        }
        if(b instanceof A){
            System.out.println("b instance");
        }
        if(a instanceof B){
            System.out.println("a instance");
        }
    }

}
