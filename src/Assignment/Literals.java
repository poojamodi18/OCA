package Assignment;

public class Literals {
    public static void main(String[] args) {
        int i = 1_000_000;
//        System.out.println(i);
        StringBuilder s = new StringBuilder("1Z0");
        System.out.println(s.capacity());
        s.append("-808");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());

    }
}
