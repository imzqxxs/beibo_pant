package demo2;

public class Room {
    protected String name;
    public int age;
    public int bed;
    public static int room=215;


    public void eat(){
        System.out.println(this.name+"正在吃饭...");
    }
    public  void sleep(){
        System.out.println(this.name+"正在睡觉...");
    }
    public  void play(){
        System.out.println(this.name+"正在打瓦");
    }
    public  void relax(){
        System.out.println(this.name+"正在玩小"+this.name);
    }
}
