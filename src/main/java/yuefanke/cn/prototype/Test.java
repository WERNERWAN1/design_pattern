package yuefanke.cn.prototype;

import java.util.Date;

/**
 * @author:WanChun
 * @date:2020/1/20 - 17:34
 * @description: 原型模式
 */
public class Test {
    /**
     * java 实现原型模型（clone）
     * @param args
     */
    public static void main(String[] args) {
        Book book=new Book("Werner",new Date(),"China");
        System.out.println(book.toString());
        try {
            Book book1=(Book) book.clone();
            System.out.println("比较结果:"+book1.equals(book));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
