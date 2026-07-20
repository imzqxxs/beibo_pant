package demo1;

class OuterClass{
    public int data1=10;
    private int data2=20;
    public static int data3=30;
//静态内部类
    static  class InnerClass{
        public int data4=40;
        private  int data5=50;
        public static int data6=60;

        public void test(){
            OuterClass outerClass=new OuterClass();
            System.out.println("inner class test()...");
            System.out.println(outerClass.data1);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
        innerClass.test();
    }
}
