package demo1;

import java.util.Comparator;

class Outclass2{
    public int data1=10;
    private int data2=20;
    public static int data3=30;
}
class Student{
    public int age;

}

public class Test2 {
    public static void main(String[] args) {
        Comparator comparator=new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return o1.age-o2.age;
            }
        };
        comparator.compare(12,13);
    }
}
