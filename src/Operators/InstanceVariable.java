package Operators;

public class InstanceVariable {

//        private int i = 1;     // can not access instance variable from static method
        private static int i = 1;
        public static void main(String argv[]){
            int i = 2;
            InstanceVariable s = new InstanceVariable ();
            s.someMethod();
        }
        public static void someMethod() {
            System.out.println(i);
        }
}
