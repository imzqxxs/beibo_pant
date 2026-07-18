package demo1;

public class Test {
    public void drawShape(){
        //圆，矩形，圆，矩形，花
        Cycle cycle=new Cycle();
        Rect rect=new Rect();
        Flower flower=new Flower();
        String[]shapes={"cycle","rect","cycle","rect","flower"};
        for (String shape:shapes) {
            if(shape.equals("cycle")){
                cycle.draw();
            }else if(shape.equals("rect")){
                rect.draw();
            }else{
                flower.draw();
            }
            
        }
    }
    public static  void drawMap(){
        Cycle cycle=new Cycle();
        Rect rect=new Rect();
        Flower flower=new Flower();
        Shape[]shapes={cycle,rect,cycle,rect,flower};
        for(Shape shape:shapes){
            shape.draw();
        }
    }
    public static void main(String[] args) {
        Test test=new Test();
//        test.drawShape();
        drawMap();
    }
}
