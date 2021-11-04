package Project3.service;

import Project3.domain.*;
import com.sun.xml.internal.bind.v2.model.core.ID;

import static Project3.service.Data.*;

/** 功能：负责将Data中的数据封装到Employee[]数组中
 * 同时提供相关操作Employee[]的方法。
 * @author CJYong
 * @create 2021-06-03 18:40
 */
public class NameListService {

    private Employee[] employees;

    /*
    给employees及数组元素进行初始化
    */
    public NameListService(){
        /*
        根据项目提供的Data类构建相应大小的employees数组
        再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
        将对象存于数组中
         */
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            // 获取员工的类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);

            //获取Employee的四个基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;
            double bonus;
            int stock;

            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = creatEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }

        }
    //  获取指定index上员工的设备
    private Equipment creatEquipment(int index) {
        int type = Integer.parseInt(EQUIPMENTS[index][0]);

        String model = EQUIPMENTS[index][1];
        switch (type){
            case PC:         //21
                String display = EQUIPMENTS[index][2];
                return  new PC(model, display);
            case NOTEBOOK:   //22
                double price = Double.parseDouble(EQUIPMENTS[index][2]);
                return new NoteBook(model,price);
            case PRINTER:    //23

                return new Printer(EQUIPMENTS[index][1],EQUIPMENTS[index][2]);
        }
        return  null;
    }

    //  获取当前所有员工
    public Employee[] getAllEmployees(){
        return employees;
    }

    //  获取指定id的员工
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id){
                return employees[i];
            }
        }

        throw new TeamException("找不到指定员工 ！");

    }

}
