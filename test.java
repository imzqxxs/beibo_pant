public class test {
    public static void main(String[] args) {
        //位运算符
    }

    public static void main23(String[] args) {
        //System.out.println(10 > 20 & 10 / 0 == 0);             // 程序抛出异常
        System.out.println(10 < 20 | 10 / 0 == 0);             // 程序抛出异常
    }


    public static void main22(String[] args) {
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!!false);

        /*int a = 10;
        System.out.println(!a);*/
    }

    public static void main21(String[] args) {
        /*int a = 1;
        int b = 2;
        System.out.println(a == 1 || b == 2);   // 左为真 则结果为真 短路情况
        System.out.println(a == 1 || b > 100);  // 左为真 但 右为假 则结果也为真  短路情况
        System.out.println(a > 100 || b == 2);  // 左为假 但 右为真 则结果也为真
        System.out.println(a > 100 || b > 100); // 左为假 且 右为假 则结果为假
*/


        System.out.println(10 < 20 || 10 / 0 == 0);
    }

    public static void main20(String[] args) {
        /*int a = 1;
        int b = 2;

        System.out.println(a == 1 && b == 2);   // 左为真 且 右为真 则结果为真
        System.out.println(a == 1 && b > 100);  // 左为真 但 右为假 则结果为假
        System.out.println(a > 100 && b == 2);  // 左为假  则结果为假   短路情况
        System.out.println(a > 100 && b > 100); // 左为假  则结果为假   短路情况
*/

        System.out.println(10 > 20 && 10 / 0 == 0);//短路情况
    }


    public static void main19(String[] args) {
        int a = 10;
        int b = 20;
        // 注意：在Java中 = 表示赋值，要与数学中的含义区分
        //      在Java中 == 表示相等
        System.out.println(a == b);       // false
        System.out.println(a != b);       // true
        System.out.println(a < b);        // true
        System.out.println(a > b);        // false
        System.out.println(a <= b);       // true
        System.out.println(a >= b);       // false


    }

    public static void main18(String[] args) {
        int a = 10;
        a = a++;
        System.out.println(a);
    }

    public static void main17(String[] args) {
        int a = 10;
        //int b = ++a;//先++ 后使用  ++a   b = a
        int b = a++;//先使用  后++   b = a  a++
        System.out.println(a);//11
        System.out.println(b);//10
    }

    public static void main16(String[] args) {
        int a = 10;
        double d = 12.5;

        //a = a + d;
        //a = (int)(a + d);
        a += d;
        System.out.println(a);
    }

    public static void main15(String[] args) {
        /*System.out.println(10 % 3); //1
        System.out.println(-10 % 3); //-1
        System.out.println(10 % -3); //1
        System.out.println(-10 % -3);//-1


        System.out.println(11.5%2.0);*/

        int a = 5;
        //a = a + 5;
        a += 5;
        System.out.println(a);
    }

    public static void main14(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a/b);
    }

    public static void main13(String[] args) {
        String s = "123";

        int ret = Integer.parseInt(s);
        System.out.println(ret+1);
    }

    public static void main12(String[] args) {
        int num = 10;
        System.out.println(num+"");

        String s = String.valueOf(num);
        System.out.println(s);
    }


    public static void main11(String[] args) {
        /*String str = "hello";
        System.out.println(str);

        String str2 = "world";
        System.out.println(str2);
        //                   拼接
        System.out.println(str+str2);
*/
        int a = 10;
        // a == 10
        System.out.println("a == "+a);

        int b = 20;
        System.out.println("a+b = "+(a+b));
        System.out.println(a+b+"a+b = ");
    }

    //小于4个字节的 都会提升为4个字节
    public static void main10(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = a + b;
        System.out.println(c);
    }


    public static void main9(String[] args) {
        int a = 10;
        long b = 20;

        int c = (int)(a + b);
        long d = a + b; // 编译成功：a + b==>int + long--->long + long 赋值给long
    }

    public static void main8(String[] args) {
        /*int a = 10;//4
        long b = 100L; //8
        //b = a;   // 可以通过编译
        a = (int)b;*/

        byte b1 = 100; //-128  127

        byte b2 = (byte)257;

    }

    public static void main7(String[] args) {
        boolean flg = false;
        System.out.println(flg);

        /*boolean value = true;
        System.out.println(value + 1);*/
    }

    public static void main6(String[] args) {
        char ch = '哈';
        System.out.println(ch);

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
    }

    public static void main5(String[] args) {

        //8
        /*double d = 12.5;
        System.out.println(d);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);*/


        /*double a = 1.0;
        double b = 2.0;
        System.out.println(a / b);

        double num = 1.1;
        System.out.println(num * num);  // 输出1.21吗？*/

        //4
        float f = 12.5F;
        System.out.println(f);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
    }




    public static void main4(String[] args) {
        //1   -128   127
        byte a = -128;
        System.out.println(a);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }

    public static void main3(String[] args) {
        //2
        short a = 32767;
        System.out.println(a);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
    }

    public static void main2(String[] args) {
        int a = 10;
        long b = 20L;
        System.out.println(b);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }

    public static void main1(String[] args) {
        /*int a = 10;
        System.out.println(a);

        int b = 0;
        System.out.println(b);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
*/

        int c = 2147483647;
        System.out.println(c);

        int d = c+1;
        System.out.println(d);
    }


}