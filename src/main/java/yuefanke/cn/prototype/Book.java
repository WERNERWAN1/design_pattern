package yuefanke.cn.prototype;

import java.util.Date;

/**
 * @author:WanChun
 * @date:2020/1/20 - 17:36
 * @description: 书 ,Cloneable 标示接口,功能和序列化一样，一种设计思想。
 */
public class Book implements Cloneable{
    /**
     * 作者
     */
    private String author;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 国家
     */
    private String country;

    public Book(String author, Date createTime, String country) {
        this.author = author;
        this.createTime = createTime;
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", createTime=" + createTime +
                ", country='" + country + '\'' +
                '}';
    }
}
