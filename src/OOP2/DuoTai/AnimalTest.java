package OOP2.DuoTai;

import java.nio.channels.Pipe;

/**
 * @author CJYong
 * @create 2021-05-19 11:19
 */

//  多态性的使用举例一 :   new 它子类的对象
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());   //  匿名对象
        test.func((new Cat()));

    }



    public void func(Animal animal){   // Animal animal = new Dog()
        animal.eat();
        animal.shout();
    }
}

class Animal{

    public void eat(){
        System.out.println("动物可以进食");
    }

    public void shout(){
        System.out.println("动物可以叫");
    }

}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗可以吃骨头");
    }

    public void shout(){
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫可以吃鱼");
    }

    public void shout(){
        System.out.println("喵喵喵");
    }
}
