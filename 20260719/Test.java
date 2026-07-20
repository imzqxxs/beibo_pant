public class Test {
    public static void main(String[] args) {
        Student student1=new Student("张三",11);
        Student student2=new Student("李四",21);
        if(student1.compareTo(student2)>0){
            System.out.println("student1大于student2");
        }else if(student1.compareTo(student2)<0){
            System.out.println("student1小于student2");
        }else{
            System.out.println("student1等于student2");
        }

        ScoreCompare scoreCompare=new ScoreCompare();
        int ret1=scoreCompare.compare(student1,student2);
    }
}