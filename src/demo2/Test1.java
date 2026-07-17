package demo2;

public class Test1 {
    public static void main(String[] args) {
        Student student=new Student("zhangsan",10);
    }
    public static void main2(String[] args) {
        System.out.println(Student.classRoom);
    }

    public static void main1(String[] args) {
Student student=new Student("zhangsan",10);
student.eat();
        System.out.println(student);
    }
}
