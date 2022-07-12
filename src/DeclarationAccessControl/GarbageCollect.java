package DeclarationAccessControl;

public class GarbageCollect {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Buffer");
        System.out.println(stringBuffer);
        StringBuffer buffer = new StringBuffer("Garbage");
        System.out.println(buffer);
        {
            buffer = new StringBuffer("2nd Object");
            System.gc();
            System.runFinalization();
        }
        //null the reference
        stringBuffer = null;
        System.out.println(stringBuffer);

        System.out.println(buffer);
//        System.gc();
    }
}
