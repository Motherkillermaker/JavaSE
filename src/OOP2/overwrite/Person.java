package OOP2.overwrite;

/*
1. OOP特性2： 继承性
2. 方法的重写
3. 四种访问的权限修饰符
4. 关键字： super
5. 子类对象实例化过程
6. OOP特性3： 多态性
 */

/**
 * @author CJYong
 * @create 2021-05-14 13:20
 */
public class Person {

    //属性
    String name;
    int age;

    //构造器（空参）
    public Person() {
    }

    //构造器（形参）
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //方法
    public void eat(){
        System.out.println("我可以吃饭");
    }

    public void sleep(){
        System.out.println("我可以睡觉");
    }


    //主程序
    public static void main(String[] args) {
        Person p1 = new Person("joey",22);
        p1.eat();
        p1.sleep();
    }
}