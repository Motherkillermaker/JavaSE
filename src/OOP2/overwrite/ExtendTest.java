package OOP2.overwrite;

/**
 * @author CJYong
 * @create 2021-05-14 13:36
 */

/*
面向对象特性之二: 继承性 why？

一、 继承性的好处
1.  减少代码的冗余，提高代码的重复性
2.  便于后续功能的拓展
3.  为之后多态性的使用提供了前提

二、 继承性的格式： class A extends B{}
    A : 子类、派生类
    B ：父类、基类、超类

    2.1     体现： 一旦子类A继承父类B以后，子类A中就获取了父类B中声明的结构、属性、方法
            特别的： 父类中声明为private的属性和方法继承后任然认为获取了父类中的私有结构
            只是因为封装性的影响使得子类不能直接调用父类的结构而已

    2.2     子类继承父类以后还可以声明自己特有的属性和方法，实现功能的拓展

三、  JAVA中关于继承性的规定
    1.  一个类可以被多个子类继承
    2.  一个类只能有一个父类（单继承性）
    3.  子父类是相对的概念
    4.  子类直接继承的父类称直接父类。间接继承的称间接父类
    5.  子类继承父类以后，就获取了直接父类以及所有间接父类中声明的属性和方法

四、   1.  如果没有显示的声明一个类的父类。则该类继承于java.lang.Object类
       2.  所有的类（除java.lang.Object类之外）都直接或间接的继承于java.lang.Object类。
       3.  所有类都具有java.lang.Object类声明的功能

 */
public class ExtendTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 22;
        p1.name = "joey";
        p1.eat();
        p1.sleep();

        Student s1 = new Student();
        s1.name = "zhangsan";
        s1.age = 22;
        s1.major = "PE";
        s1.eat();
        s1.sleep();
        s1.study();

    }
}
