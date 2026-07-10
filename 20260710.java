import java.util.Arrays;

public class Test {
    //判断数组中是否存在有连续三个奇数的情况
    public static boolean threeOdd(int[]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-3; j++) {
                if(array[j]%2!=0&&array[j+1]%2!=0&&array[j+2]%2!=0){
                    return true;
                }
            }
        }
        return false;
    }
    //寻找数组中多于一半的元素
    public static void findArr(int[]array){
//        for (int i = 0; i < array.length; i++) {
//            int count=0;
//            for (int j = 0; j < array.length; j++) {
//                if(array[j]==array[i]){
//                    count++;
//                }
//            }
//            if(count> array.length/2){
//                return array[i];
//            }
//        }
//        return -1;
        Arrays.sort(array);
        System.out.println(array[array.length/2]);

    }
    public static void main(String[] args) {
        int[]arr1={2,2,1,1,1,2,2};
        int f=findArr(arr1);
        System.out.println(f);

        int[]arr2={3,4,5,5,5,7,8,3};
        boolean g=threeOdd(arr2);
        System.out.println(g);
    }
}
class Dog{
    //成员属性
    public String color;
    public String name;
    //成员行为
    public void bark(){
        System.out.println(color+"的"+name+"汪汪汪");
    }
    public void wag(){
        System.out.println(color+"的"+name+"摇尾巴");
    }

    public Dog(String color, String name) {
        this.color = color;
        this.name = name;
    }
    public Dog(){
        this("黑","gou");
        System.out.println("调用了不带参的构造方法");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog dog1=new Dog("黄色","马嘉祺");
//        dog1.name="杨浩林";
//        dog1.color="黄色";
//
//        dog1.print();
//        dog1.bark();
//        dog1.wag();

        Dog dog2=new Dog("橙色","马嘉祺");
        Dog dog3=new Dog("橙色","马嘉祺");
        dog3.print();
        String a=dog3.toString();
        System.out.println(a);

//        dog2.name="张锦玮";
//        dog2.color="绿色";
//        dog2.print();
//
//
//        dog2.bark();
//        dog2.wag();
    }
    public void print(){
        System.out.println("姓名:"+this.name+"  "+"颜色:"+this.color);
    }
}
