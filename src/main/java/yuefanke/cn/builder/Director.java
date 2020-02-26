package yuefanke.cn.builder;

/**
 * @author:WanChun
 * @date: 2020/2/26-17:44
 * @description: 指挥者
 */
public class Director {
    public void director(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
