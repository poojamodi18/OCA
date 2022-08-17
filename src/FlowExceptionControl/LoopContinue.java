package FlowExceptionControl;

public class LoopContinue {
    public static void main(String[] args) {
        int i;
        int j;
        for (i=1; i < 4; i++) {
            for (j=2; j < 4; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.println("i: " + i + " j: " + j);

            }
        }

        String s = "java2s";
        s.replace('a', 'Z').trim().concat("Aa");
        s.substring(0, 2);
        System.out.println(s);

        int i1 = 1_234;
        double d4 = 1_234.0;

        System.out.println(i1);
        System.out.println(d4);


    }
}
