public class Test {
    public static int fib(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    // 给1234求1+2+3+4
    public static int sum(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sum(n / 10);
        }
    }

    public static int add(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n += add(n - 1);
        }
    }

    // 将123分开打印出来
    public static void print(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            print(n / 10);
            System.out.println(n % 10);
        }
    }

    // 斐波那契数列
    public static int FibTest(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 1, b = 1, nex = 0;
        for (int i = 2; i <= n; i++) {
            nex = a + b;
            a = b;
            b = nex;
        }
        return nex;
    }

    public static int ret(int n) {
        int sum = 0;
        int ret = 1;
        for (int j = 1; j <= n; j++) {
            ret *= j;
            sum += ret;
        }
        return sum;
    }

    public static int findMax(int a, int b) {
        return a > b ? a : b;
    }

    public static double findMax(double a, double b, double c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }

    public static void main(String[] args) {
        int a = Test.ret(5);
        System.out.println(a);
        int b = findMax(66, 99);
        double c = findMax(11.11, 22.22, 33.33);
        System.out.println(b);
        System.out.println(c);
        int d = FibTest(10);
        System.out.println(d);
        print(520);
        int f = add(10);
        System.out.println(f);
        int j = fib(5);
        System.out.println(j);
    }
}
