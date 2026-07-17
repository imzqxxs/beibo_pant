package demo1;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("aa",11);
        dog.name="大黄";
        dog.eat();
        dog.bark();
        System.out.println("===============");
        Cat cat=new Cat("bb",11);
        cat.name="小灰";
        cat.eat();
        cat.mew();
    }
}

