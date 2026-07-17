package demo2;

public class Student {
    private String name;
    private  int age;
    public static String classRoom="计科2505";

    {
        this.name="lisi";
        this.age=13;
        classRoom="计科2504";
        System.out.println("实例化代码块");
    }
    public static String getClassRoom() {
        return classRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("调用了带有两个参数的构造方法");
    }

    @Override
    public String toString() {
        return "demo2.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(){
        System.out.println(this.name+"正在吃饭...");
    }
}
