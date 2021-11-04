package Project2;

//为Customer对象的管理模块，内部用数组管理一组Customer对象，
//并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
public class CustomerList {
    private Customer[] customers;   //用来保存客户对象的数组
    private int total = 0;          //记录已保存客户对象的数量


    public CustomerList(int totalCustomer) {
        /*
         * 描述: 用来初始化customer构造器
         * @param totalCustomer 指定数组的长度
         * @author CJYong
         * @date 2021/5/13 0013 13:38:13
         * @return
         */

        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {  //增
        /*
         * 描述: 将指定的客户添加到数组中
         * @param customer
         * @author CJYong
         * @date 2021/5/13 0013 13:39:54
         * @return true: 添加成功，false:添加失败
         */

        if (total >= customers.length) {
            return false;
        }
        customers[total] = customer;
        total++;
        return true;
    }

    public boolean replaceCustomer(int index, Customer cust) {  //改
        /*
         * 描述: 修改指定位置客户的索引信息
         * @param index
         * @param cust
         * @author CJYong
         * @date 2021/5/13 0013 13:43:10
         * @return true: 修改成功 false: 修改失败
         */

        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    public boolean deleteCustomer(int index) {  //删
        /*
         * 描述: 删除指定索引位置上的客户
         * @param index
         * @author CJYong
         * @date 2021/5/13 0013 13:47:42
         * @return true: 修改成功 false: 修改失败
         */
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        // 最后有数据的元素需要置空
        customers[total - 1] = null;
        total--;
        return true;
    }

    public Customer[] getAllCustomers() {  //  查
        /*
         * 描述: 获取所有客户信息
         * @param
         * @author CJYong
         * @date 2021/5/13 0013 13:53:26
         * @return Project2.Customer[]
         */
        Customer[] custs = new Customer[total];
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];   // 复制地址值
        }
        return custs;
    }

    public Customer getCustomer(int index) {
        /*
         * 描述: 获取指定索引位置上的客户
         * @param index
         * @author CJYong
         * @date 2021/5/13 0013 13:57:35
         * @return  找到返回，未找到nul
         */
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    public int getTotal() {
        /*
         * 描述: 获取存储的客户的数量
         * @param
         * @author CJYong
         * @date 2021/5/13 0013 13:59:07
         * @return int
         */
        return total;
    }

}
