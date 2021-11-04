package Project3.domain;

/**
 * @author CJYong
 * @create 2021-06-03 18:36
 */
public class Architect extends Designer{
    private int stock;  //股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString(){
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
    }

    public String getDetailsForTeam(){
        return getMeberId() + "/" + getId() + "\t\t" + getName()  + '\t' + getAge() + "\t\t" + getSalary() + "\t架构师\t" + getBonus() + "\t" + getStock();
    }
}
