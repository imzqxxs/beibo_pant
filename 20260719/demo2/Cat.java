package demo2;

public class  Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.name+"正在吃猫粮。。。");
    }

}
