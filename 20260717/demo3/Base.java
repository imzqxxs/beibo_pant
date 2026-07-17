package demo3;

import demo2.Room;

public class Base extends Room {
    protected int a;

    public static void main(String[] args) {
        Base base=new Base();
        System.out.println(base.a);
        base.name="狗";
        System.out.println(base.name);
        System.out.println();
    }
}
