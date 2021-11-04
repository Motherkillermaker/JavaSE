package OOP2.Static;

import javax.xml.transform.dom.DOMResult;

/**
 * @author CJYong
 * @create 2021-05-23 17:47
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println( order1 == order2);
    }
}


//   懒汉式
class Order{

    //1.私有化类的构造器
    private Order(){

    }
    //2.声明当前类的对象，没有初始化
    //4.此对象也必须声明为static的
    private static  Order instance = null;

    //3.声明public、Static的返回当前类对象的方法
    public static  Order getInstance(){
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }

}