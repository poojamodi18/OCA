package FlowExceptionControl;

public class IfAndFor {
    public static void main(String[] args) {
        boolean myVal = false;
        if (myVal = true)
            for (int i = 0; i < 2; i++)
                System.out.println(i);
        else
            System.out.println("else");

    }
}
