package Project3.domain;

import Project3.service.Status;

/**
 * @author CJYong
 * @create 2021-06-03 16:45
 */
public class Programmer extends Employee{
    private int meberId;  // 开发团队中的ID
    private Equipment equipment;
    private Status status = Status.FREE;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMeberId() {
        return meberId;
    }

    public void setMeberId(int meberId) {
        this.meberId = meberId;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String toString(){
        return getDetails() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }

    public String getDetailsForTeam(){
        return getMeberId() + "/" + getId() + "\t\t" + getName()  + '\t' + getAge() +"\t\t" + getSalary() + "\t程序员";
    }
}
