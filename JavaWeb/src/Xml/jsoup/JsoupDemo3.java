package Xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author promise
 * @date 2020/3/22 - 15:09
 * Document/Element对象功能
 */
public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        //1.获取student.xml的path
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        //2.获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3.获取元素对象
        //3.1获取所有student对象
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);
        System.out.println("--------------");

        //3.2获取属性名为id的元素对象们
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);
        System.out.println("--------------");

        //3.3获取number属性值为heima_0001的元素对象
        Elements elements2 = document.getElementsByAttributeValue("number", "heima_0001");
        System.out.println(elements2);
        System.out.println("--------------");

        //3.4获取id属性值为itcast的元素对象
        Element itcast = document.getElementById("itcast");
        System.out.println(itcast);


    }
}
