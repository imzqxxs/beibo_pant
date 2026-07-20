package demo4;

public class Computer {
    public void powerOn(){
        System.out.println("打开笔记本电脑。");
    }
    public  void powerOff(){
        System.out.println("关闭笔记本电脑。");
    }

    public void useDevice(IUSB usb){
        usb.openDevice();
        if(usb instanceof KeyBoard){
            KeyBoard keyBoard=(KeyBoard) usb;
            keyBoard.intPut();
        }else if(usb instanceof Mouse){
            Mouse mouse=(Mouse) usb;
            mouse.click();
        }
        usb.closeDevice();
    }
}
