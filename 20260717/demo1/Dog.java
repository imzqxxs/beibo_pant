package demo1;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    public  void bark(){
        System.out.println(this.name+"正在汪汪汪");
    }
}
