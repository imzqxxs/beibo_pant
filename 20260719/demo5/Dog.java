package demo5;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(this.getName()+"正在吃狗粮。。。");
    }
}
