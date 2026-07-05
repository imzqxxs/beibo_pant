import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a=7;
        int i=2;
        for (i = 2; i <= Math.sqrt(a); i++) {
            if(a%i==0){
                break;
            }
        }
        if(i<=Math.sqrt(a)){
            System.out.println("不是素数");
        }else{
            System.out.println("是素数");
        }
    }
    public static void main11(String[] args) {
        int a=7;
        int i=2;
        for (i = 2; i <= a/2; i++) {
            if(a%i==0){
                break;
            }
        }
        if(i<=a/2){
            System.out.println("不是素数");
        }else{
            System.out.println("是素数");
        }
    }
    public static void main10(String[] args) {
        int num=1;
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            num*=i;
            sum+=num;
        }
        System.out.println(sum);
    }
    public static void main9(String[] args) {
        int num=1;
        //计算5的阶乘
        for (int i = 1; i <=5; i++) {
            num*=i;
        }
        System.out.println(num);
    }
    public static void main8(String[] args) {
        int sum=0;
        //计算1——100的和
        for (int i = 0; i <=100; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main7(String[] args) {
        int i=100;
        while(i<=200){
            if(i%3!=0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
    public static void main6(String[] args) {
        int a=100;
        while(a<=200){
            if(a%3==0){
                System.out.println(a);
            }
            a++;
            continue;


        }

    }
    public static void main5(String[] args) {
        Scanner scanner=new Scanner(System.in);
                int c=scanner.nextInt();
                int i=1;
                int ret=1;
                while(i<=c) {
                    ret*=i;
                    i++;
                }
        System.out.println(ret);
    }
    public static void main4(String[] args) {
        int i=1;
        int num=0;
        while(i<=100) {
            num+=i;
            i++;
        }
        System.out.println(num);

    }
    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if(year%4==0){
            if(year%100!=0){
                System.out.println("是闰年");
            }
        }else if(year%400==0){
            System.out.println("是闰年");
        }else{
            System.out.println("是平年");
        }
    }
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a<0){
            System.out.println("负数");
        }else if(a>0){
            System.out.println("正数");
        }else{
            System.out.println("0");
        }
    }
    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n%2==0){
            System.out.println("是偶数");
        }else{
            System.out.println("是奇数");
        }
    }
}
