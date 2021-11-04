package XMLTest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;


import java.util.List;

public class Dom4jTest {

    @Test
    public void test1() {
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read("src/XMLTest/books.xml");
            System.out.println(doc);
        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test2(){
        /**
         * 读取books.xml文件生成的Book类
         */

        //1.读取books.xml文件
        SAXReader reader = new SAXReader();
        //2.通过document对象获取根元素
        Document doc = null;
        try {
            doc = reader.read("src/XMLTest/books.xml");
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        //3.通过根元素获取book标签对象
        Element root = doc.getRootElement();
        List<Element> books = root.elements("book");
        //4.遍历，使得每个Book标签转化为Book类
        for(Element book:books){
            //asXML 把标签对象转为标签字符串
            Element name = book.element("name");

            //直接获取指定标签的文本内容
            String price = book.elementText("price");
            String author = book.elementText("author");
            String name1 = book.elementText("name");
            String sn = book.attributeValue("id");

            System.out.println(new Book(sn,name1,Double.parseDouble(price),author));

        }
    }




}
