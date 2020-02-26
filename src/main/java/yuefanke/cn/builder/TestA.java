package yuefanke.cn.builder;

/**
 * @author:WanChun
 * @date: 2020/2/26-17:48
 * @description: 建造者模式
 */
public class TestA {
    public static void main(String[] args) {
        Director director=new Director();
        Builder a=new BuilderA();
        Builder b=new BuilderB();

        director.director(a);
        Product p=a.getResult();
        p.show();

        director.director(b);
        Product d=b.getResult();
        d.show();
    }
}
