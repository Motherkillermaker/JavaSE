package Project2;

//为主模块，负责菜单的显示和用户处理操作
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public void enterMainMenu() {
        /*
         * 描述: 显示《客户信息管理软件》
         * @param
         * @author CJYong
         * @date 2021/5/13 0013 18:20:57
         * @return void
         */
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("-----------------客户信息管理软件-------------------\n");
            System.out.println("                  1.添加客户");
            System.out.println("                  2.修改客户");
            System.out.println("                  3.删除客户");
            System.out.println("                  4.客户列表");
            System.out.println("                  5.退    出\n");
            System.out.println("                  请选择<1-5>：");

            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    //  System.out.println("退出");
                    System.out.print("确认是否退出(Y/N):");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    //break;
            }
        }

    }

    private void addNewCustomer() {
        /*
         * 描述: 添加客户的操作
         * @param
         * @author CJYong
         * @date 2021/5/13 0013 18:15:30
         * @return void
         */
        //  System.out.println("添加客户的操作");
        System.out.println("-----------------添加客户-------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);

        System.out.print("性别：");
        char gender = CMUtility.readChar();

        System.out.print("年龄：");
        int age = CMUtility.readInt();

        System.out.print("电话：");
        String phone = CMUtility.readString(13);

        System.out.print("邮箱：");
        String email = CMUtility.readString(30);

        //将数据封装到对象中
        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("---------------客户列表完成-------------------");
        } else {
            System.out.println("---------------客户目录已满，添加失败-------------------");
        }
    }

    private void modifyCustomer() {
        /*
         * 描述: 修改客戶的操作
         * @param
         * @author CJYong
         * @date 2021/5/13 0013 18:15:58
         * @return void
         */
        // System.out.println("修改客戶的操作");
        System.out.println("---------------修改客户-------------------");

        Customer cust;
        int number;
        for (; ; ) {
            System.out.print("请选择待修改客户编号(-1退出)");
            number = CMUtility.readInt();

            if (number == -1) {
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户 ！");
            } else {//找到了指定的客户
                break;
            }
        }
        //修改客戶信息
        System.out.print("姓名(" + cust.getName() + "):");
        String name = CMUtility.readString(10, cust.getName());
        System.out.print("性別(" + cust.getGender() + "):");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.print("年龄(" + cust.getAge() + "):");
        int age = CMUtility.readInt(cust.getAge());
        System.out.print("电话(" + cust.getPhone() + "):");
        String phone = CMUtility.readString(13, cust.getPhone());
        System.out.print("邮箱(" + cust.getEmail() + "):");
        String email = CMUtility.readString(30, cust.getEmail());

        //method 2:
//        cust.setAge(age);
//        cust.setEmail(email);
//        cust.setGender(gender);
//        cust.setName(name);
//        cust.setPhone(phone);

        Customer newCust = new Customer(name, gender, age, phone, email);

        boolean isReplace = customerList.replaceCustomer(number - 1, newCust);
        if (isReplace) {

            System.out.println("---------------修改完成 ！-------------------");
        } else {
            System.out.println("---------------修改失败 ！-------------------");

        }
    }

    private void deleteCustomer() {
        /*
         * 描述: 刪除客戶的操作
         * @param
         * @author CJYong
         * @date 2021/5/13 0013 18:16:18
         * @return void
         */
        //System.out.println("刪除客戶的操作");
        System.out.println("---------------删除客户-------------------");

        int number;
        for (; ; ) {
            System.out.println("---------------请选择待删除客户编号(-1退出)：-------------------");
            number = CMUtility.readInt();

            if (number == -1) {
                return;
            }

            Customer customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户 ！");
            } else {
                break;
            }
        }

        //找到了指定客户
        System.out.println("是否确认删除(Y/N): ");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean deleteSuccess = customerList.deleteCustomer(number - 1);
            if (deleteSuccess) {
                System.out.println("---------------删除完成-------------------");
            } else {
                System.out.println("---------------删除失败-------------------");
            }
        } else {
            return;
        }
    }

    private void listAllCustomers() {
        /*
         * 描述: 显示客户列表的操作
         * @param
         * @author CJYong
         * @date 2021/5/13 0013 18:16:36
         * @return void
         */
        //System.out.println("显示客户列表的操作");
        System.out.println("-----------------客户列表-------------------\n");

        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录 ！");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t\t邮箱");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                Customer cust = custs[i];
                System.out.println((i + 1) + "\t\t" + cust.getName() + "\t"
                        + cust.getGender() + "\t\t" + cust.getAge() + "\t\t"
                        + cust.getPhone() + "\t\t\t" + cust.getEmail());

            }
        }


        System.out.println("---------------客户列表完成-------------------\n");

    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }

}
