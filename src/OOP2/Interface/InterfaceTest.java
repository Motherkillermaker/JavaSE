package OOP2.Interface;

/**
 * @author CJYong
 * @create 2021-05-30 14:10
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        plane plane = new plane();   // 接口的实现
        plane.fly();
    }
}

interface Flyable{
    // 全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();
    void stop();

}

interface Attackable{
    void attcak();
}
class plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

class Bullet extends Object implements Flyable,Attackable{
    // 先继承，后实现接口  （实现了子类的“多继承性”）

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attcak() {

    }
}