package demo4;

import demo3.Base;

public class Derived extends Base {
    public void test(){
        Base base=new Base();
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        Derived derived=new Derived();
        System.out.println(derived.a);
    }

}
