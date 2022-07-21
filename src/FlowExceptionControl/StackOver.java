package FlowExceptionControl;

public class StackOver {
    static int i=0;
    public static void main(String[] args) {
        go();
    }
    //approx. 11370 recursive calls before stackoverflow exception
    static void go(){
        System.out.println(i);
        i++;
        go();
    }
}
