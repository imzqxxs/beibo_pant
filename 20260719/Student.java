public class Student implements Comparable<Student>{
    public String name;
    public double score;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int age;
    private static String classRoom = "1-101";

    public static String getClassRoom() {
        return classRoom;
    }

    public static void main(String[] args) {
        System.out.println(Student.getClassRoom());
    }

    @Override
    public int compareTo(Student o) {
        if(this.age>o.age){
            return 1;
        }else if(this.age<o.age){
            return -1;
        }else{
            return 0;
        }
    }

}
