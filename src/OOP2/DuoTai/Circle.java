package OOP2.DuoTai;

/**
 * @author CJYong
 * @create 2021-05-19 18:00
 */
public class Circle {
    private double radius;


    //空参构造器( 同时设定初始化值 )
    public Circle() {
        this.radius = 1;
    }

    //带参构造器
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
         return Math.PI * getRadius() * getRadius();
    }
}
