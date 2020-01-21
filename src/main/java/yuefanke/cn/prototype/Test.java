package yuefanke.cn.prototype;

import java.util.Date;

/**
 * @author:WanChun
 * @date:2020/1/20 - 17:34
 * @description: 原型模式
 */
public class Test {
    /**
     * java 实现原型模型（clone）.原型模式只的是一个原型多个复制,java中实现方式是通过克隆，
     * 克隆是将对象复制到一个新的内存地址上，但是内部应用没有改变（潜度克隆），如果要改变对象内部的引用
     * 需要内部的对象也是一个新的引用地址，方法是将内部的引用再克隆一份。
     *
     * @param args
     */
    public static void main(String[] args) {
        Content content=new Content();
        Book book = new Book("Werner", new Date(), content,"China",200);
        System.out.println(book.toString());
        try {
            Book book1 = (Book) book.clone();
            System.out.println("比较结果:" + book1.equals(book));
            //引用地址为同一个，则为迁浅度克隆
            System.out.println("应用地址是否为同一个：" + book1.getAuthor().equals(book.getAuthor()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
