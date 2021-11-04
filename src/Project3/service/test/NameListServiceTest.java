package Project3.service.test;

import Project3.domain.Employee;
import Project3.service.NameListService;
import Project3.service.TeamException;

import javax.xml.ws.Service;


/**
 * @author CJYong
 * @create 2021-06-03 20:06
 */
/*
NameListServiceTest  类的测试
 */
public class NameListServiceTest {
    public static void main(String[] args) {
        NameListService service = new NameListService();
        Employee[] employees =service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);

        }

        System.out.println("*****************************");
        int id = 101;
        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }

    }


}
