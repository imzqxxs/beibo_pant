package demo2;

public class Test {
    public static void eatFunc(Animal animal){
        animal.eat();
    }
    public static void main(String[] args) {
        eatFunc(new Dog("大佐",11));
        eatFunc(new Cat("大帅",12));

    }
}
