package yuefanke.cn.builder;

/**
 * @author:WanChun
 * @date: 2020/2/26-17:41
 * @description: 建造B
 */
public class BuilderB  extends Builder{

    Product productB =new Product();
    @Override
    public void buildPartA() {
        productB.add("PartAB");
    }

    @Override
    public void buildPartB() {
        productB.add("PartBB");
    }

    @Override
    public Product getResult() {
        return productB;
    }
}
