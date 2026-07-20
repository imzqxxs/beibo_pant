package demo7;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1=new Person("12");
        Person person2=(Person)person1.clone();


    }
}
