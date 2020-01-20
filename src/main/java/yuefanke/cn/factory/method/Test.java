package yuefanke.cn.factory.method;

/**
 * @author:WanChun
 * @date:2020/1/20 - 15:55
 * @description: 工厂方法，通过 简单工厂 再次封装，使更满足“开闭原则”,
 */
public class Test {
    /**
     * 工厂方法，通过 简单工厂 再次封装，当添加方法时，只需要做扩展，和修改客户端代码（main）不需要对之前代码做修改。
     * @param args
     */
    public static void main(String[] args) {
        //通过减法工厂获取 操作运算对象。
        SubOperationFactory operationFactory=new SubOperationFactory();
        Operation operation=operationFactory.createOperation();
        operation.getResult(6,4);
    }
}
