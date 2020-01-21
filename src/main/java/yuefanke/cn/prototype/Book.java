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
     * 内容
     */
    private Content content;
    /**
     * 国家
     */
    private String country;

    private int page;

    public Book(String author, Date createTime, Content content, String country, Integer page) {
        this.author = author;
        this.createTime = createTime;
        this.content = content;
        this.country = country;
        this.page = page;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book book=(Book)super.clone();
        book.setContent((Content) content.clone());
        return book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", createTime=" + createTime +
                ", country='" + country + '\'' +
                '}';
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
