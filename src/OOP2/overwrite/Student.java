package OOP2.overwrite;

/**
 * @author CJYong
 * @create 2021-05-14 13:28
 */
public class Student extends Person {
//    String name;
//    int age;
    String major;

    public Student() {
    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void study(){
        System.out.println("我可以学习");
    }


}
