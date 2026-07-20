package demo4;

public class KeyBoard implements IUSB{

    @Override
    public void openDevice() {
        System.out.println("打开键盘....");
    }
    public void intPut(){
        System.out.println("键盘输入...");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘....");
    }
}
