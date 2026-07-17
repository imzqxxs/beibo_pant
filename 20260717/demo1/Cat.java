package demo1;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public  void mew(){
        System.out.println(this.name+"正在喵喵喵");
    }
}
