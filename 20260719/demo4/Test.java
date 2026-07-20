package demo4;

public class Test {
    public static void main(String[] args) {
        Computer compute=new Computer();
        compute.powerOn();

        Mouse mouse=new Mouse();
        KeyBoard keyBoard=new KeyBoard();

        compute.useDevice(mouse);
        System.out.println("==================");
        compute.useDevice(keyBoard);

        compute.powerOff();

    }
}
