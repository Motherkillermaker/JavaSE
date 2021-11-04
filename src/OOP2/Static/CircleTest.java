package OOP2.Static;

import javax.sound.midi.Soundbank;

/**
 * @author CJYong
 * @create 2021-05-22 17:23
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        Circle c2 = new Circle();

        Circle c3 = new Circle(3.4);


        System.out.println("c1 的 ID" + c1.getId());
        System.out.println("c2 的 ID" + c2.getId());
        System.out.println("c3 的 ID" + c3.getId());


        System.out.println("创建的圆的个数为：" + Circle.getTotal());
    }

}

class Circle {

    private double radius;
    private int id;

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        // this();
        this.radius = radius;
        id = init++;
        total++;
    }

    private static int total;
    private static int init = 1001;

    public double findArea() {
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }
}