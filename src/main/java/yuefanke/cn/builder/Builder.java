package yuefanke.cn.builder;

/**
 * @author:WanChun
 * @date: 2020/2/26-17:34
 * @description: 抽象建造类
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract  Product getResult();

}
