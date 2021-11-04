package OOP2.DuoTai;

/**
 * @author CJYong
 * @create 2021-05-19 18:04
 */
public class Cylinder extends Circle{

    private double length;

        // 空参构造器 （同时设置初始化值）
    public Cylinder() {
        this.length = 1;
    }

    public Cylinder(double radius,double length) {
        // 继承父类构造器
        super(radius);
        // 属性初始化
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double findVolume(){
        return super.findArea() * length;
    }

    //求表面积
    public double findArea(){
        return  2 * Math.PI * getRadius() * length + 2 * Math.PI * getRadius() * getRadius();
    }
}
