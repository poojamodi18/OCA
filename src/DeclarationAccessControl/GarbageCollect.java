package DeclarationAccessControl;

public class GarbageCollect {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Buffer");
        System.out.println(stringBuffer);
        StringBuffer buffer = new StringBuffer("Garbage");
        StringBuffer bufferVal = new StringBuffer("Collect");

        //null the reference
        stringBuffer = null;
        System.out.println(stringBuffer);


        System.out.println(buffer);
        //reassigning variable
        buffer = bufferVal;

        System.out.println(buffer);


    }
}
