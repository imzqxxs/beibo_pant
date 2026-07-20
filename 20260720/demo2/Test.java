package demo2;
class student{
    public String name;
    public  int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        String s1="hello";
        String ret=s1.toUpperCase();
        System.out.println(ret);
        String ret2=ret.toLowerCase();
        System.out.println(ret2);

        char[]chars=s1.toCharArray();
        for(char ch:chars){
            System.out.println(ch);
        }
    }
    public static void main1(String[] args) {
        String s1=String.valueOf(123);
        System.out.println(s1);

        String s2=String.valueOf(12.1);
        System.out.println(s2);

        String s3=String.valueOf(new student("张三",10));
        System.out.println(s3);
    }
}
