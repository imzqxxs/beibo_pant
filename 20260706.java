import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main6(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            int n=scanner.nextInt();
            System.out.println(n);
        }
    }
    //画叉号星星
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        while(scanner.hasNextInt()){
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        }
    }
    //猜数字游戏
    public static void main5(String[] args) {
        Random random=new Random();
        int randNum=random.nextInt(100);
        System.out.println(randNum);
        Scanner scanner=new Scanner(System.in);
        int count=3;
        while(count!=0){
            count--;
            System.out.println("请输入你要猜测的数字：");
            int num=scanner.nextInt();
            if(num<randNum) {
                System.out.println("猜小了,你还有"+count+"次机会");
            }else if(num==randNum){
                System.out.println("猜对了");
                break;
            }else{
                System.out.println("猜大了,你还有"+count+"次机会");
            }
        }
        System.out.println("机会已经用完了");

    }
    public static void main4(String[] args) {
        double sum=0;
        int flag=1;
        for (int i = 1; i <=100 ; i++) {
            sum+=flag*1.0/i;
            flag=-flag;
        }
        System.out.println(sum);
    }
    //判断两数字的最大公约数
    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int min=0;
        int max=0;
        if(a>b){
            min=b;
            max=a;
        }else{
            min=a;
            max=b;
        }
        for (int i = max; i >0; i--) {
            if(a%i==0&&b%i==0){
                System.out.println(i);
                break;
            }
        }
    }
    //寻找1——100中9的个数
    public static void main2(String[] args) {
        int count=0;
        for (int i = 0; i <100 ; i++) {
            if(i%10==9){
                count++;
            }
            if(i/10==9){
                count++;
            }
        }
        System.out.println(count);

    }
    //寻找水仙花数
    public static void main1(String[] args) {
        for (int i = 0; i < 999999; i++) {
            //1.求这个数字有几位
            int count=0;
            int temp=i;
            while(temp!=0){
                count++;
                temp=temp/10;
            }
            //此时temp=0;
            temp=i;
            //temp=153,求个位，十位，百位上的数字
            int sum=0;
            while(temp!=0){
                sum+=Math.pow(temp%10,count);
                temp/=10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
