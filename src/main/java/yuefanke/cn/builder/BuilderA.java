package yuefanke.cn.builder;

/**
 * @author:WanChun
 * @date: 2020/2/26-17:40
 * @description: 建造A
 */
public class BuilderA extends Builder {

    private Product product=new Product();

    @Override
    public void buildPartA() {
        product.add("partA");
    }

    @Override
    public void buildPartB() {
        product.add("partB");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
